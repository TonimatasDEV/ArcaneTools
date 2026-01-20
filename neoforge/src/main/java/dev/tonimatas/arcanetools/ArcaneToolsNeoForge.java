package dev.tonimatas.arcanetools;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ArcaneTools.MOD_ID)
public class ArcaneToolsNeoForge {
    @SuppressWarnings("unused")
    public ArcaneToolsNeoForge(IEventBus eventBus) {
        ArcaneTools.init();
    }
}
