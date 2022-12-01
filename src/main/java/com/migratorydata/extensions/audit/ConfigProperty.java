package com.migratorydata.extensions.audit;

import java.io.File;

public class ConfigProperty {

    public static void setProperty() {
        if (System.getProperty("log4j.configurationFile") == null) {
            System.setProperty("log4j.configurationFile", "./addons/audit-log4j/log4j2.xml");
            File f = new File("./extensions/log4j2.xml");
            if (f.isFile()) {
                System.setProperty("log4j.configurationFile", "./extensions/log4j2.xml");
                return;
            }
            f = new File("/usr/share/migratorydata/extensions/log4j2.xml");
            if (f.isFile()) {
                System.setProperty("log4j.configurationFile", "/usr/share/migratorydata/extensions/log4j2.xml");
                return;
            }
            f = new File("/etc/migratorydata/addons/audit-log4j/log4j2.xml");
            if (f.isFile()) {
                System.setProperty("log4j.configurationFile", "/etc/migratorydata/addons/audit-log4j/log4j2.xml");
            }
        }
    }
}
