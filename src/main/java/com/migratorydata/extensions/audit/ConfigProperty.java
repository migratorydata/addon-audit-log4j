package com.migratorydata.extensions.audit;

public class ConfigProperty {

    public static void setProperty() {
        if (System.getProperty("log4j.configurationFile") == null) {
            System.setProperty("log4j.configurationFile", "./extensions/log4j2.xml");
        }
    }
}
