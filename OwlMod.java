package com.example.owlmod;

import com.example.owlmod.config.OwlConfig;
import com.example.owlmod.entity.ModEntities;
import com.example.owlmod.sound.ModSounds;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class OwlMod implements ModInitializer {

    public static final String MOD_ID = "owlmod";

    @Override
    public void onInitialize() {
        AutoConfig.register(OwlConfig.class, JanksonConfigSerializer::new);
        ModSounds.init();
        ModEntities.register();
    }
}
