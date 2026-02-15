package dev.tonimatas.arcanetools.helpers.fabric;

import dev.tonimatas.arcanetools.ArcaneTools;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

import java.util.Optional;

public class PlatformHelperImpl {
    public static String getModVersion() {
        Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(ArcaneTools.MOD_ID);
        return modContainer.map(container -> container.getMetadata().getVersion().getFriendlyString()).orElse(null);
    }
}
