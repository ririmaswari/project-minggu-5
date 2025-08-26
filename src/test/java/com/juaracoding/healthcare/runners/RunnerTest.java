package com.juaracoding.healthcare.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/Authentication.feature",
        "src/test/resources/features/Appointment.feature"
}, glue = {
        "com.juaracoding.healthcare.definitions.authentications",
        "com.juaracoding.healthcare.definitions.appointments"
}, plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber-reporting/reports.json",
        "json:target/cucumber.json",
        "pretty",
        "html:target/cucumber-reporting/reports.html"
})

public class RunnerTest extends AbstractTestNGCucumberTests {

}