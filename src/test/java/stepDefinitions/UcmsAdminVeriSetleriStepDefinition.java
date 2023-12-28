package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
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

public class UcmsAdminVeriSetleriStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String dosyaYolu;

    //Veri Setler-İlişkili Veriler Steps
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

    @And("Uygun formatta bir dosyayı {string} seçer")
    public void uygunFormattaBirDosyayıSeçer(String path) {
        // Dosya yolunu kopyalama ve yapıştırma işlemi için Robot sınıfını kullanma
        dosyaYolu = path;
        try {
            Robot robot = new Robot();
            StringSelection dosyaSelection = new StringSelection(dosyaYolu);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaSelection, null);

            // Ctrl + V (Yapıştırma) kombinasyonu ile dosya yolu eklemek için Robot'u kullanma
            ReusableMethods.waitFor(1);
            robot.keyPress(KeyEvent.VK_CONTROL);
            ReusableMethods.waitFor(1);
            robot.keyPress(KeyEvent.VK_V);
            ReusableMethods.waitFor(1);
            robot.keyRelease(KeyEvent.VK_V);
            ReusableMethods.waitFor(1);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            // Enter ile dosyayı seçme penceresini kapatma
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }


    }

    @And("Dosyanın eklendiğini {string} doğrular")
    public void dosyanınEklendiğiniDoğrular(String dosyaAdı) throws IOException {


        WebElement actualDosyaAdi = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'"+dosyaAdı+"')]"));
        ReusableMethods.getScreenshot("veriEklemeHome");
        ReusableMethods.getScreenshotWebElement("excel",actualDosyaAdi);
        System.out.println("dosyaAdi = " + actualDosyaAdi.getText());
        Assert.assertEquals(dosyaAdı, actualDosyaAdi.getText());


    }
}
