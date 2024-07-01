package net.pon.utilities.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;


public class RingOfHaste extends Item {
    public RingOfHaste(Settings settings) { super(settings); }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack mainHand = user.getStackInHand(hand);
        if (user.isAlive()) {
            if (!user.hasStatusEffect(StatusEffects.HASTE)){
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 2));
            }
            else if (user.hasStatusEffect(StatusEffects.HASTE)) {
                user.removeStatusEffect(StatusEffects.HASTE);
            }
        }

        //return super.use(world, user, hand);
        return TypedActionResult.success(mainHand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(net.minecraft.text.Text.translatable("Gives mining speed effect.").formatted(Formatting.RED));
    }
}
