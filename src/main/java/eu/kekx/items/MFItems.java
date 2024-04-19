package eu.kekx.items;

import eu.kekx.MedievalFlint;
import eu.kekx.items.mats.SharpFlint;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MFItems {
    private static final Logger LOGGER = LoggerFactory.getLogger("medieval-flint");

    private static final String NAMESPACE = MedievalFlint.MOD_ID;
    public static Item SHARP_FLINT;

    public static void registerItems() {
        SHARP_FLINT = Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "sharp_flint"), (new SharpFlint(new Item.Settings())));
        LOGGER.info("Initialized all {} items", NAMESPACE);
    }

}
