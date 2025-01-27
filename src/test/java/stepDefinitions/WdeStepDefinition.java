package stepDefinitions;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import pages.WdePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utilities.Driver.desktopDriver;


public class WdeStepDefinition {

    WdePage wdePage = new WdePage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public static WebDriver driver;


    @Given("Kullanıcı wde uygulamasına gider")
    public void kullanıcıWdeUygulamasınaGider() {

        if (Driver.webDriver() != null) {
            Driver.quitWebDriver();
        }
        Driver.getDriver();
    }

    @When("Kullanıci wde için geçerli username girer")
    public void kullaniciWdeIçinGeçerliUsernameGirer() {

        wdePage.userName.clear();
        wdePage.userName.sendKeys("mehmet.demir");

    }

    @And("Kullanıcı wde için geçerli password girer")
    public void kullanıcıWdeIçinGeçerliPasswordGirer() {
        wdePage.password.sendKeys("x");

    }

    @And("Kullanıc wde için Login button tıklar")
    public void kullanıcWdeIçinLoginButtonTıklar() {
        wdePage.login.click();

        ReusableMethods.waitFor(15);
        /*
        int windowCount = Driver.getDriver().getWindowHandles().size();
        System.out.println(windowCount);
        String windows = Driver.getDriver().getWindowHandles().iterator().next();
        Driver.getDriver().switchTo().window(windows).getTitle();
        System.out.println(Driver.getDriver().switchTo().window(windows).getTitle());
        */

        /*
        //Ana Sayfaya Gecis
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowList.size = " + windowList.size());
        System.out.println("Driver.getDriver().getTitle = " + Driver.getDriver().getTitle());
        if (windowList.size() == 2) {

            Driver.getDriver().switchTo().window(windowList.get(1));
        } else {
            Driver.getDriver().switchTo().window(windowList.get(0));
        }
        ReusableMethods.waitFor(1);
        System.out.println(Driver.getDriver().getTitle());

         */
        for (String window : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(window);
            if (Driver.getDriver().getTitle().contains("Workspace")) {
                break;
            }
        }
    }

    @And("Kullanıcı hamburger menu ye tiklar")
    public void kullanıcıHamburgerMenuYeTiklar() {

        wdePage.hamburgerButton.click();
    }

    @And("My Campains e tıklar")
    public void myCampainsETıklar() {
        wdePage.myCampaigns.click();
    }

    @And("My campains sayfasında get rocords butonu na tıklar")
    public void myCampainsSayfasındaGetRocordsButonuNaTıklar()  {

        wdePage.getRecord.click();

        for (String window : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(window);
            if (Driver.getDriver().getTitle().contains("Workspace")) {
                break;
            }
        }

    }

    @And("Runtime içerisinde bitir butonuna tıklar")
    public void runtimeIçerisindeBitirButonunaTıklar() {

        actions.keyDown(Keys.ALT)
                .sendKeys(Keys.F4)
                .keyUp(Keys.ALT)
                .build()
                .perform();
        wdePage.runtimeModuleBitir.click();
    }

    @And("Sonuc kodu {string} girilir")
    public void sonucKoduGirilir(String sonucKodu) {

        wdePage.sonucKoduAraSearchBox.click();
        wdePage.sonucKoduAraSearchBox.sendKeys(sonucKodu);
        /*
        Runtime icinde sonuc kodu ara searchBox'ina girilecek olan sonuc kodunun adini yazinca
         O sonuc kodu secili hale geliyor Bunun
        */

    }

    @And("Bitir butonuna tıklar")
    public void bitirButonunaTıklar() {
        wdePage.sonucKoduBitirButon.click();
    }

    @Then("onay butonun da evet tıklar")
    public void onayButonunDaEvetTıklar() {
        wdePage.runtimeOnayButon.click();
    }
}
