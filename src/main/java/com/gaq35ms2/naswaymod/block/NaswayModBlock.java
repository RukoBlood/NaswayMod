package com.gaq35ms2.naswaymod.block;

import com.gaq35ms2.naswaymod.NaswayMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class NaswayModBlock {

    public static final Block Nasway_Block = LRegisterBlock("nasway_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.GREEN).strength(0.4f,2f).sounds(BlockSoundGroup.GRASS)));
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
