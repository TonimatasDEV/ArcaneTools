package dev.tonimatas.arcanetools.registry;

import dev.tonimatas.arcanetools.platform.Services;
import dev.tonimatas.arcanetools.platform.services.IModItemsRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ModItems {
    private static final IModItemsRegistry ITEMS = Services.MOD_ITEMS;
    
    public static final Item ARCANE_SWORD = ITEMS.register("arcane_sword", new SwordItem(Tiers.NETHERITE, new Item.Properties()
            .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, 2F))));

    public static void init() {
        // Nothing here...
    }
}
