package com.seu_nome.void_quantum.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.seu_nome.void_quantum.VoidQuantum;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VoidQuantum.MOD_ID);

    // ===== TIER 0: BÁSICO =====
    public static final RegistryObject<Item> ESSENCIA_BASICA = ITEMS.register("essencia_basica",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_BASICO = ITEMS.register("pauon_basico",
            () -> new Item(new Item.Properties()));

    // ===== TIER 1: ELEMENTAR =====
    public static final RegistryObject<Item> ESSENCIA_ELEMENTAR = ITEMS.register("essencia_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CRISTAL_ELEMENTAR = ITEMS.register("cristal_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> NUCLEO_ELEMENTAR = ITEMS.register("nucleo_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_ELEMENTAR = ITEMS.register("pauon_elementar",
            () -> new Item(new Item.Properties()));

    // ===== TIER 2: AVANÇADO =====
    public static final RegistryObject<Item> ESSENCIA_AVANCADA = ITEMS.register("essencia_avancada",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CRISTAL_AVANCADO = ITEMS.register("cristal_avancado",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> NUCLEO_AVANCADO = ITEMS.register("nucleo_avancado",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_AVANCADO = ITEMS.register("pauon_avancado",
            () -> new Item(new Item.Properties()));

    // ===== TIER 3: SUPERIOR =====
    public static final RegistryObject<Item> ESSENCIA_SUPERIOR = ITEMS.register("essencia_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CRISTAL_SUPERIOR = ITEMS.register("cristal_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> NUCLEO_SUPERIOR = ITEMS.register("nucleo_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_SUPERIOR = ITEMS.register("pauon_superior",
            () -> new Item(new Item.Properties()));

    // ===== TIER 4: SUPREMO =====
    public static final RegistryObject<Item> ESSENCIA_SUPREMA = ITEMS.register("essencia_suprema",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CRISTAL_SUPREMO = ITEMS.register("cristal_supremo",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> NUCLEO_SUPREMO = ITEMS.register("nucleo_supremo",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_SUPREMO = ITEMS.register("pauon_supremo",
            () -> new Item(new Item.Properties()));

    // ===== TIER 5: INFINITO =====
    public static final RegistryObject<Item> ESSENCIA_INFINITA = ITEMS.register("essencia_infinita",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CRISTAL_INFINITO = ITEMS.register("cristal_infinito",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> NUCLEO_INFINITO = ITEMS.register("nucleo_infinito",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PAUON_INFINITO = ITEMS.register("pauon_infinito",
            () -> new Item(new Item.Properties()));

    // ===== BATERIAS MODULARES =====
    public static final RegistryObject<Item> BATERIA_BASICA = ITEMS.register("bateria_basica",
            () -> new Item(new Item.Properties().durability(10000)));
    
    public static final RegistryObject<Item> BATERIA_ELEMENTAR = ITEMS.register("bateria_elementar",
            () -> new Item(new Item.Properties().durability(100000)));
    
    public static final RegistryObject<Item> BATERIA_AVANCADA = ITEMS.register("bateria_avancada",
            () -> new Item(new Item.Properties().durability(1000000)));
    
    public static final RegistryObject<Item> BATERIA_SUPERIOR = ITEMS.register("bateria_superior",
            () -> new Item(new Item.Properties().durability(10000000)));
    
    public static final RegistryObject<Item> BATERIA_SUPREMA = ITEMS.register("bateria_suprema",
            () -> new Item(new Item.Properties().durability(100000000)));
    
    public static final RegistryObject<Item> BATERIA_INFINITA = ITEMS.register("bateria_infinita",
            () -> new Item(new Item.Properties().durability(Integer.MAX_VALUE)));

    // ===== FERRAMENTAS PROGRESSIVAS (ITEMS SIMPLES) =====
    // Tier 1
    public static final RegistryObject<Item> PICARETA_ELEMENTAR = ITEMS.register("picareta_elementar",
            () -> new Item(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> ESPADA_ELEMENTAR = ITEMS.register("espada_elementar",
            () -> new Item(new Item.Properties().durability(600)));

    public static final RegistryObject<Item> MACHADO_ELEMENTAR = ITEMS.register("machado_elementar",
            () -> new Item(new Item.Properties().durability(700)));

    // Tier 5 (Supremo)
    public static final RegistryObject<Item> PICARETA_SUPREMA = ITEMS.register("picareta_suprema",
            () -> new Item(new Item.Properties().durability(5000)));

    public static final RegistryObject<Item> ESPADA_SUPREMA = ITEMS.register("espada_suprema",
            () -> new Item(new Item.Properties().durability(6000)));

    public static final RegistryObject<Item> MACHADO_SUPREMO = ITEMS.register("machado_supremo",
            () -> new Item(new Item.Properties().durability(7000)));

    // ===== ARMADURAS SIMPLES (TIERS) =====
    // Tier 1: Elementar
    public static final RegistryObject<Item> HELMET_ELEMENTAR = ITEMS.register("helmet_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CHESTPLATE_ELEMENTAR = ITEMS.register("chestplate_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> LEGGINGS_ELEMENTAR = ITEMS.register("leggings_elementar",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> BOOTS_ELEMENTAR = ITEMS.register("boots_elementar",
            () -> new Item(new Item.Properties()));
    
    // Tier 3: Superior
    public static final RegistryObject<Item> HELMET_SUPERIOR = ITEMS.register("helmet_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CHESTPLATE_SUPERIOR = ITEMS.register("chestplate_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> LEGGINGS_SUPERIOR = ITEMS.register("leggings_superior",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> BOOTS_SUPERIOR = ITEMS.register("boots_superior",
            () -> new Item(new Item.Properties()));
    
    // Tier 5: Infinito
    public static final RegistryObject<Item> HELMET_INFINITO = ITEMS.register("helmet_infinito",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> CHESTPLATE_INFINITO = ITEMS.register("chestplate_infinito",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> LEGGINGS_INFINITO = ITEMS.register("leggings_infinito",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> BOOTS_INFINITO = ITEMS.register("boots_infinito",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
