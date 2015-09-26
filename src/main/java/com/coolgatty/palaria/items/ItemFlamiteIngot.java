package com.coolgatty.palaria.items;

import com.coolgatty.palaria.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFlamiteIngot extends Item 
{
	public ItemFlamiteIngot()
	{
		super ();
		setUnlocalizedName("slamiteingot");
		//setTextureName(Reference.MODID + ";" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
