package dev.tonimatas.arcanetools.helpers.neoforge;

import dev.tonimatas.arcanetools.ArcaneTools;
import net.neoforged.fml.loading.LoadingModList;

public class PlatformHelperImpl {
    public static String getModVersion() {
        return LoadingModList.get().getModFileById(ArcaneTools.MOD_ID).versionString();
    }
}
