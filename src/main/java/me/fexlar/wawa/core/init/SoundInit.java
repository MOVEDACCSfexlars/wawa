package me.fexlar.wawa.core.init;

import me.fexlar.wawa.wawa;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, wawa.MODID);

    public static final RegistryObject<SoundEvent> WAWA_ENTITY_AMBIENT = SOUNDS.register("test_sound_ambient",
            () -> new SoundEvent(new ResourceLocation(wawa.MODID, "entity.wawa_entity.ambient")));

    private SoundInit() {}
}
