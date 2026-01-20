package dev.tonimatas.arcanetools;

import dev.tonimatas.arcanetools.platform.Services;
import dev.tonimatas.arcanetools.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneTools {
    public static final String MOD_ID = "arcanetools";
    public static final Logger LOGGER = LoggerFactory.getLogger("ArcaneTools");

    public static void init() {
        String platform = Services.PLATFORM.getPlatformName();
        String version = Services.PLATFORM.getModVersion();

        ModItems.init();
        
        LOGGER.info("ArcaneTools {} {} has been initialized!", version, platform);
    }
    
    
}
