package com.coolgatty.palaria.items;

import com.coolgatty.palaria.blocks.BlockFlamiteOre;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockSarliteOre;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod 
{	
	//Items
	public static Item sarliteingot;
	public static Item flamiteingot;
	
	//Tools	
	public static Item sarliteshovel;
	public static Item sarlitepick;
	public static Item sarliteaxe;
	public static Item sarlitehoe;
	
	public static Item flamiteshovel;
	public static Item flamitepick;
	public static Item flamiteaxe;
	public static Item flamitehoe;
	
	//Swords
	public static Item sarlitesword;
	public static Item flamitesword;
	
	//Materials
	static ToolMaterial SARLITE_TOOLS = EnumHelper.addToolMaterial("SARLITE_TOOLS", 4, 2432, 8.5F, 3.0F, 10);
	static ToolMaterial FLAMITE_TOOLS = EnumHelper.addToolMaterial("FLAMITE_TOOLS", 4, 2576, 9.0F, 3.0F, 10);
	
	static ToolMaterial SARLITE_SWORD = EnumHelper.addToolMaterial("SARLITE_SWORD", 4, 2432, 8.5F, 4.0F, 10);
	static ToolMaterial FLAMITE_SWORD = EnumHelper.addToolMaterial("FLAMITE_SWORD", 4, 2576, 9.0F, 5.0F, 10);
	
	
	public static void init()
	{
		//Items	
		sarliteingot = new Item().setUnlocalizedName("sarliteingot").setCreativeTab(CreativeTabs.tabMaterials);
		flamiteingot = new Item().setUnlocalizedName("flamiteingot").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Tools
		sarliteshovel = new ItemSpade(SARLITE_TOOLS).setUnlocalizedName("sarliteshovel").setCreativeTab(CreativeTabs.tabTools);
		sarlitepick = new ItemModPickaxe(SARLITE_TOOLS).setUnlocalizedName("sarlitepick").setCreativeTab(CreativeTabs.tabTools);
		sarliteaxe = new ItemModAxe(SARLITE_TOOLS).setUnlocalizedName("sarliteaxe").setCreativeTab(CreativeTabs.tabTools);
		sarlitehoe = new ItemHoe(SARLITE_TOOLS).setUnlocalizedName("sarlitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		flamiteshovel = new ItemSpade(FLAMITE_TOOLS).setUnlocalizedName("flamiteshovel").setCreativeTab(CreativeTabs.tabTools);
		flamitepick = new ItemModPickaxe(FLAMITE_TOOLS).setUnlocalizedName("flamitepick").setCreativeTab(CreativeTabs.tabTools);
		flamiteaxe = new ItemModAxe(FLAMITE_TOOLS).setUnlocalizedName("flamiteaxe").setCreativeTab(CreativeTabs.tabTools);
		flamitehoe = new ItemHoe(FLAMITE_TOOLS).setUnlocalizedName("flamitehoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Swords
		sarlitesword = new ItemSword(SARLITE_SWORD).setUnlocalizedName("sarlitesword").setCreativeTab(CreativeTabs.tabCombat);
		flamitesword = new ItemSword(FLAMITE_SWORD).setUnlocalizedName("flamitesword").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void register()
	{	

		//Items
		RegisterHelper.registerItem(sarliteingot);
		RegisterHelper.registerItem(flamiteingot);
		
		//Tools
		RegisterHelper.registerItem(sarliteshovel);
		RegisterHelper.registerItem(sarlitepick);
		RegisterHelper.registerItem(sarliteaxe);
		RegisterHelper.registerItem(sarlitehoe);
		
		RegisterHelper.registerItem(flamiteshovel);
		RegisterHelper.registerItem(flamitepick);
		RegisterHelper.registerItem(flamiteaxe);
		RegisterHelper.registerItem(flamitehoe);
		
		//Swords
		RegisterHelper.registerItem(sarlitesword);
		RegisterHelper.registerItem(flamitesword);
		
		
		//Recipes
		/*Sarlite*/
		GameRegistry.addRecipe(new ItemStack(sarlitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarliteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(sarlitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', sarliteingot, 'Y', Items.stick
		});
		
		/*Flamite*/
		
		GameRegistry.addRecipe(new ItemStack(flamitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(flamitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', flamiteingot, 'Y', Items.stick
		});
		
		
		//Smelting
		GameRegistry.addSmelting(BlockMod.sarliteore, new ItemStack(sarliteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.flamiteore, new ItemStack(flamiteingot), 5.0F);
	}
	
	public static void registerRenders ()
	{
		//Items
		registerRender(sarliteingot);
		registerRender(flamiteingot);
		
		//Tools
		registerRender(sarliteshovel);
		registerRender(sarlitepick);
		registerRender(sarliteaxe);
		registerRender(sarlitehoe);
		
		registerRender(flamiteshovel);
		registerRender(flamitepick);
		registerRender(flamiteaxe);
		registerRender(flamitehoe);
		
		//Swords
		registerRender(sarlitesword);
		registerRender(flamitesword);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
