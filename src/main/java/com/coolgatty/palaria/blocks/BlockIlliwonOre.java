package com.coolgatty.palaria.blocks;

import java.util.Random;

import com.coolgatty.palaria.Palaria;
import com.coolgatty.palaria.help.Reference;
import com.coolgatty.palaria.items.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockIlliwonOre extends Block
{
	public BlockIlliwonOre()
	{
		super(Material.rock);
		setUnlocalizedName("illiwonore");
		setHardness(5.5F);
		setResistance(7.5F);
		setHarvestLevel("pickaxe", 4);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int j = 0;

            if (this == BlockMod.illiwonore)
            {
                j = MathHelper.getRandomIntegerInRange(rand, 2, 6);
            }
            
            return j;
        }
        return 0;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == BlockMod.illiwonore ? ItemMod.illiwongem : Item.getItemFromBlock(this);
    }
    
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
}
