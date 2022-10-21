package dev.criosage.eldermade;


import dev.criosage.eldermade.item.ModItems;
import net.criosage.eldermade.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eldermade implements ModInitializer {
	public static final String MOD_ID = "eldermade";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Eldermade.");
		LOGGER.info("Eldermade Initialized.");
		
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
