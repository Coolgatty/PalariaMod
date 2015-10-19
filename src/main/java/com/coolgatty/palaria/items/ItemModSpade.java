package com.coolgatty.palaria.items;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemModSpade extends ItemTool
{
    private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand});
    private final Item repair;

    public ItemModSpade(Item.ToolMaterial material, Item repair)
    {
        super(4.0F - material.getDamageVsEntity(), material, EFFECTIVE_ON);
        this.repair = repair;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow;
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		if(repair.getItem().equals(this.repair))
			return true;
		else
			return false;
	}
}