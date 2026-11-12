
package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeleniumTestCase {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        assertEquals("Google", title);
    }

    @Test
    public void testGoogleUrl() {
        driver.get("https://www.google.com");

        String url = driver.getCurrentUrl();

        System.out.println("Current URL: " + url);

        assertTrue(url.startsWith("https://www.google.com"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
