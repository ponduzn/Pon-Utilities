package net.pon.utilities.item;

import net.pon.utilities.PonUtilities;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item RINGOFFLIGHT = registerItem("ringofflight", new Item(new Item.Settings().maxCount(1).fireproof()));
    public static final Item RINGOFHASTE = registerItem("ringofhaste", new Item(new Item.Settings().maxCount(1).fireproof()));

    public static final Item RINGOFMOVESPEED = registerItem("ringofmovespeed", new Item(new Item.Settings().maxCount(1).fireproof()));
    public static final Item RINGOFMAGNET = registerItem("ringofmagnet", new Item(new Item.Settings().maxCount(1).fireproof()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RINGOFFLIGHT);
        entries.add(RINGOFHASTE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PonUtilities.MOD_ID, name), item);

    }

    public static void registerModItems () {
        PonUtilities.LOGGER.info("Registering Mod Items for " + PonUtilities.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }

    
    

}
