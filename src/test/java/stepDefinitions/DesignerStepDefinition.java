package stepDefinitions;


import com.github.javafaker.Faker;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    public void kullaniciDesignerSayfasinaGider() {
        Driver.getDriver();
        //Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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
    public void kullaniciLoginButtonunaTıklar() {
        designerPage.sistemeGiris.click();
        ReusableMethods.waitFor(8);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(0));

        //String windows = Driver.getDriver().getWindowHandles().iterator().next();
        //Driver.getDriver().switchTo().window(windows).getTitle();
    }

    //Negatif senaryolar da ana sayfaya gidilmedigi icin bekleme suresine gerek olmadigi icin farkli login step yazildi
    @And("Kullanıcı login butonuna tıklar")
    public void kullanıcıTamamButonunaTıklar() {
        designerPage.sistemeGiris.click();
    }

    @Then("Kullanici userName {string} girer")
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

    @And("kullanıcı password {string} girer")
    public void kullanıcıGecerliPasswordGirer(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));
    }

    @And("Kullanıcı uygulama adını {string} gırer")
    public void kullanıcıUygulamaAdınıGırer(String uygulamaAdi) {
        designerPage.loginDetayButton.click();
        designerPage.uygulamaAdi.clear();
        designerPage.uygulamaAdi.sendKeys(ConfigReader.getProperty(uygulamaAdi));

    }

    @And("Kullanıcı server name {string} girer")
    public void kullanıcıServerNameGirer(String serverName) {
        designerPage.sunucu.clear();
        designerPage.sunucu.sendKeys(ConfigReader.getProperty(serverName));
    }

    @And("Kullanıcı Port bilgisini {string} girer")
    public void kullanıcıPortBilgisiniGirer(String port) {
        designerPage.port.clear();
        designerPage.port.sendKeys(ConfigReader.getProperty(port));
    }

    @Then("Kullanıcı tamam button'una tıklar")
    public void kullanıcıTamamButtonUnaTıklar() {
        ReusableMethods.waitForClickablility(designerPage.tamam, 10);
        designerPage.tamam.click();
    }

    @Then("Vazgec butonuna tiklar")
    public void vazgecButonunaTiklar() {
        designerPage.loginVazgecButton.click();
    }

    //Ana sayfa
    @Then("Kullanıcı designer ana sayfasina gidildiğini doğrular")
    public void kullanıcıDesignerAnaSayfasinaGidildiğiniDoğrular() {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 60);
        Assert.assertTrue(designerPage.anaSayfaCampaignKlasor.isDisplayed());
    }

    @Then("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        ReusableMethods.designerClose();
    }

    //Kampanya Ekleme
    @And("Kullanıcı Campaigns klasörüne tıklar")
    public void kullaniciCampaignsKlasoruneTiklar() {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);
        actions.doubleClick(designerPage.anaSayfaCampaignKlasor).build().perform();
    }

    @And("Kampanyanin eklenecegi klasöre {string} sag tiklar")
    public void kampanyaninEklenecegiKlasoruSecer(String klasorAdi) {
        WebElement kampanyaninEklenecegiKlasor = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + klasorAdi + "')]"));
        //WebElement kampanyaninEklenecegiKlasor = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'Campaigns\\"+klasorAdi+"')]"));
        actions.contextClick(kampanyaninEklenecegiKlasor).perform();
    }

    @And("Kullanıcı Kampanya ekle ye tıklar")
    public void kullaniciKampanyaEkleYeTiklar() {
        designerPage.kampanyaEkle.click();
    }

    @And("Kullanıcı Kampanya adıni {string} girer")
    public void kullaniciKampanyaAdniGirer(String kampanyaAdi) {
        eklenenKampanyaAdi = kampanyaAdi + Faker.instance().number().numberBetween(1, 1000);
        designerPage.kampanyaAdi.sendKeys(eklenenKampanyaAdi);
    }

    @And("Kullanıcı kaydet butonuna tıklar")
    public void kullaniciKaydetButonunaTiklar() {
        designerPage.kampanyaKaydet.click();
    }

    @Then("Kampanyanin eklendigini dogrular")
    public void kampanyaninEklendiginiDogrular() {
        ReusableMethods.waitForVisibility(designerPage.versiyonAcmaModePenceresi, 100);
        Assert.assertTrue(designerPage.versiyonAcmaModePenceresi.isDisplayed());
    }

    //Kampanya Goruntuleme
    @And("Kampanya modu secilir")
    public void kampanyaModuSecilir() {
        ReusableMethods.waitForVisibility(designerPage.kampanyaDuzenlemeModu, 100);
        designerPage.kampanyaDuzenlemeModu.click();
    }

    @And("Kullanıcı arama tipini {string} secer")
    public void kullaniciAramaTipiniSecer(String aramaTipi) {

        designerPage.kanalTipiComboBox.click();

        if (aramaTipi.equals("Inbound")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    perform();
        } else if (aramaTipi.equals("Outbound")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    sendKeys(Keys.ARROW_DOWN).
                    perform();
        } else {
            actions.sendKeys(Keys.ARROW_DOWN).
                    sendKeys(Keys.ARROW_DOWN).
                    sendKeys(Keys.ARROW_DOWN).
                    perform();
        }
    }

    @Given("Islem yapilacak olan {string} kampanya secilir")
    public void goruntulemekIstenilenKampanyaSecilir(String campName) {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);
        designerPage.campSearchBox.sendKeys(campName, Keys.ENTER);
        WebElement goruntulenecekKampanya = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + campName + "')]"));
        actions.doubleClick(goruntulenecekKampanya).perform();
    }

    @And("Varsayılan sonuç kodu için seç butonuna tıklar")
    public void varsayılanSonuçKoduIçinSeçButonunaTıklar() {
        designerPage.varsayilanSonucKoduSec.click();
    }

    @And("Kullanıcı varsayılan sonuç kodunu {string} secer")
    public void kullanıcıVarsayılanSonuçKodunuSecer(String sonucKodu) {

        actions.doubleClick(designerPage.cagriCevaplanmadi).perform();
        WebElement sonucKoduSec = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + sonucKodu + "')]"));
        sonucKoduSec.click();

    }

    @And("Tamam butonuna tıklar")
    public void tamamButonunaTıklar() {
        designerPage.tamamButonu.click();
    }


    @And("Kullanıcı {string} klasörüne tıklar")
    public void kullanıcıMehmetDemirKlasörüneTıklar(String klasorAdi) {

        WebElement klasorSec = Driver.getDriver().findElement(By.xpath("//TreeItem[@Name='" + klasorAdi + "']"));
        actions.doubleClick(klasorSec).perform();
    }

    @And("Kullanıcı istediği kampanyayı seçer")
    public void kullanıcıIstediğiKampanyayıSeçer() {

        actions.doubleClick(designerPage.cucumberTest01).perform();
    }

    //Akis Tasarimi Sayfasi
    @And("Kullanıcı AkışTasarım penceresine tıklar")
    public void kullanıcıAkışTasarımPenceresineTıklar() {
        ReusableMethods.waitForVisibility(designerPage.akisTasarim, 20);
        designerPage.akisTasarim.click();
    }

    @And("Kullanıcı {int} adet form ekler")
    public void kullanıcıAdetFormEkler(int formAdet) {

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

    //Kampanya Kopyalama
    @Given("Islem yapilacak olan {string} kampanyaya sag tiklanir")
    public void kopyalanacakOlanKampanyayaSagTiklanir(String copyCamp) {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);
        designerPage.campSearchBox.sendKeys(copyCamp, Keys.ENTER);
        WebElement kopyalanacakKampanya = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + copyCamp + "')]"));
        actions.contextClick(kopyalanacakKampanya).perform();
    }

    @And("Kampanya kopyala secenegine tiklanir")
    public void kampanyaKopyalaSecenegineTiklanir() {
        designerPage.kampanyaKopyala.click();
    }

    @And("Versiyon {string} satırına tıklanir")
    public void VersiyonSatırınaTıklanir(String versiyon) {
        //En son yayinlanmis olan versiyon satiri secili geldigi icin ekstra satir secimine gerek varmi?
        WebElement versiyonSec = Driver.getDriver().findElement(By.name("Row " + versiyon + " Column 2"));
        versiyonSec.click();
    }

    @And("Kampanyanin eklenecegi klasor secilir")
    public void kampanyaninEklenecegiKlasorSecilir() {
        designerPage.eklencekKlasorComboBox.click();
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();
        //WebElement kampanyaninEklenecegiKlasor = Driver.getDriver().findElement(By.xpath("//ListItem"));
        //kampanyaninEklenecegiKlasor.click();
    }

    @And("Onay penceresinde Evet'e tiklar")
    public void onayPenceresindeEveteTiklar() {
        ReusableMethods.waitForVisibility(designerPage.onayPenceresi, 10);
        System.out.println(designerPage.onayPenceresi.getText());
        if (designerPage.onayPenceresi.getText().contains("Genesys kampanyası mevcut")) {
            designerPage.onayPenceresiHayir.click();
        } else if (designerPage.onayPenceresi.getText().contains("adında bir kopyası")) {
            System.out.println(designerPage.onayPenceresi.getText());
            designerPage.onayPenceresiEvet.click();
        }
    }

    @Then("Kampanyanin kopyalandigini dogrular")
    public void kampanyaninKopyalandiginiDogrular() {
        ReusableMethods.waitForVisibility(designerPage.onayPenceresi, 60);
        System.out.println(designerPage.onayPenceresi.getText());
        Assert.assertTrue(designerPage.onayPenceresi.getText().contains("Kampanya kopyası oluşturuldu"));
        designerPage.tamam.click();
    }

    //Versiyon Yayinlama Sayfasi
    @And("Kontrol ettim checkbox'ı işaretlenir")
    public void kontrolEttimCheckboxIIşaretlenir() {
        designerPage.kontrolEttimCheckBox.click();
    }

    @And("Versiyon Yayınla butonuna tıklanır")
    public void versiyonYayınlaButonunaTıklanır() {
        designerPage.versiyonYayinlaButon.click();
    }

    @Then("Onay penceresinde Evet butonuna tiklar")
    public void onayPenceresindeEvetButonunaTiklar() {
        designerPage.onayPenceresiEvet.click();
    }

    @And("Versiyon olustur butonuna tiklanir")
    public void versiyonOlusturButonunaTiklanir() {
        designerPage.versiyonOlusturButon.click();
    }

    //Kampanya Duzenleme
    @And("Kampanya duzenle butonuna tiklanir")
    public void kampanyaDuzenleButonunaTiklanir() {
        designerPage.kampanyaDuznleButton.click();
    }

    @And("Versiyon sil butonuna tiklanir")
    public void versiyonSilButonunaTiklanir() {
        designerPage.versiyonSilButon.click();
    }
}

