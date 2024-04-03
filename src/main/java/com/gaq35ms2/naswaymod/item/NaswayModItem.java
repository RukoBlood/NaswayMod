package com.gaq35ms2.naswaymod.item;

import com.gaq35ms2.naswaymod.NaswayMod;
import com.gaq35ms2.naswaymod.block.NaswayModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NaswayModItem {
    public static final Item Nasway = LRegisterItem("nasway", NaswayModItemData.Nasway);
    private static void LAddItemToFoodGroup(FabricItemGroupEntries entries){
        entries.add(Nasway);
    }
    private static void LAddItemToBlockGroup(FabricItemGroupEntries entries){
        entries.add(NaswayModBlock.Nasway_Block);
    }
    private static Item LRegisterItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(NaswayMod.MOD_ID, name), item);
    }
    public static void RegisterItems() {
        NaswayMod.LOGGER.info("Registering " + NaswayMod.MOD_ID + " Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(NaswayModItem::LAddItemToFoodGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(NaswayModItem::LAddItemToBlockGroup);
    }
}
