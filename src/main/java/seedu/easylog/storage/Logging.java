package seedu.easylog.storage;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {

    Logger logger = Logger.getLogger("easyLogLogs");
    FileHandler fh;

    public void setUpLogger() {
        // Reset logs from previous usage of the app
        LogManager.getLogManager().reset();

        // Do not log to console
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.OFF);
        logger.addHandler(ch);

        try {
            File logs = new File("easyLogLogs.txt");
            if (logs.createNewFile()) {
                // do nothing as just checking whether logs file exists, else create the logs file
            }
            fh = new FileHandler("easyLogLogs.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            fh.setLevel(Level.ALL);
            logger.addHandler(fh);
            logger.info("Logging to file started.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInfoLevelLog(String logMessage) {
        logger.setUseParentHandlers(false);
        logger.info(logMessage);
    }

    public void writeWarningLevelLog(String logMessage) {
        logger.setUseParentHandlers(false);
        logger.warning(logMessage);
    }

    public void writeSevereLevelLog(String logMessage) {
        logger.setUseParentHandlers(false);
        logger.severe(logMessage);
    }
}
