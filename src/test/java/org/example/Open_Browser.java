package org.example;

import org.testng.annotations.Test;

public class Open_Browser extends DriverSetup{

    @Test
    public void testBroserTask() throws InterruptedException {
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: "+ url);

        Thread.sleep(3000);

    }
}
