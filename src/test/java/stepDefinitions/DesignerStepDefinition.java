package stepDefinitions;


import com.github.javafaker.Faker;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DesignerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;


public class DesignerStepDefinition {

    public static WindowsDriver<WebElement> driver;
    DesignerPage designerPage = new DesignerPage();
    Actions actions = new Actions(Driver.getDriver());

    static String eklenenKampanyaAdi;



    //Login Steps
    @Given("Kullanici designer sayfasina gider")
    public void kullaniciDesignerSayfasinaGider(){
        Driver.getDriver();
        //ReusableMethods.designer();
        
    }
    @Then("Kullanici gecerli username girer")
    public void kullanicigecerliUsernameGirer() {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("userName"));
    }

    @And("Kullanici gecerli password girer")
    public void kullanicigecerliPasswordGirer() {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty("password"));
    }
    @And("Kullanici login buttonuna tıklar")
    public void kullaniciLoginButtonunaTıklar(){
        designerPage.sistemeGiris.click();
        ReusableMethods.waitFor(7);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(0));

        //String windows = Driver.getDriver().getWindowHandles().iterator().next();
        //Driver.getDriver().switchTo().window(windows).getTitle();
    }
    @Then("Kullanici gecerli userName {string} girer")
    public void kullaniciGecerliUserNameGirer(String girilecekUserName) {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty(girilecekUserName));
    }
    @And("Kullanici gecerli olmayan password {string} girer")
    public void kullaniciGecerliOlmayanPasswordGirer(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));
    }
    @Then("Kullanici gecerli olmayan userName {string} girer")
    public void kullaniciGecerliOlmayanUserNameGirer(String girilecekUserName) {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty(girilecekUserName));
    }
    @And("kullanıcı gecerli password {string} girer")
    public void kullanıcıGecerliPasswordGirer(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));
    }
    @Then("Kullanıcı tamam button'una tıklar")
    public void kullanıcıTamamButtonUnaTıklar() {
        ReusableMethods.waitForClickablility(designerPage.tamam,10);
        designerPage.tamam.click();
    }

    @Then("Kullanıcı designer ana sayfasina gidildiğini doğrular")
    public void kullanıcıDesignerAnaSayfasinaGidildiğiniDoğrular() {

    }

    @Then("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        //ReusableMethods.designerClose();
    }


    @And("Kullanıcı Campaigns klasörüne tıklar")
    public void kullanıcıCampaignsKlasörüneTıklar() {

        ReusableMethods.waitForVisibility(designerPage.campaigns,20);
        //wait.until(ExpectedConditions.elementToBeClickable(designerPage.campaigns));
        actions.doubleClick(designerPage.campaigns).perform();

    }

    @And("Kullanıcı {string} klasörüne sag tıklar")
    public void kullaniciMehmetDemirKlasorunesagTiklar(String klasorAdi) {

        WebElement klasorContextClick=Driver.getDriver().findElement(By.xpath("//TreeItem[@Name='"+klasorAdi+"']"));
        actions.contextClick(klasorContextClick).perform();
    }

    @And("Kullanıcı KampanyaEkle ye tıklar")
    public void kullaniciKampanyaEkleYeTiklar() {

        designerPage.kampanyaEkle.click();
    }

    @And("Kullanıcı Kampanya adı {string} girer")
    public void kullanıcıKampanyaAdıGirer(String kampanyaAdi) {

        eklenenKampanyaAdi=kampanyaAdi+ Faker.instance().number().numberBetween(1,100);
        designerPage.kampanyaAdi.sendKeys(eklenenKampanyaAdi);
    }

    @And("Kullanıcı kaydet butonuna tıklar")
    public void kullanıcıKaydetButonunaTıklar() {
        designerPage.kampanyaKaydet.click();

    }

    @And("Kullanıcı kampanya modunu secer")
    public void kullanıcıKampanyaModunuSecer() {
        ReusableMethods.waitForVisibility(designerPage.kampanyaDuzenleme,100);
        designerPage.kampanyaDuzenleme.click();
    }

    @And("Kullanıcı arama tipini {string} secer")
    public void kullaniciAramaTipiniSecer(String aramaTipi) {

        ReusableMethods.waitForVisibility(designerPage.outbound,15);
        WebElement aramaTipiSec=Driver.getDriver().findElement(By.name(aramaTipi));
        aramaTipiSec.click();

    }

    @And("Kullanıcı varsayılan sonuç kodunu {string} secer")
    public void kullanıcıVarsayılanSonuçKodunuSecer(String sonucKodu) {
        designerPage.varsayilanSonucKoduSec.click();
        actions.doubleClick(designerPage.cagriCevaplanmadi).perform();
        WebElement sonucKoduSec = Driver.getDriver().findElement(By.name(sonucKodu));
        sonucKoduSec.click();
        designerPage.tamamSonucKodu.click();
    }

    @Then("Kullanıcı Kaydet e tıklar")
    public void kullanıcıKaydetETıklar() {

        designerPage.kaydet.click();
    }

    @And("Kullanıcı {string} klasörüne tıklar")
    public void kullanıcıMehmetDemirKlasörüneTıklar(String klasorAdi) {

        WebElement klasorSec=Driver.getDriver().findElement(By.xpath("//TreeItem[@Name='"+klasorAdi+"']"));
        actions.doubleClick(klasorSec).perform();
    }

    @And("Kullanıcı istediği kampanyayı seçer")
    public void kullanıcıIstediğiKampanyayıSeçer() {

        actions.doubleClick(designerPage.cucumberTest01).perform();
    }

    @And("Kullanıcı AkışTasarım penceresine tıklar")
    public void kullanıcıAkışTasarımPenceresineTıklar() {
        ReusableMethods.waitForVisibility(designerPage.akisTasarim,20);
        designerPage.akisTasarim.click();
    }

    @And("Kullanıcı {int} adet form ekler")
    public void kullanıcıAdetFormEkler(int formAdet){

        int formSayısı = formAdet;

        for (int i = 1; i <= formSayısı; i++) {
            designerPage.formEkle.click();
            ReusableMethods.waitFor(1);
        }
    }

    @And("Kullanıcı eklenen formları düzenler")
    public void kullanıcıEklenenFormlarıDüzenler() {
        designerPage.formAra.click();
        designerPage.eklenenFormlar.click();
        designerPage.form4.click();

    }
}
