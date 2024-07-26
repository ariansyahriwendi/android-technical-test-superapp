package Object;

import BaseClass.BaseSetUp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends BaseSetUp {

    private final By masukSekarang = new By.ByXPath("//android.widget.Button[@content-desc=\"Masuk Sekarang\"]\n");
    public void setMasukSekarang() {
        click(masukSekarang);
    }

    private final By usernameClick = new By.ByXPath("//android.widget.EditText[1]");
    public void setUsernameClick() {
        click(usernameClick);
    }

    private final By username = new By.ByXPath("//android.widget.EditText[1]");
    public void setUsername(String x) {
        input(username, x);
    }

    private final By passwordClick = new By.ByXPath("//android.widget.EditText[2]");
    public void setPasswordClick() {
        click(passwordClick);
    }

    private final By password = new By.ByXPath("//android.widget.EditText[2]");
    public void setPassword(String x) {
        input(password, x);
    }

    private final By login = new By.ByXPath("//android.widget.Button[@content-desc=\"Login\"]\n");
    public void setLogin() {
        click(login);
    }

    private final By homepage = new By.ByXPath("//android.widget.ImageView[2]");
    public void setHomepage() {
        waitForElement(homepage);
    }

    private final By visiblePassword = new By.ByXPath("//android.widget.EditText[2]/android.widget.ImageView");
    public void setVisiblePassword() {
        click(visiblePassword);
    }

    private final By errorUsernamePasswordBelumDimasukkan = new By.ByXPath("//android.view.View[@content-desc=\"Username/password belum dimasukkan!\"]\n");
    public void setErrorUsernamePasswordBelumDimasukkan() {
        waitForElement(errorUsernamePasswordBelumDimasukkan);
    }

    private final By errorUsernamePasswordTidakDitemukan = new By.ByXPath("//android.view.View[@content-desc=\" Username dan Password tidak ditemukan\"]\n");
    public void setErrorUsernamePasswordTidakDitemukan() {
        waitForElement(errorUsernamePasswordTidakDitemukan);
    }

    private final By errorPasswordTidakSesuai = new By.ByXPath("//android.view.View[@content-desc=\" Password tidak sesuai\"]\n");
    public void setErrorPasswordTidakSesuai() {
        waitForElement(errorPasswordTidakSesuai);
    }

    private final By profil = new By.ByXPath("//android.view.View[@content-desc=\"M\"]\n");
    public void setProfil() {
        click(profil);
    }

    private final By keluar = new By.ByXPath("//android.widget.ImageView[@content-desc=\"Keluar\"]\n");
    public void setKeluar() {
        click(keluar);
    }

    private final By konfirmasiKeluar = new By.ByXPath("//android.widget.Button[@content-desc=\"Keluar\"]\n");
    public void setKonfirmasiKeluar() {
        click(konfirmasiKeluar);
    }

    private final By loginPage = new By.ByXPath("//android.view.View[@content-desc=\"Yuk login kembali untuk mengakses akun kamu\"]\n");
    public void setLoginPage() {
        waitForElement(loginPage);
    }



}
