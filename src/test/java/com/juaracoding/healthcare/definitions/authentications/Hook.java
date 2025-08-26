package com.juaracoding.healthcare.definitions.authentications;

import com.juaracoding.healthcare.utils.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hook {
    @Before
    public static void setup() {
        // System.out.println("Hook::setup()");
        DriverUtil.openDriver();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        DriverUtil.quitDriver();
    }
}
