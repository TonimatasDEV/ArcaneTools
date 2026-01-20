package dev.tonimatas.arcanetools;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(ArcaneTools.MOD_ID)
public class ArcaneToolsNeoForge {
    public boolean isLoaded = false;
    
    @SuppressWarnings("unused")
    public ArcaneToolsNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::register);
    }
    
    @SubscribeEvent
    public void register(RegisterEvent event) {
        if (!isLoaded) {
            ArcaneTools.init();
            isLoaded = true;
        }
    }
}
