package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Nevigate extends DriverSetup{

    @Test
    public void testBroserTask() throws InterruptedException {
        driver.get("https://www.google.com");

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://x.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com");
        Thread.sleep(3000);

        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        for (String handle: handles) {
            System.out.println(handle);
        }
        System.out.println("Before Switching: " + driver.getCurrentUrl());

        driver.switchTo().window(handles.get(0));

        System.out.println("After Switching: " + driver.getCurrentUrl());

        driver.close();
        Thread.sleep(3000);
    }
}
