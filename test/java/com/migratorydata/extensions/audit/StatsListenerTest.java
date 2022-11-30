package com.migratorydata.extensions.audit;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class StatsListenerTest {
    @BeforeClass
    public static void before() {
        System.setProperty("log4j.configurationFile", "./config/log4j2.xml");
    }

    @Test
    public void test() {
        FileLogStatsListener fileLogStatsListener = new FileLogStatsListener();
        fileLogStatsListener.onStats(new MigratoryDataStatsListener.StatsEvent() {
            @Override
            public long getTotalConnectionCount() {
                return 0;
            }

            @Override
            public long getWebConnectionCount() {
                return 0;
            }

            @Override
            public long getMobileConnectionCount() {
                return 0;
            }

            @Override
            public long getDesktopConnectionCount() {
                return 0;
            }

            @Override
            public double getConnectionRate() {
                return 0;
            }

            @Override
            public double getDisconnectionRate() {
                return 0;
            }

            @Override
            public double getIncomingMessageRate() {
                return 0;
            }

            @Override
            public double getIncomingClientMessageRate() {
                return 0;
            }

            @Override
            public double getOutgoingMessageRate() {
                return 0;
            }

            @Override
            public double getIncomingByteRate() {
                return 0;
            }

            @Override
            public double getOutgoingByteRate() {
                return 0;
            }

            @Override
            public double getConnectRateRecoverySuccess() {
                return 0;
            }

            @Override
            public double getConnectRateRecoveryFail() {
                return 0;
            }

            @Override
            public double getClientPublishFailed() {
                return 0;
            }

            @Override
            public Map<String, Object> getAdditionalInfo() {
                return null;
            }

            @Override
            public String getTime() {
                return null;
            }

            @Override
            public String toString() {
                return "onStats";
            }
        });
    }

}
