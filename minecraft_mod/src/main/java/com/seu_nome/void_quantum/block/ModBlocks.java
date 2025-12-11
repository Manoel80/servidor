package com.seu_nome.void_quantum.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.seu_nome.void_quantum.VoidQuantum;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VoidQuantum.MOD_ID);

    // ===== TIER 0: MINÉRIOS BÁSICOS =====
        public static final RegistryObject<Block> MINÉRIO_BASICO = BLOCKS.register("minerio_basico",
            () -> new Block(Block.Properties.of().mapColor(MapColor.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== TIER 1: MINÉRIOS ELEMENTARES =====
        public static final RegistryObject<Block> MINÉRIO_ELEMENTAR = BLOCKS.register("minerio_elementar",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(4.0f, 4.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== TIER 2: MINÉRIOS AVANÇADOS =====
        public static final RegistryObject<Block> MINÉRIO_AVANCADO = BLOCKS.register("minerio_avancado",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(5.0f, 5.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== TIER 3: MINÉRIOS SUPERIORES =====
        public static final RegistryObject<Block> MINÉRIO_SUPERIOR = BLOCKS.register("minerio_superior",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(6.0f, 6.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== TIER 4: MINÉRIOS SUPREMOS =====
        public static final RegistryObject<Block> MINÉRIO_SUPREMO = BLOCKS.register("minerio_supremo",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(7.0f, 7.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== TIER 5: MINÉRIOS INFINITOS =====
        public static final RegistryObject<Block> MINÉRIO_INFINITO = BLOCKS.register("minerio_infinito",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(8.0f, 8.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // ===== BLOCOS DE STORAGE =====
    public static final RegistryObject<Block> BLOCO_ESSENCIA_INFINITA = BLOCKS.register("bloco_essencia_infinita",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0f, 6.0f).sound(SoundType.METAL)));

    // ===== BAÚ INFINITO MELHORADO (9 TIERS) =====
    public static final RegistryObject<Block> BAU_INFINITO_T1 = BLOCKS.register("bau_infinito_t1",
            () -> new Block(Block.Properties.of().mapColor(MapColor.METAL).strength(2.0f, 6.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BAU_INFINITO_T5 = BLOCKS.register("bau_infinito_t5",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(5.0f, 10.0f).sound(SoundType.METAL)));

    // ===== GERADORES DE ENERGIA =====
    public static final RegistryObject<Block> GERADOR_BASICO = BLOCKS.register("gerador_basico",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).strength(3.0f, 6.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GERADOR_ELEMENTAR = BLOCKS.register("gerador_elementar",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(4.0f, 8.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GERADOR_SUPERIOR = BLOCKS.register("gerador_superior",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(5.0f, 10.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GERADOR_INFINITO = BLOCKS.register("gerador_infinito",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(6.0f, 12.0f).sound(SoundType.METAL)));

    // ===== REATORES NUCLEARES =====
    public static final RegistryObject<Block> REATOR_FISSAO = BLOCKS.register("reator_fissao",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0f, 10.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> REATOR_FUSAO = BLOCKS.register("reator_fusao",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(6.0f, 12.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> REATOR_TERMOCLEAR = BLOCKS.register("reator_termoclear",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(7.0f, 15.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> REATOR_HIBRIDO = BLOCKS.register("reator_hibrido",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(8.0f, 20.0f).sound(SoundType.METAL)));

    // ===== BLOCOS DE PROCESSAMENTO =====
    public static final RegistryObject<Block> PROCESSADOR_TIER1 = BLOCKS.register("processador_tier1",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(3.0f, 6.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> PROCESSADOR_TIER5 = BLOCKS.register("processador_tier5",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0f, 10.0f).sound(SoundType.METAL)));

    // ===== BLOCOS DECORATIVOS =====
    public static final RegistryObject<Block> BLOCO_ENERGETICO = BLOCKS.register("bloco_energetico",
            () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(2.5f, 5.0f).sound(SoundType.METAL)));

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
