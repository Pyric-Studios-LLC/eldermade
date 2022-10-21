package dev.criosage.eldermade.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import dev.criosage.eldermade.Eldermade;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
	
public class ModItems {

    public static final Item OAK_SHINGLES = registerItem("oak_shingles",
							 new Item(new FabricItemSettings().group(ModItemGroup.ELDERMADE)));
    

    public static Item registerItem(String name,
				    Item item){
	return Registry.register(Registry.ITEM, new Identifier(Eldermade.MOD_ID, name), item);
    }

    public static void registerModItems(){
	Eldermade.LOGGER.debug("Registering Mod Items for " + Eldermade.MOD_ID);
    }

}
