package dev.tonimatas.arcanetools;


import dev.tonimatas.arcanetools.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(ArcaneTools.MOD_ID)
public class ArcaneToolsNeoForge {
    
    @SuppressWarnings("unused")
    public ArcaneToolsNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.register(modEventBus);
    }
}
