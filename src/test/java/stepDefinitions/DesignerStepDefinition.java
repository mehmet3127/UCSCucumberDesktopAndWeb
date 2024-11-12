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
    @Given("Designer uygulamasina gidilir")
    public void designerUygulamasinaGidilir() {
        Driver.getDriver();
        //Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @Then("Gecerli username girilir")
    public void gecerliUsernameGirilir() {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("userName"));
    }

    @And("Gecerli password girilir")
    public void gecerliPasswordGirilir() {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Login butonuna tıklanir")
    public void loginButonunaTiklanir() {
        designerPage.sistemeGiris.click();
        ReusableMethods.waitFor(8);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(0));

        //String windows = Driver.getDriver().getWindowHandles().iterator().next();
        //Driver.getDriver().switchTo().window(windows).getTitle();
    }

    //Negatif senaryolar da ana sayfaya gidilmedigi icin bekleme suresine gerek olmadigi icin farkli login step yazildi
    @And("Login butonuna tıklanir.")
    public void loginButtonunaTiklanir() {
        designerPage.sistemeGiris.click();
    }

    @Then("UserName {string} girilir")
    public void userNameGirilir(String girilecekUserName) {
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

    @And("Password {string} girilir")
    public void passwordGirilir(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));
    }

    @And("Kullanıcı uygulama adını {string} gırer")
    public void kullanıcıUygulamaAdınıGırer(String uygulamaAdi) {
        designerPage.loginDetayButton.click();
        designerPage.uygulamaAdi.clear();
        designerPage.uygulamaAdi.sendKeys(ConfigReader.getProperty(uygulamaAdi));

    }

    @And("Server name {string} girilir")
    public void serverNameGirilir(String serverName) {
        designerPage.sunucu.clear();
        designerPage.sunucu.sendKeys(ConfigReader.getProperty(serverName));
    }

    @And("Port bilgisi {string} girilir")
    public void portBilgisiGirilir(String port) {
        designerPage.port.clear();
        designerPage.port.sendKeys(ConfigReader.getProperty(port));
    }

    @Then("Tamam button'una tıklanir")
    public void tamamButtonUnaTiklanir() {
        ReusableMethods.waitForClickablility(designerPage.tamam, 10);
        designerPage.tamam.click();
    }

    @Then("Vazgec butonuna tiklar")
    public void vazgecButonunaTiklar() {
        designerPage.loginVazgecButton.click();
    }

    //Ana sayfa
    @Then("Designer ana sayfasina gidildiği gorulur")
    public void designerAnaSayfasinaGidildigiGorulur() {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 60);
        Assert.assertTrue(designerPage.anaSayfaCampaignKlasor.isDisplayed());
    }

    @Then("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        ReusableMethods.designerClose();
    }

    //Kampanya Ekleme
    @And("Campaigns klasörüne tıklanir")
    public void campaignsKlasoruneTiklanir() {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);
        actions.doubleClick(designerPage.anaSayfaCampaignKlasor).build().perform();
    }

    @And("Kampanyanin eklenecegi klasöre {string} sag tiklanir")
    public void kampanyaninEklenecegiKlasoreSagTiklanir(String klasorAdi) {
        WebElement kampanyaninEklenecegiKlasor = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + klasorAdi + "')]"));
        //WebElement kampanyaninEklenecegiKlasor = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'Campaigns\\"+klasorAdi+"')]"));
        actions.contextClick(kampanyaninEklenecegiKlasor).perform();
    }

    @And("Kampanya ekle ye tıklanir")
    public void kampanyaEkleYeTiklanir() {
        designerPage.kampanyaEkle.click();
    }

    @And("Kampanya adi {string} girilir")
    public void kampanyaAdiGirilir(String kampanyaAdi) {
        eklenenKampanyaAdi = kampanyaAdi + Faker.instance().number().numberBetween(1, 1000);
        designerPage.kampanyaAdi.sendKeys(eklenenKampanyaAdi);
    }

    @And("Kaydet butonuna tıklanir")
    public void kaydetButonunaTiklanir() {
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

    @And("Arama tipi {string} secilir")
    public void aramaTipiSecilir(String aramaTipi) {

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
    public void islemYapilacakOlanKampanyaSecilir(String campName) {
        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);
        designerPage.campSearchBox.sendKeys(campName, Keys.ENTER);
        WebElement goruntulenecekKampanya = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + campName + "')]"));
        actions.doubleClick(goruntulenecekKampanya).perform();
    }

    @And("Varsayilan sonuç kodu için seç butonuna tıklanir")
    public void varsayılanSonuçKoduIçinSeçButonunaTıklar() {
        designerPage.varsayilanSonucKoduSec.click();
    }

    @And("Varsayilan sonuc kodu {string} secilir")
    public void varsayilanSonucKoduSecilir(String sonucKodu) {

        actions.doubleClick(designerPage.cagriCevaplanmadi).perform();
        WebElement sonucKoduSec = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + sonucKodu + "')]"));
        sonucKoduSec.click();
        actions.sendKeys(Keys.SPACE).perform();

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
        designerPage.eklenenTumNodelar.click();


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


    //IVR Akis Tasarim Ekrani
    @And("Akis Tasarim penceresine tiklanir")
    public void akisTasarimPenceresineTiklanir() {
        ReusableMethods.waitForVisibility(designerPage.akisTasarim, 20);
        designerPage.akisTasarim.click();
    }

    @Then("Anons ekle noduna tiklanir")
    public void anonsEkleNodunaTiklanir() {
        designerPage.anonsEkle.click();
    }

    @And("Veri girisi ekle noduna tiklanir")
    public void veriGirisiEkleNodunaTiklanir() {
        designerPage.veriGirisiEkle.click();
    }

    @And("Menu ekle noduna tiklanir")
    public void menuEkleNodunaTiklanir() {
        designerPage.menuEkle.click();
    }

    @And("Transfer ekle noduna tiklanir")
    public void transferEkleNodunaTiklanir() {
        designerPage.transferEkle.click();
    }

    @And("Cagridan veri oku noduna tiklanir")
    public void cagridanVeriOkuNodunaTiklanir() {
        designerPage.cagridanVeriOku.click();
    }

    @And("Cagriya veri yaz noduna tiklanir")
    public void cagriyaVeriYazNodunaTiklanir() {
        designerPage.cagriyaVeriYaz.click();
    }

    @And("Gorusmeyi bitir noduna tiklanir")
    public void gorusmeyiBitirNodunaTiklanir() {
        designerPage.gorusmeyiBitir.click();
    }

    @And("Web service ekle noduna tiklanir")
    public void webServiceEkleNodunaTiklanir() {
        designerPage.webServiceEkleIVR.click();
    }

    @And("Script ekle noduna tiklanir")
    public void scriptEkleNodunaTiklanir() {
        designerPage.scriptEkleIVR.click();
    }

    @And("Akis tasariminin kaydedildigi gorulur")
    public void akisTasarimininKaydedildigiGorulur() {
        if (designerPage.onayPenceresi.getText().contains("Akış tasarımı kaydedildi.")) {
            designerPage.tamam.click();
        }
    }

    @And("Kontrol Et butonuna tiklanir")
    public void kontrolEtButonunaTiklanir() {
        designerPage.kontrolEtButon.click();
    }

    @Then("Tasarim hatasiz bilgi pop-up gorunur")
    public void tasarimHatasizBilgiPopUpGorunur() {
        if (designerPage.onayPenceresi.getText().contains("Tasarım hatasız.")) {
            designerPage.tamam.click();
        }
    }

    @Then("Tasarimda hata tespit edildi uyarisinin geldigi gorulur")
    public void tasarimdaHataTespitEdildiUyarisininGeldigiGorulur() {
        if (designerPage.onayPenceresi.getText().contains("Tasarımda hata tespit edildi.")) {
            designerPage.tamam.click();
        }

    }

    @Then("Hata mesajlarini goruntuler")
    public void hataMesajlariniGoruntuler() {
        int hataMesajiCount = 1;

        List<WebElement> hataMesaji = Driver.getDriver().findElements(By.xpath("//DataItem[contains(@Name,'Explanation Row')]"));
        for (WebElement w : hataMesaji) {
            System.out.println(hataMesajiCount + ".Hata Mesaji = " + w.getText());
            hataMesajiCount++;
        }
    }

    @And("Tasarim ekranini uzaklastir butonuna tiklanir")
    public void tasarimEkraniniUzaklastirButonunaTiklanir() {

        for (int i = 1; i < 4; i++) {
            designerPage.tasarimEkraniniUzaklastir.click();
        }
    }

    @And("Tasarim ekranini yakinlastir butonuna tiklanir")
    public void tasarimEkraniniYakinlastirButonunaTiklanir() {
        for (int i = 1; i < 4; i++) {
            designerPage.tasarimEkraniniYakinlastir.click();
        }
    }

    @And("Tasarim ekranini normal boyutta goster butonuna tiklanir")
    public void tasarimEkraniniNormalBoyuttaGosterButonunaTiklanir() {
        designerPage.tasarimEkraniniNormalBoyuttaGoster.click();
    }

    @And("Akistaki bir forma tiklanir")
    public void akistakiBirFormaTiklanir() {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();
        WebElement form = Driver.getDriver().findElement(By.name("Form.1-Anons1"));
        form.click();
    }

    @And("Ozellikler butonuna tıklanır")
    public void OzelliklerButonunaTiklanir() {
        designerPage.ozelliklerButon.click();

    }

    @Then("Ozellikler penceresinin acildigi gorulur")
    public void ozelliklerPenceresininAcildigiGorulur() {
        Assert.assertTrue(designerPage.ozelliklerpenceresiTitle.getText().contains("Form Özellikleri"));
    }

    @And("Baglanti kurulacak formlar secilir")
    public void baglantiKurulacakFormlarSecilir() {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();

        WebElement form1 = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'Anons1')]"));
        form1.click();
        designerPage.formEkleButon.click();

        WebElement form2 = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'Transfer1')]"));
        form2.click();
        designerPage.formEkleButon.click();

    }

    @Then("Baglanti kur butonuna tiklanir")
    public void baglantiKurButonunaTiklanir() {
        designerPage.baglantiKurButon.click();
    }

    @And("Silinecek olan baglanti secilir")
    public void silinecekOlanBaglantiSecilir() {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();
        WebElement baglanti = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'Varsayılan Akış')]"));
        baglanti.click();
    }

    @Then("Baglanti sil butonuna tiklanir")
    public void baglantiSilButonunaTiklanir() {
        designerPage.baglantiSilButon.click();
    }


    //Outbound Akis Tasarim Ekrani
    @And("Form ekle noduna tiklanir")
    public void formEkleNodunaTiklanir() {
        designerPage.formEkle.click();
    }

    @And("JavaScript ekle noduna tiklanir")
    public void javascriptEkleNodunaTiklanir() {
        designerPage.javaScriptEkle.click();
    }

    @And("Eklenen node'a {string} cift tiklanir")
    public void eklenenNodaCiftTiklanir(String eklenenNode) {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();

        WebElement node = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + eklenenNode + "')]"));
        actions.doubleClick(node).perform();
    }

    @Then("Standart alanlar basligi altinda veri seti degiskenlerine tiklanarak sag ekrana suruklenir")
    public void standartAlanlarBasligiAltindaVeriSetiDegiskenlerineTiklanarakSagEkranaSuruklenir() {
        actions.doubleClick(designerPage.formTasarimiStandartAlanlar).perform();
        actions.doubleClick(designerPage.etiket).perform();
    }

    @And("Eklenen node {string} acilir")
    public void eklenenNodeAcilir(String eklenenNode) {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();

        WebElement node = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + eklenenNode + "')]"));
        node.click();
        designerPage.ozelliklerButon.click();
        designerPage.ekranMaximize.click();
    }

    @And("Javascript menusu acilir ve js kodu girilir")
    public void javascriptMenusuAcilirVeJsKoduGirilir() {
        designerPage.javaScriptTab.click();
        actions.sendKeys(designerPage.javaScriptVeriSetiDegiskeni,
                        "'|53-ST_MULTITEXTBOX_KARAKTER100|'=|50-ST_TEXTBOX_NUMERIK20| + '|49-ST_TEXTBOX_KARAKTER30|'")
                .perform();
    }

    @And("Sonuc kodu tabina tiklanir")
    public void sonucKoduTabinaTiklanir() {
        designerPage.sonucKodlariTab.click();
    }

    @And("Script ekle'ye tiklanir")
    public void scriptEkleYeTiklanir() {
        designerPage.scriptEkleOB.click();
    }

    @And("Script menusu acilir")
    public void scriptMenusuAcilir() {
        designerPage.scriptTab.click();
    }

    @And("Veri seti degiskeni {string} secilip ekle'ye tiklanir")
    public void veriSetiDegiskeniSecilipEkleyeTiklanir(String veriSetiDegiskeni) {
        actions.sendKeys(designerPage.scriptVeriSetiDegiskeniTxt, veriSetiDegiskeni).perform();
        //designerPage.scriptVeriSetiDegiskeni.click();
        //List<WebElement> veriSetiDegiskeniSec = Driver.getDriver().findElements(By.xpath("//ListItem[@Name='E03-Müşteri Soyadı']"));
        //switch (veriSetiDegiskeni) {
        //    case "E01-Müşteri No":
        //        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //    case "E02-Müşteri Adı":
        //        for (int i = 0; i < 2; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E03-Müşteri Soyadı":
        //        for (int i = 0; i < 3; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E04-Agent Adı":
        //        for (int i = 0; i < 4; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E05-Günün Tarih/Saati":
        //        for (int i = 0; i < 5; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E06-Agent Id":
        //        for (int i = 0; i < 6; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E06-Conn Id":
        //        for (int i = 0; i < 7; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
        //    case "E06-CustKey":
        //        for (int i = 0; i < 8; i++) {
        //            actions.sendKeys(Keys.ARROW_DOWN).perform();
        //        }
//
//
        //}
        //for (WebElement w : veriSetiDegiskeniSec) {
        //    System.out.println("w.getText() = " + w.getText());
        //    if (w.getText().contains(veriSetiDegiskeni)) {
        //        w.click();
        //    }
        //}
        //designerPage.veriSetiDegiskeniEkleButon.click();
    }

    @And("Donus degerlerinin yazilacagi veri seti degiskenleri alanina tiklanir")
    public void donusDegerlerininYazilacagiVeriSetiDegiskenleriAlaninaTiklanir() {
        WebElement ddyvsd = Driver.getDriver().findElement(By.name("Row 1"));
        ddyvsd.click();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //WebElement ddyvsdSec = Driver.getDriver().findElement(By.name("57-ST_COMBOBOX_KARAKTER20"));
    }

    @And("Karar nesnesini secer")
    public void kararNesnesiniSecer() {
        designerPage.kararNesnesiComboBox.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }
}

