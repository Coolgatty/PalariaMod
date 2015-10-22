package com.coolgatty.palaria.mobs;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.mobs.render.RenderCowasaurus;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;
import com.coolgatty.palaria.mobs.render.RenderEnderRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderMagmaRaptorChicken;
import com.coolgatty.palaria.mobs.render.RenderRaptorChicken;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobMod 
{
	public static void register()
	{
		//Creeptile
		EntityRegistry.registerModEntity(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, Reference.MODID, 80, 3, true);
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
				BiomeGenBase.taigaHills);
		EntityList.addMapping(EntityCreeptile.class, "Creeptile", Palaria.creeptileID, 0x23DE55, 0x000000);
		
		//Cowasaurus
		EntityRegistry.registerModEntity(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityCowasaurus.class, 5, 2, 3, EnumCreatureType.MONSTER, 
				BiomeGenBase.beach,
				BiomeGenBase.forest,
				BiomeGenBase.jungle,
				BiomeGenBase.mushroomIsland, 
				BiomeGenBase.mushroomIslandShore, 
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
				BiomeGenBase.taiga);
		EntityList.addMapping(EntityCowasaurus.class, "Cowasaurus", Palaria.cowasaurusID, 0x4F3D2B, 0x8C8282);
		
		//Raptor Chicken
		EntityRegistry.registerModEntity(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, Reference.MODID, 100, 3, true);
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
				BiomeGenBase.taigaHills);
		EntityList.addMapping(EntityRaptorChicken.class, "RaptorChicken", Palaria.raptorchickenID, 0xCFB8B8, 0xD11515);
		
		//Magma Raptor Chicken
		EntityRegistry.registerModEntity(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityMagmaRaptorChicken.class, 5, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.hell);
		EntityList.addMapping(EntityMagmaRaptorChicken.class, "MagmaRaptorChicken", Palaria.magmaraptorchickenID, 0xFFD000, 0xD60400);
		
		//Ender Raptor Chicken
		EntityRegistry.registerModEntity(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, Reference.MODID, 100, 3, true);
		EntityRegistry.addSpawn(EntityEnderRaptorChicken.class, 3, 2, 5, EnumCreatureType.MONSTER, 
				BiomeGenBase.sky);
		EntityList.addMapping(EntityEnderRaptorChicken.class, "EnderRaptorChicken", Palaria.enderraptorchickenID, 0x000000, 0xD11515);
	}

	public static void registerRenders() 
	{
		registerRender(EntityCreeptile.class, new RenderCreeptile());
		registerRender(EntityCowasaurus.class, new RenderCowasaurus());
		registerRender(EntityRaptorChicken.class, new RenderRaptorChicken());
		registerRender(EntityMagmaRaptorChicken.class, new RenderMagmaRaptorChicken());
		registerRender(EntityEnderRaptorChicken.class, new RenderEnderRaptorChicken());
	}

	private static void registerRender(Class entityClass,  Render renderClass) 
	{
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderClass);
	}
	
	
}
