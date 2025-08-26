package com.juaracoding.healthcare.definitions.authentications;

import com.juaracoding.healthcare.pages.HomePage;
import com.juaracoding.healthcare.pages.LoginPage;
import com.juaracoding.healthcare.utils.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NegativeLoginSteps {
    HomePage homePage;
    LoginPage loginPage;

    @Given("pengguna masuk terlebih dahulu ke halama login.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com");
        new HomePage(DriverUtil.getDriver()).clickMakeAppointment();
        loginPage = new LoginPage(DriverUtil.getDriver());
    }

    @When("pengguna memasukkan username {string}.")
    public void step02(String username){
        loginPage.setUsername(username);
    }

    @And("pengguna memasukkan password {string}.")
    public void step03(String password){
        loginPage.setPassword(password);
    }

    @And("pengguna menekan tombol login.")
    public void step04() {
        loginPage.clickLoginButton();
    }

    @Then("pengguna akan melihat pesan kesalahan {string}.")
    public void step05(String message){
        Assert.assertEquals(loginPage.getErrorMessage(), message);
    }
}
