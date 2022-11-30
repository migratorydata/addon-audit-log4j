package com.migratorydata.extensions.audit;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class MessageListenerTest {
    @BeforeClass
    public static void before() {
        System.setProperty("log4j.configurationFile", "./config/log4j2.xml");
    }

    @Test
    public void test() {
        FileLogMessageListener fileLogMessageListener = new FileLogMessageListener();


        fileLogMessageListener.onMessage(new MigratoryDataMessageListener.MessageEvent(){

            @Override
            public String getTime() {
                return null;
            }

            @Override
            public String getSubject() {
                return null;
            }

            @Override
            public byte[] getContent() {
                return new byte[0];
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
