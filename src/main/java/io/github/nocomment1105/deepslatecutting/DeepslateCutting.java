package io.github.nocomment1105.deepslatecutting;

import io.github.nocomment1105.deepslatecutting.config.Config;
import io.github.nocomment1105.deepslatecutting.registry.ModBlocks;
import io.github.nocomment1105.deepslatecutting.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeepslateCutting implements ModInitializer {
    public static final String MOD_ID = "deepslatecutting";
    public static Config CONFIG;
    public static final Logger LOGGER = LogManager.getLogger("Deepslate Cutting");
    @Override
    public void onInitialize() {
        CONFIG = new Config(false);
        var myValue = CONFIG.smoothStuff;
        if (myValue) {
            ModBlocks.registerBlocks();
            ModItems.registerItems();
            LOGGER.info("Loaded Config! Regular deepslate extras are ON");
            LOGGER.warn("If you are running a server, please tell your clients they need to enable deepslate " +
                    "extras to see the regular deepslate blocks!");
        } else {
            LOGGER.info("Loaded Config! Regular deepslate extras are OFF");
        }
    }
}
