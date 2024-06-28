package net.pon.utilities.item.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class RingOfFlight extends Item {

    public RingOfFlight(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.isCreative()) {
            user.getAbilities().allowFlying = true;
            user.getAbilities().flying = true;
        }
        else {
            user.getAbilities().allowFlying = false;
            user.getAbilities().flying = false;
        }



        return super.use(world, user, hand);

    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
