package io.github.nocomment1105.deepslatecutting.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.nocomment1105.deepslatecutting.DeepslateCutting.MOD_ID;

public class ModItems {
    public static final BlockItem DEEPSLATE_SLAB = new BlockItem(ModBlocks.DEEPSLATE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DEEPSLATE_STAIRS = new BlockItem(ModBlocks.DEEPSLATE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DEEPSLATE_WALL = new BlockItem(ModBlocks.DEEPSLATE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deepslate_slab"), DEEPSLATE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deepslate_stairs"), DEEPSLATE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deepslate_wall"), DEEPSLATE_WALL);
    }
}
