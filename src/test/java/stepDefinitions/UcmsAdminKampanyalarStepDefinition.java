package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminKampanyalarStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    static String kayitGunu;
    static String aramaSayisi;

    @And("Kampanyalar butonuna tıklar")
    public void kampanyalarButonunaTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.kampanyalarSayfasi);

    }

    @And("Arama limitleri menüsüne tıklar")
    public void aramaLimitleriMenüsüneTıklar() {
        //ucmsAdminPage.kampanyaSecButton.click();
        jse.executeScript("arguments[0].click();", ucmsAdminPage.aramaLimitleriMenu);

    }

    @And("Açılan pencereden arama limiti eklemek istediği {string} kampanyayı seçer")
    public void açılanPenceredenAramaLimitiEklemekIstediğiKampanyayıSeçer(String kampanyaAdi) {

        ucmsAdminPage.içerikAramaSearchBox.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(kampanyaAdi);
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

    @And("Sıfırdan büyük bir kayıt günü {string} girer")
    public void sıfırdanBüyükBirKayıtGünüGirer(String kayitGunuGir) {
        kayitGunu=kayitGunuGir;
        ucmsAdminPage.limitEkleKayitGunu.sendKeys(kayitGunuGir);
    }

    @And("Arama sayısı {string} girer")
    public void aramaSayısıGirer(String aramaSayisiGir) {
        aramaSayisi=aramaSayisiGir;
        ucmsAdminPage.limitEkleAramaSayisi.sendKeys(aramaSayisiGir);

    }

    @And("Arama limitini eklemek istediği diğer {string} kampanyayı seçer")
    public void aramaLimitiniEklemekIstediğiDiğerKampanyayıSeçer(String kampanyaAdi) {
        if (kampanyaAdi.isEmpty()) {

        } else {
            ucmsAdminPage.limitEkleKampanyalar.click();
            WebElement kampanyaSec = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + kampanyaAdi + "')]"));
            kampanyaSec.click();
        }

    }

    @And("Arama limitinin eklendiğini görür")
    public void aramaLimitininEklendiğiniGörür() {

        WebElement aramaLimitiEklendi =Driver.getDriver().
                findElement(By.xpath("//td[contains(text(),' "+kayitGunu+". günündeki arama limiti "+aramaSayisi+" attempt. ')]"));
        System.out.println("aramaLimitiEklendiText = " + aramaLimitiEklendi.getText());
        Assert.assertTrue(aramaLimitiEklendi.isDisplayed());

    }


}
