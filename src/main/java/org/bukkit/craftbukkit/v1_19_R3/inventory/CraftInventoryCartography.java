package org.bukkit.craftbukkit.v1_19_R3.inventory;

import net.minecraft.world.Container;
import org.bukkit.inventory.CartographyInventory;

public class CraftInventoryCartography extends CraftResultInventory implements CartographyInventory {

    public CraftInventoryCartography(Container inventory, Container resultInventory) {
        super(inventory, resultInventory);
    }
}
