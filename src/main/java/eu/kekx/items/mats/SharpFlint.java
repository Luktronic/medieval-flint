package eu.kekx.items.mats;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharpFlint extends Item {
    private static final Logger LOGGER = LoggerFactory.getLogger("medieval-flint");

    public SharpFlint(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        LOGGER.info("USED SHARP FLINT ON  CLIENT: {}", world.isClient);

        return ActionResult.success(world.isClient);
    }
}
