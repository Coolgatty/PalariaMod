package com.coolgatty.palaria.mobs;

import com.coolgatty.palaria.items.ItemMod;
import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityRaptorChicken extends EntityMob
{
    
    public float wingRotation;
    public float destPos;
    public float field_70884_g;
    public float field_70888_h;
    public float wingRotDelta = 1.0F;
    /** The time until the next egg is spawned. */
    public int timeUntilNextEgg;
    public boolean chickenJockey;
	private double moveSpeed;

    public EntityRaptorChicken(World par1World)
    {
    	super(par1World);
        this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
        this.moveSpeed = 1.0D;
        this.setSize(0.5F, 1.2F);
        this.getNavigator();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityCowasaurus.class, 15.0F, 1.0D, 1.2D));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityWolf.class, 10.0F, 1.0D, 1.2D));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityChicken.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed - 0.2D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityChicken.class, true));
        this.experienceValue = 20;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.50D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(14.0D);
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
    	float f = 1.0F;
    	float d = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        
    	boolean dmg = entity.attackEntityFrom(DamageSource.causeMobDamage(this).setDamageBypassesArmor(), f) && entity.attackEntityFrom(DamageSource.causeMobDamage(this), d);
    
        return dmg;
    }
    
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.field_70888_h = this.wingRotation;
        this.field_70884_g = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.destPos = MathHelper.clamp_float(this.destPos, 0.0F, 1.0F);

        if (!this.onGround && this.wingRotDelta < 1.0F)
        {
            this.wingRotDelta = 1.0F;
        }

        this.wingRotDelta = (float)((double)this.wingRotDelta * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.wingRotation += this.wingRotDelta * 2.0F;

        if (!this.worldObj.isRemote && !this.isChild() && !this.isChickenJockey() && --this.timeUntilNextEgg <= 0)
        {
            this.playSound("mob.chicken.plop", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            this.dropItem(Items.egg, 1);
            this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "palaria:mob.raptorchicken.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "palaria:mob.raptorchicken.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "palaria:mob.raptorchicken.hurt";
    }

    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.chicken.step", 0.15F, 1.0F);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);
        int f = this.rand.nextInt(2);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Items.feather, 1);
        }
        
        for (int k = 0; k < f; ++k)
        {
            this.dropItem(ItemMod.raptorclaw, 1);
        }
        

        if (this.isBurning())
        {
            this.dropItem(Items.cooked_chicken, 1);
        }
        else
        {
            this.dropItem(Items.chicken, 1);
        }
    }
    
    public EntityRaptorChicken createChild(EntityAgeable ageable)
    {
        return new EntityRaptorChicken(this.worldObj);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack stack)
    {
        return stack != null && stack.getItem() == Items.wheat_seeds;
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
        this.chickenJockey = tagCompund.getBoolean("IsChickenJockey");

        if (tagCompund.hasKey("EggLayTime"))
        {
            this.timeUntilNextEgg = tagCompund.getInteger("EggLayTime");
        }
    }

    /**
     * Get the experience points the entity currently has.
     */
    protected int getExperiencePoints(EntityPlayer player)
    {
        return this.isChickenJockey() ? 10 : super.getExperiencePoints(player);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setBoolean("IsChickenJockey", this.chickenJockey);
        tagCompound.setInteger("EggLayTime", this.timeUntilNextEgg);
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return this.isChickenJockey() && this.riddenByEntity == null;
    }

    public void updateRiderPosition()
    {
        super.updateRiderPosition();
        float f = MathHelper.sin(this.renderYawOffset * (float)Math.PI / 180.0F);
        float f1 = MathHelper.cos(this.renderYawOffset * (float)Math.PI / 180.0F);
        float f2 = 0.1F;
        float f3 = 0.0F;
        this.riddenByEntity.setPosition(this.posX + (double)(f2 * f), this.posY + (double)(this.height * 0.5F) + this.riddenByEntity.getYOffset() + (double)f3, this.posZ - (double)(f2 * f1));

        if (this.riddenByEntity instanceof EntityLivingBase)
        {
            ((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.renderYawOffset;
        }
    }

    /**
     * Determines if this chicken is a jokey with a zombie riding it.
     */
    public boolean isChickenJockey()
    {
        return this.chickenJockey;
    }

    /**
     * Sets whether this chicken is a jockey or not.
     */
    public void setChickenJockey(boolean jockey)
    {
        this.chickenJockey = jockey;
    }
}
