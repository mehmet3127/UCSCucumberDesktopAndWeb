package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminVeriSetleriStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String dosyaYolu;
    static String silenecekVeriAdi;
    static String indirilecekDosyaAdı;
    static String arananVeriAdi;
    static String veriSetiŞablonAdı;
    static String güncelVeriSetiŞablonAdi;


    //Veri Setler-İlişkili Veriler Veri Ekleme Steps
    @And("Veri setleri butonuna tıklar")
    public void veriSetleriButonunaTıklar() {
        ucmsAdminPage.verilerSetleriSekmesi.click();

    }

    @And("İlişkili veriler sekmesine tıklar")
    public void ilişkiliVerilerSekmesineTıklar() {
        ucmsAdminPage.ilişkiliVerilerMenü.click();

    }

    @And("Ekle ıkonuna  tıklar")
    public void ekleIkonunaTıklar() {
        /*
        String dosyaYolu = System.getProperty("user.home") + "C:\\Users\\demir\\Bolge-Il-Ilce (2) (1).xlsx";
        ReusableMethods.waitFor(1);
        ucmsAdminPage.veriEkleİkon.sendKeys(dosyaYolu);
        ReusableMethods.waitFor(3);
        */
        ucmsAdminPage.veriEkleİkon.click();
    }

    @And("Bir dosya {string} seçer")
    public void BirDosyayıSeçer(String path) {
        // Dosya yolunu kopyalama ve yapıştırma işlemi için Robot sınıfını kullanma
        dosyaYolu = path;
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

    @And("Dosyanın eklendiğini {string} doğrular")
    public void dosyanınEklendiğiniDoğrular(String dosyaAdı) {

        WebElement actualDosyaAdi = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + dosyaAdı + "')]"));
        ReusableMethods.getScreenshot("veriEklemeHome");
        ReusableMethods.getScreenshotWebElement("excel", actualDosyaAdi);
        System.out.println("dosyaAdi = " + actualDosyaAdi.getText());
        Assert.assertEquals(dosyaAdı, actualDosyaAdi.getText());

    }

    @And("Dosya formatının uygun olmadığı uyarısını doğrular")
    public void dosyaFormatınınUygunOlmadığıUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.uygunFormattaVeriEkleyinPoUp.isDisplayed());
    }

    @And("Bu dosya adında bir kayıt zaten var uyarısını doğrular")
    public void buDosyaAdındaBirKayıtZatenVarUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.aynıİsimdeVeriEklenemezPopup.isDisplayed());
    }

    //Veri Setler-İlişkili Veriler Veri Değişikliği Steps
    @And("Değiştirmek istediği verinin {string} düzenle ıkonuna  tıklar")
    public void değiştirmekIstediğiVerininDüzenleIkonunaTıklar(String veriAdı) {
        WebElement degişecekVeriDüzenleIkon = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + veriAdı + "')]//following-sibling::td[contains(@class,'Edit')]"));
        degişecekVeriDüzenleIkon.click();
    }

    @And("Değişiklik yapmak istediğinizden eminmisiniz uyarısını onaylar")
    public void değişiklikYapmakIstediğinizdenEminmisinizUyarısınıOnaylar() {
        ucmsAdminPage.onayButton.click();
    }

    //Veri Setler-İlişkili Veriler Veri Silme Steps
    @And("Silmek istediği verinin {string} sil ikonuna tıklar")
    public void silmekIstediğiVerininSilIkonunaTıklar(String veriAdi) {
        silenecekVeriAdi = veriAdi;
        WebElement silinecekVeri = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + silenecekVeriAdi + "')]//following-sibling::td[contains(@class,'Remove')]"));
        silinecekVeri.click();
    }

    @And("Dosyayı silmek istediğinizden eminmisiniz uyarısını onaylar")
    public void dosyayıSilmekIstediğinizdenEminmisinizUyarısınıOnaylar() {
        ucmsAdminPage.onayButton.click();
    }

    @And("Dosyanın silindiğini doğrular")
    public void dosyanınSilindiğiniDoğrular() {
        ReusableMethods.waitFor(1);
        List<WebElement> silinecekVeri = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + silenecekVeriAdi + "')]"));

        ReusableMethods.getScreenshot("veriSilindi");

        System.out.println("silinecekVeri.size = " + silinecekVeri.size());
        Assert.assertEquals(silinecekVeri.size(), 0);
        if (silinecekVeri.size() == 0) {
            System.out.println("dosya silindi");
        } else System.out.println("dosya silinmedi");
        /*
        try {
            // Öğeyi bulmaya çalış
            WebElement actualDosyaAdi = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'Excel')]"));
            System.out.println("Element bulunamadı.");
        } catch (NoSuchElementException e) {
            System.out.println("Element bulundu.");
        }
       */
    }

    //Veri Setler-İlişkili Veriler Dosya indirme Steps
    @And("İndirmek istediği dosyanın {string} dosya indir ıkonuna tıklar")
    public void indirmekIstediğiDosyanınDosyaIndirIkonunaTıklar(String dosyaAdı) {
        indirilecekDosyaAdı = dosyaAdı;
        WebElement indirilecekDosya = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + indirilecekDosyaAdı + "')]//following-sibling::td[contains(@class,'Download')]"));
        indirilecekDosya.click();

    }

    @Then("Dosyanın indirildiğini doğrular")
    public void dosyanınIndirildiğiniDoğrular() {
        ReusableMethods.waitFor(5);
        // Örnek olarak, dosyanın indirildiği klasörü belirtmek için
        String downloadFolderPath = "C:\\Users\\demir\\Downloads";
        // Dosya adını belirleyin


        // Dosya yolu oluşturun
        String filePath = downloadFolderPath + "\\" + indirilecekDosyaAdı;

        // Dosya var mı yok mu kontrol edin

        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Dosya indirildi.");
        } else {
            System.out.println("Dosya indirilmedi.");
        }
    }

    //Veri Setler-İlişkili Veriler Veri Arama Steps
    @And("Var olan veri ismini {string} girer")
    public void varOlanVeriIsminiGirer(String veriAdi) {
        arananVeriAdi = veriAdi;
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(arananVeriAdi);

    }

    @Then("Var olan verinin olduğunu doğrular")
    public void varOlanVerininOlduğunuDoğrular() {
        WebElement arananVeri = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + arananVeriAdi + "')]"));
        Assert.assertTrue(arananVeri.isDisplayed());
        ReusableMethods.waitFor(1);

    }

    //Veri Setler-Veri Seti Şablonu Veri Seti Şablonu Ekleme
    @And("Veri seti şablonları sekmesine tıklar")
    public void veriSetiŞablonlarıSekmesineTıklar() {
        ucmsAdminPage.veriSetiŞablonlarıMenü.click();
    }

    @And("Veri seti şablonu ekleme ikonuna tıklar")
    public void veriSetiŞablonuEklemeIkonunaTıklar() {
        ucmsAdminPage.veriSetiŞablonuEkleİkon.click();
    }

    @And("Şablon adı {string} girer")
    public void şablonAdıGirer(String şablonAdı) {
        veriSetiŞablonAdı = şablonAdı;
        ucmsAdminPage.şablonAdı.sendKeys(şablonAdı);
    }

    @And("En az bir adet veri seti {string} seçer")
    public void enAzBirAdetFromAlanıSeçer(String formAdı) {

        WebElement formAlanı = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + formAdı + "')]"));

        actions.clickAndHold(formAlanı).moveToElement(ucmsAdminPage.veriSetTaşımaAlanı).release(ucmsAdminPage.veriSetTaşımaAlanı).build().perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Veri seti şablonunun eklendiğini doğrular")
    public void veriSetiŞablonununEklendiĞiniDoğrular() {
        List<WebElement> veriSetiŞablonuEklendiUyarısı = ucmsAdminPage.veriSetiŞablonuEklendiPopup;
        Assert.assertEquals(veriSetiŞablonuEklendiUyarısı.size(), 1);
    }

    @Then("Şablon adı boş bırakılamaz uyarısını doğrular")
    public void şablonAdıBoşBırakılamazUyarısınıDoğrular() {
        List<WebElement> şablonAdıBoşBırakılmazPopUp = ucmsAdminPage.şablonAdıBoşBırakılamazPopUp;
        Assert.assertEquals(şablonAdıBoşBırakılmazPopUp.size(), 1);
    }

    @Then("Bir veya birden fazla form alanı seçiniz uyarısnı doğrular")
    public void birVeyaBirdenFazlaFormAlanıSeçinizUyarısnıDoğrular() {
        List<WebElement> birdenFazlaFormAlanıSeçinizPopUp = ucmsAdminPage.formAlanıSeçinizPopUp;
        Assert.assertEquals(birdenFazlaFormAlanıSeçinizPopUp.size(), 1);
    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Düzenleme
    @And("Düzenlemek istediği veri seti şablonunun {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiVeriSetiŞablonununDüzenleIkonunaTıklar(String veriSetiŞablonu) {
        WebElement düzenlenecekVeriSetiŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + veriSetiŞablonAdı + "')]//following-sibling::td[contains(@class,'Edit')]"));
        düzenlenecekVeriSetiŞablonu.click();
    }

    @And("Açılan pencerede Şablon adını {string} değiştirir")
    public void açılanPenceredeŞablonAdınıDeğiştirir(String güncellenenŞablonAdı) {
        güncelVeriSetiŞablonAdi = güncellenenŞablonAdı;
        ucmsAdminPage.şablonAdı.clear();
        ucmsAdminPage.şablonAdı.sendKeys(güncelVeriSetiŞablonAdi);
    }

    @Then("Veri seti şablonunun güncellendiğini doğrular")
    public void veriSetiŞablonununGüncellendiğiniDoğrular() {

        List<WebElement> veriSetiŞablonuGüncellendiUyarısı = ucmsAdminPage.veriSetiŞablonuGüncellendiPopUp;
        Assert.assertEquals(veriSetiŞablonuGüncellendiUyarısı.size(), 1);
    }

    @And("Seçilen veri setlerini {string} iptal eder")
    public void seçilenVeriSetleriniIptalEder(String versiSeti) {
        WebElement formAlanı = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + versiSeti + "')]"));

        actions.clickAndHold(formAlanı).moveToElement(ucmsAdminPage.veriSetiAlanı).release(ucmsAdminPage.veriSetiAlanı).build().perform();
        ReusableMethods.waitFor(1);

    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Düzenleme
    @And("Aramak istediği veri seti şablonunun {string} ismini girer")
    public void aramakIstediğiVeriSetiŞablonununIsminiGirer(String aranacakŞablonAdı) {

        ReusableMethods.waitFor(1);
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(veriSetiŞablonAdı);
        ReusableMethods.waitFor(1);
    }

    @Then("Veri seti şablonunun olduğunu doğrular")
    public void veriSetiŞablonununOlduğunuDoğrular() {
        WebElement sonuçŞablonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + veriSetiŞablonAdı + "')]"));
        Assert.assertTrue(sonuçŞablonu.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Listeleme
    @Then("İnaktif veri seti şablonlarının listelendiği görülür")
    public void inaktifVeriSetiŞablonlarınınListelendiğiGörülür() {

        List<WebElement> inaktifVeriSetiŞablonları = ucmsAdminPage.pasifVeriSetiŞablonuList;

        boolean nextPageExists = true;
        int toplamPasifVeriSetiŞablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("inaktifVeriSetiŞablonları.size = " + inaktifVeriSetiŞablonları.size());
            toplamPasifVeriSetiŞablonuSize += inaktifVeriSetiŞablonları.size();
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
        System.out.println("toplamPasifVeriSetiŞablonuSize = " + toplamPasifVeriSetiŞablonuSize);

    }

    @Then("Yalnızca aktif veri seti şablonlarının listelendiği görülür")
    public void yalnızcaAktifVeriSetiŞablonlarınınListelendiğiGörülür() {
        List<WebElement> aktifVeriSetiŞablonları = ucmsAdminPage.aktifVeriSetiŞablonuList;

        boolean nextPageExists = true;
        int toplamAktifVeriSetiŞablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("aktifVeriSetiŞablonları.size = " + aktifVeriSetiŞablonları.size());
            toplamAktifVeriSetiŞablonuSize += aktifVeriSetiŞablonları.size();
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
        System.out.println("toplamAktifVeriSetiŞablonuSize = " + toplamAktifVeriSetiŞablonuSize);

    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Aktif-Pasif Etme
    @And("Aktif olan veri seti şablonunun {string} Aktif-Pasif et iconuna tıklanır")
    public void aktifOlanVeriSetiŞablonununPasifEtIconunaTıklanır(String pasifEdilecekVeriSetiŞablonu) {
        WebElement aktifEdilecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + güncelVeriSetiŞablonAdi + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitFor(1);
        aktifEdilecekSonuçŞablonu.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kayıt güncellendi yazısnı doğrular")
    public void kayıtGüncellendiYazısnıDoğrular() {
        List<WebElement> veriSetiŞablonuGüncellendiPopUp = ucmsAdminPage.verSetiŞablonuAktifPasifEtmePopup;
        Assert.assertEquals(veriSetiŞablonuGüncellendiPopUp.size(), 1);

    }
    @And("Pasif etmek istediği şablonun {string} checkboxına tıklar")
    public void pasifEtmekIstediğiŞablonunCheckboxınaTıklar(String veriSetiŞablonu) {
        WebElement pasifEdilecekVeriSetiŞablonu = Driver.getDriver().findElement(By.xpath("//td[text()='" + güncelVeriSetiŞablonAdi + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        pasifEdilecekVeriSetiŞablonu.click();
    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Versiyon Değiştirme
    @And("Güncellenen veri seti şablonunun {string} versiyon ikonuna tıklar")
    public void güncellenenVeriSetiŞablonununVersiyonIkonunaTıklar(String versiyonDeğişecekVeriSetiŞablonu) {

        WebElement versionDeğişecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'"+versiyonDeğişecekVeriSetiŞablonu+"')]//following-sibling::td[contains(@class,'History')]"));

        versionDeğişecekSonuçŞablonu.click();
    }
}
