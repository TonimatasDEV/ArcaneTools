package dev.tonimatas.arcanetools.platform;

import dev.tonimatas.arcanetools.ArcaneTools;
import dev.tonimatas.arcanetools.platform.services.IModItemsRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricModItemsRegistry implements IModItemsRegistry {
    @Override
    public Item register(String id, Item item) {
        ResourceLocation resourceLocation = ResourceLocation.fromNamespaceAndPath(ArcaneTools.MOD_ID, id);
        return Registry.register(BuiltInRegistries.ITEM, resourceLocation, item);
    }
}
