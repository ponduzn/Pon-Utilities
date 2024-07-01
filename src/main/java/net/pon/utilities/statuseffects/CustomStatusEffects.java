package net.pon.utilities.statuseffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pon.utilities.PonUtilities;

public class CustomStatusEffects {
    public static StatusEffect CUSTOMMAGNETISM;


    public static StatusEffect registerCustomMagnetismEffect(String name, double range) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(PonUtilities.MOD_ID, name),
                new CustomMagnetismEffect(StatusEffectCategory.BENEFICIAL, 0x98D982));
    }
    public static void registerEffects() {
        CUSTOMMAGNETISM = registerCustomMagnetismEffect("magnetism", 10);
    }

}
