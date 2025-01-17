package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class UcmsAdminSonuçKodlarıStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.webDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.webDriver();
    static String eklenenKodGrubuName;
    static String altGrupName;
    static WebElement eklenenkodGrubu;
    static String eklenenSonucKoduName;
    static String versiyonDegisecekSonucKodu;
    static String guncellenecekSonucKoduKodGrubu;
    static String guncellenenKodGrubuName;
    static String versiyonDeğişecekKodGrubuName;

    static WebDriver driver;

    //Login Steps
    @Given("Kullanıcı ucmsadmin sayfasına gider")
    public void kullanıcıUcmsadminSayfasınaGider() {
        if (Driver.getDriver() != null) {
            Driver.designerClose();
            ReusableMethods.winAppDriverStop();
        }
        Driver.webDriver().get(ConfigReader.getProperty("ucmsAdminURL"));
    }

    @When("Kullanıcı ucmsadmin için geçerli username girer")
    public void KullanıcıUcmsadminIçinGeçerliUsernameGirer() {
        ucmsAdminPage.userName.click();
        ucmsAdminPage.userName.sendKeys("mehmet.demir");

    }

    @And("Kullanıcı ucmsadmin için geçerli password girer")
    public void kullanıcıUcmsadminIçinGeçerliPasswordGirer() {
        ucmsAdminPage.password.sendKeys("x");
    }

    @And("Kullanıcı giriş butonuna tıklar")
    public void kullanıcıGirişButonunaTıklar() {
        ucmsAdminPage.girisButton.click();
        ucmsAdminPage.uygulamalar.click();
        ucmsAdminPage.ucmsConfig.click();
        ucmsAdminPage.girisButton.click();
    }

    @And("Kullanıcı giriş butona tıklar")
    public void kullanıcıGirişButonaTıklar() {
        ucmsAdminPage.girisButton.click();
    }

    @Then("Anasayfaya gidildiğini doğrular")
    public void anasayfayaGidildiğiniDoğrular() {
        Assert.assertTrue(ucmsAdminPage.homePageUser.isDisplayed());


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
        Assert.assertTrue(ucmsAdminPage.hataliKullaniciBilgileriPopup.isDisplayed());
    }

    //Kod Grubu Ekleme Ve Silme Steps
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

    @And("CRM ıd {string} girilir")
    public void crmIdgirilir(String crmId) {
        ucmsAdminPage.crmId.sendKeys(crmId);
    }

    @And("Grup adı {string} ekler")
    public void GrupAdıEkler(String grupAdi) {
        eklenenKodGrubuName = grupAdi + Faker.instance().idNumber().valid().replace("-", "");
        ucmsAdminPage.grupAdiEkle.sendKeys(eklenenKodGrubuName);
    }

    @And("Kaydet butonuna tıklar")
    public void KaydetButonunaTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.kaydetButton);

    }

    @Then("Onay butonuna tıklar")
    public void OnayButonunaTıklar() {
        ReusableMethods.waitForVisibilityWeb(ucmsAdminPage.onayButton, 10);
        ucmsAdminPage.onayButton.click();

    }

    @Then("Kod grubunun eklendigini dogrular")
    public void kodGrubununEklendiginiDogrular() {


        WebElement eklenenKodGrubu = Driver.webDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibilityWeb(eklenenKodGrubu, 15);
        Assert.assertTrue(eklenenKodGrubu.isDisplayed());
    }

    @And("Silmek istediği {string} kod grubunun sil ıkonuna tıklar")
    public void silmekIstediğiKodGrubununSilIkonunaTıklar(String sonucKoduVarmi) {

        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibility(eklenenkodGrubu, 10);
        actions.moveToElement(eklenenkodGrubu).perform();

        WebElement eklenenkodGrubuSilIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sil']"));
        ReusableMethods.waitForClickablility(eklenenkodGrubuSilIkonu, 10);
        eklenenkodGrubuSilIkonu.click();

        if (sonucKoduVarmi.equals("Sonuc Kodu olan")) {
            ucmsAdminPage.onayButton.click();
        }


    }

    @Then("Kod grubunun silindiğini doğrular")
    public void KodGrubununSilindiğiniDoğrular() {
        Assert.assertTrue(ucmsAdminPage.kodGrubuSilindiPopup.isDisplayed());
    }

    @Then("Kod grubunun silinemediğini doğrular")
    public void kodGrubununSilinemediğiniDoğrular() {

        ucmsAdminPage.kodGrubuSilinemezPopup.isDisplayed();
    }

    //Kod Grubu Güncelleme Steps
    @And("Güncellemek istediği kod grubunun {string} grup güncelle ıkonuna tıklar")
    public void güncellemekIstediğiKodGrubununGrupGüncelleIkonunaTıklar(String kodGrubuName) {

        WebElement guncellenecekKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibility(guncellenecekKodGrubu, 10);
        actions.moveToElement(guncellenecekKodGrubu).perform();

        WebElement guncellenecekKodGrubuGuncelleIkon = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Grup Güncelle']"));
        ReusableMethods.waitForClickablility(guncellenecekKodGrubuGuncelleIkon, 10);
        guncellenecekKodGrubuGuncelleIkon.click();

    }

    @And("Açılan pencereden grup adı {string} ve crmId {string} alanını günceller")
    public void açılanPenceredenGrupAdıVeCrmIdAlanınıGünceller(String grupAdi, String crmId) {

        ucmsAdminPage.crmId.clear();
        ucmsAdminPage.crmId.sendKeys(crmId);

        ucmsAdminPage.grupAdiEkle.clear();
        guncellenenKodGrubuName = grupAdi + Faker.instance().idNumber().valid().replace("-", "");
        ucmsAdminPage.grupAdiEkle.sendKeys(guncellenenKodGrubuName);
    }

    @Then("Kod grubunun güncellendiğini doğrular")
    public void kodGrubununGüncellendiğiniDoğrular() {

        ReusableMethods.waitFor(1);
        WebElement guncellenenKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + guncellenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibility(guncellenenKodGrubu, 10);
        Assert.assertTrue(guncellenenKodGrubu.isDisplayed());
    }

    @And("Açılan pencereden bilgileri siler")
    public void açılanPenceredenBilgileriSiler() {
        ucmsAdminPage.crmId.clear();
        ucmsAdminPage.grupAdiEkle.clear();
    }

    @Then("Zorunlu alanları doldurunuz uyarısını doğrular")
    public void zorunluAlanlarıDoldurunuzUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.zorunluAlanlarıDoldurunuzPopup.isDisplayed());
    }

    //Kod Grubu Versiyon Değişikliği
    @And("Versiyon degiştirmek istediği kod grubunun {string} grup güncelle ıkonuna tıklar")
    public void versiyonDegiştirmekIstediğiKodGrubununGrupGüncelleIkonunaTıklar(String arg0) {

        WebElement versiyonDegisecekKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + guncellenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibility(versiyonDegisecekKodGrubu, 10);
        actions.moveToElement(versiyonDegisecekKodGrubu).perform();

        WebElement versiyonDegisecekKodGrubuGuncelleIkon = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + guncellenenKodGrubuName + "')]/following::button[@mattooltip='Grup Güncelle']"));
        ReusableMethods.waitForClickablility(versiyonDegisecekKodGrubuGuncelleIkon, 10);
        versiyonDegisecekKodGrubuGuncelleIkon.click();

    }

    @And("Güncellenen sonuç kodu grubunun versiyon ikonuna tıklar")
    public void güncellenenSonuçKoduGrubununVersiyonIkonunaTıklar() {


        WebElement versiyonDegisecekKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + guncellenenKodGrubuName + "')]"));
        ReusableMethods.waitForVisibility(versiyonDegisecekKodGrubu, 10);
        actions.moveToElement(versiyonDegisecekKodGrubu).perform();

        WebElement versiyonDegisecekKodGrubuVersiyonIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + guncellenenKodGrubuName + "')]//following::button[@mattooltip='Versiyon']"));
        ReusableMethods.waitForClickablility(versiyonDegisecekKodGrubuVersiyonIkonu, 10);
        versiyonDegisecekKodGrubuVersiyonIkonu.click();


    }

    @And("Kod grubunun versiyonunun degistigini doğrular")
    public void kodGrubununVersiyonununDegistiginiDoğrular() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        WebElement versiyonDegisenKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        Assert.assertTrue(versiyonDegisenKodGrubu.isDisplayed());
    }

    //Alt Grup Ekleme
    @And("Eklenen kod grubunun alt grup ekle ikonuna tıklar")
    public void eklenenKodGrubununAltGrupEkleIkonunaTıklar() {

        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(eklenenkodGrubu).perform();

        WebElement eklenenkodGrubuAltGrupEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Alt Grup Ekle']"));
        eklenenkodGrubuAltGrupEkle.click();
    }

    @And("Alt grup ekle modalı açılır.")
    public void altGrupEkleModalıAçılır() {

    }

    @And("Kapat butonuna tıklanarak menü kapatılır.")
    public void kapatButonunaTıklanarakMenüKapatılır() {
        ReusableMethods.waitFor(2);
        ucmsAdminPage.altGrupKapat.click();

    }

    @And("Geçerli bir başlık girilir.")
    public void geçerliBirBaşlıkGirilir() {

        altGrupName = "AG_" + eklenenKodGrubuName;
        ucmsAdminPage.altGrupBaslik.sendKeys(altGrupName);
    }

    @And("Kaydet butonuna tıklanır.")
    public void kaydetButonunaTıklanır() {
        ucmsAdminPage.kaydetButton.click();
        ucmsAdminPage.onayButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Başarılı bir şekilde kaydedildiği doğrulanır.")
    public void başarılıBirŞekildeKaydedildiğiDoğrulanır() {

    }

    @And("Kaydet butonunun aktif olmadığı görülür")
    public void kaydetButonununAktifOlmadığıGörülür() {

        ucmsAdminPage.kaydetButton.isEnabled();
    }


    //Sonuç Kodları Ekleme Steps
    @And("Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar")
    public void eklenenKodGrubununSonuçKoduEkleIkonunaTıklar() {

        //eklenenkodGrubu = Driver.webDriver().findElement(By.xpath("//*[contains(text(),'Mehmetdemir')]"));
        eklenenkodGrubu = Driver.webDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        eklenenkodGrubu.click();

        ucmsAdminPage.sonucKoduEkleIkon.click();

        //WebElement eklenenkodGrubuSonucKoduEkleIkon = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sonuç Kodu Ekle']"));
        //eklenenkodGrubuSonucKoduEkleIkon.click();
    }

    @And("Başlık bilgisi {string} girilir")
    public void başlıkKısmınaIsimGirer(String sonucKoduBaslikName) {
        eklenenSonucKoduName = sonucKoduBaslikName + Faker.instance().idNumber().valid().replace("-", "");
        ucmsAdminPage.sonucKoduBaslik.sendKeys(eklenenSonucKoduName);

    }

    @And("Varsa Bilgilendirme notu bilgisi girilir")
    public void varsaBilgilendirmeNotuBilgisiGirilir() {

        ucmsAdminPage.sonucKoduBilgilendirmeNotu.sendKeys("automation_closed_resultcode");
    }

    @And("Varsa Aciklama bilgisi girilir")
    public void varsaAciklamaBilgisiGirilir() {
        ucmsAdminPage.sonucKoduAciklama.sendKeys("automation_closed_resultcode");
    }

    @And("CRM sonuc kodu {string} girilir")
    public void crmSonucKoduGirilir(String crmId) {
        ucmsAdminPage.crmSonucKodu.sendKeys(crmId);
    }

    @And("Aksiyon tipi {string} secilir")
    public void aksiyonTipiSecilir(String aksiyonTipi) {
        ucmsAdminPage.actionTipiCombo.click();

        WebElement aksiyonTipiSec = Driver.webDriver().findElement(By.xpath("//span[text()='" + aksiyonTipi + "']"));
        aksiyonTipiSec.click();
    }


    @And("Genel özellikler tabına geçer")
    public void genelÖzelliklerTabınaGeçer() {
        ucmsAdminPage.genelOzelliklerTab.click();
    }

    @And("Başarı durumu {string} secilir")
    public void basariDurumuSecilir(String basariDurumu) {

        ucmsAdminPage.basariDurumuComboBox.click();

        WebElement basariDurumuSec = Driver.webDriver().findElement(By.xpath("//span[text()='" + basariDurumu + "']"));
        basariDurumuSec.click();

    }

    @And("Musteriye ulasilma durumu {string} secilir")
    public void musteriyeUlasilmaDurumuSecilir(String musteriyeUlasilmaDurumu) {
        ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();

        WebElement musteriyeUlasilmaDurumuSec = Driver.webDriver().findElement(By.xpath("//span[text()='" + musteriyeUlasilmaDurumu + "']"));
        musteriyeUlasilmaDurumuSec.click();

    }

    @And("Musteriye temas durumu {string} secilir")
    public void musteriyeTemasDurumuSecilir(String musteriyeTemasDurumu) {
        ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
        WebElement musteriyeTemasDurumuSec = Driver.webDriver().findElement(By.xpath("//span[text()='" + musteriyeTemasDurumu + "']"));
        musteriyeTemasDurumuSec.click();

    }
    @And("Varsa CTI sonuc kodu {string} secilir")
    public void varsaCTISonucKoduSecilir(String CTISonucKodu) {

        ucmsAdminPage.ctiSonucKodu.click();

        WebElement ctiSonucKoduSec = Driver.webDriver().findElement(By.xpath("//span[text()= '" + CTISonucKodu + "']"));
        ctiSonucKoduSec.click();

    }

    @And("Kaydete tıklar")
    public void kaydeteTıklar() {
        ReusableMethods.waitForClickablilityWeb(ucmsAdminPage.kaydetButton, 10);
        ucmsAdminPage.kaydetButton.click();

    }

    //Sonuç Kodu Arama Steps
    @And("İçerik ara searchbox ına tıklar")
    public void içerikAraSearchboxInaTıklar() {
        ucmsAdminPage.icerikAramaSearchBox.click();
    }

    @And("Var olan sonuç kodunun ismini girer")
    public void varOlanSonuçKodununIsminiGirer() {

        ucmsAdminPage.icerikAramaSearchBox.sendKeys(eklenenSonucKoduName);
    }

    @And("Var olan sonuç kodunun olduğunu doğrular")
    public void varOlanSonuçKodununOlduğunuDoğrular() {
        WebElement varOlanSonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]"));
        ReusableMethods.waitFor(3);
        Assert.assertTrue(varOlanSonucKodu.isDisplayed());
    }

    //Devre Dışı Bırakılan Sonuç Kodlarını Listeleme Steps
    @And("Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.")
    public void açılanSayfadaDevreDışıBırakılanlarIconunaTıklanır() {
        ucmsAdminPage.devreDisiBirakilanlarIkon.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.devreDisiBirakilanlarIkon.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.devreDisiBirakilanlarIkon.click();


    }

    @Then("Kod grupları hiyerarşisi altında devre dışı bırakılan sonuç kodlarının da üstü çizili olarak listelendiği görülür")
    public void kodGruplarıHiyerarşisiAltındaDevreDışıBırakılanSonuçKodlarınınDaÜstüÇiziliOlarakListelendiğiGörülür() {

        List<WebElement> devreDisiBirakilanSonucKodlariList = ucmsAdminPage.devreDisiBirakilanSonucKodlari;

        System.out.println("devreDisiBirakilanSonucKodlariList.size = " + devreDisiBirakilanSonucKodlariList.size());

        for (WebElement w : devreDisiBirakilanSonucKodlariList) {
            System.out.println(w.getText());
        }
    }

    @Then("Tekrar devre dışı bırakılanlar iconuna tıklandığında, devre dışı bırakılmış sonuç kodlarının listelenmediği  görülür")
    public void tekrarDevreDışıBırakılanlarIconunaTıklandığındaDevreDışıBırakılmışSonuçKodlarınınListelenmediğiGörülür() {
        ucmsAdminPage.devreDisiBirakilanlarIkon.click();

        List<WebElement> devreDisiBirakilanSonucKodlariList = ucmsAdminPage.devreDisiBirakilanSonucKodlari;

        for (WebElement w : devreDisiBirakilanSonucKodlariList) {
            System.out.println(w.getText());
        }

    }

    //Sonuç Kodu Taşıma Steps
    @And("Değiştirmek istediği sonuç kodunun kod grubuna {string} tıklar")
    public void değiştirmekIstediğiSonuçKodununKodGrubunaTıklar(String kodGrubuName) {

        WebElement degistirmekIstedigiSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle " + eklenenKodGrubuName + "']"));
        degistirmekIstedigiSonucKoduKodGrubu.click();
    }

    @And("Değiştirmek istediği sonuç kodunun {string} dizin değiştir iconuna tıklar")
    public void değiştirmekIstediğiSonuçKodununDizinDeğiştirIconunaTıklar(String sonucKoduName) {
        ReusableMethods.waitFor(1);

        WebElement sonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]"));
        actions.moveToElement(sonucKodu).perform();

        ReusableMethods.waitFor(1);
        WebElement sonucKoduDizinDegistirIkonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]//following::button[@mattooltip='Dizin Değiştir']"));
        sonucKoduDizinDegistirIkonu.click();


    }

    @And("Değiştirmek istediği pasif sonuç kodunun dizin değiştir iconuna tıklar")
    public void değiştirmekIstediğiPasifSonuçKodununDizinDeğiştirIconunaTıklar() {
        WebElement tasinanSonucKodu = Driver.getDriver().findElement(By.xpath("//del[contains(text(),'SonuçKoduTaşıma')]"));
        actions.moveToElement(tasinanSonucKodu).perform();

        WebElement sonucKoduDizinDegistirIkonu = Driver.getDriver().findElement(By.xpath("//del[contains(text(),'SonuçKoduTaşıma')]//following::button[@mattooltip='Dizin Değiştir']"));
        sonucKoduDizinDegistirIkonu.click();

    }

    @And("Taşımak istediği kod grubunun {string} buraya taşı iconuna tıklar")
    public void taşımakIstediğiKodGrubununBurayaTaşıIconunaTıklar(String kodGrubuName) {

        eklenenKodGrubuName = kodGrubuName;

        WebElement tasimakIstedigiSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(tasimakIstedigiSonucKoduKodGrubu).perform();

        WebElement sonucKoduBurayaTasiIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Buraya Taşı']"));
        sonucKoduBurayaTasiIkonu.click();

    }

    @And("Açılan uyarı penceresinde evet e tıklanır")
    public void açılanUyarıPenceresindeEvetETıklanır() {
        ucmsAdminPage.onayButton.click();
    }

    @Then("Sonuç kodunun dizinin değiştiği görülür.")
    public void sonuçKodununDizininDeğiştiğiGörülür() {
        List<WebElement> sonucKoduTasindiUyari = ucmsAdminPage.sonucKoduTasindiUyarisi;
        Assert.assertEquals(sonucKoduTasindiUyari.size(), 1);
    }

    @And("Açılan uyarı penceresinde vazgeç e tıklanır")
    public void açılanUyarıPenceresindeVazgeçETıklanır() {
        ucmsAdminPage.vazgecButton.click();
    }

    @Then("Sonuç kodunun dizinin değişmediğini görülür.")
    public void sonuçKodununDizininDeğişmediğiniGörülür() {
        List<WebElement> sonucKoduTasindiUyari = ucmsAdminPage.sonucKoduTasindiUyarisi;
        Assert.assertEquals(sonucKoduTasindiUyari.size(), 0);
    }

    @And("İptal icon'una tıklar")
    public void iptalIconUnaTıklar() {
        ucmsAdminPage.tasimaIptalButton.click();
    }

    //Sonuç Kodu devre dışı bırakma
    @And("Devre dışı bırakmak istediği sonuç kodunun kod grubuna {string} tıklar")
    public void devreDışıBırakmakIstediğiSonuçKodununKodGrubunaTıklar(String kodGrubuName) {
        WebElement devreDisiBirakmakIstedigiSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle " + kodGrubuName + "']"));
        devreDisiBirakmakIstedigiSonucKoduKodGrubu.click();
    }

    @And("Devre dışı bırakmak istediği sonuç kodunun {string} devre dışı bırak iconuna tıklar")
    public void devreDışıBırakmakIstediğiSonuçKodununDevreDışıBırakIconunaTıklar(String sonucKoduName) {

        eklenenSonucKoduName = sonucKoduName;
        WebElement sonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + sonucKoduName + "')]"));
        actions.moveToElement(sonucKodu).perform();

        WebElement sonucKoduDevreDisiBirakIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + sonucKoduName + "')]/following::button[@mattooltip='Devre Dışı Bırak']"));
        sonucKoduDevreDisiBirakIkonu.click();

    }

    @And("Sonuç kodunun devre dışı oldugunu dogrular")
    public void sonuçKodununDevreDışıOldugunuDogrular() {

        ucmsAdminPage.devreDisiBirakilanlarIkon.click();
        Driver.getDriver().navigate().refresh();
        WebElement sonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]"));
        System.out.println(sonucKodu.getTagName());
        Assert.assertEquals("del", sonucKodu.getTagName());

    }

    //Sonuç Kodu devrye alma
    @And("Devreye almak istediği sonuç kodunun kod grubuna {string} tıklar")
    public void devreyeAlmakIstediğiSonuçKodununKodGrubunaTıklar(String kodGrubuName) {
        WebElement devreyeAlmakIstedigiIstedigiSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle " + kodGrubuName + "']"));
        devreyeAlmakIstedigiIstedigiSonucKoduKodGrubu.click();
    }

    @And("Devreye almak istediği sonuç kodunun {string} devreye al iconuna tıklar")
    public void devreyeAlmakIstediğiSonuçKodununDevreyeAlIconunaTıklar(String sonucKoduName) {

        eklenenSonucKoduName = sonucKoduName;
        WebElement sonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + sonucKoduName + "')]"));
        actions.moveToElement(sonucKodu).perform();

        WebElement sonucKoduDevreDevreyeAlIkonu = Driver.getDriver().findElement(By.xpath("//del[contains(text(),'" + sonucKoduName + "')]/following::button[@mattooltip='Devreye Al']"));
        sonucKoduDevreDevreyeAlIkonu.click();

    }

    @And("Sonuç kodunun aktif oldugunu dogrular")
    public void sonuçKodununAktifOldugunuDogrular() {
        Driver.getDriver().navigate().refresh();
        WebElement sonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]"));
        System.out.println(sonucKodu.getTagName());
        Assert.assertEquals("span", sonucKodu.getTagName());
    }


    //Sonuç Kodu Güncelleme ve Veriyon değişikliği
    @And("Güncellemek istediği sonuç kodunun {string} tıklar")
    public void güncellemekIstediğiSonuçKodununTıklar(String kodGrubuName) {
        guncellenecekSonucKoduKodGrubu = kodGrubuName;
        WebElement guncellemekIstedigiSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle " + eklenenKodGrubuName + "']"));
        guncellemekIstedigiSonucKoduKodGrubu.click();
    }

    @And("Güncellemek istediği {string} güncelle ıkonuna tıklar")
    public void güncellemekIstediğiSonuçKodununGüncelleIkonunaTıklar(String sonucKodu) {

        versiyonDegisecekSonucKodu = sonucKodu;
        WebElement guncellenecekSonucKodu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenSonucKoduName + "')]"));
        actions.moveToElement(guncellenecekSonucKodu).perform();

        WebElement sonucKoduGuncelleIkonu = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'" + eklenenSonucKoduName + "')]/following::button[@mattooltip='Güncelle'])[1]"));
        sonucKoduGuncelleIkonu.click();


    }

    @And("Açılan pencereden Başlık alanını günceller")
    public void açılanPenceredenBaşlıkAlanınıGünceller() {
        ReusableMethods.waitForVisibility(ucmsAdminPage.sonucKoduBaslik, 10);
        ucmsAdminPage.sonucKoduBaslik.clear();
        ucmsAdminPage.sonucKoduBaslik.sendKeys(eklenenSonucKoduName);
    }

    @And("Güncelle butonuna tıklar")
    public void güncelleButonunaTıklar() {
        ReusableMethods.waitForClickablility(ucmsAdminPage.guncelleButton, 10);
        ucmsAdminPage.guncelleButton.click();

    }

    @Then("Sonuç kodunun güncellendiğini doğrular")
    public void sonuçKodununGüncellendiğiniDoğrular() {

        List<WebElement> sonuçKoduGüncellendi = ucmsAdminPage.sonucKoduGuncellendiPopup;
        Assert.assertEquals(sonuçKoduGüncellendi.size(), 1);
    }

    @And("Güncellenen sonuç kodunun versiyon ikonuna tıklar")
    public void güncellenenSonuçKodununVersiyonIkonunaTıklar() {
        ReusableMethods.waitFor(1);
        WebElement versiyonDegisecekSonucKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle " + eklenenKodGrubuName + "']"));
        ReusableMethods.waitForClickablility(versiyonDegisecekSonucKoduKodGrubu, 10);
        versiyonDegisecekSonucKoduKodGrubu.click();


        WebElement versiyonEditSonucKodu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenSonucKoduName + "')]"));
        actions.moveToElement(versiyonEditSonucKodu).perform();

        WebElement versiyonDegiseceksonucKoduVersiyonIkonu = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'" + eklenenSonucKoduName + "')]//following::button[@mattooltip='Versiyon'])[1]"));
        ReusableMethods.waitFor(3);
        versiyonDegiseceksonucKoduVersiyonIkonu.click();


    }

    @And("Açılan pencerede tipi Oluşturma olan satırın Bu versiyonlar devam et ikonuna tıklar")
    public void açılanPenceredeTipiOluşturmaOlanSatırınBuVersiyonlarDevamEtIkonunaTıklar() {

        ucmsAdminPage.olusturmaTipiBuVersiyonIleDevamEt.click();

    }

    @And("Açılan pencerede tüm alanların pasif geldiğini görür")
    public void açılanPenceredeTümAlanlarınPasifGeldiğiniGörür() {
    }

    @And("Versiyonu değiştir butonuna tıklar")
    public void versiyonuDeğiştirButonunaTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.versiyonDeğiştirButton);

    }

    @And("Sonuç kodu veriyonunun güncellendiğini doğrular")
    public void sonuçKoduVeriyonununGüncellendiğiniDoğrular() {
        List<WebElement> sonuçKoduGüncellendi = ucmsAdminPage.sonucKoduGuncellendiPopup;
        Assert.assertEquals(sonuçKoduGüncellendi.size(), 1);
    }

    //Sonuç Kodu Sayfa Kuralları Steps
    @And("Açılan pencereden Randevuyu Sistem Belirlesin sekmesine tıklar")
    public void açılanPenceredenRandevuyuSistemBelirlesinSekmesineTıklar() {
        ucmsAdminPage.actionTipiCombo.click();
        ucmsAdminPage.randevuyuSistemBelirlesin.click();

    }

    @And("Açılan Randevu Özellikleri alanındaki Randevu Tipi combosunda Otomatik Grup Randevu işaretlenir")
    public void açılanRandevuÖzellikleriAlanındakiRandevuTipiCombosundaOtomatikGrupRandevuIşaretlenir() {
        ucmsAdminPage.randevuTipi.click();
        ucmsAdminPage.otomatikGrupRandevu.click();
    }

    @And("Dakika alanına süre girilir.")
    public void dakikaAlanınaSüreGirilir() {
        ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("20");
    }

    @And("Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilemez olduğu görülür.")
    public void sonrakiAramaDavranışıAlanındaBuKontağıAramaSıralamasındanÇıkartCheckBoxSeçilemezOlduğuGörülür() {

    }

    @And("Sonraki arama davranışı alanında Bir Sonraki Kontağa Geç check box işaretlenir.")
    public void sonrakiAramaDavranışıAlanındaBirSonrakiKontağaGeçCheckBoxIşaretlenir() {
    }

    @And("Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilebilir olduğu görülür.")
    public void sonrakiAramaDavranışıAlanındaBuKontağıAramaSıralamasındanÇıkartCheckBoxSeçilebilirOlduğuGörülür() {
    }

    @And("Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box işaretlenir.")
    public void sonrakiAramaDavranışıAlanındaBuKontağıAramaSıralamasındanÇıkartCheckBoxIşaretlenir() {
    }

    @And("Sonraki arama davranışı alanında Bir Sonraki Kontağa Geç  check box işareti kaldırılır.")
    public void sonrakiAramaDavranışıAlanındaBirSonrakiKontağaGeçCheckBoxIşaretiKaldırılır() {
    }

    @And("Sonraki arama davranışı alanında Bu Kontağı Arama Sıralamasından Çıkart check box seçilemez olduğu ve işaretinin kaldırıldığı görülür.")
    public void sonrakiAramaDavranışıAlanındaBuKontağıAramaSıralamasındanÇıkartCheckBoxSeçilemezOlduğuVeIşaretininKaldırıldığıGörülür() {
    }

}
