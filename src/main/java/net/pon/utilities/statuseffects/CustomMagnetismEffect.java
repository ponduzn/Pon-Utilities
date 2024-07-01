package net.pon.utilities.statuseffects;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;

import java.util.List;

public class CustomMagnetismEffect extends StatusEffect {
    public CustomMagnetismEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffects(LivingEntity entity, int amplifier, Hand hand) {
        if (this == CustomStatusEffects.CUSTOMMAGNETISM) {
            ItemStack Hand = entity.getStackInHand(hand);
            if (entity.isAlive()) {
                List<ItemEntity> items = entity.getEntityWorld().getEntitiesByType(EntityType.ITEM, Box.of(entity.getPos(), entity.getX() + 20, entity.getY() + 20, entity.getZ() + 20), (e) -> true);
                for (ItemEntity item : items) {
                    item.setPosition(entity.getPos());
                }
            }
        }
    }
}
