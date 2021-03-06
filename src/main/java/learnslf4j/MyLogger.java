package learnslf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger extends IMyLogger {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    @Override
    protected void debugLevelTest() {
        LOGGER.debug("debug level test");
    }

    @Override
    protected void infoLevelTest() {
        LOGGER.info("info level test");
    }

    @Override
    protected void warnLevelTest() {
        LOGGER.warn("warn level test");
    }

    @Override
    protected void errorLevelTest() {
        LOGGER.error("error level test");
    }
}
