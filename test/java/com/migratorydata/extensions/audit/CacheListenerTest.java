package com.migratorydata.extensions.audit;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class CacheListenerTest {

    @BeforeClass
    public static void before() {
        System.setProperty("log4j.configurationFile", "./config/log4j2.xml");
    }

    @Test
    public void test() {
        FileLogCacheListener fileLogCacheListener = new FileLogCacheListener();

        fileLogCacheListener.onAdd(new MigratoryDataCacheListener.CacheAddEvent() {

            @Override
            public String getTime() {
                return null;
            }

            @Override
            public String getSubject() {
                return null;
            }

            @Override
            public int getSeqNo() {
                return 0;
            }

            @Override
            public int getEpochNo() {
                return 0;
            }

            @Override
            public Map<String, Object> getAdditionalInfo() {
                return null;
            }
        });
    }
}
