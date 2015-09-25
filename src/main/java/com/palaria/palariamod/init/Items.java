package com.palaria.palariamod.init;

import com.palaria.palariamod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items 
{
	public static Item wood_blade;
	
	public static void init()
	{
		wood_blade = new Item().setUnlocalizedName("wood_blade");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(wood_blade, wood_blade.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(wood_blade);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "Inventory"));
	}
}
