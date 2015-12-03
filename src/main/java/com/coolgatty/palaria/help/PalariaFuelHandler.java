package com.coolgatty.palaria.help;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.items.ItemMod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class PalariaFuelHandler implements IFuelHandler 
{
 public int getBurnTime(ItemStack fuel) 
 	{
	 if(fuel.getItem() == ItemMod.nelium)
		 return 2400;
	 else
		 return 0;
 	}
}