package com.cabservice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test
    public void basicSmokeTest() {
        String serviceName = "Cab Service";
        Assert.assertTrue(serviceName.contains("Cab"), "Service name validation failed!");
    }
}
