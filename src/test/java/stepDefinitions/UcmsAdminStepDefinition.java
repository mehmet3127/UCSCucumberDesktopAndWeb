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
import utilities.ReusableMethods;

import java.util.List;


public class UcmsAdminStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String eklenenKodGrubuName;
    static WebElement eklenenkodGrubu;
    static String eklenenSonuçKoduName;

    //Login Steps
    @Given("Kullanıcı ucmsadmin sayfasına gider")
    public void kullanıcıUcmsadminSayfasınaGider() {
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

    @And("Crm ıd alanını null geçer")
    public void crmIdAlanınıNullGeçer() {
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
        ReusableMethods.waitFor(2);
    }

    @Then("Onay butonuna tıklar")
    public void OnayButonunaTıklar() {
        ucmsAdminPage.onayButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Sayfayı kapatır")
    public void SayfayıKapatır() {
        ReusableMethods.waitFor(1);
        //Driver.closeDriver();
    }

    @And("Silmek istediği kod grubunun sil ıkonuna tıklar")
    public void silmekIstediğiKodGrubununSilIkonunaTıklar() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSilIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sil']"));
        eklenenkodGrubuSilIkonu.click();
        ucmsAdminPage.onayButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Silmek istediği sonuç kodu olan kod grubunun sil Ikonuna tıklar")
    public void silmekIstediğiSonuçKoduOlanKodGrubununSilIkonunaTıklar() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSilIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sil']"));
        eklenenkodGrubuSilIkonu.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kod grubunun silindiğini doğrular")
    public void KodGrubununSilindiğiniDoğrular() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);
    }

    @Then("Kod grubunun silinemediğini doğrular")
    public void kodGrubununSilinemediğiniDoğrular() {

        ucmsAdminPage.kodGrubuSilinemezPopup.isDisplayed();
        System.out.println("kodGrubuSilinemezPopup = " + ucmsAdminPage.kodGrubuSilinemezPopup.getText());
    }

    //Kod Grubu Güncelleme Steps
    @And("Güncellemek istediği kod grubunun grup güncelle ıkonuna tıklar")
    public void güncellemekIstediğiKodGrubununGrupGüncelleIkonunaTıklar() {
        ReusableMethods.waitFor(1);
        WebElement güncellenenKodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'GrupGüncelleme')]"));
        actions.moveToElement(güncellenenKodGrubu).perform();
        WebElement eklenenkodGrubuSilIkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'GrupGüncelleme')]/following::button[@mattooltip='Grup Güncelle']"));
        eklenenkodGrubuSilIkonu.click();
        ReusableMethods.waitFor(1);

    }

    @And("Açılan pencereden istediği alanı günceller")
    public void açılanPenceredenIstediğiAlanıGünceller() {
        ucmsAdminPage.crmId.clear();
        ucmsAdminPage.crmId.sendKeys("KodGrupGüncelleme");
        ucmsAdminPage.grupAdıEkle.clear();
        ucmsAdminPage.grupAdıEkle.sendKeys("KodGrupGüncelleme");
    }

    @Then("Kod grubunun güncellendiğini doğrular")
    public void kodGrubununGüncellendiğiniDoğrular() {

    }
    @And("Açılan pencereden bilgileri siler")
    public void açılanPenceredenBilgileriSiler() {
        ucmsAdminPage.crmId.clear();
        ucmsAdminPage.grupAdıEkle.clear();
    }

    @Then("Zorunlu alanları doldurunuz uyarısını doğrular")
    public void zorunluAlanlarıDoldurunuzUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.zorunluAlanlarıDoldurunuzPopup.isDisplayed());
    }


    //Alt Grup Ekleme
    @And("Eklenen kod grubunun alt grup ekle ikonuna tıklar")
    public void eklenenKodGrubununAltGrupEkleIkonunaTıklar() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        ReusableMethods.waitFor(1);
        actions.moveToElement(eklenenkodGrubu).perform();
        ReusableMethods.waitFor(1);
        WebElement eklenenkodGrubuAltGrupEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Alt Grup Ekle']"));
        ReusableMethods.waitFor(1);
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
        ucmsAdminPage.altGrupBaşlık.sendKeys("AG" + eklenenKodGrubuName);
    }

    @And("Kaydet butonuna tıklanır.")
    public void kaydetButonunaTıklanır() {
        ucmsAdminPage.kaydetButton.click();
        ucmsAdminPage.onayButton.click();
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
        ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
    }

    @And("Başlık kısmına isim girer")
    public void başlıkKısmınaIsimGirer() {
        ucmsAdminPage.SonuçKoduBaşlık.sendKeys("SK" + eklenenKodGrubuName);
        eklenenSonuçKoduName = "SK" + eklenenKodGrubuName;
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
    public void kaydeteTıklar() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.kaydetButton.click();
        ReusableMethods.waitFor(3);
    }

    //Sonuç Kodu Arama Steps
    @And("İçerik ara searchbox ına tıklar")
    public void içerikAraSearchboxInaTıklar() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.içerikAramaSearchBox.click();
    }

    @And("Var olan sonuç kodunun ismini girer")
    public void varOlanSonuçKodununIsminiGirer() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(eklenenSonuçKoduName);
        ReusableMethods.waitFor(1);
    }

    @And("Var olan sonuç kodunun olduğunu doğrular")
    public void varOlanSonuçKodununOlduğunuDoğrular() {
        WebElement eklenenSonuçKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonuçKoduName + "')]"));
        System.out.println("eklenenSonuçKodu.getText() = " + eklenenSonuçKodu.getText());
        Assert.assertTrue(eklenenSonuçKodu.isDisplayed());
    }

    //Devre Dışı Bırakılan Sonuç Kodlarını Listeleme Steps
    @And("Açılan sayfada devre dışı bırakılanlar iconuna tıklanır.")
    public void açılanSayfadaDevreDışıBırakılanlarIconunaTıklanır() {
        ucmsAdminPage.devreDışıBırakılanlarIkon.click();
        ReusableMethods.waitFor(3);

    }

    @Then("Kod grupları hiyerarşisi altında devre dışı bırakılan sonuç kodlarının da üstü çizili olarak listelendiği görülür")
    public void kodGruplarıHiyerarşisiAltındaDevreDışıBırakılanSonuçKodlarınınDaÜstüÇiziliOlarakListelendiğiGörülür() {

        List<WebElement> devreDışıBırakılanSonuçKodlarıList = ucmsAdminPage.devreDışıBırakılanSonuçKodları;

        System.out.println("devreDışıBırakılanSonuçKodlarıList.size() = " + devreDışıBırakılanSonuçKodlarıList.size());

        for (WebElement w : devreDışıBırakılanSonuçKodlarıList) {
            System.out.println(w.getText());
        }
    }

    @Then("Tekrar devre dışı bırakılanlar iconuna tıklandığında, devre dışı bırakılmış sonuç kodlarının listelenmediği  görülür")
    public void tekrarDevreDışıBırakılanlarIconunaTıklandığındaDevreDışıBırakılmışSonuçKodlarınınListelenmediğiGörülür() {
        ucmsAdminPage.devreDışıBırakılanlarIkon.click();

        List<WebElement> devreDışıBırakılanSonuçKodlarıList = ucmsAdminPage.devreDışıBırakılanSonuçKodları;
        System.out.println("devreDışıBırakılanSonuçKodlarıList.size() = " + devreDışıBırakılanSonuçKodlarıList.size());
        for (WebElement w : devreDışıBırakılanSonuçKodlarıList) {
            System.out.println(w.getText());
        }

    }

    //Sonuç Kodu Taşıma Steps
    @And("Değiştirmek istediği sonuç kodunun kod grubuna tıklar")
    public void değiştirmekIstediğiSonuçKodununKodGrubunaTıklar() {
        WebElement değiştirmekİstediğiSonuçKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//button[@aria-label='toggle KGOtomasyon001']"));
        değiştirmekİstediğiSonuçKoduKodGrubu.click();
    }

    @And("Değiştirmek istediği sonuç kodunun dizin değiştir iconuna tıklar")
    public void değiştirmekIstediğiSonuçKodununDizinDeğiştirIconunaTıklar() {

        WebElement sonuçKodu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'SonuçKoduTaşıma')]"));
        ReusableMethods.waitFor(1);
        actions.moveToElement(sonuçKodu).perform();
        ReusableMethods.waitFor(1);
        WebElement sonuçKoduDizinDeğiştirİkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'SonuçKoduTaşıma')]/following::button[@mattooltip='Dizin Değiştir']"));
        ReusableMethods.waitFor(1);
        sonuçKoduDizinDeğiştirİkonu.click();
        ReusableMethods.waitFor(1);

    }

    @And("Değiştirmek istediği pasif sonuç kodunun dizin değiştir iconuna tıklar")
    public void değiştirmekIstediğiPasifSonuçKodununDizinDeğiştirIconunaTıklar() {
        WebElement taşınanSonuçKodu = Driver.getDriver().findElement(By.xpath("//del[contains(text(),'SonuçKoduTaşıma')]"));
        actions.moveToElement(taşınanSonuçKodu).perform();
        WebElement sonuçKoduDizinDeğiştirİkonu = Driver.getDriver().findElement(By.xpath("//del[contains(text(),'SonuçKoduTaşıma')]/following::button[@mattooltip='Dizin Değiştir']"));
        sonuçKoduDizinDeğiştirİkonu.click();

    }

    @And("Taşımak istediği kod grubunun buraya taşı iconuna tıklar")
    public void taşımakIstediğiKodGrubununBurayaTaşıIconunaTıklar() {

        WebElement taşımakİstediğiSonuçKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'SonuçKoduTaşımaKodGrubu')]"));
        ReusableMethods.waitFor(1);
        actions.moveToElement(taşımakİstediğiSonuçKoduKodGrubu).perform();
        ReusableMethods.waitFor(1);
        WebElement sonuçKoduBurayaTaşıİkonu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'SonuçKoduTaşımaKodGrubu')]/following::button[@mattooltip='Buraya Taşı']"));
        ReusableMethods.waitFor(1);
        sonuçKoduBurayaTaşıİkonu.click();
        ReusableMethods.waitFor(1);
    }
    @And("Açılan uyarı penceresinde evet e tıklanır")
    public void açılanUyarıPenceresindeEvetETıklanır() {
        ucmsAdminPage.onayButton.click();
    }

    @Then("Sonuç kodunun dizinin değiştiği görülür.")
    public void sonuçKodununDizininDeğiştiğiGörülür() {
        List<WebElement> sonuçKoduTaşındıUyarı = ucmsAdminPage.sonuçKoduTaşındıUyarısı;
        Assert.assertEquals(sonuçKoduTaşındıUyarı.size(), 1);
    }
    @And("Açılan uyarı penceresinde vazgeç e tıklanır")
    public void açılanUyarıPenceresindeVazgeçETıklanır() {
        ucmsAdminPage.vazgeçButton.click();
    }

    @Then("Sonuç kodunun dizinin değişmediğini görülür.")
    public void sonuçKodununDizininDeğişmediğiniGörülür() {
        List<WebElement> sonuçKoduTaşındıUyarı = ucmsAdminPage.sonuçKoduTaşındıUyarısı;
        Assert.assertEquals(sonuçKoduTaşındıUyarı.size(), 0);
    }

    @And("İptal icon'una tıklar")
    public void iptalIconUnaTıklar() {
        ucmsAdminPage.taşımaİptalButton.click();
    }


}
