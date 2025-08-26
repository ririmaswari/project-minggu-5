package com.juaracoding.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AppointmentPage {
    private WebDriver driver;
    private By facilitySortLocator = By.xpath("//*[@id='combo_facility']");
    private By visitDateLocator = By.xpath("//*[@id='txt_visit_date']");
    private By buttonAppointment = By.xpath("//*[@id='btn-book-appointment']");


    public AppointmentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public List<String> sortingBy(String value) {
        Select select = new Select(driver.findElement(facilitySortLocator));
        select.selectByValue(value);

        List<String> actuals = new ArrayList<String>();

        return actuals;
    }

    public void setVisitDate(String value) {
        WebElement visitDateField = driver.findElement(visitDateLocator);
        visitDateField.clear();       // Bersihkan field jika ada isi sebelumnya
        visitDateField.sendKeys(value); // Isi dengan tanggal sesuai format (misalnya "10/08/2025")
    }

    public void clickButtonAppointment(){
        driver.findElement(buttonAppointment).click();
    }

}
