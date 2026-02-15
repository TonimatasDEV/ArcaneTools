package dev.tonimatas.arcanetools.data;

import dev.tonimatas.arcanetools.ArcaneTools;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;

public class ModDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }

    @Override
    public @Nullable String getEffectiveModId() {
        return ArcaneTools.MOD_ID;
    }
}
