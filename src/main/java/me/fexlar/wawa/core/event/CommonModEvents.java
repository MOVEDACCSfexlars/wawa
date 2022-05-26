package me.fexlar.wawa.core.event;

import me.fexlar.wawa.common.entity.WawaEntity;
import me.fexlar.wawa.core.init.EntityInit;
import me.fexlar.wawa.wawa;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wawa.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)
    {
        event.put(EntityInit.WAWA_ENTITY.get(), WawaEntity.createAttributes().build());
    }
}
