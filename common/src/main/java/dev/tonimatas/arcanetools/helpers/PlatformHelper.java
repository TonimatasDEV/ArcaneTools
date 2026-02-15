package dev.tonimatas.arcanetools.helpers;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.injectables.targets.ArchitecturyTarget;

public class PlatformHelper {
    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    public static String getPlatformName() {
        return ArchitecturyTarget.getCurrentTarget();
    }

    /**
     * Gets the version of ArcaneTools.
     *
     * @return The version of ArcaneTools.
     */
    @ExpectPlatform
    public static String getModVersion() {
        throw new AssertionError();
    }
}
