#!/usr/bin/env python3
from PIL import Image, ImageDraw
import os

os.chdir("/workspaces/servidor/minecraft_mod")

# Cores do Nexus Energético
CORES = {
    # Essências
    'essencia_basica': (100, 100, 100),           # Cinza
    'essencia_elementar': (0, 150, 255),          # Azul Claro
    'essencia_avancada': (0, 200, 255),           # Ciano
    'essencia_superior': (150, 0, 255),           # Roxo
    'essencia_suprema': (255, 0, 150),            # Magenta
    'essencia_infinita': (255, 255, 0),           # Amarelo Brilhante
    
    # Cristais
    'cristal_elementar': (100, 200, 255),         # Azul Gelo
    'cristal_avancado': (0, 255, 200),            # Ciano Neon
    'cristal_superior': (200, 100, 255),          # Roxo Neon
    'cristal_supremo': (255, 0, 200),             # Magenta Neon
    'cristal_infinito': (255, 255, 150),          # Amarelo Ouro
    
    # Núcleos
    'nucleo_elementar': (0, 100, 200),            # Azul Escuro
    'nucleo_avancado': (0, 150, 255),             # Azul Medio
    'nucleo_superior': (100, 0, 255),             # Roxo Escuro
    'nucleo_supremo': (200, 0, 150),              # Roxo Rosa
    'nucleo_infinito': (255, 200, 0),             # Ouro
    
    # Baterias
    'bateria_basica': (100, 100, 100),            # Cinza
    'bateria_elementar': (0, 150, 255),           # Azul
    'bateria_avancada': (0, 200, 255),            # Ciano
    'bateria_superior': (150, 0, 255),            # Roxo
    'bateria_suprema': (255, 0, 150),             # Magenta
    'bateria_infinita': (255, 255, 0),            # Amarelo
    
    # Ferramentas
    'picareta_elementar': (100, 180, 255),        # Azul Claro
    'espada_elementar': (0, 150, 255),            # Azul
    'machado_elementar': (100, 200, 255),         # Azul Claro
    'picareta_suprema': (255, 200, 0),            # Ouro
    'espada_suprema': (255, 150, 0),              # Laranja Ouro
    'machado_supremo': (255, 100, 0),             # Laranja Brilhante
    
    # Armaduras
    'helmet_elementar': (0, 150, 255),
    'chestplate_elementar': (0, 150, 255),
    'leggings_elementar': (0, 150, 255),
    'boots_elementar': (0, 150, 255),
    'helmet_superior': (150, 0, 255),
    'chestplate_superior': (150, 0, 255),
    'leggings_superior': (150, 0, 255),
    'boots_superior': (150, 0, 255),
    'helmet_infinito': (255, 200, 0),
    'chestplate_infinito': (255, 200, 0),
    'leggings_infinito': (255, 200, 0),
    'boots_infinito': (255, 200, 0),
    
    # Minérios
    'minerio_basico': (100, 100, 100),            # Cinza
    'minerio_elementar': (50, 150, 255),          # Azul
    'minerio_avancado': (0, 200, 255),            # Ciano
    'minerio_superior': (150, 0, 255),            # Roxo
    'minerio_supremo': (255, 0, 150),             # Magenta
    'minerio_infinito': (255, 255, 0),            # Amarelo
    
    # Blocos
    'bau_infinito_t1': (150, 120, 80),            # Marrom
    'bau_infinito_t5': (200, 0, 150),             # Magenta
    'gerador_basico': (200, 0, 0),                # Vermelho
    'gerador_elementar': (255, 100, 0),           # Laranja
    'gerador_superior': (255, 200, 0),            # Amarelo
    'gerador_infinito': (200, 200, 200),          # Prata
    'reator_fissao': (200, 50, 50),               # Vermelho Escuro
    'reator_fusao': (50, 150, 200),               # Azul Escuro
    'reator_termoclear': (200, 50, 200),          # Roxo Escuro
    'reator_hibrido': (100, 100, 100),            # Cinza Escuro
    'processador_tier1': (50, 100, 200),          # Azul
    'processador_tier5': (200, 200, 200),         # Prata
    'bloco_energetico': (150, 0, 255),            # Roxo
    'bloco_essencia_infinita': (255, 255, 200),   # Amarelo Claro
}

def criar_textura_item(nome, cor):
    tamanho = 16
    img = Image.new('RGBA', (tamanho, tamanho), (0, 0, 0, 0))
    draw = ImageDraw.Draw(img)
    
    # Fundo com gradiente simulado
    for y in range(tamanho):
        brilho = int(255 * (1 - y / tamanho * 0.3))
        cor_linha = tuple(min(c, brilho) for c in cor)
        draw.line([(0, y), (tamanho, y)], fill=cor_linha + (255,))
    
    # Brilho central
    brilho_cor = tuple(min(255, c + 50) for c in cor)
    draw.ellipse([(4, 4), (12, 12)], fill=brilho_cor + (200,))
    
    # Borda escura
    cor_escura = tuple(max(0, c - 100) for c in cor)
    draw.rectangle([(0, 0), (tamanho-1, tamanho-1)], outline=cor_escura + (255,), width=1)
    
    return img

def criar_textura_bloco(nome, cor):
    tamanho = 16
    img = Image.new('RGB', (tamanho, tamanho), cor)
    draw = ImageDraw.Draw(img)
    
    # Padrão de pedra/textura
    for x in range(0, tamanho, 2):
        for y in range(0, tamanho, 2):
            if (x + y) % 4 == 0:
                variacao = tuple(max(0, min(255, c - 20)) for c in cor)
                draw.rectangle([(x, y), (x+2, y+2)], fill=variacao)
    
    # Linha de brilho na borda superior
    brilho_cor = tuple(min(255, c + 40) for c in cor)
    draw.line([(0, 0), (tamanho, 0)], fill=brilho_cor, width=1)
    
    # Sombra na borda inferior
    sombra_cor = tuple(max(0, c - 60) for c in cor)
    draw.line([(0, tamanho-1), (tamanho, tamanho-1)], fill=sombra_cor, width=1)
    
    return img

print("╔════════════════════════════════════════╗")
print("║  Gerando Texturas Nexus Energético    ║")
print("╚════════════════════════════════════════╝\n")

# Criar texturas de items
print("Criando texturas de ITEMS...")
for nome, cor in CORES.items():
    if nome not in ['bau_infinito_t1', 'bau_infinito_t5', 'gerador_basico', 'gerador_elementar', 
                    'gerador_superior', 'gerador_infinito', 'reator_fissao', 'reator_fusao',
                    'reator_termoclear', 'reator_hibrido', 'processador_tier1', 'processador_tier5',
                    'bloco_energetico', 'bloco_essencia_infinita', 'minerio_basico', 'minerio_elementar',
                    'minerio_avancado', 'minerio_superior', 'minerio_supremo', 'minerio_infinito']:
        img = criar_textura_item(nome, cor)
        caminho = f"src/main/resources/assets/nexus_energetico/textures/item/{nome}.png"
        img.save(caminho)
        print(f"  ✓ {nome}.png")

# Criar texturas de blocos
print("\nCriando texturas de BLOCOS...")
blocos = ['bau_infinito_t1', 'bau_infinito_t5', 'gerador_basico', 'gerador_elementar', 
          'gerador_superior', 'gerador_infinito', 'reator_fissao', 'reator_fusao',
          'reator_termoclear', 'reator_hibrido', 'processador_tier1', 'processador_tier5',
          'bloco_energetico', 'bloco_essencia_infinita', 'minerio_basico', 'minerio_elementar',
          'minerio_avancado', 'minerio_superior', 'minerio_supremo', 'minerio_infinito']

for nome in blocos:
    if nome in CORES:
        img = criar_textura_bloco(nome, CORES[nome])
        caminho = f"src/main/resources/assets/nexus_energetico/textures/block/{nome}.png"
        img.save(caminho)
        print(f"  ✓ {nome}.png")

print("\n✅ Todas as texturas foram criadas!")
print(f"\nTotal: {len(CORES)} texturas criadas")
