package com.migratorydata.extensions.audit.util;

import com.migratorydata.extensions.audit.MigratoryDataAccessListener;

import java.util.Map;

public class DummyConnectEvent implements MigratoryDataAccessListener.ConnectEvent {

    private String message;

    public DummyConnectEvent(String message) {
        this.message = message;
    }

    @Override
    public String getToken() {
        return null;
    }

    @Override
    public String getClientAddress() {
        return null;
    }

    @Override
    public String getUserAgent() {
        return null;
    }

    @Override
    public Map<String, Object> getAdditionalInfo() {
        return null;
    }

    @Override
    public String getTime() {
        return null;
    }
}
