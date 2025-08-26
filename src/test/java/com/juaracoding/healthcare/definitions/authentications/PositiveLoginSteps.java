package com.juaracoding.healthcare.definitions.authentications;

import com.juaracoding.healthcare.pages.AppointmentPage;
import com.juaracoding.healthcare.pages.HomePage;
import com.juaracoding.healthcare.pages.LoginPage;
import com.juaracoding.healthcare.utils.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PositiveLoginSteps {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;

    @Given("pengguna berada di halaman login CURA Healthcare Service.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com");
        new HomePage(DriverUtil.getDriver()).clickMakeAppointment();
    }

    @When("pengguna login dengan username {string} dan password {string}.")
    public void step02(String username, String password){
        loginPage = new LoginPage(DriverUtil.getDriver());
        loginPage.performLogin(username, password);
    }

    @Then("pengguna akan di bawa ke halaman dengan url {string} untuk memeriksa hasil test.")
    public void step03(String url){
        appointmentPage = new AppointmentPage(DriverUtil.getDriver());
        Assert.assertEquals(appointmentPage.getCurrentURL(), url);
    }

}
