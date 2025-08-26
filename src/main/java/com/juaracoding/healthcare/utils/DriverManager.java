package com.juaracoding.healthcare.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {
    private WebDriver driver;

    public DriverManager() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver(){
        driver.quit();
    }
}
