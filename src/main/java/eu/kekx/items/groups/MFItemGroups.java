package eu.kekx.items.groups;

import eu.kekx.items.MFItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MFItemGroups {

    private static final Logger LOGGER = LoggerFactory.getLogger("medieval-flint");

    public static void addItemsToExisting() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.FLINT, MFItems.SHARP_FLINT);
        });
        LOGGER.info("Initialized all medieval-flint item groups");
    }
}
