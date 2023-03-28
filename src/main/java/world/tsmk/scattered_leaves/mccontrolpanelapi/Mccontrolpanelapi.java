package world.tsmk.scattered_leaves.mccontrolpanelapi;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mccontrolpanelapi implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    Logger logger = LoggerFactory.getLogger("mccontrolpanelapi");
    @Override
    public void onInitialize() {
        logger.info("hello world");
    }
}
