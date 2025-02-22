package net.pon.utilities;

import net.fabricmc.api.ModInitializer;
import net.pon.utilities.ModLootTable.ModLootTableModifiers;
import net.pon.utilities.item.ModItemGroups;
import net.pon.utilities.item.ModItems;

import net.pon.utilities.statuseffects.CustomStatusEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PonUtilities implements ModInitializer {
	
	public static final String MOD_ID = "ponutils";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
		CustomStatusEffects.registerEffects();
	}
}