package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.GensysAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class GenesysAdminStepDefinitions {

    GensysAdminPage genesys = new GensysAdminPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Kullanıcı Genesys admin Url'ye gider")
    public void kullanıcıGenesysAdminUrlYeGider(){

        Driver.getDriver().get("https://teres.ucsturkey.com/wcm/");
        //genesys.advanced.click();
        //genesys.link.click();

    }

    @When("Kullanıcı Genesys admin için geçerli username girer")
    public void kullanıcıGenesysAdminIçinGeçerliUsernameGirer() {
        genesys.userName.sendKeys("can");
    }
    @And("Kullanıcı Genesys admin için geçerli password girer")
    public void kullanıcıGenesysAdminIçinGeçerliPasswordGirer() {
        genesys.password.sendKeys("x");

    }

    @And("Kullanıcı Genesys admin için application girer")
    public void kullanıcıGenesysAdminIçinApplicationGirer() {
        genesys.applicationName.sendKeys("default");

    }

    @And("Kullanıcı Genesys admin için host name girer")
    public void kullanıcıGenesysAdminIçinHostNameGirer() {
        genesys.hostName.sendKeys("teres.ucsturkey.com");
    }

    @And("Kullanıcı Genesys admin için port girer")
    public void kullanıcıGenesysAdminIçinPortGirer() {
        genesys.Port.sendKeys("2020");
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
    public void kullanıcıAccountSekmesineTıklar(){

        jse.executeScript("arguments[0].click();",genesys.account);

    }

    @And("Kullanıcı users sekmesine tıklar")
    public void kullanıcıUsersSekmesineTıklar(){
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();",genesys.users);

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
    public void kullanıcıIstediğiLinkETıklar(){
        genesys.OCS_Group_1.click();
        ReusableMethods.waitFor(1);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowHandlesHashCode = " + windowList.get(1));
        Driver.getDriver().switchTo().window(windowList.get(1));
        ReusableMethods.waitFor(1);
    }
}
