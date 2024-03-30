package com.gaq35ms2.naswaymod.items;

import com.gaq35ms2.naswaymod.NaswayMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NaswayModItems {
    public static final Item Nasway = LRegisteritem("nasway", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().snack().hunger(2).saturationModifier(0.4f).build())));

    private static void LAddItemToItemGroup(FabricItemGroupEntries entries){
        entries.add(Nasway);
    }
    private static Item LRegisteritem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(NaswayMod.MOD_ID, name), item);
    }
    public static void RegisterItems() {
        NaswayMod.LOGGER.info("Registering" + NaswayMod.MOD_ID + "Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(NaswayModItems::LAddItemToItemGroup);
    }
}
