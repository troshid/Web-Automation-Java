package org.example;

import org.testng.annotations.Test;

public class Browser_Minimize_Maximize extends DriverSetup {

    @Test
    public void testBroserTask() throws InterruptedException {
        driver.get("https://www.google.com");

        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

    }
}
