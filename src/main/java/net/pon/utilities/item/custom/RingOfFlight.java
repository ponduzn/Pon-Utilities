package net.pon.utilities.item.custom;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;


public class RingOfFlight extends Item {
    public RingOfFlight(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.getAbilities().flying && !user.getAbilities().allowFlying) {
            user.getAbilities().allowFlying = true;
            user.getAbilities().flying = true;
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 9999, 1));
        }
        else if (user.getAbilities().flying || user.getAbilities().allowFlying) {
            user.getAbilities().allowFlying = false;
            user.getAbilities().flying = false;
            user.removeStatusEffect(StatusEffects.ABSORPTION);
        }
        return super.use(world, user, hand);

    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(net.minecraft.text.Text.translatable("Gives creative flight.").formatted(Formatting.RED));
    }
}
