package com.coolgatty.palaria.help;

import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.world.WorldGenOres;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterHelper 
{
	//Block
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
		
    public static void registerBlock(Block block, Class<? extends ItemBlock> itemclass)
    {
        GameRegistry.registerBlock(block, itemclass, block.getUnlocalizedName().substring(5));
    }
    
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String file) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MODID + ":" + file, "inventory"));
	}
	
	public static void registerMetaBlocks(Block block, String... names)
	{
		Item item = Item.getItemFromBlock(block);
		ModelBakery.addVariantName(item, names);
	}
    
	//Item
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
