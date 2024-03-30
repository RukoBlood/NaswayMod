package com.gaq35ms2.naswaymod;

import com.gaq35ms2.naswaymod.items.NaswayModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class NaswayMod implements ModInitializer{
    public static final String MOD_ID = "naswaymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize(){
        LOGGER.info("NaswayMod very unstable release");
        NaswayModItems.RegisterItems();
    }
}
