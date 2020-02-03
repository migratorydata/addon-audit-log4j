package com.migratorydata.extensions.audit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.migratorydata.extensions.audit.ConfigProperty.setProperty;

public class FileLogMessageListener implements MigratoryDataMessageListener {

    static {
        setProperty();
    }

    private final Logger logger;

    public FileLogMessageListener() {
        logger = LogManager.getLogger(FileLogMessageListener.class);
    }

    @Override
    public void onMessage(MessageEvent messageEvent) {
        logger.info(messageEvent.toString());
    }
}
