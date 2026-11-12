
package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class SeleniumTestCase {

    WebDriver driver;

    @Before
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
    }

    @Test
    public void testGoogleTitle() {

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        assertTrue(title.contains("Google"));
    }

    @Test
    public void testGoogleUrl() {

        driver.get("https://www.google.com");

        String url = driver.getCurrentUrl();

        System.out.println("Current URL: " + url);

        assertTrue(url.contains("google.com"));
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
