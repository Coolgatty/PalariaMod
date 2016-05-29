package com.coolgatty.palaria.mobs;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.mobs.render.RenderCowasaurus;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;
import com.coolgatty.palaria.mobs.render.RenderEndEndermite;
import com.coolgatty.palaria.mobs.render.RenderEnderRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderEnderWalker;
import com.coolgatty.palaria.mobs.render.RenderMagmaRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderStoneEndermite;
import com.coolgatty.palaria.world.BiomeRegistry;
import com.jcraft.jorbis.Block;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	
	public static void registerEntity()
	{
		//Creeptile
		EntityRegistry.registerModEntity(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, Reference.MODID, 80, 3, true, 0x23DE55, 0x000000);
				EntityRegistry.addSpawn(EntityCreeptile.class, 10, 2, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Cowasaurus
		EntityRegistry.registerModEntity(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, Reference.MODID, 100, 3, true, 0x4F3D2B, 0x8C8282);
				EntityRegistry.addSpawn(EntityCowasaurus.class, 5, 2, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach,
				BiomeGenBase.forest,
				BiomeGenBase.jungle,
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeRegistry.bloodforest);
		
		//Raptor Chicken
		EntityRegistry.registerModEntity(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, Reference.MODID, 100, 3, true, 0xCFB8B8, 0xD11515);
		EntityRegistry.addSpawn(EntityRaptorChicken.class, 12, 4, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Magma Raptor Chicken
		EntityRegistry.registerModEntity(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, Reference.MODID, 100, 3, true, 0xFFD000, 0xD60400);
		EntityRegistry.addSpawn(EntityMagmaRaptorChicken.class, 6, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.hell);
		
		//Ender Raptor Chicken
		EntityRegistry.registerModEntity(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, Reference.MODID, 100, 3, true, 0x000000, 0xD11515);
		EntityRegistry.addSpawn(EntityEnderRaptorChicken.class, 3, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		
		//Stone Endermite
		EntityRegistry.registerModEntity(EntityStoneEndermite.class, "StoneEndermite", Palaria.stoneendermiteID, Reference.MODID, 100, 3, true, 0x000000, 0xBABABA);
		EntityRegistry.addSpawn(EntityStoneEndermite.class, 2, 1, 2, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//End Endermite
		EntityRegistry.registerModEntity(EntityEndEndermite.class, "EndEndermite", Palaria.endendermiteID, Reference.MODID, 100, 3, true, 0x000000, 0xD4D40F);
		EntityRegistry.addSpawn(EntityEndEndermite.class, 2, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		
		//Ender Walker
		EntityRegistry.registerModEntity(EntityEnderWalker.class, "EnderWalker", Palaria.enderwalkerID, Reference.MODID, 50, 5, true, 0x000000, 0xA00000);
		EntityRegistry.addSpawn(EntityEnderWalker.class, 2, 1, 2, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach, 
				BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, 
				BiomeGenBase.forest, 
				BiomeGenBase.forestHills, 
				BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.ocean, 
				BiomeGenBase.plains, 
				BiomeGenBase.river, 
				BiomeGenBase.swampland,
				BiomeGenBase.desert,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga,
				BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desertHills,
				BiomeGenBase.extremeHillsPlus,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.megaTaiga,
				BiomeGenBase.megaTaigaHills,
				BiomeGenBase.mesa,
				BiomeGenBase.mesaPlateau,
				BiomeGenBase.mesaPlateau_F,
				BiomeGenBase.roofedForest,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeGenBase.sky,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
		
		//Magma Overlord
		EntityRegistry.registerModEntity(EntityMagmaOverlord.class, "MagmaOverlord", Palaria.magmaoverlordID, Reference.MODID, 100, 3, true, 0x5B280D, 0xFFD000);
		EntityRegistry.addSpawn(EntityMagmaOverlord.class, 6, 1, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.hell);
		
		//Slime Overlord
		EntityRegistry.registerModEntity(EntitySlimeOverlord.class, "SlimeOverlord", Palaria.slimeoverlordID, Reference.MODID, 100, 3, true, 0x2EF0E6, 0x2EF078);
		EntityRegistry.addSpawn(EntitySlimeOverlord.class, 7, 2, 4, EnumCreatureType.MONSTER, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.swampland,
				BiomeGenBase.river,
				BiomeGenBase.roofedForest,
				BiomeGenBase.stoneBeach,
				BiomeRegistry.skyforest);
		
		//Agonizing Ent
		EntityRegistry.registerModEntity(EntityAgonizingEnt.class, "AgonizingEnt", Palaria.agonizingentID, Reference.MODID, 100, 3, true, 0x6B5821, 0xC09D1F);
		EntityRegistry.addSpawn(EntityAgonizingEnt.class, 15, 2, 7, EnumCreatureType.MONSTER, 
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
				BiomeGenBase.swampland,
				BiomeGenBase.roofedForest,
				BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills,
				BiomeGenBase.forestHills,
				BiomeGenBase.forest,
				BiomeGenBase.jungle,
				BiomeGenBase.jungleEdge,
				BiomeGenBase.jungleHills,
				BiomeGenBase.taiga,
				BiomeGenBase.taigaHills,
				BiomeGenBase.savanna,
				BiomeGenBase.savannaPlateau,
				BiomeRegistry.bloodforest,
				BiomeRegistry.skyforest);
	}
}
