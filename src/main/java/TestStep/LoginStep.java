package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseStep {

    @Given("Welcome page opened")
    public void welcomePageOpened() {
    }

    @When("I click masuk sekarang")
    public void iClickMasukSekarang() {
        login.setMasukSekarang();
    }

    @And("I input username {string}")
    public void iInputUsername(String x) {
        login.setUsernameClick();
        login.setUsername(x);
    }

    @And("I input password {string}")
    public void iInputPassword(String x) {
        login.setPasswordClick();
        login.setPassword(x);
    }

    @And("I click login")
    public void iClickLogin() {
        login.setLogin();
    }

    @Then("Success to login")
    public void successToLogin() throws InterruptedException {
        login.setHomepage();
        Thread.sleep(2000);
    }

    @And("I click icon visible password")
    public void iClickIconVisiblePassword() {
        login.setVisiblePassword();
    }

    @Then("Failed to login error message username password belum dimasukkan")
    public void failedToLoginErrorMessageUsernamePasswordBelumDimasukkan() {
        login.setErrorUsernamePasswordBelumDimasukkan();
    }

    @Then("Failed to login error message username dan password tidak ditemukan")
    public void failedToLoginErrorMessageUsernameDanPasswordTidakDitemukan() {
        login.setErrorUsernamePasswordTidakDitemukan();
    }

    @Then("Failed to login error message password tidak sesuai")
    public void failedToLoginErrorMessagePasswordTidakSesuai() {
        login.setErrorPasswordTidakSesuai();
    }

    @And("I click profile")
    public void iClickProfile() {
        login.setProfil();
    }

    @And("I click keluar")
    public void iClickKeluar() {
        login.setKeluar();
    }

    @And("I click konfirmasi keluar")
    public void iClickKonfirmasiKeluar() {
        login.setKonfirmasiKeluar();
    }

    @Then("Success to logout")
    public void successToLogout() {
        login.setLoginPage();
    }
}