package com.migratorydata.extensions.audit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.migratorydata.extensions.audit.ConfigProperty.setProperty;

public class FileLogAccessListener implements MigratoryDataAccessListener {

    static {
        setProperty();
    }

    private final Logger logger;

    public FileLogAccessListener() {
        logger = LogManager.getLogger(FileLogAccessListener.class);
    }

    @Override
    public void onConnect(ConnectEvent accessEvent) {
        logger.info(accessEvent.toString());
    }

    @Override
    public void onSubscribe(SubscribeEvent accessEvent) {
        logger.info(accessEvent.toString());
    }

    @Override
    public void onSubscribeWithHistory(SubscribeWithHistoryEvent accessEvent) {
        logger.info(accessEvent.toString());
    }

    @Override
    public void onSubscribeWithRecovery(SubscribeWithRecoveryEvent accessEvent) {
        logger.info(accessEvent.toString());
    }

    @Override
    public void onUnsubscribe(UnsubscribeEvent accessEvent) {
        logger.info(accessEvent.toString());
    }

    @Override
    public void onDisconnect(DisconnectEvent accessEvent) {
        logger.info(accessEvent.toString());
    }
}
