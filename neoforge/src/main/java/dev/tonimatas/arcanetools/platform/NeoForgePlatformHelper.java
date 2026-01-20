package dev.tonimatas.arcanetools.platform;

import dev.tonimatas.arcanetools.ArcaneTools;
import dev.tonimatas.arcanetools.platform.services.IPlatformHelper;
import net.minecraft.world.entity.player.Player;
import net.neoforged.fml.loading.LoadingModList;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public String getModVersion() {
        return LoadingModList.get().getModFileById(ArcaneTools.MOD_ID).versionString();
    }

    @Override
    public boolean hasPermission(Player player, String permission) {
        return false;
        //return player.hasPermissions(3); // TODO
    }
}
