package dev.tonimatas.arcanetools.registry;

import dev.tonimatas.arcanetools.ArcaneTools;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcaneTools.MOD_ID);

    public static final DeferredItem<SwordItem> ARCANE_SWORD = ITEMS.register("arcane_sword", () -> new SwordItem(Tiers.WOOD, new Item.Properties()
            .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, 2F))));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
