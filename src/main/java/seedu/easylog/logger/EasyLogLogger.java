package seedu.easylog.logger;

import seedu.easylog.EasyLog;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogManager;
import java.util.logging.SimpleFormatter;


/**
 * Handles file logging when using easyLog.
 */
public class EasyLogLogger {
    private final static Logger easyLogLogger = Logger.getLogger(EasyLog.class.getName());

    public EasyLogLogger() {
        LogManager.getLogManager().reset();
        easyLogLogger.setUseParentHandlers(false);

        easyLogLogger.setLevel(Level.WARNING);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING);

        easyLogLogger.addHandler(consoleHandler);

        /*try {
            FileHandler fileHandler = new FileHandler("easyLog.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.FINE);
            easyLogLogger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }*/
    }
}
