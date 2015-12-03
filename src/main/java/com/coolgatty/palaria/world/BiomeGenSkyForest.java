package com.coolgatty.palaria.world;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.blocks.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomeGenSkyForest extends BiomeGenBase
{
	
	public BiomeGenSkyForest(int biomeID) 
	{
		super(biomeID);
		this.worldGeneratorTrees = new WorldGenTrees(false, 5, 1, 1, false);
		this.waterColorMultiplier = 0x00FF5E;
		this.theBiomeDecorator.flowersPerChunk = 3;
		this.theBiomeDecorator.deadBushPerChunk = 1;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.treesPerChunk = 4;
	}

	public int getGrassColorAtPos(BlockPos p_180627_1_)
	{
		return 65535;
	}
	
	public void decorate(World worldIn, Random p_180624_2_, BlockPos p_180624_3_)
	{
       super.decorate(worldIn, p_180624_2_, p_180624_3_);
       int i = 6 + p_180624_2_.nextInt(6);
       int j;
       int k;
       int l;

       for (j = 0; j < i; ++j)
       {
           k = p_180624_2_.nextInt(16);
           l = p_180624_2_.nextInt(28) + 4;
           int i1 = p_180624_2_.nextInt(16);
           BlockPos blockpos1 = p_180624_3_.add(k, l, i1);

           if (worldIn.getBlockState(blockpos1).getBlock().isReplaceableOreGen(worldIn, blockpos1, net.minecraft.block.state.pattern.BlockHelper.forBlock(Blocks.stone)))
           {
               worldIn.setBlockState(blockpos1, Blocks.emerald_ore.getDefaultState(), 2);
           }
       }
	}
}
