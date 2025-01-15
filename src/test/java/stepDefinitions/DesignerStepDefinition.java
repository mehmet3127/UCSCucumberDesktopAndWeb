package stepDefinitions;


import com.github.javafaker.Faker;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DesignerPage;
import pages.UcmsAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;


public class DesignerStepDefinition {

    public static WindowsDriver<WebElement> driver;
    public static WebDriver driver2;
    DesignerPage designerPage = new DesignerPage();
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 120);


    protected static String eklenenKampanyaAdi;
    static String eklenenVeriSetiDegiskeniName;


    //Login Steps
    @Given("Designer uygulamasina gidilir")
    public void designerUygulamasinaGidilir() {

        if (Driver.webDriver() != null) {
            Driver.quitWebDriver();
        }
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

        for (String window : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(window);
            if (Driver.getDriver().getTitle().contains("UcmsDesigner")) {
                break;
            }
        }

        //List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        //Driver.getDriver().switchTo().window(windowList.get(0));

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

        ReusableMethods.waitForVisibility(designerPage.anaSayfaCampaignKlasor, 90);

        Assert.assertTrue(designerPage.anaSayfaCampaignKlasor.isDisplayed());

        //Assert.assertTrue(Driver.getDriver().getTitle().contains("UcmsDesigner"));
        //Driver.designerClose();
        //ReusableMethods.winAppDriverStop();
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
        eklenenKampanyaAdi = kampanyaAdi;
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

        actions.keyDown(Keys.ALT)
                .sendKeys(Keys.F4)
                .keyUp(Keys.ALT)
                .build()
                .perform();

    }

    //Kampanya Goruntuleme
    @And("Kampanya modu secilir")
    public void kampanyaModuSecilir() {

        if (designerPage.onayPenceresi.isDisplayed()) {
            designerPage.tamam.click();
        }else {
            ReusableMethods.waitForVisibility(designerPage.kampanyaDuzenlemeModu, 45);
            designerPage.kampanyaDuzenlemeModu.click();
        }

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
        designerPage.secButon.click();
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
    public void islemyapilacakOlanKampanyayaSagTiklanir(String copyCamp) {

        ReusableMethods.waitForVisibility(designerPage.anaSayfaTest, 90);

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
        ReusableMethods.waitForVisibility(designerPage.akisTasarimPenceresi, 20);
        designerPage.akisTasarimPenceresi.click();
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

    @And("{string} Tasarim ekranini uzaklastir butonuna tiklanir")
    public void tasarimEkraniniUzaklastirButonunaTiklanir(String kanalTipi) {

        for (int i = 1; i < 4; i++) {
            if (kanalTipi.equals("IVR")) {
                designerPage.akisEkraniUzaklastirIVR.click();
            } else {
                designerPage.akisEkraniUzaklastirOB.click();
            }

        }
    }

    @And("{string} Tasarim ekranini yakinlastir butonuna tiklanir")
    public void tasarimEkraniniYakinlastirButonunaTiklanir(String kanalTipi) {
        for (int i = 1; i < 4; i++) {
            if (kanalTipi.equals("IVR")) {
                designerPage.akisEkraniYakinlastirIVR.click();
            } else {
                designerPage.akisEkraniYakinlastirOB.click();
            }

        }
    }

    @And("{string} Tasarim ekranini normal boyutta goster butonuna tiklanir")
    public void tasarimEkraniniNormalBoyuttaGosterButonunaTiklanir(String kanalTipi) {
        if (kanalTipi.equals("IVR")) {
            designerPage.akisEkraniNormalBoyuttaGosterIVR.click();
        } else {
            designerPage.akisEkraniNormalBoyuttaGosterOB.click();
        }

    }

    @And("Akistaki bir node {string} tiklanir")
    public void akistakiBirFormaTiklanir(String nodeName) {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();
        WebElement node = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + nodeName + "')]"));
        node.click();
    }

    @And("Ozellikler butonuna tıklanır")
    public void OzelliklerButonunaTiklanir() {
        designerPage.ozelliklerButon.click();

    }

    @Then("Ozellikler penceresinin acildigi gorulur")
    public void ozelliklerPenceresininAcildigiGorulur() {
        Assert.assertTrue(designerPage.ozelliklerpenceresiTitle.getText().contains("Form Özellikleri"));
    }

    @And("Baglanti kurulacak formlar {string} {string} secilir")
    public void baglantiKurulacakFormlarSecilir(String node1, String node2) {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();

        WebElement form1 = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + node1 + "')]"));
        form1.click();
        designerPage.formEkleButon.click();

        WebElement form2 = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + node2 + "')]"));
        form2.click();
        designerPage.formEkleButon.click();

    }

    @Then("Baglanti kur butonuna tiklanir")
    public void baglantiKurButonunaTiklanir() {
        designerPage.baglantiKurButon.click();
    }

    @And("Silinecek olan baglanti {string} secilir")
    public void silinecekOlanBaglantiSecilir(String silinecekBaglanti) {
        designerPage.formAra.click();
        designerPage.eklenenTumNodelar.click();
        WebElement baglanti = Driver.getDriver().findElement(By.xpath("//ListItem[contains(@Name,'" + silinecekBaglanti + "')]"));
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

    @And("Script tabi acilir")
    public void scriptTabiAcilir() {
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

    @And("Web service ekle noda tiklanir")
    public void webServiceEkleNodaTiklanir() {
        designerPage.webServiceEkleOB.click();
    }

    @And("Web service tabi acilir")
    public void webServiceTabiAcilir() {
        designerPage.webServiceTab.click();
    }

    @And("Test endpointi eklenir")
    public void testEndpointiEklenir() {
        designerPage.testEndpoint.sendKeys("http://172.30.1.60:39029/api/v1/batch/start");

    }

    @And("Preprod endpointi eklenir")
    public void preprodEndpointiEklenir() {
        actions.sendKeys(Keys.TAB, "http://172.30.1.60:39029/api/v1/batch/start").perform();
    }

    @And("Prod endpointi eklenir")
    public void prodEndpointiEklenir() {
        actions.sendKeys(Keys.TAB, "http://172.30.1.60:39029/api/v1/batch/start").perform();
    }

    @And("Ornek JSON kodu girilir")
    public void ornekJSONKoduGirilir() {
        designerPage.ornekJson.sendKeys("{" +
                "\n" +
                "\"ImportRequestedBy\": \"CRM_SERVICE\",\n" +
                "\n" +
                "\"TotalRecordCount\": 3120,\n" +
                "\n" +
                "\"ListName\": \"Churn_2020-12-20\",\n" +
                "\n" +
                "\"CampId\":62,\n" +
                "\n" +
                "\"AutoEndBatch\": false,\n" +
                "\n" +
                "\"ChunkCount\": 7\n" +
                "\n" +
                "}");
    }

    @And("Yukle butonuna tiklanir")
    public void yukleButonunaTiklanir() {
        designerPage.yukleButon.click();
    }

    @And("Request tabina gecilir")
    public void requestTabinaGecilir() {
    }

    @And("Alan eslestirme tabina tiklanir")
    public void alanEslestirmeTabinaTiklanir() {
    }

    @And("Sol alt combobox'tan SOAP secilir")
    public void solAltComboboxTanSOAPSecilir() {
        designerPage.restSoapComboBox.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @And("Url alanina tiklanir ve Url {string} girilir")
    public void urlAlaninaTiklanirVeUrlGirilir(String url) {
        designerPage.soapUrl.sendKeys(url);
    }

    @And("Sag taraftaki yesil butona tiklanir")
    public void sagTaraftakiYesilButonaTiklanir() {
        designerPage.parametreDegerleriButon.click();
    }

    @And("Session dan deger oku noduna tiklanir")
    public void sessionDanDegerOkuNodunaTiklanir() {
        designerPage.sessiondanDegerOku.click();
    }

    @And("Session dan deger oku tabi acilir")
    public void sessionDanDegerOkuTabiAcilir() {
        designerPage.sessiondanDegerOkuTab.click();
    }

    @And("Veri seti degiskeni listBox'ina tiklanir")
    public void veriSetiDegiskeniListBoxInaTiklanir() {
        actions.contextClick(designerPage.veriSetiDegiskeniEklemeEkrani).perform();
        actions.contextClick(designerPage.degiskenEkleButon).perform();
        WebElement degerAdi = Driver.getDriver().findElement(By.name("Row 1"));
        degerAdi.sendKeys("CUSTOMER_NAME");
        WebElement veriSetiDegiskeni = Driver.getDriver().findElement(By.name("Row 1 Column 2"));
        actions.doubleClick(veriSetiDegiskeni).perform();
    }

    @And("Akis baslangic formu secilir")
    public void akisBaslangicFormuSecilir() {
        designerPage.akisBaslangicFormu.click();
    }

    @And("Ucms admine gider")
    public void ucmsAdmineGider() {
        Driver.webDriver().get("http://test-linux.ucs.pvt:58027/");
        ucmsAdminPage.userName.sendKeys("mehmet.demir");

    }

    @And("Veri seti ekrani acilir")
    public void veriSetiEkraniAcilir() {

        designerPage.veriSetiPenceresi.click();
    }

    @And("Veri seti alanina sag tiklanir")
    public void veriSetiAlaninaSagTiklanir() {
        actions.contextClick(designerPage.veriSetiDegiskeniEklemeEkrani).perform();
    }

    @And("Ekle butonuna tıklanir")
    public void ekleButonunaTıklanir() {
        designerPage.ekleButon.click();
    }

    @And("Arama metnine veri seti degiskeni ismi {string} yazilir")
    public void aramaMetnineVeriSetiDegiskeniIsmiYazilir(String veriSetiDegiskeni) {
        eklenenVeriSetiDegiskeniName = veriSetiDegiskeni;
        designerPage.degiskenEkleAramaMetniSearchBox.sendKeys(veriSetiDegiskeni, Keys.ENTER);

    }

    @And("Sec butonuna tıklanır")
    public void secButonunaTıklanır() {
        designerPage.secButon.click();
    }

    @And("Eklenen veri seti sag tarafa suruklenir")
    public void ekleneVeriSetiSagTarafaSuruklenir() {

        WebElement eklenenVeriSetiDegiskeni = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + eklenenVeriSetiDegiskeniName + "')]"));
        Assert.assertTrue(eklenenVeriSetiDegiskeni.isDisplayed());
        actions.doubleClick(eklenenVeriSetiDegiskeni).perform();

    }

    @And("Inbound'a kopyala butonuna tiklanir")
    public void ınboundAKopyalaButonunaTiklanir() {
        designerPage.inboundaKopyala.click();
    }

    //Kampanya Tanim Penceresi CRM Tabi
    @And("CRM tabi acilir")
    public void crmTabiAcilir() {
        designerPage.kampanyaTanimPenceresiCrmTab.click();
    }

    @And("Harici kampanya adi girilir")
    public void hariciKampanyaAdiGirilir() {
        designerPage.hariciKampanyaId.sendKeys("DEMIR");
    }

    @And("Dosya kaynaklari sekmesine tiklanir")
    public void dosyaKaynaklariSekmesineTiklanir() {
        designerPage.kampanyaTanimPenceresiDosyaKaynaklariTab.click();
    }

    @And("Dosya turu {string} secilir")
    public void dosyaTuruSecilir(String dosyaKaynagi) {
        switch (dosyaKaynagi) {
            case "Resim":

                designerPage.resim.click();
                break;
            case "Ses Dosyasi":

                designerPage.dosyaKaynaklariSesDosyasi.click();
                break;
            case "XML Liste Kaynagi":

                designerPage.dosyaKaynaklariXmlListeKaynagi.click();
                break;
        }

    }

    @And("Ice al butonuna tiklanir")
    public void ıceAlButonunaTiklanir() {
        designerPage.dosyaKaynaklariIceAl.click();
    }

    @And("Disa ver butonuna tiklanir")
    public void disaVerButonunaTiklanir() {
        designerPage.dosyaKaynaklariDisaVer.click();
        WebElement disaVerilecekPath1 = Driver.getDriver().findElement(By.name("Yerel Disk (C:)"));
        actions.click(disaVerilecekPath1).perform();

        WebElement disaVerilecekPath2 = Driver.getDriver().findElement(By.name("_UcsDemo"));
        actions.click(disaVerilecekPath2).perform();

        WebElement disaVerilecekPath3 = Driver.getDriver().findElement(By.name("TestData"));
        actions.click(disaVerilecekPath3).perform();
    }

    @And("Eklenecek dosya secilir {string}")
    public void eklenecekDosyaSecilir(String dosyaYolu) {
        try {
            Robot robot = new Robot();
            StringSelection dosyaSelection = new StringSelection(dosyaYolu);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaSelection, null);

            // Ctrl + V (Yapıştırma) kombinasyonu ile dosya yolu eklemek için Robot'u kullanma
            ReusableMethods.waitFor(2);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            // Enter ile dosyayı seçme penceresini kapatma
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Then("Ice alim dosyasinin gecersiz oldugu uyarisi gorulur")
    public void iceAlimDosyasininGecersizOlduguUyariGorulur() {

        if (designerPage.bilgiHataMesaji.getText().contains("İçe alım dosyası geçersiz")) {
            System.out.println("hataMesaji.getText() = " + designerPage.bilgiHataMesaji.getText());
            designerPage.tamam.click();
        }
    }

    @Then("Kampanya dosyalari ice alindi uyari gorulur")
    public void kampanyaDosyalariIceAlindiUyariGorulur() {
        ReusableMethods.waitForVisibility(designerPage.bilgiHataMesaji, 60);
        if (designerPage.bilgiHataMesaji.getText().contains("Kampanya dosyaları içe alındı")) {
            System.out.println("hataMesaji.getText() = " + designerPage.bilgiHataMesaji.getText());
            designerPage.tamam.click();
        }
    }

    @Then("Dışa verme dosyası oluşturuldu uyarisi gorulur")
    public void dışaVermeDosyasıOluşturulduUyarisiGorulur() {
    }


    @Then("Desteklenmeyen dosya formati uyarisi gorulur")
    public void desteklenmeyenDosyaFormatiUyarisiGorulur() {
        if (designerPage.bilgiHataMesaji.getText().contains("Desteklenmeyen dosya formatı")) {
            System.out.println("hataMesaji.getText() = " + designerPage.bilgiHataMesaji.getText());
            designerPage.tamam.click();
        }
    }

    @And("Dosya {string} secilir")
    public void dosyaSecilir(String dosya) {
        switch (dosya) {
            case "Resim":
                actions.doubleClick(designerPage.resim).
                        sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                break;
            case "Ses Dosyasi":
                actions.doubleClick(designerPage.dosyaKaynaklariSesDosyasi).
                        sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                break;
            case "XML Liste Kaynagi":
                actions.doubleClick(designerPage.dosyaKaynaklariXmlListeKaynagi).
                        sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                break;
        }
    }

    @And("Sil butonuna tiklanir")
    public void silButonunaTiklanir() {
        designerPage.silButon.click();
    }

    @And("Ongorum butonuna tiklanir")
    public void ongorumButonunaTiklanir() {
        designerPage.dosyaKaynaklariOngorum.click();

    }

    @And("Acilan ongorum dosyasi kapatilir")
    public void acilanOngorumDosyasiKapatilir() {
        ReusableMethods.waitFor(2);
        actions.keyDown(Keys.ALT)
                .sendKeys(Keys.F4)
                .keyUp(Keys.ALT)
                .build()
                .perform();
    }

    //Iceri Veri Transferi
    @And("Listeler'e tiklanir")
    public void listelerETiklanir() {
        designerPage.listelerButon.click();
        designerPage.ekranMaximize.click();
    }

    @And("Iceri veri transferi tab'ina tiklanir")
    public void ıceriVeriTransferiTabInaTiklanir() {
        designerPage.listelerEkraniIceriVeriTransferiTab.click();
    }

    @And("Veri kaynagi tipine tiklanir ve veri kaynagi tipi {string} secilir")
    public void veriKaynagiTipineTiklanirVeVeriKaynagiTipiSecilir(String veriKaynagiTipi) {

        designerPage.iceriVeriTransferiVeriKaynagiTipi.click();

        if (veriKaynagiTipi.equals("Ağ Yolundaki Dosya")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    perform();
        } else if (veriKaynagiTipi.equals("ODBC Veri Kaynağı")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    sendKeys(Keys.ARROW_DOWN).
                    perform();
        }
    }

    @And("Dosya yolu secilir {string}")
    public void dosyaYoluSecilir(String dosyaYolu) {

        designerPage.iceriVeriTransferiVeriKaynagiDosyaYolu.sendKeys(dosyaYolu);
    }

    @And("Ayrac {string} secilir")
    public void ayracSecilir(String ayrac) {
        designerPage.iceriVeriTransferiVeriKaynagiAyrac.clear();
        designerPage.iceriVeriTransferiVeriKaynagiAyrac.sendKeys(ayrac);
    }

    @And("Dosya formati {string} secilir")
    public void dosyaFormatiSecilir(String dosyaFormati) {

        designerPage.iceriVeriTransferiVeriKaynagiFormati.click();

        if (dosyaFormati.equals("UTF-8")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    perform();
        } else if (dosyaFormati.equals("ANSI")) {
            actions.sendKeys(Keys.ARROW_DOWN).
                    sendKeys(Keys.ARROW_DOWN).
                    perform();
        }

    }

    @And("Sonraki butonuna tiklanir")
    public void sonrakiButonunaTiklanir() {
        designerPage.iceriVeriTransferiSonrakiButon.click();
    }

    @And("Musteri bilgileri modulune tiklanir")
    public void musteriBilgileriModuluneTiklanir() {
        designerPage.iceriVeriTransferiKaynakHedefAlanMusteriBilgileri.click();

    }

    @And("{string} ile deger adi {string} alani eslestirilir")
    public void ileDegerAdiAlaniEslestirilir(String kaynak, String hedefAdi) {

        //WebElement kaynakAlan = Driver.getDriver().findElement(By.name(kaynak));
        WebElement kaynakAlan = Driver.getDriver().findElement(By.xpath("//TreeItem[contains(@Name,'" + kaynak + "')]"));


        int hedefSatir = 0;

        switch (hedefAdi) {

            case "Cep":
                kaynakAlan.click();
                hedefSatir = 1;

                break;
            case "No":
                hedefSatir = 1;

                break;
            case "Ad":
                hedefSatir = 2;

                break;
            case "Soyadı":
                hedefSatir = 3;

                break;
        }

        WebElement hedefAlani = Driver.getDriver().findElement(By.name("MatchCols Row " + hedefSatir));
        actions.dragAndDrop(kaynakAlan, hedefAlani).build().perform();

    }

    @And("Kaynak hedef alan eslestirme sayfasinda Tlf tipi secilir")
    public void kaynakHedefAlanEslestirmeSayfasindaTlfTipiSecilir() {
        WebElement tlfTipiCombobox = Driver.getDriver().findElement(By.name("Type Row 1"));
        actions.click(tlfTipiCombobox).sendKeys(Keys.ENTER).perform();

    }

    @And("Veri transferi sayfasina gecilir")
    public void veriTransferiSayfasinaGecilir() {

        designerPage.iceriVeriTransferiSonrakiButon.click();
        designerPage.iceriVeriTransferiSonrakiButon.click();
    }

    @And("Kaynaktaki mukerrer kayitlari iceri aktar checkBox'ina tiklanir")
    public void kaynaktakiMukerrerKayitlariIceriAktarCheckBoxInaTiklanir() {

        designerPage.veriTransferiKaynaktakiMukerrerKayitlarIceriAktar.click();

    }

    @And("Batch Id durumu {string} secilir")
    public void batchIdDurumuSecilir(String batchIdDurumu) {
        designerPage.veriTransferiBatchIdDurumu.click();

        switch (batchIdDurumu) {

            case "Aktif":
                actions.sendKeys(Keys.ARROW_DOWN).
                        perform();
                break;
            case "Pasif":
                actions.sendKeys(Keys.ARROW_DOWN).
                        sendKeys(Keys.ARROW_DOWN).
                        perform();
                break;
        }
    }

    @And("Gecerlilik tarihi {string} secilir")
    public void gecerlilikTarihiSecilir(String gecerlilikTarihi) {
        designerPage.veriTransferiGecerlilikTarihi.click();

        switch (gecerlilikTarihi) {

            case "Takvim tarihine":
                actions.sendKeys(Keys.ARROW_DOWN).
                        perform();
                break;
            case "Ayin son gunune":
                actions.sendKeys(Keys.ARROW_DOWN).
                        sendKeys(Keys.ARROW_DOWN).
                        perform();
                break;
        }
    }

    @And("Transferi baslat butonuna tiklanir")
    public void transferiBaslatButonunaTiklanir() {
        designerPage.veriTransferiTarnasferiBaslat.click();
    }

    @Then("Yukleme talebi alindi mesajinin geldigi gorulur")
    public void yuklemeTalebiAlindiMesajininGeldigiGorulur() {

        if (designerPage.onayPenceresi.getText().contains("Yükleme talebiniz alındı")) {
            designerPage.tamam.click();
        }

        actions.keyDown(Keys.ALT)
                .sendKeys(Keys.F4)
                .keyUp(Keys.ALT)
                .build()
                .perform();
    }
}

