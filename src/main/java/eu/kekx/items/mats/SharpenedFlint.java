package eu.kekx.items.mats;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharpenedFlint extends Item {
    private static final Logger LOGGER = LoggerFactory.getLogger("medieval-flint");
    private byte amountUsed;
    public SharpenedFlint(Settings settings) {
        super(settings);
        amountUsed = 0;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        String sc = world.isClient ? "CLIENT" : "SERVER";
        amountUsed++;
        var player = context.getPlayer();
        var flintCount = player.getStackInHand(Hand.OFF_HAND).getCount();
        LOGGER.info("{} - BEFORE Flint: {}", sc, flintCount);
        player.sendMessage(Text.of(sc + " - BEFORE FLINT: " + flintCount), false);
        player.giveItemStack(new ItemStack(Items.FLINT));
        flintCount = player.getStackInHand(Hand.OFF_HAND).getCount();
        player.sendMessage(Text.of(sc + " - FLINT: " + flintCount), false);


        return ActionResult.success(world.isClient);
    }
}
