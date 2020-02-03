package com.migratorydata.extensions.audit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.migratorydata.extensions.audit.ConfigProperty.setProperty;

public class FileLogCacheListener implements MigratoryDataCacheListener {

    static {
        setProperty();
    }

    private final Logger logger;

    public FileLogCacheListener() {
        logger = LogManager.getLogger(FileLogCacheListener.class);
    }

    @Override
    public void onAdd(CacheAddEvent cacheAddEvent) {
        logger.info(cacheAddEvent.toString());
    }

    @Override
    public void onClean(CacheCleanEvent cacheCleanEvent) {
        logger.info(cacheCleanEvent.toString());
    }

    @Override
    public void onGetHistory(CacheHistoryEvent cacheHistoryEvent) {
        logger.info(cacheHistoryEvent.toString());
    }

    @Override
    public void onGetRecovery(CacheRecoveryEvent cacheRecoveryEvent) {
        logger.info(cacheRecoveryEvent.toString());
    }

    @Override
    public void onStart(CacheStartEvent cacheStartEvent) {
        logger.info(cacheStartEvent.toString());
    }
}
