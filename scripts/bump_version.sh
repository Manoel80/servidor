#!/usr/bin/env bash
set -euo pipefail

# bump_version.sh
# Uso:
#  ./scripts/bump_version.sh [patch|minor|major|X.Y.Z] [--commit] [--release]
# - default: incrementa patch
# - --commit: faz commit e push das alterações
# - --release: recompila e atualiza asset na release (usa 'gh' e './gradle-8.8/bin/gradle')

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
MOD_DIR="$ROOT/minecraft_mod"
BUILD_GRADLE="$MOD_DIR/build.gradle"
FILES=(
  "$MOD_DIR/README.md"
  "$MOD_DIR/CURSE_FORGE_DESCRIPTION.txt"
  "$MOD_DIR/CURSE_FORGE_PUBLICATION_GUIDE.md"
  "$MOD_DIR/MODRINTH_UPLOAD.md"
  "$ROOT/RESUMO_FINAL.md"
)

if [ ! -f "$BUILD_GRADLE" ]; then
  echo "Não achei $BUILD_GRADLE" >&2
  exit 1
fi

old_version=$(grep -E "version\s*=\s*'([0-9]+\.[0-9]+\.[0-9]+)'" "$BUILD_GRADLE" | sed -E "s/.*'([0-9]+\.[0-9]+\.[0-9]+)'.*/\1/" | head -n1)
if [ -z "$old_version" ]; then
  echo "Não foi possível detectar a versão atual em $BUILD_GRADLE" >&2
  exit 1
fi

mode=${1:-patch}
shift || true

do_commit=false
do_release=false
while [ "$#" -gt 0 ]; do
  case "$1" in
    --commit) do_commit=true ;; 
    --release) do_release=true ;;
    *) ;;
  esac
  shift
done

parse_version() {
  IFS='.' read -r major minor patch <<< "$1"
  echo "$major" "$minor" "$patch"
}

if [[ "$mode" =~ ^(patch|minor|major)$ ]]; then
  read major minor patch <<< "$(parse_version "$old_version")"
  case "$mode" in
    patch) patch=$((patch+1)) ;;
    minor) minor=$((minor+1)); patch=0 ;;
    major) major=$((major+1)); minor=0; patch=0 ;;
  esac
  new_version="$major.$minor.$patch"
else
  # explicit version
  new_version="$mode"
fi

echo "Versão: $old_version -> $new_version"

# Update build.gradle (first occurrence)
sed -i "0,/'version = '/s/'version = '\''[0-9]\+\.[0-9]\+\.[0-9]\+\''/'version = '\''$new_version\''/" "$BUILD_GRADLE" || true

# Replace occurrences in documentation files (plain and with v prefix)
for f in "${FILES[@]}"; do
  if [ -f "$f" ]; then
    sed -i "s/v$old_version/v$new_version/g" "$f" || true
    sed -i "s/$old_version/$new_version/g" "$f" || true
  fi
done

echo "Arquivos atualizados."

if [ "$do_commit" = true ]; then
  echo "Commitando alterações..."
  git -C "$ROOT" add "$BUILD_GRADLE" "${FILES[@]}" || true
  git -C "$ROOT" commit -m "Bump version: $old_version -> $new_version" || true
  git -C "$ROOT" push origin main || true
  echo "Commit enviado."
fi

if [ "$do_release" = true ]; then
  echo "Construindo JAR..."
  (cd "$MOD_DIR" && ./gradle-8.8/bin/gradle build -x test)
  echo "Upload para GitHub Release..."
  JAR_PATH="$MOD_DIR/build/libs/void_quantum-$new_version.jar"
  # rename current jar to include new version if necessary
  if [ -f "$MOD_DIR/build/libs/void_quantum-1.0.0.jar" ] && [ "$new_version" != "1.0.0" ]; then
    # try to move existing artifact
    mv "$MOD_DIR/build/libs/void_quantum-1.0.0.jar" "$JAR_PATH" || true
  fi
  if [ -f "$JAR_PATH" ]; then
    gh release upload "v$new_version" "$JAR_PATH" --clobber || gh release upload "v1.0.0" "$JAR_PATH" --clobber || true
  else
    echo "JAR não encontrado em $JAR_PATH" >&2
  fi
fi

echo "Pronto."
