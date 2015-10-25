package com.coolgatty.palaria.mobs.entityAI;

import com.coolgatty.palaria.mobs.EntityNimatin;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityAINimatinBeg extends EntityAIBase
{
    private EntityNimatin theNimatin;
    private EntityPlayer thePlayer;
    private World worldObject;
    private float minPlayerDistance;
    private int field_75384_e;
    private static final String __OBFID = "CL_00001576";

    public EntityAINimatinBeg(EntityNimatin p_i1617_1_, float p_i1617_2_)
    {
        this.theNimatin = p_i1617_1_;
        this.worldObject = p_i1617_1_.worldObj;
        this.minPlayerDistance = p_i1617_2_;
        this.setMutexBits(2);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        this.thePlayer = this.worldObject.getClosestPlayerToEntity(this.theNimatin, (double)this.minPlayerDistance);
        return this.thePlayer == null ? false : this.hasPlayerGotBoneInHand(this.thePlayer);
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.thePlayer.isEntityAlive() ? false : (this.theNimatin.getDistanceSqToEntity(this.thePlayer) > (double)(this.minPlayerDistance * this.minPlayerDistance) ? false : this.field_75384_e > 0 && this.hasPlayerGotBoneInHand(this.thePlayer));
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theNimatin.func_70918_i(true);
        this.field_75384_e = 40 + this.theNimatin.getRNG().nextInt(40);
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.theNimatin.func_70918_i(false);
        this.thePlayer = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        this.theNimatin.getLookHelper().setLookPosition(this.thePlayer.posX, this.thePlayer.posY + (double)this.thePlayer.getEyeHeight(), this.thePlayer.posZ, 10.0F, (float)this.theNimatin.getVerticalFaceSpeed());
        --this.field_75384_e;
    }

    /**
     * Gets if the Player has the Bone in the hand.
     */
    private boolean hasPlayerGotBoneInHand(EntityPlayer p_75382_1_)
    {
        ItemStack itemstack = p_75382_1_.inventory.getCurrentItem();
        return itemstack == null ? false : (!this.theNimatin.isTamed() && itemstack.getItem() == Items.bone ? true : this.theNimatin.isBreedingItem(itemstack));
    }
}