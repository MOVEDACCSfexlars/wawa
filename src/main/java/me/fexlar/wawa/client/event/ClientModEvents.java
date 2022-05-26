package me.fexlar.wawa.client.event;

import me.fexlar.wawa.client.renderer.WawaEntityRenderer;
import me.fexlar.wawa.client.renderer.model.WawaEntityModel;
import me.fexlar.wawa.core.init.EntityInit;
import me.fexlar.wawa.wawa;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wawa.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    private ClientModEvents() {}

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(WawaEntityModel.LAYER_LOCATION, WawaEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(EntityInit.WAWA_ENTITY.get(), WawaEntityRenderer::new);
    }
}
