package com.gaq35ms2.naswaymod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class NaswayModBlockData {
    /*
    * Я думаю переместить сюда некоторую информацию о блоках, дабы в основном регистрационном классе не было такого убогого говнокода.
    * Но это будет сложно наверное.
    */

    public static final Block Nasway_block = new Block(FabricBlockSettings.copyOf(Blocks.DIRT)
                    .mapColor(MapColor.GREEN)
                    .strength(0.4f,2f)
                    .sounds(BlockSoundGroup.GRASS));
}
