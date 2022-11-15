package maxwainer.blockchain.miner;

import java.util.logging.Logger;

public class Application {

    public static final Logger LOGGER = Logger.getLogger("Application");

    public static void main(String[] args) {
        LOGGER.info("Loading miner version 1.0 by Max_Wainer...");
    }

    private static final class ShutdownHook extends Thread {

        @Override
        public void run() {

        }
    }

}
