package com.gaq35ms2.naswaymod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class NaswayModFood {
    public static final FoodComponent Nasway = new FoodComponent.Builder()
            .snack()
            .alwaysEdible()
            .hunger(4)
            .saturationModifier(2.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200,2), 0.1f)
            .build();
}
