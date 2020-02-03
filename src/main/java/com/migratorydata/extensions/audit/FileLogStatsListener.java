package com.migratorydata.extensions.audit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.migratorydata.extensions.audit.ConfigProperty.setProperty;

public class FileLogStatsListener implements MigratoryDataStatsListener {

    static {
        setProperty();
    }

    private final Logger logger;

    public FileLogStatsListener() {
        logger = LogManager.getLogger(FileLogStatsListener.class);
    }

    @Override
    public void onStats(StatsEvent statsEvent) {
        logger.info(statsEvent.toString());
    }
}
