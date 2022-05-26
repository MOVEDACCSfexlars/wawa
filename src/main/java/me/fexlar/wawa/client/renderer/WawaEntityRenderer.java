package me.fexlar.wawa.client.renderer;

import me.fexlar.wawa.client.renderer.model.WawaEntityModel;
import me.fexlar.wawa.common.entity.WawaEntity;
import me.fexlar.wawa.wawa;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WawaEntityRenderer<Type extends WawaEntity> extends MobRenderer<Type, WawaEntityModel<Type>>
{

    private static final ResourceLocation TEXTURE = new ResourceLocation(wawa.MODID, "textures/entities/wawa_entity.png");

    public WawaEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new WawaEntityModel<>(context.bakeLayer(WawaEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
