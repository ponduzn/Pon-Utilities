package net.pon.utilities.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class RingOfHaste extends Item {
    public RingOfHaste(Settings settings) { super(settings); }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

       // if "ON HOTBAR, THEN GIVE HASTE"


       // else "DO NOTHING"

        return super.use(world, user, hand);
    }
}
