package com.gaq35ms2.naswaymod.block;

import com.gaq35ms2.naswaymod.NaswayMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NaswayModBlock {

    public static final Block Nasway_Block = LRegisterBlock("nasway_block", NaswayModBlockData.Nasway_block);

    private static Block LRegisterBlock(String name, Block block){
        LRegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaswayMod.MOD_ID, name), block);
    }
    private static Item LRegisterBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(NaswayMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void RegisterBlocks(){
        NaswayMod.LOGGER.info("Registering " + NaswayMod.MOD_ID + " Blocks...");
    }
}
