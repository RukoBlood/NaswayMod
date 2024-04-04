package com.gaq35ms2.naswaymod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class NaswayModBlockData {
    /*
    * Дабы сделать свой код более читаемым, я перенёс инфу о блоках сюда
    */

    public static final Block Nasway_block = new Block(FabricBlockSettings.copyOf(Blocks.DIRT)
                    .mapColor(MapColor.GREEN)
                    .strength(0.4f,2f)
                    .sounds(BlockSoundGroup.GRASS));
    public static final Block Nasway_Elite_block = new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
            .sounds(BlockSoundGroup.GRAVEL));
}
