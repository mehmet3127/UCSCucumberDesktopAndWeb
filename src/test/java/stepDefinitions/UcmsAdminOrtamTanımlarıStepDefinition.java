package stepDefinitions;

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

public class UcmsAdminOrtamTanımlarıStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    //Ortam Tanımları-Çıkış Numaraları-Çıkış Numarası ekleme
    @And("Ortam Tanımları butonuna tıklar")
    public void ortamTanımlarıButonunaTıklar() {
        ucmsAdminPage.ortamTanimlariSayfasi.click();
    }

    @And("Çıkış Numaraları sekmesine tıklar")
    public void çıkışNumaralarıSekmesineTıklar() {
        ucmsAdminPage.cikisNumaralariMenu.click();
    }

    @And("Açılan ekle modalına telefon {string} no girer")
    public void açılanEkleModalınaEnFazlaKarakterOlacakŞekildeTelefonNoGirer(String telNo) {
        ucmsAdminPage.cikisNumaralariTelNo.clear();
        ucmsAdminPage.cikisNumaralariTelNo.sendKeys(telNo);
    }

    @Then("Telefon numarası eklendi uyarısını görür")
    public void telefonNumarasıEklendiYarısınıGörür() {
        Assert.assertEquals(ucmsAdminPage.telefonNumarasiEklendiPopUp.size(), 1);
    }

    @Then("Telefon numarası boş geçilemez uyarısını görür")
    public void telefonNumarasıBoşGeçilemezUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.telefonNumarasiBosGecilemezPopUp.isDisplayed());
    }

    @Then("Aynı telefon numarasyla zaten bir kayıt var uyarısını görür")
    public void aynıTelefonNumarasylaZatenBirKayıtVarUyarısınıGörür() {
        ucmsAdminPage.ayniTelNoVarPopUp.isDisplayed();
    }

    @Then("Modalın kapandığı ve ekleme yapılmadığı görülür.")
    public void modalınKapandığıVeEklemeYapılmadığıGörülür() {

        Assert.assertEquals(ucmsAdminPage.telefonNumarasiEklendiPopUp.size(), 0);
    }

    //Ortam Tanımları-Çıkış Numaraları-Çıkış Numarası ekleme
    @And("Var olan bir çıkış numarasının {string} düzenle iconuna tıklanır")
    public void varOlanBirÇıkışNumarasınınDüzenleIconunaTıklanır(String telNo) {

        By elementSelector = By.xpath("//td[contains(text(),'" + telNo + "')]//following-sibling::td[contains(@class,'Edit')]");
        while (true) {
            try {
                ReusableMethods.waitForVisibility(elementSelector, 10);
                WebElement telNoEdit = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + telNo + "')]//following-sibling::td[contains(@class,'Edit')]"));
                telNoEdit.click();
                break;
            } catch (Exception e) {
                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Telefon numarası güncellendi uyarısını görür")
    public void telefonNumarasıGüncellendiUyarısınıGörür() {
        Assert.assertEquals(ucmsAdminPage.telefonNumarasiGuncellendiPopUp.size(), 1);

    }

    @And("Var olan bir çıkış numarasının {string} sil iconuna tıklanır")
    public void varOlanBirÇıkışNumarasınınSilIconunaTıklanır(String telNo) {
        By elementSelector = By.xpath("//td[contains(text(),'" + telNo + "')]//following-sibling::td[contains(@class,'Delete')]");
        while (true) {
            try {
                ReusableMethods.waitForVisibility(elementSelector, 10);
                WebElement scriptDelete = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + telNo + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
                scriptDelete.click();
                break;
            } catch (Exception e) {

                ucmsAdminPage.nextPageButton.click();
            }
        }
    }

    @Then("Çıkış numarasının {string} silindiği dogrular")
    public void çıkışNumarasınınSilindiğiDogrular(String telNo) {
        ReusableMethods.waitFor(1);
        List<WebElement> telNoDelete = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + telNo + "')]"));
        Assert.assertEquals(telNoDelete.size(), 0);

    }

    @Then("Çıkış numarasının {string} silinmediği dogrular")
    public void çıkışNumarasınınSilinmediğiDogrular(String telNo) {
        List<WebElement> telNoDelete = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + telNo + "')]"));
        Assert.assertEquals(telNoDelete.size(), 1);
    }
}
