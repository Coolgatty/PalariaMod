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
		GameRegistry.addRecipe(new ItemStack(ItemMod.woodblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.stoneblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.ironblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamondblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.goldblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.sarliteingot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarlitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.sarliteblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
				"XY", 
				" Y", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.flamiteblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteaxe), new Object [] 
		{
				"XX", 
				"YX", 
				"Y ", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritehoe), new Object [] 
		{
				"XX", 
				" Y", 
				" Y", 
				'X', ItemMod.claritegem, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemMod.claritehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.clariteblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
				"XY", 
				" Y", 
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
				" Y", 
				" Y", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.illiwonblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
				"XY", 
				" Y", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.afnamiteblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
				"XY", 
				" Y", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermitehoe), new Object [] 
		{
				"XX", 
				"Y ", 
				"Y ", 
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
		GameRegistry.addRecipe(new ItemStack(ItemMod.endermiteblade), new Object []
		{
			"YXX",
			"Y X",
			"YXX",
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
		
		
		
		//Smelting
		GameRegistry.addSmelting(BlockMod.sarliteore, new ItemStack(ItemMod.sarliteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.flamiteore, new ItemStack(ItemMod.flamiteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.endermiteore, new ItemStack(ItemMod.endermiteingot), 5.0F);
		GameRegistry.addSmelting(BlockMod.endendermiteore, new ItemStack(ItemMod.endermiteingot), 5.0F);
		
	}
}