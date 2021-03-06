package com.coolgatty.palaria.mobs;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.coolgatty.palaria.items.ItemMod;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityStoneEndermite extends EntityMob
{
    private static final UUID attackingSpeedBoostModifierUUID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final AttributeModifier attackingSpeedBoostModifier = (new AttributeModifier(attackingSpeedBoostModifierUUID, "Attacking speed boost", 0.15000000596046448D, 0)).setSaved(false);
    private boolean isAggressive;
    /**
     * Counter to delay the teleportation of an enderman towards the currently attacked target
     */
    private int teleportDelay = 0;
    private int field_70826_g = 0;

    public EntityStoneEndermite(World worldIn)
    {
        super(worldIn);
        this.setSize(1.0F, 1.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(2, new EntityStoneEndermite.AIFindPlayer());
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityEndermite.class, 10, true, false, new Predicate()
        {
            private static final String __OBFID = "CL_00002223";
            public boolean func_179948_a(EntityEndermite p_179948_1_)
            {
                return p_179948_1_.isSpawnedByPlayer();
            }
            public boolean apply(Object p_apply_1_)
            {
                return this.func_179948_a((EntityEndermite)p_apply_1_);
            }
        }));
        this.experienceValue = 80;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0D);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Short((short)0));
        this.dataWatcher.addObject(17, new Byte((byte)0));
        this.dataWatcher.addObject(18, new Byte((byte)0));
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
    	float f = 0.2F;
    	float d = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        
    	boolean dmg = entity.attackEntityFrom(DamageSource.causeMobDamage(this).setDamageBypassesArmor(), f) && entity.attackEntityFrom(DamageSource.causeMobDamage(this), d);
    
        return dmg;
    }

    /**
     * Checks to see if this enderman should be attacking this player
     */
    private boolean shouldAttackPlayer(EntityPlayer p_70821_1_)
    {
        ItemStack itemstack = p_70821_1_.inventory.armorInventory[3];

        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.pumpkin))
        {
            return false;
        }
        else
        {
            Vec3 vec3 = p_70821_1_.getLook(1.0F).normalize();
            Vec3 vec31 = new Vec3(this.posX - p_70821_1_.posX, this.getEntityBoundingBox().minY + (double)(this.height / 2.0F) - (p_70821_1_.posY + (double)p_70821_1_.getEyeHeight()), this.posZ - p_70821_1_.posZ);
            double d0 = vec31.lengthVector();
            vec31 = vec31.normalize();
            double d1 = vec3.dotProduct(vec31);
            return d1 > 1.0D - 0.025D / d0 ? p_70821_1_.canEntityBeSeen(this) : false;
        }
    }

    public float getEyeHeight()
    {
        return 2.55F;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.worldObj.isRemote)
        {
            for (int i = 0; i < 2; ++i)
            {
                this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D, new int[0]);
            }
        }

        this.isJumping = false;
        super.onLivingUpdate();
    }

    protected void updateAITasks()
    {
        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.drown, 1.0F);
        }

        if (this.isScreaming() && !this.isAggressive && this.rand.nextInt(100) == 0)
        {
            this.setScreaming(false);
        }

        if (this.worldObj.isDaytime())
        {
            float f = this.getBrightness(1.0F);

            if (f > 0.5F && this.worldObj.canSeeSky(new BlockPos(this)) && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
            {
                this.setAttackTarget((EntityLivingBase)null);
                this.setScreaming(false);
                this.isAggressive = false;
                this.teleportRandomly();
            }
        }

        super.updateAITasks();
    }

    /**
     * Teleport the enderman to a random nearby position
     */
    protected boolean teleportRandomly()
    {
        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
        double d1 = this.posY + (double)(this.rand.nextInt(64) - 32);
        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
        return this.teleportTo(d0, d1, d2);
    }

    /**
     * Teleport the enderman to another entity
     */
    protected boolean teleportToEntity(Entity p_70816_1_)
    {
        Vec3 vec3 = new Vec3(this.posX - p_70816_1_.posX, this.getEntityBoundingBox().minY + (double)(this.height / 2.0F) - p_70816_1_.posY + (double)p_70816_1_.getEyeHeight(), this.posZ - p_70816_1_.posZ);
        vec3 = vec3.normalize();
        double d0 = 16.0D;
        double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
        double d2 = this.posY + (double)(this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
        double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
        return this.teleportTo(d1, d2, d3);
    }

    /**
     * Teleport the enderman
     */
    protected boolean teleportTo(double p_70825_1_, double p_70825_3_, double p_70825_5_)
    {
        net.minecraftforge.event.entity.living.EnderTeleportEvent event = new net.minecraftforge.event.entity.living.EnderTeleportEvent(this, p_70825_1_, p_70825_3_, p_70825_5_, 0);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return false;
        double d3 = this.posX;
        double d4 = this.posY;
        double d5 = this.posZ;
        this.posX = event.targetX;
        this.posY = event.targetY;
        this.posZ = event.targetZ;
        boolean flag = false;
        BlockPos blockpos = new BlockPos(this.posX, this.posY, this.posZ);

        if (this.worldObj.isBlockLoaded(blockpos))
        {
            boolean flag1 = false;

            while (!flag1 && blockpos.getY() > 0)
            {
                BlockPos blockpos1 = blockpos.down();
                Block block = this.worldObj.getBlockState(blockpos1).getBlock();

                if (block.getMaterial().blocksMovement())
                {
                    flag1 = true;
                }
                else
                {
                    --this.posY;
                    blockpos = blockpos1;
                }
            }

            if (flag1)
            {
                super.setPositionAndUpdate(this.posX, this.posY, this.posZ);

                if (this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() && !this.worldObj.isAnyLiquid(this.getEntityBoundingBox()))
                {
                    flag = true;
                }
            }
        }

        if (!flag)
        {
            this.setPosition(d3, d4, d5);
            return false;
        }
        else
        {
            short short1 = 128;

            for (int i = 0; i < short1; ++i)
            {
                double d9 = (double)i / ((double)short1 - 1.0D);
                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                double d6 = d3 + (this.posX - d3) * d9 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
                double d7 = d4 + (this.posY - d4) * d9 + this.rand.nextDouble() * (double)this.height;
                double d8 = d5 + (this.posZ - d5) * d9 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
                this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, d6, d7, d8, (double)f, (double)f1, (double)f2, new int[0]);
            }

            this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
            this.playSound("mob.endermen.portal", 1.0F, 1.0F);
            return true;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return this.isScreaming() ? "mob.endermen.scream" : "mob.endermen.idle";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.endermen.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.endermen.death";
    }

    public void func_175490_a(IBlockState p_175490_1_)
    {
        this.dataWatcher.updateObject(16, Short.valueOf((short)(Block.getStateId(p_175490_1_) & 65535)));
    }

    public IBlockState func_175489_ck()
    {
        return Block.getStateById(this.dataWatcher.getWatchableObjectShort(16) & 65535);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else
        {
            if (source.getEntity() == null || !(source.getEntity() instanceof EntityEndermite))
            {
                if (!this.worldObj.isRemote)
                {
                    this.setScreaming(true);
                }

                if (source instanceof EntityDamageSource && source.getEntity() instanceof EntityPlayer)
                {
                    if (source.getEntity() instanceof EntityPlayerMP && ((EntityPlayerMP)source.getEntity()).theItemInWorldManager.isCreative())
                    {
                        this.setScreaming(false);
                    }
                    else
                    {
                        this.isAggressive = true;
                    }
                }

                if (source instanceof EntityDamageSourceIndirect)
                {
                    this.isAggressive = false;

                    for (int i = 0; i < 64; ++i)
                    {
                        if (this.teleportRandomly())
                        {
                            return true;
                        }
                    }

                    return false;
                }
            }

            boolean flag = super.attackEntityFrom(source, amount);

            if (source.isUnblockable() && this.rand.nextInt(10) != 0)
            {
                this.teleportRandomly();
            }

            return flag;
        }
    }

    public boolean isScreaming()
    {
        return this.dataWatcher.getWatchableObjectByte(18) > 0;
    }

    public void setScreaming(boolean p_70819_1_)
    {
        this.dataWatcher.updateObject(18, Byte.valueOf((byte)(p_70819_1_ ? 1 : 0)));
    }

    class AIFindPlayer extends EntityAINearestAttackableTarget
    {
        private EntityPlayer field_179448_g;
        private int field_179450_h;
        private int field_179451_i;
        private EntityStoneEndermite field_179449_j = EntityStoneEndermite.this;
        private static final String __OBFID = "CL_00002221";

        public AIFindPlayer()
        {
            super(EntityStoneEndermite.this, EntityPlayer.class, true);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            double d0 = this.getTargetDistance();
            List list = this.taskOwner.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.taskOwner.getEntityBoundingBox().expand(d0, 4.0D, d0), this.targetEntitySelector);
            Collections.sort(list, this.theNearestAttackableTargetSorter);

            if (list.isEmpty())
            {
                return false;
            }
            else
            {
                this.field_179448_g = (EntityPlayer)list.get(0);
                return true;
            }
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void startExecuting()
        {
            this.field_179450_h = 5;
            this.field_179451_i = 0;
        }

        /**
         * Resets the task
         */
        public void resetTask()
        {
            this.field_179448_g = null;
            this.field_179449_j.setScreaming(false);
            IAttributeInstance iattributeinstance = this.field_179449_j.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
            iattributeinstance.removeModifier(EntityStoneEndermite.attackingSpeedBoostModifier);
            super.resetTask();
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean continueExecuting()
        {
            if (this.field_179448_g != null)
            {
                if (!this.field_179449_j.shouldAttackPlayer(this.field_179448_g))
                {
                    return false;
                }
                else
                {
                    this.field_179449_j.isAggressive = true;
                    this.field_179449_j.faceEntity(this.field_179448_g, 10.0F, 10.0F);
                    return true;
                }
            }
            else
            {
                return super.continueExecuting();
            }
        }

        /**
         * Updates the task
         */
        public void updateTask()
        {
            if (this.field_179448_g != null)
            {
                if (--this.field_179450_h <= 0)
                {
                    this.targetEntity = this.field_179448_g;
                    this.field_179448_g = null;
                    super.startExecuting();
                    this.field_179449_j.playSound("mob.endermen.stare", 1.0F, 1.0F);
                    this.field_179449_j.setScreaming(true);
                    IAttributeInstance iattributeinstance = this.field_179449_j.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
                    iattributeinstance.applyModifier(EntityStoneEndermite.attackingSpeedBoostModifier);
                }
            }
            else
            {
                if (this.targetEntity != null)
                {
                    if (this.targetEntity instanceof EntityPlayer && this.field_179449_j.shouldAttackPlayer((EntityPlayer)this.targetEntity))
                    {
                        if (this.targetEntity.getDistanceSqToEntity(this.field_179449_j) < 16.0D)
                        {
                            this.field_179449_j.teleportRandomly();
                        }

                        this.field_179451_i = 0;
                    }
                    else if (this.targetEntity.getDistanceSqToEntity(this.field_179449_j) > 256.0D && this.field_179451_i++ >= 30 && this.field_179449_j.teleportToEntity(this.targetEntity))
                    {
                        this.field_179451_i = 0;
                    }
                }

                super.updateTask();
            }
        }
    }
 
    protected void dropFewItems(boolean par1, int par2)
    {
    	int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
    	int var9 = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);

    	for (int var4 = 0; var4 < var9; ++var4)
    	{
    		this.dropItem(ItemMod.endermiteingot, 1);
        }
    	for (int var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(ItemMod.endermiteshard, 1);
        }
    }
}
