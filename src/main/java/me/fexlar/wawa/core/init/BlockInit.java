package me.fexlar.wawa.core.init;

import me.fexlar.wawa.wawa;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create((ResourceLocation) ForgeRegistries.BLOCKS, wawa.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.COLOR_LIGHT_BLUE)));
}
