package me.fexlar.wawa;

import me.fexlar.wawa.core.init.BlockInit;
import me.fexlar.wawa.core.init.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = wawa.MODID)
public class wawa {
    public static final String MODID = "wawa";

    public wawa() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}
