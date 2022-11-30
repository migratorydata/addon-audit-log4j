package com.migratorydata.extensions.audit;

import com.migratorydata.extensions.audit.util.DummyConnectEvent;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccessListenerTest {

    @BeforeClass
    public static void before() {
        System.setProperty("log4j.configurationFile", "./config/log4j2.xml");
    }

    @Test
    public void test() {
        FileLogAccessListener accessListener = new FileLogAccessListener();

        accessListener.onConnect(new DummyConnectEvent("message"));

        Assert.assertTrue(true);
    }

    @Test
    public void testWithTwoMessagesAndCompressionWithRotate() throws InterruptedException {
        FileLogAccessListener accessListener = new FileLogAccessListener();

        accessListener.onConnect(new DummyConnectEvent("message1"));

        Thread.sleep(5000);

        accessListener.onConnect(new DummyConnectEvent("message2"));

        accessListener.onConnect(new DummyConnectEvent("message3"));
    }

}
