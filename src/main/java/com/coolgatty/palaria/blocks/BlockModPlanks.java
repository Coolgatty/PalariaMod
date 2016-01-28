package com.coolgatty.palaria.blocks;

import java.util.List;

import com.coolgatty.palaria.blocks.metahelp.IMetaBlockName;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModPlanks extends Block implements IMetaBlockName
{
    public static final PropertyEnum<BlockModPlanks.EnumType> VARIANT = PropertyEnum.<BlockModPlanks.EnumType>create("variant", BlockModPlanks.EnumType.class);

    public BlockModPlanks()
    {
        super(Material.wood);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockModPlanks.EnumType.REDWOOD));
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        for (BlockModPlanks.EnumType blockmodplanks$enumtype : BlockModPlanks.EnumType.values())
        {
            list.add(new ItemStack(itemIn, 1, blockmodplanks$enumtype.getMetadata()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, BlockModPlanks.EnumType.byMetadata(meta));
    }

    public MapColor getMapColor(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).func_181070_c();
    }
    
    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        REDWOOD(0, "redwood", MapColor.redColor);
        private static final BlockModPlanks.EnumType[] META_LOOKUP = new BlockModPlanks.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;
        private final MapColor field_181071_k;

        private static final String __OBFID = "CL_00002081";

        private EnumType(int p_i46388_3_, String p_i46388_4_, MapColor p_i46388_5_)
        {
            this(p_i46388_3_, p_i46388_4_, p_i46388_4_, p_i46388_5_);
        }

        private EnumType(int p_i46389_3_, String p_i46389_4_, String p_i46389_5_, MapColor p_i46389_6_)
        {
            this.meta = p_i46389_3_;
            this.name = p_i46389_4_;
            this.unlocalizedName = p_i46389_5_;
            this.field_181071_k = p_i46389_6_;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public MapColor func_181070_c()
        {
            return this.field_181071_k;
        }
        
        public String toString()
        {
            return this.name;
        }

        public static BlockModPlanks.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.name;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }

        static
        {
            for (BlockModPlanks.EnumType blockmodplanks$enumtype : values())
            {
                META_LOOKUP[blockmodplanks$enumtype.getMetadata()] = blockmodplanks$enumtype;
            }
        }
    }
    
    @Override
    public String getSpecialName(ItemStack stack) 
    {
        switch (stack.getItemDamage())
        {
        case 0 :
        	return BlockModPlanks.EnumType.REDWOOD.getName();
        }
		return null;
    }
}