package dev.tonimatas.arcanetools.platform.services;

import net.minecraft.world.item.Item;

public interface IModItemsRegistry {
    Item register(String id, Item item);
}
