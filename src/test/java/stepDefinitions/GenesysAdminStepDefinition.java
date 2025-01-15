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

    @Given("Genesys admin Url'ye gidilir")
    public void genesysAdminUrlYeGidilir() {

        if (Driver.getDriver() != null) {
            Driver.designerClose();
            ReusableMethods.winAppDriverStop();
        }

        Driver.webDriver().get(ConfigReader.getProperty("gaURL"));

        //genesys.advanced.click();
        //genesys.link.click();
    }

    @When("Genesys admin icin gecerli username girilir")
    public void genesysAdminIcinGecerliUsernameGirilir() {
        genesys.userName.sendKeys(ConfigReader.getProperty("gaUserName"));

    }

    @And("Genesys admin icin gecerli password girilir")
    public void genesysAdminIcinGecerliPasswordGirilir() {
        genesys.password.sendKeys(ConfigReader.getProperty("gaPassword"));

    }

    @And("Genesys admin icin application girilir")
    public void genesysAdminIcinApplicationGirilir() {
        genesys.applicationName.sendKeys(ConfigReader.getProperty("gaAplication"));

    }

    @And("Genesys admin icin host name girilir")
    public void genesysAdminIcinHostNameGirilir() {
        genesys.hostName.sendKeys(ConfigReader.getProperty("gaHostName"));
    }

    @And("Genesys admin icin port girilir")
    public void genesysAdminIcinPortGirilir() {
        genesys.Port.sendKeys(ConfigReader.getProperty("gaPort"));
    }

    @And("Genesys admin login buttonuna tıklanir")
    public void genesysAdminLoginButtonunaTiklanir() {
        genesys.loginButton.click();

    }

    @Then("Kullanıcı genesys admin anasayfasına gidildiğini doğrular")
    public void kullanıcıGenesysAdminAnasayfasınaGidildiğiniDoğrular() {

        Assert.assertTrue(genesys.homePageTitle.isDisplayed());
    }

    @And("Account sekmesine tiklanir")
    public void accountSekmesineTiklanir() {

        jse.executeScript("arguments[0].click();", genesys.account);

    }

    @And("Users sekmesine tiklanir")
    public void usersSekmesineTiklanir() {
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

    //Kampanya Start
    @And("Operation tab'i acilir")
    public void operationTabIAcilir() {
        genesys.operations.click();

    }

    @And("Calistirilmak istenilen kampanya {string} secilir")
    public void calistirilmakIstenilenKampanyaSecilir(String kampanyaName) {
        //genesys.campIdSearchBox.sendKeys(kampanyaName);
        genesys.campIdSearchBoxAraButon.click();


        WebElement kampanyaKlasoru = Driver.webDriver().findElement(By.xpath("//div[text()='Test']"));
        ReusableMethods.waitFor(2);
        actions.doubleClick(kampanyaKlasoru).perform();

        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForClickablilityWeb(genesys.campFiltreleSearchBox, 10);
        genesys.campFiltreleSearchBox.sendKeys(kampanyaName, Keys.ENTER);
        WebElement kampanyaSec = Driver.webDriver().findElement(By.xpath("//div[text()='" + kampanyaName + "']"));
        actions.doubleClick(kampanyaSec).perform();
    }

    @And("Load butonuna basilir")
    public void loadButonunaBasilir() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJsWeb(genesys.loadButton);
        //genesys.loadButton.click();
    }

    @And("Dialing mode kismindan kampanya arama modu {string} secilir")
    public void dialingModeKismindanKampanyaAramaModuSecilir(String dialingMode) {

        if (dialingMode.equals("Preview")) {

            System.out.println("Dialing Mode Defoult Olarak Preview Secili");
        } else {

            //ReusableMethods.waitForVisibilityWeb(genesys.dialingMode, 10);
            ReusableMethods.waitFor(1);
            genesys.dialingMode.click();

            WebElement dialingModeSec = Driver.webDriver().findElement(By.xpath("//div[text()='" + dialingMode + "']"));
            ReusableMethods.waitForVisibilityWeb(dialingModeSec, 10);
            dialingModeSec.click();
        }

    }

    @And("Start butonuna tiklanir")
    public void startButonunaTiklanir() {

        ReusableMethods.waitFor(2);
        if (genesys.kampanyaStartButton.isEnabled()) {
            genesys.kampanyaStartButton.click();
        } else {
            System.out.println("Start Butonu Aktif Degil");
        }

    }
}
