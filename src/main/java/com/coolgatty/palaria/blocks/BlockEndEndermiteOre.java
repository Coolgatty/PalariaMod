package com.coolgatty.palaria.blocks;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.items.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEndEndermiteOre extends Block
{
	public BlockEndEndermiteOre()
	{
		super(Material.rock);
		setUnlocalizedName("endendermiteore");
		setHardness(10.5F);
		setResistance(14.5F);
		setHarvestLevel("pickaxe", 6);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
