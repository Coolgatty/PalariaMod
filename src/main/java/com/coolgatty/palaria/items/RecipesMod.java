package com.coolgatty.palaria.items;

import com.coolgatty.palaria.blocks.BlockMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class RecipesMod
{
	public static void addRecipes()
	{
		//Recipes
		
		/**************************************************************/
		/*Wood*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', Blocks.planks, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodstealth), new Object []
		{
			"X",
			"Y",
			'X', Blocks.planks, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodfalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', Blocks.planks, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodaxehead), new Object []
		{
			"X",
			'X', Items.wooden_axe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodswordhead), new Object []
		{
			"X",
			'X', Items.wooden_sword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodpickaxehead), new Object []
		{
			"X",
			'X', Items.wooden_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodshovelhead), new Object []
		{
			"X",
			'X', Items.wooden_shovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodbattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.woodaxehead, 'Y', ItemMod.woodswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.woodshovelhead, 'Y', ItemMod.woodpickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Stone*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', Blocks.cobblestone, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stonestealth), new Object []
		{
			"X",
			"Y",
			'X', Blocks.cobblestone, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stonefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', Blocks.cobblestone, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneaxehead), new Object []
		{
			"X",
			'X', Items.stone_axe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneswordhead), new Object []
		{
			"X",
			'X', Items.stone_sword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stonepickaxehead), new Object []
		{
			"X",
			'X', Items.stone_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneshovelhead), new Object []
		{
			"X",
			'X', Items.stone_shovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stonebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.stoneaxehead, 'Y', ItemMod.stoneswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.stoneshovelhead, 'Y', ItemMod.stonepickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Iron*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', Items.iron_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironstealth), new Object []
		{
			"X",
			"Y",
			'X', Items.iron_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironfalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', Items.iron_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironaxehead), new Object []
		{
			"X",
			'X', Items.iron_axe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironswordhead), new Object []
		{
			"X",
			'X', Items.iron_sword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironpickaxehead), new Object []
		{
			"X",
			'X', Items.iron_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironshovelhead), new Object []
		{
			"X",
			'X', Items.iron_shovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironbattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.ironaxehead, 'Y', ItemMod.ironswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.ironshovelhead, 'Y', ItemMod.ironpickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Diamond*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', Items.diamond, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondstealth), new Object []
		{
			"X",
			"Y",
			'X', Items.diamond, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondfalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', Items.diamond, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondaxehead), new Object []
		{
			"X",
			'X', Items.diamond_axe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondswordhead), new Object []
		{
			"X",
			'X', Items.diamond_sword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondpickaxehead), new Object []
		{
			"X",
			'X', Items.diamond_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondshovelhead), new Object []
		{
			"X",
			'X', Items.diamond_shovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondbattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.diamondaxehead, 'Y', ItemMod.diamondswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.diamondshovelhead, 'Y', ItemMod.diamondpickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Gold*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', Items.gold_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldstealth), new Object []
		{
			"X",
			"Y",
			'X', Items.gold_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldfalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', Items.gold_ingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldaxehead), new Object []
		{
			"X",
			'X', Items.golden_axe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldswordhead), new Object []
		{
			"X",
			'X', Items.golden_sword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldpickaxehead), new Object []
		{
			"X",
			'X', Items.golden_pickaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldshovelhead), new Object []
		{
			"X",
			'X', Items.golden_shovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldbattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.goldaxehead, 'Y', ItemMod.goldswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.goldshovelhead, 'Y', ItemMod.goldpickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Sarlite*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.sarliteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitestealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteaxehead), new Object []
		{
			"X",
			'X', ItemMod.sarliteaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteswordhead), new Object []
		{
			"X",
			'X', ItemMod.sarlitesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitepickaxehead), new Object []
		{
			"X",
			'X', ItemMod.sarlitepick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteshovelhead), new Object []
		{
			"X",
			'X', ItemMod.sarliteshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.sarliteaxehead, 'Y', ItemMod.sarliteswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.sarliteshovelhead, 'Y', ItemMod.sarlitepickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Flamite*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.flamiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitestealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.flamiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteaxehead), new Object []
		{
			"X",
			'X', ItemMod.flamiteaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteswordhead), new Object []
		{
			"X",
			'X', ItemMod.flamitesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitepickaxehead), new Object []
		{
			"X",
			'X', ItemMod.flamitepick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteshovelhead), new Object []
		{
			"X",
			'X', ItemMod.flamiteshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.flamiteaxehead, 'Y', ItemMod.flamiteswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.flamiteshovelhead, 'Y', ItemMod.flamitepickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Clarite*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteaxe), new Object [] 
		{
				"XX", 
				"XY", 
				" Y", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.claritegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.claritegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.claritegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.claritegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritestealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteaxehead), new Object []
		{
			"X",
			'X', ItemMod.clariteaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteswordhead), new Object []
		{
			"X",
			'X', ItemMod.claritesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritepickaxehead), new Object []
		{
			"X",
			'X', ItemMod.claritepick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteshovelhead), new Object []
		{
			"X",
			'X', ItemMod.clariteshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.clariteaxehead, 'Y', ItemMod.clariteswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.clariteshovelhead, 'Y', ItemMod.claritepickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Illiwon*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonpick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonhoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
				'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonsword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonhelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonchestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.illiwongem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonstealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonfalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.illiwongem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonaxehead), new Object []
		{
			"X",
			'X', ItemMod.illiwonaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonswordhead), new Object []
		{
			"X",
			'X', ItemMod.illiwonsword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonpickaxehead), new Object []
		{
			"X",
			'X', ItemMod.illiwonpick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonshovelhead), new Object []
		{
			"X",
			'X', ItemMod.illiwonshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonbattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.illiwonaxehead, 'Y', ItemMod.illiwonswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.illiwonshovelhead, 'Y', ItemMod.illiwonpickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Afnamite*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.afnamitegem
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitestealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.afnamitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteaxehead), new Object []
		{
			"X",
			'X', ItemMod.afnamiteaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteswordhead), new Object []
		{
			"X",
			'X', ItemMod.afnamitesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitepickaxehead), new Object []
		{
			"X",
			'X', ItemMod.afnamitepick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteshovelhead), new Object []
		{
			"X",
			'X', ItemMod.afnamiteshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.afnamiteaxehead, 'Y', ItemMod.afnamiteswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.afnamiteshovelhead, 'Y', ItemMod.afnamitepickaxehead, 'Z', Items.stick
		});
		
		/**************************************************************/
		/*Endermite*/
		/**************************************************************/
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitepick), new Object [] 
		{
				"XXX", 
				" Y ", 
				" Y ", 
				'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteshovel), new Object [] 
		{
				"X", 
				"Y", 
				"Y", 
				'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitesword), new Object [] 
		{
				"X", 
				"X", 
				"Y", 
				'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitehelmet), new Object []
		{
			"XXX",
			"X X",
			'X', ItemMod.endermiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitechestplate), new Object []
		{
			"X X",
			"XXX",
			"XXX",
			'X', ItemMod.endermiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteleggings), new Object []
		{
			"XXX",
			"X X",
			"X X",
			'X', ItemMod.endermiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteboots), new Object []
		{
			"X X",
			"X X",
			'X', ItemMod.endermiteingot
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteblade), new Object []
		{
			"XXY",
			"X Y",
			"XXY",
			'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitestealth), new Object []
		{
			"X",
			"Y",
			'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitefalkion), new Object []
		{
			"X X",
			" X ",
			" Y ",
			'X', ItemMod.endermiteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteaxehead), new Object []
		{
			"X",
			'X', ItemMod.endermiteaxe
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteswordhead), new Object []
		{
			"X",
			'X', ItemMod.endermitesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitepickaxehead), new Object []
		{
			"X",
			'X', ItemMod.endermitepick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteshovelhead), new Object []
		{
			"X",
			'X', ItemMod.endermiteshovel
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitebattleaxe), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.endermiteaxehead, 'Y', ItemMod.endermiteswordhead, 'Z', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteshick), new Object []
		{
			"X",
			"Y",
			"Z",
			'X', ItemMod.endermiteshovelhead, 'Y', ItemMod.endermitepickaxehead, 'Z', Items.stick
		});
		
		
		
		//Smelting
		GameRegistry.addSmelting(BlockMod.sarliteore, new ItemStack(ItemMod.sarliteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.flamiteore, new ItemStack(ItemMod.flamiteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.endermiteore, new ItemStack(ItemMod.endermiteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.endendermiteore, new ItemStack(ItemMod.endermiteingot), 5.0F);
		
		//Special
		
		/**Crafting**/
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitechunk), new Object []
		{
			"XXX",
			"XXX",
			"XXX",
			'X', ItemMod.endermiteshard
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitequartz), new Object []
		{
			"XXX",
			"XXX",
			"XXX",
			'X', ItemMod.refinedendermitechunk
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitegem), new Object []
		{
			"XXX",
			"XXX",
			"XXX",
			'X', ItemMod.refinedendermitequartz
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.enderrite), new Object []
		{
			"XXX",
			"XXX",
			"XXX",
			'X', ItemMod.refinedendermitegem
		});
		
		/***********************************************************************************************************/
		/**Swords***************************************************************************************************/
		/***********************************************************************************************************/
		GameRegistry.addRecipe(new ItemStack(ItemMod.crawmitesword), new Object []
		{
			"X",
			"X",
			"Y",
			'X', ItemMod.crawmite, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.doomspoon), new Object []
		{
			"X",
			"X",
			"Y",
			'X', ItemMod.afnamitegem, 'Y', ItemMod.crawmitesword
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.refinedendermitesword), new Object []
		{
			"X",
			"X",
			"Y",
			'X', ItemMod.refinedendermitequartz, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.enderlitesword), new Object []
		{
			"X",
			"X",
			"Y",
			'X', ItemMod.refinedendermitegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.enderritesword), new Object []
		{
			"X",
			"X",
			"Y",
			'X', ItemMod.enderrite, 'Y', Items.stick
		});
		
		/**Smelting**/
		GameRegistry.addSmelting(ItemMod.endermitechunk, new ItemStack(ItemMod.refinedendermitechunk), 5.0F);
		GameRegistry.addSmelting(ItemMod.endermitequartz, new ItemStack(ItemMod.refinedendermitequartz), 5.0F);
		GameRegistry.addSmelting(ItemMod.endermitegem, new ItemStack(ItemMod.refinedendermitegem), 5.0F);
		
	}
}