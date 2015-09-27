package com.coolgatty.palaria.blocks;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockSarliteOre extends Block
{
	public BlockSarliteOre()
	{
		super(Material.rock);
		setUnlocalizedName("sarliteore");
		//setBlockTextureName(Reference.MODID + ";" + getUnlocalizedName().substring(5));
		setHardness(3.5F);
		setResistance(5.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
