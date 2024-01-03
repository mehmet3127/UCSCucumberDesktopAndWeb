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
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminVeriSetleriStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String dosyaYolu;
    static String silenecekVeriAdi;

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
        //Assert.assertFalse(actualDosyaAdi.isDisplayed());
        //Assert.assertNotEquals(silenecekVeriAdi, actualDosyaAdi.getText());

        System.out.println("silinecekVeri.size = " + silinecekVeri.size());
        Assert.assertEquals(silinecekVeri.size(),0);
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
}
