package org.bukkit.craftbukkit.v1_19_R3.entity;

import org.bukkit.craftbukkit.v1_19_R3.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Slime;

public class CraftSlime extends CraftMob implements Slime, CraftEnemy {

    public CraftSlime(CraftServer server, net.minecraft.world.entity.monster.Slime entity) {
        super(server, entity);
    }

    @Override
    public int getSize() {
        return getHandle().getSize();
    }

    @Override
    public void setSize(int size) {
        getHandle().setSize(size, true);
    }

    @Override
    public net.minecraft.world.entity.monster.Slime getHandle() {
        return (net.minecraft.world.entity.monster.Slime) entity;
    }

    @Override
    public String toString() {
        return "CraftSlime";
    }

    @Override
    public EntityType getType() {
        return EntityType.SLIME;
    }
}
