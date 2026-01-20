package dev.tonimatas.arcanetools;

import net.fabricmc.api.ModInitializer;

public class ArcaneToolsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ArcaneTools.init();
    }
}
