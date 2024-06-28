package net.pon.utilities.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
        if (!user.isCreative()) {
            user.setMovementSpeed(50f);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 999999, 3));
            //mining speed > move speed
        }
        else {
            user.setMovementSpeed(0);
        }



        return super.use(world, user, hand);

    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
