package com.seu_nome.void_quantum;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.loading.FMLEnvironment;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.seu_nome.void_quantum.item.ModItems;
import com.seu_nome.void_quantum.block.ModBlocks;
import com.seu_nome.void_quantum.block.ModBlockItems;

@Mod(VoidQuantum.MOD_ID)
public class VoidQuantum {
    public static final String MOD_ID = "void_quantum";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VoidQuantum() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registra items (inclui armaduras)
        ModItems.register(modEventBus);
        ModBlockItems.register(modEventBus);

        // Registra blocos
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(this::clientSetup);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("╔════════════════════════════════════╗");
        LOGGER.info("║  NEXUS ENERGÉTICO - MOD CARREGADO  ║");
        LOGGER.info("║  6 Níveis de Progressão Energética ║");
        LOGGER.info("╚════════════════════════════════════╝");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Cliente configurado para Nexus Energético!");
    }
}
