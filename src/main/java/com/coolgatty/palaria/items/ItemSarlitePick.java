package com.coolgatty.palaria.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemSarlitePick extends ItemPickaxe 
{

	public ItemSarlitePick(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("sarlitepick");
		//setTextureName(Reference.MODID + ";" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}

}
