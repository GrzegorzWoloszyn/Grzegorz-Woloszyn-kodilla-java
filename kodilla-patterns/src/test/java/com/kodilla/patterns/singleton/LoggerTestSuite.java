package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given

        //When
        Logger.getInstance().log("First logon");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("First logon", result);
    }
}
