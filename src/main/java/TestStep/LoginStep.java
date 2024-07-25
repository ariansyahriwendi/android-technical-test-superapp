package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseStep {

    @Given("Account is registered")
    public void accountIsRegistered() {
    }

    @Given("Login page opened")
    public void loginPageOpened() {
    }

    @Given("Account not logged in")
    public void accountNotLoggedIn() {
    }

    @When("I input email {string}")
    public void iInputEmail(String x) {
    }

    @And("I input password {string}")
    public void iInputPassword(String x) {

    }

    @And("I click login")
    public void iClickLogin(String x) {

    }

    @Then("Redirect to welcome page")
    public void redirectToWelcomePage(String x) {

    }

    @And("I input {string} on field Nomor HP atau No. kartu member")
    public void iInputOnFieldNomorHPNoKartuMember(String arg0) {
    }

    @And("I input {string} on field Masukkan Password")
    public void iInputOnFieldMasukkanPassword(String arg0) {
    }

    @And("I click button Lanjut")
    public void iClickButtonLanjut() {
    }

    @Then("Success to login")
    public void successToLogin() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("Open to beranda page")
    public void openToBerandaPage() {
    }

    @Then("Fail to login")
    public void failToLogin() {
    }

    @Then("Error mesage Password Anda salah. Silahkan coba lagi")
    public void errorMesagePasswordAndaSalahSilahkanCobaLagi() {
    }

    @Given("Device connected with account 081806442929")
    public void deviceConnectedWithAccount081806442929() {
    }

    @Then("Pop up error message Login Gagal, Maaf device ini sudah terhubung dengan Id:xxx, No:xxx, dan No Hp:{int}xxxxx{int}. Mohon hubungi Sahabat Alfamart")
    public void popUpErrorMessageLoginGagalMaafDeviceIniSudahTerhubungDenganIdXxxNoXxxDanNoHpXxxxxMohonHubungiSahabatAlfamart(int arg0, int arg1) {
    }

    @Then("Error message Nomor HP atau No. kartu Member tidak boleh kosong")
    public void errorMessageNomorHPAtauNoKartuMemberTidakBolehKosong() {
    }

    @Then("Error message Kolom ini diperlukan")
    public void errorMessageKolomIniDiperlukan() {
    }

    @Then("Error message Password minimum delapan karakter")
    public void errorMessagePasswordMinimumDelapanKarakter() {
    }

    @And("I click icon visible password")
    public void iClickIconVisiblePassword() {
    }

    @Then("Failed to login")
    public void failedToLogin() {
    }

    @Then("Show alert wrong email or password")
    public void showAlertWrongEmailOrPassword() {
    }

    @Then("Show alert enter valid email")
    public void showAlertEnterValidEmail() {
    }

    @Then("Show alert enter password")
    public void showAlertEnterPassword() {
    }

    @Then("Show alert enter email")
    public void showAlertEnterEmail() {
    }
}
