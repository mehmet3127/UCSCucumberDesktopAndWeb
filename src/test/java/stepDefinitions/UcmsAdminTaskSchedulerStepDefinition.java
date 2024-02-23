package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminTaskSchedulerStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    static String isZamanlayiciAdi;
    static String scriptAdi;
    static String scriptName;
    static String komutZamanAsimi;


    @And("Test Scheduler butonuna tıklar")
    public void testSchedulerButonunaTıklar() {
        ucmsAdminPage.taskSchedulerSayfasi.click();

    }

    @And("İş zamanlayıcı sekmesine tıklar")
    public void işZamanlayıcıSekmesineTıklar() {
        ucmsAdminPage.isZamanlayiciMenu.click();

    }

    //İş Zamanlayıcı Ekleme
    @And("İş adı alanına {string} giriş yapar")
    public void işAdıAlanınaGirişYapar(String isAdi) {

        if (!isAdi.isEmpty()) {
            isZamanlayiciAdi = isAdi + Faker.instance().idNumber().ssnValid();
            ucmsAdminPage.isAdi.clear();
            ucmsAdminPage.isAdi.sendKeys(isZamanlayiciAdi);
        } else {
            isZamanlayiciAdi = isAdi;
        }


    }

    @And("Scripts combosundan bir script {string} seçer")
    public void scriptsCombosundanBirScriptSeçer(String script) {
        scriptAdi = script;
        if (!script.isEmpty()) {
            //ReusableMethods.waitForClickablility(ucmsAdminPage.script, 10);
            ReusableMethods.waitFor(1);
            jse.executeScript("arguments[0].click();", ucmsAdminPage.script);
            WebElement scriptSec = Driver.getDriver().findElement(By.xpath("//span[text()='" + script + "']"));
            ReusableMethods.waitForClickablility(scriptSec, 10);
            scriptSec.click();
        }
    }

    //Aya göre İş Zamanlayıcı Ekleme
    @And("Ay Tab'ına geçer")
    public void ayTabInaGeçer() {
        ucmsAdminPage.ayTab.click();
    }

    @And("Ay combosundan değer {int} girer")
    public void ayCombosundanDeğerGirer(int ayGir) {
        Select select = new Select(ucmsAdminPage.ayGir);
        select.selectByIndex(ayGir);
    }

    @And("Gün combosunda deger {int} girer")
    public void günCombosundaDegerGirer(int ayIcinGun) {
        Select select = new Select(ucmsAdminPage.ayIcinGunGir);
        select.selectByIndex(ayIcinGun);
    }

    @And("Saat combosunda değer {int} girer")
    public void saatCombosundaDeğerGirer(int ayIcinSaat) {
        Select select = new Select(ucmsAdminPage.ayIcinSaatGir);
        select.selectByIndex(ayIcinSaat);
    }

    @And("Dakika combosunda değer {int} girer")
    public void dakikaCombosundaDeğerGirer(int ayIcinDakika) {
        Select select = new Select(ucmsAdminPage.ayIcinDakikaGir);
        select.selectByIndex(ayIcinDakika);
    }

    @And("Saniye combosunda değer {int} girer")
    public void saniyeCombosundaDeğerGirer(int ayIcinSaniye) {
        Select select = new Select(ucmsAdminPage.ayIcinSaniyeGir);
        select.selectByIndex(ayIcinSaniye);
    }

    //Haftaya göre İş Zamanlayıcı Ekleme
    @And("Hafta Tab'ına geçer")
    public void haftaTabInaGeçer() {
        ucmsAdminPage.haftaTab.click();
    }

    @And("Bir gün {string} seçer")
    public void birGünSeçer(String haftaIcinGun) {
        WebElement haftaIcinGunSec = Driver.getDriver().findElement(By.xpath("//label[contains(text(),'" + haftaIcinGun + "')]"));

        if (haftaIcinGun.equals("Pazartesi")) {

        } else {
            ucmsAdminPage.pazartesi.click();
            haftaIcinGunSec.click();
        }
    }

    @And("Saat combosundan değer {int} girer")
    public void saatCombosundanDeğerGirer(int haftaIcinSaat) {
        Select select = new Select(ucmsAdminPage.haftaIcinSaatGir);
        select.selectByIndex(haftaIcinSaat);
    }

    @And("Dakika combosundan değer {int} girer")
    public void dakikaCombosundanDeğerGirer(int haftaIcinDakika) {
        Select select = new Select(ucmsAdminPage.haftaIcinDakikaGir);
        select.selectByIndex(haftaIcinDakika);
    }

    @And("Saniye combosundan değer {int} girer")
    public void saniyeCombosundanDeğerGirer(int haftaIcinSaniye) {
        Select select = new Select(ucmsAdminPage.haftaIcinSaniyeGir);
        select.selectByIndex(haftaIcinSaniye);
    }

    //Güne göre İş Zamanlayıcı Ekleme
    @And("Gün Tab'ına geçer")
    public void günTabInaGeçer() {
        ucmsAdminPage.gunTab.click();
    }

    @And("Gün combosunda deger {int} seçer")
    public void günCombosundaDegerSeçer(int gun) {
        Select select = new Select(ucmsAdminPage.gunGir);
        select.selectByIndex(gun);
    }

    @And("Saat combosunda değer {int} seçer")
    public void saatCombosundaDeğerSeçer(int gunIcinSaat) {
        Select select = new Select(ucmsAdminPage.gunIcinSaatGir);
        select.selectByIndex(gunIcinSaat);
    }

    @And("Dakika combosunda değer {int} seçer")
    public void dakikaCombosundaDeğerSeçer(int gunIcinDakika) {
        Select select = new Select(ucmsAdminPage.gunIcinDakikaGir);
        select.selectByIndex(gunIcinDakika);
    }

    @And("Saniye combosunda değer {int} seçer")
    public void saniyeCombosundaDeğerSeçer(int gunIcinSaniye) {
        Select select = new Select(ucmsAdminPage.gunIcinSaniyeGir);
        select.selectByIndex(gunIcinSaniye);
    }

    //Saate Göre İş Zamanlayıcı Ekleme
    @And("Saat Tab'ına geçer")
    public void saatTabInaGeçer() {
        ucmsAdminPage.saatTab.click();
    }

    @And("Saat combosundan değer {int} seçer")
    public void saatCombosundanDeğerSeçer(int saat) {
        Select select = new Select(ucmsAdminPage.saatGir);
        select.selectByIndex(saat);
    }

    @And("Saniye combosundan deger {int} seçer")
    public void saniyeCombosundanDegerSeçer(int saatIcinSaniye) {
        Select select = new Select(ucmsAdminPage.saatIcinSaniyeGir);
        select.selectByIndex(saatIcinSaniye);
    }

    //Dakikaya Göre İş Zamanlayıcı Ekleme
    @And("Dakika tabını geçer")
    public void dakikaTabınıGeçer() {
        ucmsAdminPage.dakikaTab.click();
    }

    @And("Dakika combosundan değer {int} seçer")
    public void dakikaTabınıSeçipDakikaCombosundanDeğerSeçer(int dakika) {
        Select select = new Select(ucmsAdminPage.dakikaGir);
        select.selectByIndex(dakika);
    }

    @And("Saniye combosundan değer {int} seçer")
    public void saniyeCombosundanDeğerSeçer(int saniye) {
        Select select = new Select(ucmsAdminPage.saniyeGir);
        select.selectByIndex(saniye);
    }

    @Then("Kaydın eklenip eklenmedigini doğrular")
    public void kaydınEklendiğiniDoğrular() {
        if (isZamanlayiciAdi.isEmpty()) {

            Assert.assertTrue(ucmsAdminPage.isAdiBosGecilemezPopUp.isDisplayed());

        } else if (scriptAdi.isEmpty()) {

            Assert.assertTrue(ucmsAdminPage.scriptAdiBosGecilemezPopUp.isDisplayed());

        } else if ((isZamanlayiciAdi.isEmpty() && scriptAdi.isEmpty())) {

            Assert.assertTrue(ucmsAdminPage.isAdiBosGecilemezPopUp.isDisplayed());

        } else {

            Assert.assertTrue(ucmsAdminPage.isZamanlayiciEklendiPopUp.isDisplayed());
            //Başarılı şekilde eklendi uyarısı çıkmadığı için şimdilik bu popup ile doğrulama yapılıyor
        }
    }


    @And("Listelenen planlanmış işlerden herhangi biri için {string} Bir Kere Çalıştır iconuna tıklar")
    public void listelenenPlanlanmışIşlerdenHerhangiBiriIçinBirKereÇalıştırIconunaTıklar(String planlananIs) {


        By elementSelector = By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'OneTimeTrigger')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement planlanmisIsZamanlayici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'OneTimeTrigger')]"));
                planlanmisIsZamanlayici.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }


    }

    @Then("Çalıştırıldı yazan bilgilendirme pop up ının gelmesi beklenir.")
    public void çalıştırıldıYazanBilgilendirmePopUpInınGelmesiBeklenir() {
        ReusableMethods.waitForVisibility(ucmsAdminPage.planlanmisIsiCasitirPopUp, 10);
        Assert.assertTrue(ucmsAdminPage.planlanmisIsiCasitirPopUp.isDisplayed());
    }

    @And("Pop uptaki Kapat butonu kullanılarak pop up kapatılır.")
    public void popUptakiKapatButonuKullanılarakPopUpKapatılır() {
        ucmsAdminPage.popupKapat.click();
    }

    //İş Zamanlayıcı-listelenen Planlanmış işi Durdur iconu kullanarak durdurma
    @And("Listelenen planlanmış işlerden herhangi biri için {string} planlanmış işi durdur iconuna tıklar")
    public void listelenenPlanlanmışIşlerdenHerhangiBiriIçinPlanlanmışIşiDurdurIconunaTıklar(String planlananIs) {

        By elementSelector = By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'Resume')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement planlanmisIsZamanlayici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'Resume')]"));
                planlanmisIsZamanlayici.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }

    }

    @Then("Zamanlanan İş Durduruldu yazan bilgilendirme pop up ının gelmesi beklenir.")
    public void zamanlananİşDurdurulduYazanBilgilendirmePopUpInınGelmesiBeklenir() {
        //ReusableMethods.waitForVisibility(ucmsAdminPage.zamanlananIsDurdurulduPopUp, 10);
        Assert.assertTrue(ucmsAdminPage.zamanlananIsDurdurulduPopUp.isDisplayed());
    }

    @And("İşlem yapılan planlanmış iş için kırmızı olan Durdur iconunun yeşil Çalıştırmaya Devam Et iconuna dönüşmesi beklenir.")
    public void işlemYapılanPlanlanmışIşIçinKırmızıOlanDurdurIconununYeşilÇalıştırmayaDevamEtIconunaDönüşmesiBeklenir() {
        //ReusableMethods.waitForVisibility(ucmsAdminPage.calistirmayaDevamEtIcon, 10);
        Assert.assertTrue(ucmsAdminPage.calistirmayaDevamEtIcon.isDisplayed());
    }

    //İş Zamanlayıcı-listelenen Planlanmış işi Çalıştırmaya devam et iconu kullanarak bir kez çalıştırma
    @Then("Durdurulmuş İş Tekrar Çalıştırıldı yazan bilgilendirme pop up ının gelmesi beklenir.")
    public void durdurulmuşİşTekrarÇalıştırıldıYazanBilgilendirmePopUpInınGelmesiBeklenir() {
        Assert.assertTrue(ucmsAdminPage.durdurulanIşTekrarÇalıştırıldıPopUp.isDisplayed());
    }

    @And("İşlem yapılan planlanmış iş için yeşil olan Çalıştırmaya Devam Et iconunun kırmızı Durdur iconuna dönüşmesi beklenir.")
    public void işlemYapılanPlanlanmışIşIçinYeşilOlanÇalıştırmayaDevamEtIconununKırmızıDurdurIconunaDönüşmesiBeklenir() {
        Assert.assertTrue(ucmsAdminPage.durdurIcon.isDisplayed());
    }

    //İş Zamanlayıcı-listelenen Planlanmış işi Güncelleme
    @And("Listelenen planlanmış işlerden herhangi biri için {string} Düzenle iconuna tıklanır")
    public void listelenenPlanlanmışIşlerdenHerhangiBiriIçinDüzenleIconunaTıklanır(String planlananIs) {

        By elementSelector = By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'OneTimeTrigger')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement planlanmisIsZamanlayici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'Edit')]"));
                planlanmisIsZamanlayici.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }

    }

    @And("Açılan modalda İş adı alanına var olan bir işin ismi {string} girilir")
    public void açılanModaldaİşAdıAlanınaVarOlanBirIşinIsmiGirilir(String varOlanIs) {

        ucmsAdminPage.isAdi.clear();
        ucmsAdminPage.isAdi.sendKeys(varOlanIs);
    }

    @Then("Eklemeye çalıştığınız iş aynı bilgilerle önceden oluşturulmuştur uyarısını görür")
    public void eklemeyeÇalıştığınızIşAynıBilgilerleÖncedenOluşturulmuştur() {
        Assert.assertTrue(ucmsAdminPage.ayniIsimdeIsOlusturulduPopUp.isDisplayed());
    }

    @Then("Planlanmış iş güncellendi yazısını görür.")
    public void planlanmışIşGüncellendiYazısınıGörür() {

        Assert.assertTrue(ucmsAdminPage.planlanmisIsGuncellendiPopUp.isDisplayed());

    }

    //İş Zamanlayıcı-listelenen Planlanmış işi Silme
    @And("Listelenen planlanmış işlerden çalışan bir iş için {string} Çöp kutusu iconuna tıklanır")
    public void listelenenPlanlanmışIşlerdenÇalışanBirIşIçinÇöpKutusuIconunaTıklanır(String planlananIs) {

        By elementSelector = By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'OneTimeTrigger')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement planlanmisIsZamanlayici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + planlananIs + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
                planlanmisIsZamanlayici.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("planlanan iş silindi uyarısını görür.")
    public void planlananIşSilindiUyarısınıGörür() {
        Assert.assertEquals(ucmsAdminPage.planlanmisIsSilindiPopUp.size(), 1);
    }

    @Then("planlanan iş silindi uyarısını görmez.")
    public void planlananIşSilindiUyarısınıGörmez() {
        Assert.assertEquals(ucmsAdminPage.planlanmisIsSilindiPopUp.size(), 0);
    }

    @And("Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir tıklanır.")
    public void açılanSayfadaDevreDışıBırakılanlarToggleIAktifEdilirTıklanır() {

        ucmsAdminPage.taskSchedulerDevreDisiBirakIkon.click();
    }

    @And("Silinen planlanmış işlerden herhangi biri için {string} Aktif et iconuna tıklanır")
    public void silinenPlanlanmışIşlerdenHerhangiBiriIçinAktifEtIconunaTıklanır(String silinenIs) {

        By elementSelector = By.xpath("//td[contains(text(),'" + silinenIs + "')]//following-sibling::td[contains(@class,'Edit')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 5);

                // Element görünürse tıklama yapın
                WebElement planlanmisIsZamanlayici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + silinenIs + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Aktif Et')]"));
                planlanmisIsZamanlayici.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Silinen planlanmış işin {string} aktif edildiği ve listelendiği görülür.")
    public void silinenPlanlanmışIşinAktifEdildiğiVeListelendiğiGörülür(String silinenIs) {
        List<WebElement> planlanmisIsZamanlayici = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + silinenIs + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
        Assert.assertEquals(planlanmisIsZamanlayici.size(), 1);
    }

    //İş Zamanlayıcı-listelenen Planlanmış işi Arama
    @And("İçerik ara kısmına aramak istediği iş adını {string} girer")
    public void içerikAraKısmınaAramakIstediğiIşAdınıGirer(String planlananIs) {
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(isZamanlayiciAdi);
    }

    @And("İçerik ara kısmına aramak istediği işin scriptini {string} girer")
    public void içerikAraKısmınaAramakIstediğiIşinScriptiniGirer(String planlanaIsScriptAdi) {
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(scriptAdi);
    }

    @And("Aradığı işin listede olduğunu doğrular")
    public void aradığıIşinListedeOlduğunuDoğrular() {
        WebElement planlananIs = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + scriptAdi + "')]"));
        Assert.assertTrue(planlananIs.isDisplayed());
    }

    //Task Scheduler-Log menüsü-Log Arama
    @And("Log sekmesine tıklar")
    public void logSekmesineTıklar() {
        ucmsAdminPage.logMenu.click();
    }

    @And("İş adı searchBoxına aramak istediği logun iş adını {string} girer")
    public void işAdıSearchBoxınaAramakIstediğiLogunIşAdınıGirer(String log) {

        ucmsAdminPage.logIsAdiSearchBox.sendKeys(log);

    }

    @And("Filtre butonuna tıklar")
    public void filtreButonunaTıklar() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.logFiltrele.click();
    }

    @Then("Aradığı {string} log'un olduğunu doğrular")
    public void aradığıLogUnOlduğunuDoğrular(String log) {
        WebElement logAdi = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + log + "')]"));
        Assert.assertTrue(logAdi.isDisplayed());
    }

    @And("İş adı searchBoxına aramak istediği logun oluşturanı {string} girer")
    public void işAdıSearchBoxınaAramakIstediğiLogunOluşturanıGirer(String olusturan) {
        ucmsAdminPage.logIsOlusturanSearchBox.sendKeys(olusturan);
        ReusableMethods.waitFor(1);
    }

    @And("Başlangıç {string} ve bitiş {string} tarihini seçer")
    public void başlangıçVeBitişTarihiniSeçer(String baslangicTarihi, String bitisTarihi) {
        ucmsAdminPage.logBaslangicTarihi.sendKeys(baslangicTarihi);
        ReusableMethods.waitFor(1);
        ucmsAdminPage.logBitisTarihi.sendKeys(bitisTarihi);

    }

    @Then("Belirtilen tarih aralığındaki Logların listelendiğini görür")
    public void belirtilenTarihAralığındakiLoglarınListelendiğiniGörür() {


    }

    @And("Sıfırla butonuna tıklar")
    public void sıfırlaButonunaTıklar() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.logSifirla.click();
    }

    @Then("Yapılan filtreleme işleminin kaldırlıdığını görür")
    public void yapılanFiltrelemeIşlemininKaldırlıdığınıGörür() {

    }

    @And("Başlangıç tarihi sıfırlama ikonuna tıklar")
    public void başlangıçTarihiSıfırlamaIkonunaTıklar() {
        ucmsAdminPage.logBaslangicTarihiSifirla.click();
    }

    @And("Bitiş tarihi sıfırlama ikonuna tıklar")
    public void bitişTarihiSıfırlamaIkonunaTıklar() {
        ucmsAdminPage.logBitisTarihiSifirla.click();
    }

    @And("Logları {string} sıralama butonuna tıklar")
    public void loglarıSıralamaButonunaTıklar(String log) {

        switch (log) {
            case "İş Adı":
                ucmsAdminPage.logIsAdiSirala.click();
                break;
            case "Oluşturan":
                ucmsAdminPage.logOlusturanSirala.click();
                break;
            case "Log":
                ucmsAdminPage.logSirala.click();
                break;

            case "Tarih":
                ucmsAdminPage.logTarihSirala.click();
                break;
            default:
        }
    }

    @Then("Logların {string} göre sıralandığını görür")
    public void loglarınGöreSıralandığınıGörür(String log) {
        switch (log) {
            case "İş Adı":
                Assert.assertTrue(ucmsAdminPage.logIsAdiSiralaDogrula.isDisplayed());
                break;

            case "Oluşturan":
                Assert.assertTrue(ucmsAdminPage.logOlusturanSiralaDogrula.isDisplayed());
                break;

            case "Log":
                Assert.assertTrue(ucmsAdminPage.logSiralaDogrula.isDisplayed());
                break;

            case "Tarih":
                Assert.assertTrue(ucmsAdminPage.logTarihSiralaDogrula.isDisplayed());
                break;

            default:
        }
    }

    //Task Scheduler-Script Tanımı menüsü-Script Ekleme
    @And("Script Tanımı sekmesine tıklar")
    public void scriptTanımıSekmesineTıklar() {
        ucmsAdminPage.scriptTanimiMenu.click();
    }

    @And("Script adı alanına değer {string} girilir")
    public void scriptAdıAlanınaDeğerGirilir(String scriptAd) {

        if (scriptAd.isEmpty()) {
            ucmsAdminPage.yeniScriptscriptAdi.click();
            ReusableMethods.waitFor(1);
            ucmsAdminPage.yeniScriptscriptAdi.clear();
            ReusableMethods.waitFor(1);
            scriptName = scriptAd;
            ucmsAdminPage.yeniScriptscriptAdi.sendKeys(scriptName);

        } else {
            ucmsAdminPage.yeniScriptscriptAdi.click();
            ReusableMethods.waitFor(1);
            ucmsAdminPage.yeniScriptscriptAdi.clear();
            scriptName = scriptAd + Faker.instance().idNumber().ssnValid();
            ucmsAdminPage.yeniScriptscriptAdi.sendKeys(scriptName);
        }
    }

    @And("Script adı alanına var olan değer {string} girilir")
    public void scriptAdıAlanınaVarOlanDeğerGirilir(String scriptAd) {

        ucmsAdminPage.yeniScriptscriptAdi.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.yeniScriptscriptAdi.clear();
        ucmsAdminPage.yeniScriptscriptAdi.sendKeys(scriptAd);
    }

    @And("Bağlantı combosundan bir bağlantı {string} seçilir")
    public void bağlantıCombosundanBirBağlantıSeçilir(String baglantı) {

        if (baglantı.isEmpty()) {

        } else {
            ReusableMethods.waitFor(1);
            ucmsAdminPage.yeniScriptbaglanti.click();
            WebElement baglanti = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + baglantı + "')]"));
            baglanti.click();
        }
    }

    @And("Komut zaman aşımı alanına değer {string} girilir")
    public void komutZamanAşımıAlanınaDeğerGirilir(String wait) {
        ucmsAdminPage.yeniScriptkomutZamanAsimi.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.yeniScriptkomutZamanAsimi.clear();
        ucmsAdminPage.yeniScriptkomutZamanAsimi.sendKeys(wait);
    }

    @And("Script alanına değer {string} girilir")
    public void scriptAlanınaDeğerGirilir(String script) {
        ucmsAdminPage.yeniScriptScript.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.yeniScriptScript.clear();
        ucmsAdminPage.yeniScriptScript.sendKeys(script);
    }

    @Then("Scriptin kaydedildigini dogrular")
    public void scriptinKaydedildiginiDogrular() {
        Assert.assertTrue(ucmsAdminPage.scriptEklendiPopUp.isDisplayed());
    }

    @Then("Script adı boş bırakılamaz uyarısı geldiği görülür")
    public void scriptAdıBoşBırakılamazUyarısıGeldiğiGörülür() {
        Assert.assertTrue(ucmsAdminPage.scriptAdiBosGecilemezPopUp.isDisplayed());
    }

    @Then("Bağlantı boş bırakılamaz uyarısı geldiği görülür")
    public void bağlantıBoşBırakılamazUyarısıGeldiğiGörülür() {
        Assert.assertTrue(ucmsAdminPage.baglantiBosGecilemezPopUp.isDisplayed());
    }

    @Then("Komut zaman aşımı boş bırakılamaz uyarısı geldiği görülür")
    public void komutZamanAşımıBoşBırakılamazUyarısıGeldiğiGörülür() {

        Assert.assertTrue(ucmsAdminPage.komutZamanAsimiBosGecilemezPopUp.isDisplayed());
    }

    @Then("Script boş bırakılamaz uyarısı geldiği görülür")
    public void scriptBoşBırakılamazUyarısıGeldiğiGörülür() {
        Assert.assertTrue(ucmsAdminPage.ScriptAlaniBosGecilemezPopUp.isDisplayed());
    }

    @Then("Script adı mevcut uyarısı geldiği görülür")
    public void scriptAdıMevcutUyarısıGeldiğiGörülür() {

        Assert.assertTrue(ucmsAdminPage.scriptAdiAyniPopUp.isDisplayed());
    }

    @Then("Girilen değerin yazılmadığı görülür")
    public void girilenDeğerinYazılmadığıGörülür() {

        Assert.assertTrue(ucmsAdminPage.komutZamanAsimiBos.isDisplayed());
    }

    //Task Scheduler-Script Tanımı menüsü-Script Düzenleme
    @And("Listeden bir kaydın {string} düzenle ikonuna tıklar")
    public void listedenBirKaydınDüzenleIkonunaTıklar(String script) {

        By elementSelector = By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Edit')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement scriptEdit = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Edit')]"));
                scriptEdit.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Güncelleme işleminin yapıldığını doğrular")
    public void güncellemeIşlemininYapıldığınıDoğrular() {

        Assert.assertTrue(ucmsAdminPage.ScriptBasariylaGuncellendiPopUp.isDisplayed());
    }

    //Task Scheduler-Script Tanımı menüsü-Script Silme
    @And("Listeden bir kaydın {string} sil ikonuna tıklar")
    public void listedenBirKaydınSilIkonunaTıklar(String script) {
        By elementSelector = By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Delete')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement scriptDelete = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
                scriptDelete.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Script tanımının {string} listeden sildiğini doğrular")
    public void scriptTanımınınListedenSildiğiniDoğrular(String script) {
        List<WebElement> silinenScript = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Delete')]//preceding-sibling::mat-icon[contains(@mattooltip,'Aktif Et')]"));
        Assert.assertEquals(silinenScript.size(), 1);
        //Assert.assertTrue(ucmsAdminPage.scriptSilindiPopUp.isDisplayed());
    }

    @Then("Script tanımının listeden silinmediğini doğrular")
    public void scriptTanımınınListedenSilinmediğiniDoğrular() {
        Assert.assertEquals(ucmsAdminPage.scriptSilinmediPopUp.size(), 0);
    }

    //Task Scheduler-Script Tanımı menüsü-Script Aktif Etme
    @And("Listeden silinmiş bir kaydın {string} aktif et ikonuna tıklar")
    public void listedenSilinmişBirKaydınAktifEtIkonunaTıklar(String script) {
        By elementSelector = By.xpath("//td[contains(text(),'" + script + "')]//following-sibling::td[contains(@class,'Delete')]");
        while (true) {
            try {
                // Elementin görünmesini 10 saniye boyunca bekleyin
                ReusableMethods.waitForVisibility(elementSelector, 10);

                // Element görünürse tıklama yapın
                WebElement scriptActive = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Aktif Et')]"));
                scriptActive.click();

                // İşlem tamamlandı, döngüyü sonlandırın
                break;
            } catch (Exception e) {
                // Element görünmediği durumda buraya düşer, bir sonraki sayfaya geçebilirsiniz
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Silinen {string} Script tanımının aktif edildiğini doğrular")
    public void scriptTanımınınAktifEdildiğiniDoğrular(String script) {
        List<WebElement> activeScript = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + scriptName + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
        Assert.assertEquals(activeScript.size(), 1);
    }
}
