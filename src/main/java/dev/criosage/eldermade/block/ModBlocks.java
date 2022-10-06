package net.criosage.eldermade.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import dev.criosage.eldermade.Eldermade;
import dev.criosage.eldermade.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block SPRUCE_SHINGLES = registerBlock("spruce_shingles",
							      new Block(FabricBlockSettings.
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
