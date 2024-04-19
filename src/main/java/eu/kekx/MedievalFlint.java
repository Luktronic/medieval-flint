package eu.kekx;

import eu.kekx.items.MFItems;
import eu.kekx.items.groups.MFItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MedievalFlint implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    private static final Logger LOGGER = LoggerFactory.getLogger("medieval-flint");
	public static final String MOD_ID = "medieval-flint";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		MFItems.registerItems();
		MFItemGroups.addItemsToExisting();
		LOGGER.info("Hello Fabric world!");
	}
}