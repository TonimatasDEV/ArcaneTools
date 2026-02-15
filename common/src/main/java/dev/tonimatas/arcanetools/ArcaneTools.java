package dev.tonimatas.arcanetools;

import dev.architectury.injectables.targets.ArchitecturyTarget;
import dev.tonimatas.arcanetools.helpers.PlatformHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneTools {
    public static final String MOD_ID = "arcanetools";
    public static final Logger LOGGER = LoggerFactory.getLogger("ArcaneTools");

    public static void init() {
        String platform = ArchitecturyTarget.getCurrentTarget();
        String version = PlatformHelper.getModVersion();
        
        LOGGER.info("ArcaneTools {} {} has been initialized!", version, platform);
    }
    
    
}
