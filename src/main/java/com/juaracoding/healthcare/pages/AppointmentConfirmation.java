package com.juaracoding.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentConfirmation {
    private WebDriver driver;
    private By facilityConfirmation = By.id("facility");
    private By visitDateConfirmation = By.id("visit_date");

    public AppointmentConfirmation(WebDriver driver){
        this.driver = driver;
    }

    public String getFacility(){
        return driver.findElement(facilityConfirmation).getText();
    }

    public String getVisitDate(){
        return driver.findElement(visitDateConfirmation).getText();
    }
}
