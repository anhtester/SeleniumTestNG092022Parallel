package anhtester.com.utils;

import anhtester.com.helpers.PropertiesHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LogUtils {
    //Initialize Log4j instance
    private static final Logger LOGGER = (Logger) LogManager.getLogger(LogUtils.class);

    //Info Level Logs
    public static void info(String message) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.info(message);
        }
    }

    public static void info(Object object) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.info(object);
        }
    }

    //Warn Level Logs
    public static void warn(String message) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.warn(message);
        }
    }

    public static void warn(Object object) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.warn(object);
        }
    }

    //Error Level Logs
    public static void error(String message) {
        if (PropertiesHelper.getValue("LOGGER").equals("error") || PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.error(message);
        }

    }

    public static void error(Object object) {
        if (PropertiesHelper.getValue("LOGGER").equals("error") || PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.error(object);
        }
    }

    //Fatal Level Logs
    public static void fatal(String message) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.fatal(message);
        }
    }

    public static void fatal(Object object) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.fatal(object);
        }
    }

    //Debug Level Logs
    public static void debug(String message) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.debug(message);
        }
    }

    public static void debug(Object object) {
        if (PropertiesHelper.getValue("LOGGER").equals("all")) {
            LOGGER.debug(object);
        }
    }
}
