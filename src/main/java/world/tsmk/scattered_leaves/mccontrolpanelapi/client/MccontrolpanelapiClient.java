package world.tsmk.scattered_leaves.mccontrolpanelapi.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MccontrolpanelapiClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    Logger logger = LoggerFactory.getLogger("mccontrolpanelapi");
    @Override
    public void onInitializeClient() {
        logger.info("hello world");

    }
}
