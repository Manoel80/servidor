#!/usr/bin/env python3
from PIL import Image, ImageDraw
import os

# Criar pastas se não existirem
os.makedirs("src/main/resources/assets/seu_mod/textures/item", exist_ok=True)
os.makedirs("src/main/resources/assets/seu_mod/textures/block", exist_ok=True)

# Função para criar texturas
def criar_textura(nome, cor, tipo="item"):
    tamanho = 16
    img = Image.new('RGB', (tamanho, tamanho), color=cor)
    draw = ImageDraw.Draw(img)
    
    # Adiciona um padrão simples
    for i in range(tamanho):
        for j in range(tamanho):
            if (i + j) % 2 == 0:
                img.putpixel((i, j), tuple(max(0, c - 30) for c in cor))
    
    # Borda
    draw.rectangle([(0, 0), (tamanho-1, tamanho-1)], outline=(0, 0, 0))
    
    caminho = f"src/main/resources/assets/seu_mod/textures/{tipo}/{nome}.png"
    img.save(caminho)
    print(f"✓ Criado: {caminho}")

# ITEMS
print("=== Criando Texturas de Items ===")
criar_textura("essencia_celestial", (100, 150, 255), "item")  # Azul celestial
criar_textura("cristal_infernal", (200, 50, 50), "item")      # Vermelho infernal
criar_textura("nucleo_energetico", (200, 200, 50), "item")    # Amarelo energético
criar_textura("picareta_aquecida", (100, 100, 200), "item")   # Azul água
criar_textura("espada_energetica", (255, 150, 0), "item")     # Laranja elétrico
criar_textura("machado_plasmatico", (150, 0, 255), "item")    # Roxo plasma

# BLOCKS
print("\n=== Criando Texturas de Blocos ===")
criar_textura("minério_essencia", (80, 120, 200), "block")    # Azul minério
criar_textura("bau_infinito", (150, 100, 50), "block")        # Marrom baú
criar_textura("bloco_energetico", (200, 100, 255), "block")   # Roxo claro energia

print("\n✅ Todas as texturas foram criadas com sucesso!")
