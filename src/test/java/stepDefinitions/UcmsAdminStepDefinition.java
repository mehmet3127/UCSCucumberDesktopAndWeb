package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.ConfigReader;
import utilities.Driver;


public class UcmsAdminStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String eklenenKodGrubuName;
    static WebElement eklenenkodGrubu;

    //Login Steps
    @Given("Kullanıcı ucmsadmin sayfasına gider")
    public void kullanıcıUcmsadminSayfasınaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ucmsAdminURL"));
    }

    @When("Kullanıcı ucmsadmin için geçerli username girer")
    public void KullanıcıUcmsadminIçinGeçerliUsernameGirer() {
        ucmsAdminPage.userName.sendKeys("mehmet.demir");
    }

    @And("Kullanıcı ucmsadmin için geçerli password girer")
    public void kullanıcıUcmsadminIçinGeçerliPasswordGirer() {
        ucmsAdminPage.password.sendKeys("x");
    }

    @And("Kullanıcı giriş butonuna tıklar")
    public void kullanıcıGirişButonunaTıklar() {
        ucmsAdminPage.girişButton.click();
        ucmsAdminPage.uygulamalar.click();
        ucmsAdminPage.ucmsConfig.click();
        ucmsAdminPage.girişButton.click();
    }

    @And("Kullanıcı giriş butona tıklar")
    public void kullanıcıGirişButonaTıklar() {
        ucmsAdminPage.girişButton.click();
    }

    @Then("Anasayfaya gidildiğini doğrular")
    public void anasayfayaGidildiğiniDoğrular() {
        ucmsAdminPage.girişButton.click();

        Assert.assertTrue("Ucms Admin Anasayfasına Gidilemedi", ucmsAdminPage.homePageUser.isDisplayed());
    }

    @When("Kullanıcı ucmsadmin için username {string} girer")
    public void kullanıcıUcmsadminIçinUsernameGirer(String username) {
        ucmsAdminPage.userName.sendKeys(username);
    }

    @And("Kullanıcı ucmsadmin için passeord {string} girer")
    public void kullanıcıUcmsadminIçinPasseordGirer(String password) {
        ucmsAdminPage.password.sendKeys(password);
    }

    @And("Kullanıcı Anasayfaya gidilemediğini doğrular")
    public void kullanıcıAnasayfayaGidilemediğiniDoğrular() {
        Assert.assertTrue(ucmsAdminPage.hatalıKullanıcıBilgileriPopup.isDisplayed());
    }

    //Kod Grubu Ekle Steps
    @And("Sonuç kodları butonuna tıklar")
    public void sonuçKodlarıButonunaTıklar() {
        ucmsAdminPage.sonuçKodlarıButton.click();
    }

    @And("Sonuç kodları sekmesine tıklar")
    public void sonuçKodlarıSekmesineTıklar() {
        ucmsAdminPage.sonuçKodlarSekmesi.click();
    }

    @And("Kod grubu ekle ıkon a tıklar")
    public void KodGrubuEkleIkonATıklar() {
        ucmsAdminPage.kodGrubuEkleIkon.click();
    }

    @And("Grup adı {string} ekler")
    public void GrupAdıEkler(String grupAdı) {
        eklenenKodGrubuName = grupAdı;
        ucmsAdminPage.grupAdıEkle.sendKeys("KG" + grupAdı);
    }

    @And("Grup adı  ekler")
    public void GrupAdıEkler() {
    }

    @And("Kaydet butonuna tıklar")
    public void KaydetButonunaTıklar() {
        ucmsAdminPage.kaydetButton.click();
    }

    @Then("Onay butonuna tıklar")
    public void OnayButonunaTıklar() throws InterruptedException {
        ucmsAdminPage.kaydetOnayButton.click();
        Thread.sleep(2000);
    }

    @Then("Sayfayı kapatır")
    public void SayfayıKapatır() throws InterruptedException {
        Thread.sleep(1000);
        //Driver.closeDriver();
    }


    //Alt Grup Ekleme
    @And("Eklenen kod grubunun alt grup ekle ikonuna tıklar")
    public void eklenenKodGrubununAltGrupEkleIkonunaTıklar() throws InterruptedException {
        Thread.sleep(1000);
        Driver.getDriver().navigate().refresh();                                //button[@aria-label='toggle " + eklenenKodGrubuName +']
        Thread.sleep(1000);
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        Thread.sleep(1000);
        actions.moveToElement(eklenenkodGrubu).perform();
        Thread.sleep(1000);
        WebElement eklenenkodGrubuAltGrupEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Alt Grup Ekle']"));
        Thread.sleep(1000);
        eklenenkodGrubuAltGrupEkle.click();
    }

    @And("Alt grup ekle modalı açılır.")
    public void altGrupEkleModalıAçılır() {

    }

    @And("Geçerli bir başlık girilir.")
    public void geçerliBirBaşlıkGirilir() {
        ucmsAdminPage.altGrupBaşlık.sendKeys("AG" + eklenenKodGrubuName);
    }

    @And("Kaydet butonuna tıklanır.")
    public void kaydetButonunaTıklanır() {
        ucmsAdminPage.kaydetButton.click();
        ucmsAdminPage.kaydetOnayButton.click();
    }

    @Then("Başarılı bir şekilde kaydedildiği doğrulanır.")
    public void başarılıBirŞekildeKaydedildiğiDoğrulanır() {

    }


    //Sonuç Kodları Steps
    @And("Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar")
    public void eklenenKodGrubununSonuçKoduEkleIkonunaTıklar() {
        Driver.getDriver().navigate().refresh();
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSonuçKoduEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sonuç Kodu Ekle']"));
        eklenenkodGrubuSonuçKoduEkle.click();
    }

    @And("Aksiyon tipi combo suna tıklanır")
    public void aksiyonTipiComboSunaTıklanır() {
        ucmsAdminPage.actionTipiCombo.click();
    }

    @And("Açılan pencereden kaydı kapat sekmesine tıklar")
    public void AçılanPenceredenKaydıKapatSekmesineTıklar() {
        ucmsAdminPage.kaydıKapat.click();
    }

    @And("Başlık kısmına isim girer")
    public void başlıkKısmınaIsimGirer() {
        ucmsAdminPage.SonuçKoduBaşlık.sendKeys("SK" + eklenenKodGrubuName);
    }

    @And("Genel özellikler tabına geçer")
    public void genelÖzelliklerTabınaGeçer() {
        ucmsAdminPage.genelÖzelliklerTab.click();
    }

    @And("Başarı durumu combosunda kriter dışını seçer")
    public void başarıDurumuCombosundaKriterDışınıSeçer() {
        ucmsAdminPage.başarıDurumuComboBox.click();
        ucmsAdminPage.kriterDışı.click();
    }

    @And("Müşteriye ulaşılma durumundan müşteriye ulaşılamadı seçer")
    public void müşteriyeUlaşılmaDurumundanMüşteriyeUlaşılamadıSeçer() {
        ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
        ucmsAdminPage.müşteriyeUlaşılamadı.click();
    }

    @And("Müşteri temas durumundan temas edilemedi seçer")
    public void müşteriTemasDurumundanTemasEdilemediSeçer() {
        ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
        ucmsAdminPage.müşteriyeTemasEdilemedi.click();
    }

    @And("Kaydete tıklar")
    public void kaydeteTıklar() throws InterruptedException {
        ucmsAdminPage.kaydetButton.click();
        Thread.sleep(2000);
    }

}
