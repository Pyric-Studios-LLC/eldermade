package dev.criosage.eldermade.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import dev.criosage.eldermade.Eldermade;
import dev.criosage.eldermade.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;



public class ModItemGroup {
    public static final ItemGroup ELDERMADE = FabricItemGroupBuilder.
	build(new Identifier(Eldermade.MOD_ID,
			     "eldermade"),
	      () -> new ItemStack(ModItems.BREAD));
    
}
