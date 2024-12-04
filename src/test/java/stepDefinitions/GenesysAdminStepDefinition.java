package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.GensysAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class GenesysAdminStepDefinition {

    GensysAdminPage genesys = new GensysAdminPage();
    Actions actions = new Actions(Driver.webDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.webDriver();

    @Given("Kullanıcı Genesys admin Url'ye gider")
    public void kullanıcıGenesysAdminUrlYeGider() {

        if (Driver.getDriver() != null) {
            Driver.designerClose();
            ReusableMethods.winAppDriverStop();
        }

        Driver.webDriver().get(ConfigReader.getProperty("gaURL"));

        //genesys.advanced.click();
        //genesys.link.click();
    }

    @When("Kullanıcı Genesys admin için geçerli username girer")
    public void kullanıcıGenesysAdminIçinGeçerliUsernameGirer() {
        genesys.userName.sendKeys(ConfigReader.getProperty("gaUserName"));

    }

    @And("Kullanıcı Genesys admin için geçerli password girer")
    public void kullanıcıGenesysAdminIçinGeçerliPasswordGirer() {
        genesys.password.sendKeys(ConfigReader.getProperty("gaPassword"));

    }

    @And("Kullanıcı Genesys admin için application girer")
    public void kullanıcıGenesysAdminIçinApplicationGirer() {
        genesys.applicationName.sendKeys(ConfigReader.getProperty("gaAplication"));

    }

    @And("Kullanıcı Genesys admin için host name girer")
    public void kullanıcıGenesysAdminIçinHostNameGirer() {
        genesys.hostName.sendKeys(ConfigReader.getProperty("gaHostName"));
    }

    @And("Kullanıcı Genesys admin için port girer")
    public void kullanıcıGenesysAdminIçinPortGirer() {
        genesys.Port.sendKeys(ConfigReader.getProperty("gaPort"));
    }

    @And("Kullanıcı login buttonuna tıklar")
    public void kullanıcıLoginButtonunaTıklar() {
        genesys.loginButton.click();

    }

    @Then("Kullanıcı genesys admin anasayfasına gidildiğini doğrular")
    public void kullanıcıGenesysAdminAnasayfasınaGidildiğiniDoğrular() {

        Assert.assertTrue(genesys.homePageTitle.isDisplayed());
    }

    @And("Kullanıcı Account sekmesine tıklar")
    public void kullanıcıAccountSekmesineTıklar() {

        jse.executeScript("arguments[0].click();", genesys.account);

    }

    @And("Kullanıcı users sekmesine tıklar")
    public void kullanıcıUsersSekmesineTıklar() {
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", genesys.users);

    }

    @And("Kullanıcı istediği Testi seçer")
    public void kullanıcıIstediğiTestiSeçer() {
        actions.doubleClick(genesys.gökhanttest4).perform();

    }

    @And("Kullanıcı agentGroup tab'a tıklar")
    public void kullanıcıAgentGroupTabATıklar() {
        genesys.agentGroups.click();
    }

    @And("Kullanıcı istediği link e tıklar")
    public void kullanıcıIstediğiLinkETıklar() {
        genesys.OCS_Group_1.click();
        ReusableMethods.waitFor(1);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowHandlesHashCode = " + windowList.get(1));
        Driver.getDriver().switchTo().window(windowList.get(1));
        ReusableMethods.waitFor(1);
    }

    @And("Provisioning tab'i acilir")
    public void provisioningTabIAcilir() {

        System.out.println(genesys.provisioning.isDisplayed());

        System.out.println("genesys.provisioning.getText() = " + genesys.provisioning.getText());

        ReusableMethods.clickWithJsWeb(genesys.provisioning);

    }

    @And("Environment sekmesine tiklanir")
    public void environmentSekmesineTiklanir() {
        genesys.environment.click();
    }

    @And("Applications'a tiklanir")
    public void applicationsATiklanir() {
        genesys.applications.click();
    }

    @And("Ilgili klasor {string} acilir")
    public void ılgiliKlasorAcilir(String klasorName) {
        WebElement appKlasor = Driver.webDriver().findElement(By.xpath("//div[text()='" + klasorName + "']"));
        actions.doubleClick(appKlasor).perform();
    }

    @And("Ilgili application {string} acilir")
    public void ılgiliApplicationAcilir(String applicationName) {
        WebElement application = Driver.webDriver().findElement(By.xpath("//span[text()='" + applicationName + "']"));
        actions.doubleClick(application).perform();
    }

    @And("options tab'ina tiklanir")
    public void optionsTabInaTiklanir() {
        genesys.optionsTab.click();
    }

    @And("Option alanina guncellenecek optionun adi {string} yazilir")
    public void optionAlaninaGuncellenecekOptionunAdiYazilir(String optionName) {
        //genesys.optionsFilter.click();
        actions.sendKeys(genesys.optionsFilter, optionName, Keys.ENTER).perform();
    }

    @And("Guncelleme yapilmak istenen optionun value degerine {string} veri girilir")
    public void guncellemeYapilmakIstenenOptionunValueDegerineVeriGirilir(String valueDegeri) {
        ReusableMethods.clickWithJsWeb(genesys.optionsFilterValueDegeri);
        actions.click(genesys.optionsFilterValueDegeri)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
        actions.sendKeys(genesys.optionsFilterValueDegeri, valueDegeri, Keys.ENTER).perform();


    }

    @And("Save butonuna tiklanir")
    public void saveButonunaTiklanir() {
        genesys.save.click();
    }

    @And("Genesys uygulmasi kapatilir")
    public void genesysUygulmasiKapatilir() {
        Driver.quitWebDriver();
    }
}
