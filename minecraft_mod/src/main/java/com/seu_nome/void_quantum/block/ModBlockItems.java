package com.seu_nome.void_quantum.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.seu_nome.void_quantum.VoidQuantum;

public class ModBlockItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VoidQuantum.MOD_ID);

    // MINÉRIOS
    public static final RegistryObject<Item> MINÉRIO_BASICO = ITEMS.register("minério_basico",
            () -> new BlockItem(ModBlocks.MINÉRIO_BASICO.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINÉRIO_ELEMENTAR = ITEMS.register("minério_elementar",
            () -> new BlockItem(ModBlocks.MINÉRIO_ELEMENTAR.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINÉRIO_AVANCADO = ITEMS.register("minério_avancado",
            () -> new BlockItem(ModBlocks.MINÉRIO_AVANCADO.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINÉRIO_SUPERIOR = ITEMS.register("minério_superior",
            () -> new BlockItem(ModBlocks.MINÉRIO_SUPERIOR.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINÉRIO_SUPREMO = ITEMS.register("minério_supremo",
            () -> new BlockItem(ModBlocks.MINÉRIO_SUPREMO.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINÉRIO_INFINITO = ITEMS.register("minério_infinito",
            () -> new BlockItem(ModBlocks.MINÉRIO_INFINITO.get(), new Item.Properties()));

    // STORAGE
    public static final RegistryObject<Item> BLOCO_ESSENCIA_INFINITA = ITEMS.register("bloco_essencia_infinita",
            () -> new BlockItem(ModBlocks.BLOCO_ESSENCIA_INFINITA.get(), new Item.Properties()));

    // BAÚS
    public static final RegistryObject<Item> BAU_INFINITO_T1 = ITEMS.register("bau_infinito_t1",
            () -> new BlockItem(ModBlocks.BAU_INFINITO_T1.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAU_INFINITO_T5 = ITEMS.register("bau_infinito_t5",
            () -> new BlockItem(ModBlocks.BAU_INFINITO_T5.get(), new Item.Properties()));

    // GERADORES
    public static final RegistryObject<Item> GERADOR_BASICO = ITEMS.register("gerador_basico",
            () -> new BlockItem(ModBlocks.GERADOR_BASICO.get(), new Item.Properties()));

    public static final RegistryObject<Item> GERADOR_ELEMENTAR = ITEMS.register("gerador_elementar",
            () -> new BlockItem(ModBlocks.GERADOR_ELEMENTAR.get(), new Item.Properties()));

    public static final RegistryObject<Item> GERADOR_SUPERIOR = ITEMS.register("gerador_superior",
            () -> new BlockItem(ModBlocks.GERADOR_SUPERIOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> GERADOR_INFINITO = ITEMS.register("gerador_infinito",
            () -> new BlockItem(ModBlocks.GERADOR_INFINITO.get(), new Item.Properties()));

    // REATORES
    public static final RegistryObject<Item> REATOR_FISSAO = ITEMS.register("reator_fissao",
            () -> new BlockItem(ModBlocks.REATOR_FISSAO.get(), new Item.Properties()));

    public static final RegistryObject<Item> REATOR_FUSAO = ITEMS.register("reator_fusao",
            () -> new BlockItem(ModBlocks.REATOR_FUSAO.get(), new Item.Properties()));

    public static final RegistryObject<Item> REATOR_TERMOCLEAR = ITEMS.register("reator_termoclear",
            () -> new BlockItem(ModBlocks.REATOR_TERMOCLEAR.get(), new Item.Properties()));

    public static final RegistryObject<Item> REATOR_HIBRIDO = ITEMS.register("reator_hibrido",
            () -> new BlockItem(ModBlocks.REATOR_HIBRIDO.get(), new Item.Properties()));

    // PROCESSADORES
    public static final RegistryObject<Item> PROCESSADOR_TIER1 = ITEMS.register("processador_tier1",
            () -> new BlockItem(ModBlocks.PROCESSADOR_TIER1.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROCESSADOR_TIER5 = ITEMS.register("processador_tier5",
            () -> new BlockItem(ModBlocks.PROCESSADOR_TIER5.get(), new Item.Properties()));

    // DECORATIVOS
    public static final RegistryObject<Item> BLOCO_ENERGETICO = ITEMS.register("bloco_energetico",
            () -> new BlockItem(ModBlocks.BLOCO_ENERGETICO.get(), new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
