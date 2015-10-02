package com.coolgatty.palaria.blocks;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockFlamiteOre extends Block
{
	public BlockFlamiteOre()
	{
		super(Material.rock);
		setUnlocalizedName("flamiteore");
		setHardness(3.5F);
		setResistance(5.5F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
