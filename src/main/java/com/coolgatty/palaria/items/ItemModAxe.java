package com.coolgatty.palaria.items;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemModAxe extends ItemTool
{
    private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});
    private static final String __OBFID = "CL_00001770";
    private final Item repair;

    protected ItemModAxe(Item.ToolMaterial material, Item repair)
    {
        super(6.0F - material.getDamageVsEntity(), material, EFFECTIVE_ON);
        this.repair = repair;
    }

    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
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