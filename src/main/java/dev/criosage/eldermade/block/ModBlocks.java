package net.criosage.eldermade.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import dev.criosage.eldermade.Eldermade;
import dev.criosage.eldermade.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.criosage.eldermade.block.ModStairsBlock;


public class ModBlocks {



    /**
     * Spruce Shingles
     */

    public static final Block SPRUCE_SHINGLES = registerBlock("spruce_shingles",
							      new Block(FabricBlockSettings.
									of(Material.WOOD).
									strength(2f)
									),
							      ModItemGroup.ELDERMADE);

    /**
     * Spruce Shingles slabs
     */

    
    public static final Block SPRUCE_SHINGLES_SLAB = registerBlock("spruce_shingles_slab",
								   new SlabBlock(FabricBlockSettings.
									     of(Material.WOOD).
									     strength(2f)),
								   ModItemGroup.ELDERMADE);
    
    
    /**
     * Spruce Shingles stairs
     */

    public static final Block SPRUCE_SHINGLES_STAIR = registerBlock("spruce_shingles_stair",
								   new ModStairsBlock(
										      ModBlocks.SPRUCE_SHINGLES.getDefaultState(),
										      FabricBlockSettings.
									     of(Material.WOOD).
									     strength(2f)),
								   ModItemGroup.ELDERMADE);

    
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
	registerBlockItem(name, block, tab);
	return Registry.register(Registry.BLOCK, new Identifier(Eldermade.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
	return Registry.register(Registry.ITEM,
				 new Identifier(Eldermade.MOD_ID, name),
				 new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    
    public static void registerModBlocks() {
	Eldermade.LOGGER.debug("Registering ModBlocks for " + Eldermade.MOD_ID);
    }
}
