package com.coolgatty.palaria.mobs.render.layer;


import com.coolgatty.palaria.mobs.EntityCreeptile;
import com.coolgatty.palaria.mobs.models.ModelCreeptile;
import com.coolgatty.palaria.mobs.render.RenderCreeptile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerCreeptileCharge implements LayerRenderer
{
    private static final ResourceLocation LIGHTNING_TEXTURE = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    private final RenderCreeptile creeptileRenderer;
    private final ModelCreeptile creeptileModel = new ModelCreeptile(2.0F);
    private static final String __OBFID = "CL_00002423";

    public LayerCreeptileCharge(RenderCreeptile p_i46121_1_)
    {
        this.creeptileRenderer = p_i46121_1_;
    }

    public void doRenderLayer(EntityCreeptile p_177169_1_, float p_177169_2_, float p_177169_3_, float p_177169_4_, float p_177169_5_, float p_177169_6_, float p_177169_7_, float p_177169_8_)
    {
        if (p_177169_1_.getPowered())
        {
            GlStateManager.depthMask(!p_177169_1_.isInvisible());
            this.creeptileRenderer.bindTexture(LIGHTNING_TEXTURE);
            GlStateManager.matrixMode(5890);
            GlStateManager.loadIdentity();
            float f7 = (float)p_177169_1_.ticksExisted + p_177169_4_;
            GlStateManager.translate(f7 * 0.01F, f7 * 0.01F, 0.0F);
            GlStateManager.matrixMode(5888);
            GlStateManager.enableBlend();
            float f8 = 0.5F;
            GlStateManager.color(f8, f8, f8, 1.0F);
            GlStateManager.disableLighting();
            GlStateManager.blendFunc(1, 1);
            this.creeptileModel.setModelAttributes(this.creeptileRenderer.getMainModel());
            this.creeptileModel.render(p_177169_1_, p_177169_2_, p_177169_3_, p_177169_5_, p_177169_6_, p_177169_7_, p_177169_8_);
            GlStateManager.matrixMode(5890);
            GlStateManager.loadIdentity();
            GlStateManager.matrixMode(5888);
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }

    public void doRenderLayer(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        this.doRenderLayer((EntityCreeptile)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
    }
}