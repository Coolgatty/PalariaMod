package com.coolgatty.palaria.items;

import com.coolgatty.palaria.blocks.BlockMod;
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemShick extends ItemTool
{
    private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand, Blocks.activator_rail, Blocks.coal_ore, Blocks.cobblestone, Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore, Blocks.double_stone_slab, Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice, Blocks.iron_block, Blocks.iron_ore, Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore, Blocks.mossy_cobblestone, Blocks.netherrack, Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore, Blocks.sandstone, Blocks.red_sandstone, Blocks.stone, Blocks.stone_slab});
    private final Item repair;

    protected ItemShick(Item.ToolMaterial material, Item repair)
    {
        super(5.25F - material.getDamageVsEntity(), material, EFFECTIVE_ON);
        this.repair = repair;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow && blockIn == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : blockIn == BlockMod.sarliteore ? this.toolMaterial.getHarvestLevel() == 3 : blockIn == BlockMod.flamiteore ? this.toolMaterial.getHarvestLevel() == 3 : blockIn == BlockMod.illiwonore ? this.toolMaterial.getHarvestLevel() == 4 : blockIn == BlockMod.afnamiteore ? this.toolMaterial.getHarvestLevel() == 5 : blockIn == BlockMod.endermiteore ? this.toolMaterial.getHarvestLevel() == 6 : blockIn == BlockMod.endendermiteore ? this.toolMaterial.getHarvestLevel() == 6 : (blockIn != Blocks.diamond_block && blockIn != Blocks.diamond_ore ? (blockIn != Blocks.emerald_ore && blockIn != Blocks.emerald_block ? (blockIn != Blocks.gold_block && blockIn != Blocks.gold_ore ? (blockIn != Blocks.iron_block && blockIn != Blocks.iron_ore ? (blockIn != Blocks.lapis_block && blockIn != Blocks.lapis_ore ? (blockIn != Blocks.redstone_ore && blockIn != Blocks.lit_redstone_ore ? (blockIn.getMaterial() == Material.rock ? true : (blockIn.getMaterial() == Material.iron ? true : blockIn.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
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