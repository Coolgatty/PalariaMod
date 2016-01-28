package com.coolgatty.palaria.blocks;

import com.coolgatty.palaria.blocks.metahelp.IMetaBlockName;
import com.google.common.base.Predicate;
import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModLog extends BlockLog implements IMetaBlockName
{
    public static final PropertyEnum<BlockModPlanks.EnumType> VARIANT = PropertyEnum.<BlockModPlanks.EnumType>create("variant", BlockModPlanks.EnumType.class, new Predicate<BlockModPlanks.EnumType>()
    {
        public boolean apply(BlockModPlanks.EnumType type)
        {
            return type.getMetadata() < 4;
        }
    });

    public BlockModLog()
    {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockModPlanks.EnumType.REDWOOD).withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
    }
    
    public MapColor getMapColor(IBlockState state)
    {
        BlockModPlanks.EnumType blockmodplanks$enumtype = (BlockModPlanks.EnumType)state.getValue(VARIANT);

        switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
        {
            case X:
            case Z:
            case NONE:
            default:

                switch (blockmodplanks$enumtype)
                {
                    case REDWOOD:
                    default:
                        return BlockModPlanks.EnumType.REDWOOD.func_181070_c();
                }

            case Y:
                return blockmodplanks$enumtype.func_181070_c();
        }
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, BlockModPlanks.EnumType.REDWOOD.getMetadata()));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockModPlanks.EnumType.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @SuppressWarnings("incomplete-switch")
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();

        switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
        {
            case X:
                i |= 4;
                break;
            case Z:
                i |= 8;
                break;
            case NONE:
                i |= 12;
        }

        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT, LOG_AXIS});
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        return ((BlockModPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
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