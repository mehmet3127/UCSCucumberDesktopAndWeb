package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminSmsStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());

    static String smsSablonAdi;
    static String guncelSmsSablonAdi;
    static String smsYaraticiId;
    static String smsYaraticiAdi;

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Ekleme Steps
    @And("Sms butonuna tıklar")
    public void smsButonunaTıklar() {

        ucmsAdminPage.smsSekmesi.click();
    }

    @And("Şablonlar sekmesine tıklar")
    public void şablonlarSekmesineTıklar() {
        ucmsAdminPage.smsSablonlar.click();

    }

    @And("Ekle ikonuna tıklar")
    public void ekleIkonunaTıklar() {
        ucmsAdminPage.ekleIkon.click();
    }

    @And("Sms Şablon adı {string} girer")
    public void smsŞablonAdıGirer(String smsSablonAdiGir) {

        if (smsSablonAdiGir.isEmpty()) {
            smsSablonAdi = smsSablonAdiGir;
            ucmsAdminPage.şablonAdı.sendKeys(smsSablonAdiGir);

        } else if (smsSablonAdiGir.contains("Güncel")) {
            guncelSmsSablonAdi = (smsSablonAdiGir + Faker.instance().idNumber().valid());
            guncelSmsSablonAdi = guncelSmsSablonAdi.replace("-", "");
            ucmsAdminPage.şablonAdı.clear();
            ucmsAdminPage.şablonAdı.sendKeys(guncelSmsSablonAdi);
        } else {
            smsSablonAdi = (smsSablonAdiGir + Faker.instance().idNumber().valid());
            smsSablonAdi = smsSablonAdi.replace("-", "");
            ucmsAdminPage.şablonAdı.clear();
            ucmsAdminPage.şablonAdı.sendKeys(smsSablonAdi);
        }
    }

    @And("Veri seti alanında eklemek istediği veri setini {string} seçer")
    public void veriSetiAlanındaEklemekIstediğiVeriSetiniSeçer(String veriSetiAdi) {

        ucmsAdminPage.smsSablonuEklemeVeriSeti.sendKeys(veriSetiAdi);

        WebElement eklenecekVeriSeti = Driver.getDriver().findElement(By.xpath("//span[text()='" + veriSetiAdi + "']"));

        ReusableMethods.waitForVisibility(eklenecekVeriSeti, 10);

        eklenecekVeriSeti.click();

    }

    @And("Şablon metni alanına bir metin {string} girer")
    public void şablonMetniAlanınaBirMetinGirer(String sablonMetni) {

        ucmsAdminPage.smsSablonuEklemeSablonMetni.sendKeys(sablonMetni);
    }

    @Then("Sms şablonunun eklendiğini görür")
    public void smsŞablonununEklendiğiniGörür() {

        Assert.assertEquals(ucmsAdminPage.smsSablonuEklendiPopUp.size(), 1);
    }

    @Then("Şablon metni alanına en az on karakter girilmeli uyarısını görür")
    public void şablonMetniAlanınaEnAzOnKarakterGirilmeliUyarısınıGörür() {

        Assert.assertEquals(ucmsAdminPage.sablonMetniOnKarakterOlmalıPopUp.size(), 1);
    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Arama Steps
    @And("Aramak istediği sms şablonunun {string} ismini girer")
    public void aramakIstediğiSmsŞablonununIsminiGirer(String arananSmsSablonu) {

        ucmsAdminPage.icerikAramaSearchBox.sendKeys(smsSablonAdi);

    }

    @And("Aramak istediği sms şablonunun id'sini girer")
    public void aramakIstediğiSmsŞablonununIdSiniGirer() {

        ucmsAdminPage.icerikAramaSearchBox.clear();
        WebElement smsSablonuId = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + smsSablonAdi + "')]//preceding-sibling::td[contains(@class,'Id mat-column-Id')]"));
        ucmsAdminPage.icerikAramaSearchBox.sendKeys(smsSablonuId.getText());
    }

    @And("Aranan sms şablonunun listede olduğunu doğrular")
    public void arananSmsŞablonununListedeOlduğunuDoğrular() {
        WebElement smsSablonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + smsSablonAdi + "')]"));
        ReusableMethods.waitForVisibility(smsSablonu, 10);
        Assert.assertTrue(smsSablonu.isDisplayed());
    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Düzenleme Steps
    @And("Düzenlemek istediği Sms şablonunun {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiSmsŞablonununDüzenleIkonunaTıklar(String güncellenecekSmsSablonu) {

        WebElement smsSablonuDuzenle = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + smsSablonAdi + "')]//following-sibling::td[contains(@class,'Edit')]"));
        smsSablonuDuzenle.click();
    }

    @And("Şablon metni alanında değişiklik {string} yapar")
    public void şablonMetniAlanındaDeğişiklikYapar(String guncelSablonMetni) {

        ucmsAdminPage.smsSablonuEklemeSablonMetni.click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.smsSablonuEklemeSablonMetni.clear();
        ucmsAdminPage.smsSablonuEklemeSablonMetni.sendKeys(guncelSablonMetni);
    }

    @And("Sms şablonunun güncellendiğini doğrular")
    public void smsŞablonununGüncellendiğiniDoğrular() {

        Assert.assertEquals(ucmsAdminPage.smsSablonuGuncellendiPopUp.size(), 1);
    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Listeleme Steps
    @Then("İnaktif SMS şablonları da listelenir.")
    public void inaktifSMSŞablonlarıDaListelenir() {
        List<WebElement> inaktifSmsSablonuList = ucmsAdminPage.pasifSmsSablonuList;

        boolean nextPageExists = true;
        int toplamPasifSmsSablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("inaktifSmsSablonuList.size = " + inaktifSmsSablonuList.size());
            toplamPasifSmsSablonuSize += inaktifSmsSablonuList.size();
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
        System.out.println("toplamPasifSmsSablonuSize = " + toplamPasifSmsSablonuSize);
    }

    @Then("Yalnızca Aktif Sms sablonlaeının listelenir")
    public void yalnızcaAktifSmsSablonlaeınınListelenir() {
        List<WebElement> aktifSmsSablonuSetiList = ucmsAdminPage.aktifSmsSablonuList;

        boolean nextPageExists = true;
        int toplamAktifSmsSablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("aktifSmsSablonuSetiList.size = " + aktifSmsSablonuSetiList.size());
            toplamAktifSmsSablonuSize += aktifSmsSablonuSetiList.size();
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
        System.out.println("toplamAktifSmsSablonuSize = " + toplamAktifSmsSablonuSize);
    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Aktif-Pasif Etme Steps
    @And("Sms Sablonunun {string} Aktif-Pasif et iconuna tıklanır")
    public void smsSablonununAktifPasifEtIconunaTıklanır(String aktifPasifSmsSablonu) {

        WebElement aktifEdilenVeriSeti = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + smsSablonAdi + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitForVisibility(aktifEdilenVeriSeti, 10);
        aktifEdilenVeriSeti.click();
    }

    @Then("Sms sablonunun aktif-pasif edildiği doğrulanır")
    public void smsSablonununAktifPasifEdildiğiDoğrulanır() {

        Assert.assertEquals(ucmsAdminPage.smsSablonuAktifPasifEdildPopUp.size(), 1);
    }

    @And("Aktif yada pasif etmek istediği sms sablonunun {string} checkboxına tıklar")
    public void aktifYadaPasifEtmekIstediğiSmsSablonununCheckboxınaTıklar(String aktifPasifSmsSablonu) {

        WebElement aktifPasifEdilecekSmsSablonu = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonAdi + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        aktifPasifEdilecekSmsSablonu.click();
    }

    @And("Aktif yada pasif etmek istediği sms sablonlarının {string} {string} checkboxına tıklar")
    public void aktifYadaPasifEtmekIstediğiSmsSablonlarınınCheckboxınaTıklar(String smsSablonu1, String smsSablonu2) {

        WebElement aktifPasifEdilecekSmsSablonu1 = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonu1 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        aktifPasifEdilecekSmsSablonu1.click();
        WebElement aktifPasifEdilecekSmsSablonu2 = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonu2 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        aktifPasifEdilecekSmsSablonu2.click();

    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Silme Steps
    @And("Silmek istediği sms sablonunun {string} checkboxına tıklar")
    public void silmekIstediğiSmsSablonununCheckBoxınaTıklar(String smsSablonu) {

        WebElement silinecekSmsSablonu = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonAdi + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        silinecekSmsSablonu.click();
    }

    @And("Silmek istediği sms sablonunun {string} {string} checkboxına tıklar")
    public void silmekIstediğiSmsSablonununCheckboxınaTıklar(String smsSablonu1, String smsSablonu2) {

        WebElement silinecekSmsSablonu1 = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonu1 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        silinecekSmsSablonu1.click();
        WebElement silinecekSmsSablonu2 = Driver.getDriver().findElement(By.xpath("//td[text()='" + smsSablonu2 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        silinecekSmsSablonu2.click();

    }

    @And("Sağ üst köşede beliren sil ikonuna tıklanır")
    public void sağÜstKöşedeBelirenSilIkonunaTıklanır() {

        ucmsAdminPage.silIkon.click();
    }

    @Then("Sms sablonunun silindiğini doğrular")
    public void smsSablonununSilindiğiniDoğrular() {

        Assert.assertEquals(ucmsAdminPage.smsSablonuSilindiPopUp.size(), 1);
    }

    @Then("Sms sablonunun silinmediğini doğrular")
    public void smsSablonununSilinmediğiniDoğrular() {
        Assert.assertEquals(ucmsAdminPage.smsSablonuSilindiPopUp.size(), 0);
    }

    //Sms Sayfası-Şablonlar Menüsü-Sms Şablonu Güncelleme(Düzenleme) Steps
    @And("Güncellenen sms sablonunun {string} versiyon ikonuna tıklar")
    public void güncellenenSmsSablonununVersiyonIkonunaTıklar(String smsSablonu) {
        WebElement versionDegisecekSmsSablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + guncelSmsSablonAdi + "')]//following-sibling::td[contains(@class,'History')]"));

        versionDegisecekSmsSablonu.click();
    }

    @And("Versiyonu geri al butonuna tıklar")
    public void versiyonuGeriAlButonunaTıklar() {

        ReusableMethods.waitForClickablility(ucmsAdminPage.versiyonuGeriAl, 10);
        ucmsAdminPage.versiyonuGeriAl.click();

    }

    @Then("Versiyon değiştiğini görür")
    public void versiyonDeğiştiğiniGörür() {

        Assert.assertEquals(ucmsAdminPage.versiyonGuncellendi.size(), 1);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi) {

        ReusableMethods.waitFor(beklemeSuresi);
    }

    //Sms Sayfası-Yaratıcı Menüsü-Sms Yaratıcı Oluşturma Steps
    @And("SMS Yaratıcı sekmesine tıklar")
    public void smsYaratıcıSekmesineTıklar() {
        ucmsAdminPage.smsSablonYaratici.click();
    }

    @And("Açılan ekranda Yaratıcı Id {string} ve Yaratıcı Adı {string} girer")
    public void açılanEkrandaYaratıcıIdVeYaratıcıAdıGirer(String yaraticiId, String yaraticiAdi) {

        if (yaraticiId.isEmpty()) {
            ucmsAdminPage.smsYaraticiId.clear();
            ucmsAdminPage.smsYaraticiId.sendKeys(yaraticiId);
            smsYaraticiId = yaraticiId;
        } else {
            ucmsAdminPage.smsYaraticiId.clear();
            smsYaraticiId = (yaraticiId + Faker.instance().idNumber().valid()).replace("-", "");
            ucmsAdminPage.smsYaraticiId.sendKeys(smsYaraticiId);
        }


        if (yaraticiAdi.isEmpty()) {
            ucmsAdminPage.smsYaraticiAdi.clear();
            ucmsAdminPage.smsYaraticiAdi.sendKeys(yaraticiAdi);
            smsYaraticiAdi = yaraticiAdi;
        } else {
            ucmsAdminPage.smsYaraticiAdi.clear();
            smsYaraticiAdi = yaraticiAdi + ReusableMethods.randomİnt(100);
            ucmsAdminPage.smsYaraticiAdi.sendKeys(smsYaraticiAdi);
        }
    }

    @Then("SMS Yaratıcı eklendiğini doğrular")
    public void smsYaratıcıEklendiğiniDoğrular() {

        if (smsYaraticiId.isEmpty() || smsYaraticiAdi.isEmpty()) {

            Assert.assertEquals(ucmsAdminPage.smsYaraticiOlusturulduPopUp.size(), 0);

        } else {

            Assert.assertEquals(ucmsAdminPage.smsYaraticiOlusturulduPopUp.size(), 1);
        }

    }

    //Sms Sayfası-Yaratıcı Menüsü-Sms Yaratıcı Güncelleme(Düzenleme) Steps
    @And("Güncelle butonuna tıklar.")
    public void güncelleButonunaTıklar() {

        ucmsAdminPage.smsGuncelleButton.click();
    }

    @And("Düzenlemek istediği Sms yaratıcı {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiSmsYaratıcıDüzenleIkonunaTıklar(String smsYaratici) {

        WebElement smsYaraticDuzenle = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + smsYaraticiId + "')]//following-sibling::td[contains(@class,'Edit')]"));
        smsYaraticDuzenle.click();
    }

    @Then("SMS güncellendiğini eklendiğini doğrular")
    public void smsGüncellendiğiniEklendiğiniDoğrular() {


        if (smsYaraticiId.isEmpty() || smsYaraticiAdi.isEmpty()) {

            Assert.assertEquals(ucmsAdminPage.smsYaraticiGuncellendiPopUp.size(), 0);

        } else {

            Assert.assertEquals(ucmsAdminPage.smsYaraticiGuncellendiPopUp.size(), 1);
        }
    }

    //Sms Sayfası-Yaratıcı Menüsü-Sms Yaratıcı Silme Step
    @And("Silmek istediği Sms yaratıcının {string} sil ikonuna tıklar")
    public void silmekIstediğiSmsYaratıcınınSilIkonunaTıklar(String smsYaratici) {

        WebElement silinecekSmsYaratici = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + smsYaraticiId + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
        silinecekSmsYaratici.click();
    }

    @Then("Sms yaratıcı nın silindiğini doğrular")
    public void smsYaratıcıNınSilindiğiniDoğrular() {
        ReusableMethods.waitFor(1);
        List<WebElement> smsSablonu = Driver.getDriver().findElements(By.xpath("//*[contains(text(),'" + smsYaraticiId + "')]"));
        Assert.assertEquals(smsSablonu.size(), 0);

    }
}
