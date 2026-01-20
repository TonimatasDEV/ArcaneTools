package dev.tonimatas.arcanetools.platform.services;

import net.minecraft.world.entity.player.Player;

public interface IPlatformHelper {

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Gets the version of ArcaneTools.
     *
     * @return The version of ArcaneTools.
     */
    String getModVersion();

    /**
     * Check player permissions.
     *
     * @param player     Player name.
     * @param permission Permission to check.
     * @return Result of player permission.
     */
    boolean hasPermission(Player player, String permission);
}
