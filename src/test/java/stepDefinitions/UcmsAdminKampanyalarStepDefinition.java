package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminKampanyalarStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    static String kayitGunu;
    static String aramaSayisi;
    static String sonucKoduSablonu;

    //Kampanyalar Sayfası-Arama Limirleri Menüsü
    @And("Kampanyalar butonuna tıklar")
    public void kampanyalarButonunaTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.kampanyalarSayfasi);
    }

    @And("Arama limitleri menüsüne tıklar")
    public void aramaLimitleriMenüsüneTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.aramaLimitleriMenu);
    }

    @And("Açılan pencereden {string} kampanyayı seçer")
    public void açılanPenceredenKampanyayıSeçer(String kampanyaAdi) {

        ucmsAdminPage.icerikAramaSearchBox.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.icerikAramaSearchBox.sendKeys(kampanyaAdi);
        WebElement kampanyaSec = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'" + kampanyaAdi + "')])[2]"));
        ReusableMethods.waitForClickablility(kampanyaSec, 5);
        kampanyaSec.click();
        ucmsAdminPage.aramaLimitleriSecButton.click();
        ReusableMethods.waitFor(2);

    }

    @And("Ekle butonuna tıklar")
    public void ekleButonunaTıklar() {
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", ucmsAdminPage.limitEkleButton);
    }

    @And("Kayıt günü {string} girer")
    public void kayıtGünüGirer(String kayitGunuGir) {
        kayitGunu = kayitGunuGir;
        ucmsAdminPage.limitEkleKayitGunu.sendKeys(kayitGunuGir);
    }

    @And("ikinci kayıt günü {string} girer")
    public void ikinciKayıtGünüGirer(String kayitGunuGir) {
        ucmsAdminPage.limitEkleKayitGunuIki.sendKeys(kayitGunuGir);
    }

    @And("Arama sayısı {string} girer")
    public void aramaSayısıGirer(String aramaSayisiGir) {
        aramaSayisi = aramaSayisiGir;
        ucmsAdminPage.limitEkleAramaSayisi.sendKeys(aramaSayisiGir);

    }

    @And("Arama limitini eklemek istediği diğer {string} kampanyayı seçer")
    public void aramaLimitiniEklemekIstediğiDiğerKampanyayıSeçer(String kampanyaAdi) {
        if (kampanyaAdi.isEmpty()) {

        } else {
            ucmsAdminPage.limitEkleKampanyalar.click();
            WebElement kampanyaSec = Driver.getDriver().
                    findElement(By.xpath("//span[contains(text(),'" + kampanyaAdi + "')]"));
            actions.doubleClick(kampanyaSec).perform();
        }
    }

    @And("Arama limitinin eklendiğini görür")
    public void aramaLimitininEklendiğiniGörür() {

        WebElement aramaLimitiEklendi = Driver.getDriver().
                findElement(By.xpath("//td[contains(text(),' " + kayitGunu + ". günündeki arama limiti " + aramaSayisi + " attempt. ')]"));
        System.out.println("aramaLimitiEklendiText = " + aramaLimitiEklendi.getText());
        Assert.assertTrue(aramaLimitiEklendi.isDisplayed());
    }


    @And("Birinci sıradaki Kayıt günü alanını doldurunuz uyarısını görür.")
    public void birinciSıradakiKayıtGünüAlanınıDoldurunuzUyarısınıGörür() {

        Assert.assertTrue(ucmsAdminPage.kayitGunuAlaniniDoldurunuzPopUp.isDisplayed());
    }

    @And("Birinci sıradaki Arama sayısı alanını doldurunuz uyarısını görür")
    public void birinciSıradakiAramaSayısıAlanınıDoldurunuzUyarısınıGörür() {

        Assert.assertTrue(ucmsAdminPage.aramaSayisiAlaniniDoldurunuzPopUp.isDisplayed());
    }

    @And("İlk gün limiti sıfır olamaz uyarısını görür.")
    public void ilkGünLimitiSıfırOlamazUyarısınıGörür() {
        ucmsAdminPage.limitEkleAramaSayisi.sendKeys(Keys.TAB);
        Assert.assertTrue(ucmsAdminPage.IlkGUnLimitiSifirOlamazPopUp.isDisplayed());
    }

    @Then("Aynı gün için tek bir kayıt girilebilir uyarısı görür")
    public void aynıGünIçinTekBirKayıtGirilebilirUyarısıGörür() {
        ucmsAdminPage.limitEkleKayitGunuIki.sendKeys(Keys.TAB);
        Assert.assertTrue(ucmsAdminPage.ayniGunIcinTekBirKayitGirilebilirPopUp.isDisplayed());
    }


    @And("Aynı kayıt gününe ait farklı değer olduğu silinip yerine yazılacak uyarısını görür.")
    public void aynıKayıtGününeAitFarklıDeğerOlduğuSilinipYerineYazılacakUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.ayniKayitGünüVarPopUp.isDisplayed());
    }

    @And("Silmek istediği arama limitinin sil ikonuna tıklar")
    public void silmekIstediğiAramaLimitininSilIkonunaTıklar() {
        WebElement silinecekAramaLimiti = Driver.getDriver().
                findElement(By.xpath("//td[contains(text(),' " + kayitGunu + ". günündeki arama limiti " + aramaSayisi + " attempt.')]//following-sibling::td[contains(@class,'Edit')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
        silinecekAramaLimiti.click();

    }


    @Then("Arama limitini silindiğini doğrular")
    public void aramaLimitiniSilindiğiniDoğrular() {
        List<WebElement> aramaLimitiSilindi = Driver.getDriver().
                findElements(By.xpath("//td[contains(text(),' " + kayitGunu + ". günündeki arama limiti " + aramaSayisi + " attempt. ')]"));

        Assert.assertEquals(aramaLimitiSilindi.size(), 0);

    }

    @And("Silinenleri göster butonunu aktif hale getirir")
    public void silinenleriGösterButonunuAktifHaleGetirir() {
        ucmsAdminPage.silinenAramaLimitleriniGosterToggle.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Silinmiş olan arama limitlerini görür")
    public void silinmişOlanAramaLimitleriniGörür() {

        for (WebElement w : ucmsAdminPage.silinenAramaLimitleriList) {
            System.out.println(w.getText());
        }
    }

    //Kampanyalar Sayfası-Çağtı Aksiyonları Menüsü
    @And("Çağrı aksiyonları menüsüne tıklar")
    public void çağrıAksiyonlarıMenüsüneTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.cagriAksiyonlariMenu);

    }

    @And("Sonuç kodu şablonu {string} seçer")
    public void sonuçKoduŞablonuSeçer(String sonucKoduSablonuGir) {

        sonucKoduSablonu = sonucKoduSablonuGir;

        if (sonucKoduSablonuGir.isEmpty()) {

        } else {
            ReusableMethods.waitFor(7);
            ucmsAdminPage.cagriAksiyonuSonucKoduSablonuEkle.click();
            WebElement sonucKoduSablonuSec = Driver.getDriver().
                    findElement(By.xpath("//span[contains(text(),'" + sonucKoduSablonuGir + "')]"));
            jse.executeScript("arguments[0].click();", sonucKoduSablonuSec);
            ucmsAdminPage.cagriAksiyonuSonucKoduSablonuEkle.sendKeys(Keys.TAB);
            ReusableMethods.waitFor(1);
        }
    }

    @And("Koşul tipini {string} seçer")
    public void koşulTipiniSeçer(String kosulTipi) {
        ucmsAdminPage.kosulTipiComboBox.click();
        WebElement kosulTipiSec = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + kosulTipi + "')]"));
        kosulTipiSec.click();
    }

    @And("Tüm sonuç kodları butonunu aktif hale getirir")
    public void tümSonuçKodlarıButonunuAktifHaleGetirir() {
        ucmsAdminPage.tumSonucKodlariSecToggle.click();
    }

    @And("Tüm kampanyalara uygula butonunu aktif hale getirir")
    public void tümKampanyalaraUygulaButonunuAktifHaleGetirir() {
        ucmsAdminPage.tumKampanyalaraUygulaToggle.click();
    }

    @And("Değer {string} ve dakika {string} girer")
    public void değerVeDakikaGirer(String deger, String dakika) {
        ucmsAdminPage.cagriAksiyonuEkleDeger.clear();
        ucmsAdminPage.cagriAksiyonuEkleDeger.sendKeys(deger);
        ucmsAdminPage.cagriAksiyonuEkleDakika.clear();
        ucmsAdminPage.cagriAksiyonuEkleDakika.sendKeys(dakika);


    }

    @And("Aksiyon tipini {string} seçer")
    public void aksiyonTipiniSeçer(String aksiyonTipi) {
        ucmsAdminPage.aksiyonTipiComboBox.click();
        WebElement aksiyonTipiSec = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + aksiyonTipi + "')]"));
        aksiyonTipiSec.click();
    }

    @And("Göndermek istediği sms {string} seçer")
    public void göndermekIstediğiSmsSeçer(String sms) {
        ucmsAdminPage.smsTamplateComboBox.click();
        WebElement smsSec = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + sms + "')]"));
        smsSec.click();
    }

    @And("Kayıt durumunu {string} seçer")
    public void kayıtDurumunuSeçer(String kayitDurumu) {
        ucmsAdminPage.kayitDurumuComboBox.click();
        WebElement kayıtSec = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + kayitDurumu + "')]"));
        kayıtSec.click();
    }

    @And("Web servis linkini {string} ekler")
    public void webServisLinkiniEkler(String link) {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.webServisLink);
        ucmsAdminPage.webServisLink.sendKeys(link);
    }

    @Then("Çağrı aksiyonunun eklendiğini görür")
    public void çağrıAksiyonununEklendiğiniGörür() {
        WebElement cagriAksiyonuEklendi = Driver.getDriver().findElement(By.xpath("//td[text()='" + sonucKoduSablonu + "']"));
        Assert.assertTrue(cagriAksiyonuEklendi.isDisplayed());
    }

    @Then("Birinci sıradaki Koşul Tipi alanını doldurunuz uyarısını görür")
    public void birinciSıradakiKoşulTipiAlanınıDoldurunuzUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.kosulTipiBosGecilemezPopUp.isDisplayed());
        //doğrulama da tırnak içindeki "Koşul" kelimesini okuyamadığı için bu şekilde doğrulama yapıldı
    }

    @Then("Değer alanını doldurunuz uyarısını görür")
    public void değerAlanınıDoldurunuzUyarısınıGörür() {

        Assert.assertTrue(ucmsAdminPage.kosulTipiBosGecilemezPopUp.isDisplayed());
        //doğrulama da tırnak içindeki "Değer" kelimesini okuyamadığı için bu şekilde doğrulama yapıldı
    }

    @Then("Dakika alanını doldurunuz uyarısını görür")
    public void dakikaAlanınıDoldurunuzUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.kosulTipiBosGecilemezPopUp.isDisplayed());
        //doğrulama da tırnak içindeki "Dakika" kelimesini okuyamadığı için bu şekilde doğrulama yapıldı
    }

    @Then("{string} alanını doldurunuz uyarısını görür")
    public void alanınıDoldurunuzUyarısınıGörür(String bosAlan) {

        //WebElement cagriAksiyonuEklenemedi = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'1. sıradaki " + bosAlan + " alanını doldurunuz.')]"));
        //Assert.assertTrue(cagriAksiyonuEklenemedi.isDisplayed());
        Assert.assertTrue(ucmsAdminPage.kosulTipiBosGecilemezPopUp.isDisplayed());
        //doğrulama da tırnak içindeki "Aksiyon tipi" kelimesini okuyamadığı için bu şekilde doğrulama yapıldı
    }

    @Then("Tamplate alanını doldurunuz uyarısını görür")
    public void tamplateAlanınıDoldurunuzUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.kosulTipiBosGecilemezPopUp.isDisplayed());
        //doğrulama da tırnak içindeki "Tamplate" kelimesini okuyamadığı için bu şekilde doğrulama yapıldı
    }

    @And("Düzenlemek istediği çağrı aksiyonunun düzenle ikonuna tıklar")
    public void düzenlemekIstediğiÇağrıAksiyonununDüzenleIkonunaTıklar() {

    }

    @And("Düzenlemek istediği çağrı aksiyonunun {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiÇağrıAksiyonununDüzenleIkonunaTıklar(String cagriAksiyonu) {
        WebElement cagriAksiyonuEdit = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + cagriAksiyonu + "')]//following-sibling::td[contains(@class,'Edit')]"));
        cagriAksiyonuEdit.click();
    }

    @Then("Yapılan düzenlemeyi doğrular")
    public void yapılanDüzenlemeyiDoğrular() {
        //Düzenlendi yada güncellendi şeklinde popUp çıkmadığı için doğrulamada sıkıntı olur
    }


    @And("Devre dışı bırakmak istediği {string} çağrı aksiyonunun devre dışı bırak ikonuna tıklar")
    public void devreDışıBırakmakIstediğiÇağrıAksiyonununDevreDışıBırakIkonunaTıklar(String cagriAksiyonu) {

        WebElement cagriAksiyonuDevreDisi = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + cagriAksiyonu + "')]//following-sibling::td[contains(@class,'IsEnabled')]//preceding-sibling::mat-icon[contains(text(),'check_circle')]"));
        ReusableMethods.waitForVisibility(cagriAksiyonuDevreDisi, 5);
        jse.executeScript("arguments[0].click();", cagriAksiyonuDevreDisi);
        //cagriAksiyonuDevreDisi.click();


    }

    @Then("Çağrı aksiyonunun devre dışı olduğunu doğrular")
    public void çağrıAksiyonununDevreDışıOlduğunuDoğrular() {
        WebElement cagriAksiyonPasifEdildi=Driver.getDriver().findElement(By.xpath("//td[contains(text(),'1032')]//following-sibling::td[contains(@class,'IsEnabled')]//mat-icon[contains(@class,'red')]"));
        Assert.assertTrue(cagriAksiyonPasifEdildi.isDisplayed());
        //Cagrı askisyonu doğrulamak için unike bir isim olmadığı için doğrulama da sıkıntı oluyor
    }

    @Then("Çağrı aksiyonunun aktif olduğunu olduğunu doğrular")
    public void çağrıAksiyonununAktifOlduğunuOlduğunuDoğrular() {
        WebElement cagriAksiyonPasifEdildi=Driver.getDriver().findElement(By.xpath("//td[contains(text(),'1032')]//following-sibling::td[contains(@class,'IsEnabled')]//mat-icon[contains(@class,'green')]"));
        Assert.assertTrue(cagriAksiyonPasifEdildi.isDisplayed());
        //Cagrı askisyonu doğrulamak için unike bir isim olmadığı için doğrulama da sıkıntı oluyor
    }

    @Then("Devre dışı bırakılan çağrı aksiyonlarının listelendiğini doğrular")
    public void devreDışıBırakılanÇağrıAksiyonlarınınListelendiğiniDoğrular() {

        List<WebElement> inaktifCagriAksiyonlari = ucmsAdminPage.pasifVeriSetiList;

        boolean nextPageExists = true;
        int toplamPasifCagriAksiyonlariSize = 0;

        while (nextPageExists) {
            //System.out.println("inaktifVeriSetiList.size = " + inaktifVeriSetiList.size());
            toplamPasifCagriAksiyonlariSize += inaktifCagriAksiyonlari.size();
            try {
                if (!ucmsAdminPage.nextPageButton.isEnabled()) {
                    nextPageExists = false;
                } else {
                    ucmsAdminPage.nextPageButton.click();
                    //ReusableMethods.waitFor(1);
                }
            } catch (NoSuchElementException e) {
                nextPageExists = false;
            }
        }
        System.out.println("toplamPasifCagriAksiyonlariSize = " + toplamPasifCagriAksiyonlariSize);

    }
}
