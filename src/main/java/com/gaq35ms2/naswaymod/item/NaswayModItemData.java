package com.gaq35ms2.naswaymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class NaswayModItemData {
    public static final Item Nasway = new Item(new FabricItemSettings()
            .food(NaswayModFood.Nasway));
    public static final Item Nasway_Elite = new Item(new FabricItemSettings()
            .food(NaswayModFood.Nasway_Elite));
}
