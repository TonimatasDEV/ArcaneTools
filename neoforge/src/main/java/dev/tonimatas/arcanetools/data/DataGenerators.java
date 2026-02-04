package dev.tonimatas.arcanetools.data;

import dev.tonimatas.arcanetools.ArcaneTools;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = ArcaneTools.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        
    }
}
