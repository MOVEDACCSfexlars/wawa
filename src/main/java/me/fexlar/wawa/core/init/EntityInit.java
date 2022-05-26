package me.fexlar.wawa.core.init;

import me.fexlar.wawa.common.entity.WawaEntity;
import me.fexlar.wawa.wawa;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {

    private EntityInit() {}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, wawa.MODID);

    public static final RegistryObject<EntityType<WawaEntity>> WAWA_ENTITY = ENTITIES.register("wawa_entity",
            () -> EntityType.Builder.of(WawaEntity::new, MobCategory.MISC).sized(1f, 1f)
                    .build(new ResourceLocation(wawa.MODID, "wawa_entity").toString()));
}
