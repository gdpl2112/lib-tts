package io.github.gdpl2112;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

/**
 * @author HRS-Computer
 */
public final class LibTts extends JavaPlugin {
    public static final LibTts INSTANCE = new LibTts();

    private LibTts() {
        super(new JvmPluginDescriptionBuilder("io.github.gdpl2112.lib-tts", "1.0")
                .name("lib-tts")
                .author("kloping")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}