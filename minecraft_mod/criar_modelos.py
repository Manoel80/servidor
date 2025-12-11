#!/usr/bin/env python3
import json
import os

os.chdir("/workspaces/servidor/minecraft_mod")

# Items simples (generated)
ITEMS_GENERATED = [
    # Essências
    'essencia_basica', 'essencia_elementar', 'essencia_avancada',
    'essencia_superior', 'essencia_suprema', 'essencia_infinita',
    # Cristais
    'cristal_elementar', 'cristal_avancado', 'cristal_superior',
    'cristal_supremo', 'cristal_infinito',
    # Núcleos
    'nucleo_elementar', 'nucleo_avancado', 'nucleo_superior',
    'nucleo_supremo', 'nucleo_infinito',
    # Baterias
    'bateria_basica', 'bateria_elementar', 'bateria_avancada',
    'bateria_superior', 'bateria_suprema', 'bateria_infinita'
]

# Ferramentas (handheld)
FERRAMENTAS = [
    'picareta_elementar', 'espada_elementar', 'machado_elementar',
    'picareta_suprema', 'espada_suprema', 'machado_supremo'
]

# Armaduras
ARMADURAS = [
    'helmet_elementar', 'chestplate_elementar', 'leggings_elementar', 'boots_elementar',
    'helmet_superior', 'chestplate_superior', 'leggings_superior', 'boots_superior',
    'helmet_infinito', 'chestplate_infinito', 'leggings_infinito', 'boots_infinito'
]

print("Criando modelos JSON...")

# Criar modelos de items generated
for item in ITEMS_GENERATED + ARMADURAS:
    modelo = {
        "parent": "item/generated",
        "textures": {
            "layer0": f"nexus_energetico:item/{item}"
        }
    }
    caminho = f"src/main/resources/assets/nexus_energetico/models/item/{item}.json"
    with open(caminho, 'w') as f:
        json.dump(modelo, f, indent=2)
    print(f"  ✓ {item}.json")

# Criar modelos de ferramentas (handheld)
for ferramenta in FERRAMENTAS:
    modelo = {
        "parent": "item/handheld",
        "textures": {
            "layer0": f"nexus_energetico:item/{ferramenta}"
        }
    }
    caminho = f"src/main/resources/assets/nexus_energetico/models/item/{ferramenta}.json"
    with open(caminho, 'w') as f:
        json.dump(modelo, f, indent=2)
    print(f"  ✓ {ferramenta}.json (handheld)")

# Blocos
BLOCOS = [
    'minério_basico', 'minério_elementar', 'minério_avancado', 'minério_superior', 'minério_supremo', 'minério_infinito',
    'bau_infinito_t1', 'bau_infinito_t5', 'gerador_basico', 'gerador_elementar', 'gerador_superior', 'gerador_infinito',
    'reator_fissao', 'reator_fusao', 'reator_termoclear', 'reator_hibrido',
    'processador_tier1', 'processador_tier5', 'bloco_energetico', 'bloco_essencia_infinita'
]

print("\nCriando modelos de BLOCOS...")
for bloco in BLOCOS:
    # Modelo 3D do bloco
    modelo_bloco = {
        "parent": "block/cube_all",
        "textures": {
            "all": f"nexus_energetico:block/{bloco}"
        }
    }
    caminho_bloco = f"src/main/resources/assets/nexus_energetico/models/block/{bloco}.json"
    with open(caminho_bloco, 'w') as f:
        json.dump(modelo_bloco, f, indent=2)
    print(f"  ✓ {bloco}.json (block)")
    
    # Modelo do item do bloco
    modelo_item = {
        "parent": f"nexus_energetico:block/{bloco}"
    }
    caminho_item = f"src/main/resources/assets/nexus_energetico/models/item/{bloco}.json"
    with open(caminho_item, 'w') as f:
        json.dump(modelo_item, f, indent=2)
    print(f"  ✓ {bloco}.json (item)")

# Criar blockstates
print("\nCriando BLOCKSTATES...")
for bloco in BLOCOS:
    blockstate = {
        "variants": {
            "": {
                "model": f"nexus_energetico:block/{bloco}"
            }
        }
    }
    caminho = f"src/main/resources/assets/nexus_energetico/blockstates/{bloco}.json"
    with open(caminho, 'w') as f:
        json.dump(blockstate, f, indent=2)
    print(f"  ✓ {bloco}.json")

print(f"\n✅ Total: {len(ITEMS_GENERATED) + len(FERRAMENTAS) + len(ARMADURAS) + (len(BLOCOS) * 2)} modelos criados!")
