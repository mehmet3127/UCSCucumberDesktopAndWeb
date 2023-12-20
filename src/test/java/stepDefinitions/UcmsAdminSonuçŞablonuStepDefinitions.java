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

import java.util.List;
import java.util.NoSuchElementException;

public class UcmsAdminSonuçŞablonuStepDefinitions {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String sonuçŞablonuName;

    //Sonuç Şablonu Ekleme Steps
    @And("Sonuç şablonları sekmesine tıklar")
    public void sonuçŞablonlarıSekmesineTıklar() {
        ucmsAdminPage.sonuçŞablonlarıMenü.click();
    }

    @And("Sonuç şablonu ekleme ıkonun tıklar")
    public void sonuçŞablonuEklemeIkonunTıklar() {
        ucmsAdminPage.sonuçŞablonuEkleIkon.click();
    }

    @And("Şablon adı girer")
    public void şablonAdıGirer() {
        sonuçŞablonuName = "SonuçŞablonuEklemeOtomasyon07";
        ucmsAdminPage.şablonAdı.sendKeys(sonuçŞablonuName);
    }

    @Then("Sonuç kodu seçiniz uyarısını doğrular")
    public void sonuçKoduSeçinizUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.sonuçKoduseçinizPopup.isDisplayed());
    }

    @And("Sonuç kodu seçer")
    public void sonuçKoduSeçer() {
        WebElement sonuçKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),' Çağrı Cevaplandı')]//preceding::button[@aria-label='toggle undefined']"));
        sonuçKoduKodGrubu.click();
        ReusableMethods.waitFor(2);
        WebElement sonuçKoduAltGrup = Driver.getDriver().findElement(By.xpath("//span[contains(text(),' Çağrı Kapatıcı')]//preceding::button[@aria-label='toggle undefined'][1]"));
        sonuçKoduAltGrup.click();
        ReusableMethods.waitFor(2);
        WebElement sonuçKoduSeç = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Farklı irtibat aranacak')]"));
        sonuçKoduSeç.click();
        ReusableMethods.waitFor(2);
        //jse.executeScript("arguments[0].click();",sonuçKoduSeç);
    }

    @Then("Sonuç şablonu eklendi yazısını doğrular")
    public void sonuçŞablonuEklendiYazısınıDoğrular() {
        List<WebElement> sonuçŞablonuEklendi = ucmsAdminPage.sonuçŞablonuEklendiPopup;
        Assert.assertEquals(sonuçŞablonuEklendi.size(), 1);

    }

    //Sonuç Şablonu İçerik Arama Steps
    @And("Var olan sonuç şablonunun ismini girer")
    public void varOlanSonuçŞablonununIsminiGirer() {
        ReusableMethods.waitFor(1);
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(sonuçŞablonuName);
        ReusableMethods.waitFor(1);
    }

    @And("Var olan sonuç şablonunun ıd sini girer")
    public void varOlanSonuçŞablonununIdSiniGirer() {
        ucmsAdminPage.içerikAramaSearchBox.sendKeys("20026");
        ReusableMethods.waitFor(1);
    }

    @Then("Var olan sonuç şablonunun olduğunu doğrular")
    public void varOlanSonuçŞablonununOlduğunuDoğrular() {
        WebElement sonuçŞablonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + sonuçŞablonuName + "')]"));
        Assert.assertTrue(sonuçŞablonu.isDisplayed());
        ReusableMethods.waitFor(1);

    }

    @Then("Id ile aranan sonuç şablonunun olduğunu doğrular")
    public void ıdIleArananSonuçŞablonununOlduğunuDoğrular() {
        WebElement sonuçŞablonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'20026')]"));
        Assert.assertTrue(sonuçŞablonu.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    //Sonuç Şablonu Düzenleme Steps
    @And("Düzenlemek istediği sonuç şablonunun {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiSonuçŞablonununDüzenleIkonunaTıklar(String şablonAdı) {

        WebElement düzenlenecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + şablonAdı + "')]//following-sibling::td[contains(@class,'Edit')]"));
        düzenlenecekSonuçŞablonu.click();

    }

    @And("Seçili olan sonuç kodu seçeneğini kaldırır")
    public void seçiliOlanSonuçKoduSeçeneğiniKaldırır() {
        WebElement sonuçKoduKodGrubu = Driver.getDriver().findElement(By.xpath("//span[contains(text(),' Çağrı Cevaplandı')]//preceding::button[@aria-label='toggle undefined']"));
        sonuçKoduKodGrubu.click();

        WebElement sonuçKoduAltGrup = Driver.getDriver().findElement(By.xpath("//span[contains(text(),' Çağrı Kapatıcı')]//preceding::button[@aria-label='toggle undefined'][1]"));
        sonuçKoduAltGrup.click();

        WebElement sonuçKoduSeç = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Farklı irtibat aranacak')]"));
        sonuçKoduSeç.click();

    }

    @And("Şablon adını {string} değiştirir")
    public void şablonAdınıDeğiştirir(String ŞablonAdı) {
        ucmsAdminPage.şablonAdı.clear();
        ucmsAdminPage.şablonAdı.sendKeys(ŞablonAdı);
        ReusableMethods.waitFor(2);
    }

    @And("Sonuç şablonu güncellendi yazısnı doğrular")
    public void sonuçŞablonuGüncellendiYazısnıDoğrular() {
        List<WebElement> sonuçŞablonuGüncellendiPopup = ucmsAdminPage.sonuçŞablonuGüncellendiPopup;
        Assert.assertEquals(sonuçŞablonuGüncellendiPopup.size(), 1);
    }

    //Sonuç Şablonşarı (Aktif-Pasif) Listeleme
    @And("Açılan sayfada devre dışı bırakılanlar toggle'ı aktif edilir")
    public void açılanSayfadaDevreDışıBırakılanlarToggleIAktifEdilir() {
        ucmsAdminPage.sonuçŞablonuDevreDışıBırakılanlar.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.sonuçŞablonuDevreDışıBırakılanlar.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.sonuçŞablonuDevreDışıBırakılanlar.click();


    }

    @And("İnaktif sonuç şablonları listelenir")
    public void inaktifSonuçŞablonlarıListelenir() {
        List<WebElement> inaktifSonuçŞablonları = ucmsAdminPage.pasifSonuçŞablonuList;

        boolean nextPageExists = true;
        int pasifSonuçŞablonuSize=0;

        while (nextPageExists) {
            System.out.println("inaktifSonuçŞablonları.size = " + inaktifSonuçŞablonları.size());
            pasifSonuçŞablonuSize+=inaktifSonuçŞablonları.size();
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
        System.out.println("pasifSonuçŞablonuSize = " + pasifSonuçŞablonuSize);

    }
}
