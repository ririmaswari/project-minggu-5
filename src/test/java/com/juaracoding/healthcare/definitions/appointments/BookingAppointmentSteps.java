package com.juaracoding.healthcare.definitions.appointments;

import com.juaracoding.healthcare.pages.AppointmentConfirmation;
import com.juaracoding.healthcare.pages.AppointmentPage;
import com.juaracoding.healthcare.pages.HomePage;
import com.juaracoding.healthcare.pages.LoginPage;
import com.juaracoding.healthcare.utils.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BookingAppointmentSteps {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    AppointmentConfirmation appointmentConfirmation;

    @Given("pengguna wajib melakukan login terlebih dahulu.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com");
        new HomePage(DriverUtil.getDriver()).clickMakeAppointment();
        loginPage = new LoginPage(DriverUtil.getDriver());
        loginPage.performLogin();
        appointmentPage = new AppointmentPage(DriverUtil.getDriver());
    }

    @When("pengguna memilih fasilitas {string}.")
    public void step02(String facility){
        appointmentPage.sortingBy(facility);
    }

    @And("pengguna memilih tanggal janji pada {string}.")
    public void step03(String date){
        appointmentPage.setVisitDate(date);
    }

    @And("pengguna klik Book Appointment jika sudah sesuai.")
    public void step04(){
        appointmentPage.clickButtonAppointment();
    }

    @Then("pengguna akan mendapatkan verifikasi fasilitas {string} dan tanggal {string} yang sudah dipilih.")
    public void step05(String facility, String date) {
        AppointmentConfirmation confirmation = new AppointmentConfirmation(DriverUtil.getDriver());

        // Assert facility
        Assert.assertEquals(confirmation.getFacility(), facility);

        // Assert visit date
        Assert.assertEquals(confirmation.getVisitDate(), date);

    }
}
