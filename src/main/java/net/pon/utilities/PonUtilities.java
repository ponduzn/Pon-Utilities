package net.pon.utilities;

import net.fabricmc.api.ModInitializer;
import net.pon.utilities.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PonUtilities implements ModInitializer {
	
	public static final String MOD_ID = "ponutils";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}