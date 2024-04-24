package com.gaq35ms2.naswaymod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class NaswayModFood {
    public static final FoodComponent Nasway = new FoodComponent.Builder()
            .snack()
            .alwaysEdible()
            .nutrition(4)
            .saturationModifier(2.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200,2), 0.1f)
            .build();

    public static final FoodComponent Nasway_Elite = new FoodComponent.Builder()
            .snack()
            .alwaysEdible()
            .nutrition(6)
            .saturationModifier(3.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 250), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 250, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200,2), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 250, 1),1f)
            .build();
}
