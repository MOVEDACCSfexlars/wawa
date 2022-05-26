package me.fexlar.wawa.core.init;

import me.fexlar.wawa.wawa;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, wawa.MODID);

    public static final RegistryObject<Item> WAWA_SPAWN_EGG = ITEMS.register("wawa_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.WAWA_ENTITY, 0xffffff, 0xffffff, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = ITEMS.register("test_block",
            () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
