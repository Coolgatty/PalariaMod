package com.coolgatty.palaria.world;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.blocks.BlockMod;
import com.coolgatty.palaria.blocks.BlockModLog;
import com.coolgatty.palaria.blocks.BlockModPlanks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomeGenBloodForest extends BiomeGenBase
{
	private WorldGenerator theWorldGenerator = new WorldGenMinable(Blocks.monster_egg.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 5);
    private static final IBlockState redwoodSpawn = BlockMod.modlog.getDefaultState().withProperty(BlockModLog.VARIANT, BlockModPlanks.EnumType.REDWOOD);
    private static final IBlockState field_181654_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
	   
	public BiomeGenBloodForest(int biomeID) 
	{
		super(biomeID);
        this.worldGeneratorTrees = new WorldGenTrees(false, 16, redwoodSpawn, field_181654_b, false);
		this.waterColorMultiplier = 0xFF0000;
		this.theBiomeDecorator.flowersPerChunk = 3;
		this.theBiomeDecorator.deadBushPerChunk = 1;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.treesPerChunk = 4;
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	}
		
	public int getGrassColorAtPos(BlockPos p_180627_1_)
	{
		return 0xDF8225;
	}
	
    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);
        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
        WorldGenerator emeralds = new EmeraldGenerator();
        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
            emeralds.generate(worldIn, rand, pos);

        for (int i = 0; i < 7; ++i)
        {
            int j1 = rand.nextInt(16);
            int k1 = rand.nextInt(64);
            int l1 = rand.nextInt(16);
            if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, theWorldGenerator, pos.add(j1, k1, l1), net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.SILVERFISH))
            this.theWorldGenerator.generate(worldIn, rand, pos.add(j1, k1, l1));
        }
        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
    }
    
    private static class EmeraldGenerator extends WorldGenerator
    {
        @Override
        public boolean generate(World worldIn, Random rand, BlockPos pos)
        {
            int count = 3 + rand.nextInt(6);
            for (int i = 0; i < count; i++)
            {
                BlockPos blockpos = pos.add(rand.nextInt(16), rand.nextInt(28) + 4, rand.nextInt(16));

                if (worldIn.getBlockState(blockpos).getBlock().isReplaceableOreGen(worldIn, blockpos, net.minecraft.block.state.pattern.BlockHelper.forBlock(Blocks.stone)))
                {
                    worldIn.setBlockState(blockpos, Blocks.emerald_ore.getDefaultState(), 2);
                }
            }
            return true;
        }
    }
}
