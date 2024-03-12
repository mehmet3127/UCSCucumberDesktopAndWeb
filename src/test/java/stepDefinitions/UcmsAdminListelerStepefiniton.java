package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminListelerStepefiniton {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();

    static String aramaKatagorisiSec;

    @And("Listeler butonuna tıklar")
    public void listelerButonunaTıklar() {
        ucmsAdminPage.listelerSekmesi.click();
    }

    @And("DNC sekmesine tıklar")
    public void dncSekmesineTıklar() {
        ucmsAdminPage.dncMenu.click();

    }

    @And("Açılan pencerede Manuel DNC Kaydı ekle tabına geçer")
    public void açılanPenceredeManuelDNCKaydıEkleTabınaGeçer() {
        ucmsAdminPage.manuelDncKaydiEkleTab.click();
        ucmsAdminPage.dncListeEkleSilTab.click();
        ucmsAdminPage.manuelDncKaydiEkleTab.click();
    }

    @And("CampId alanına {string} giriş yapar")
    public void campıdAlanınaGirişYapar(String campIdGir) {

        if (campIdGir.isEmpty()) {
            ucmsAdminPage.kampanyaId.sendKeys(campIdGir);
        } else {
            String campId = (campIdGir + ReusableMethods.randomİnt(100)).replaceAll("[^0-9]", "");
            ucmsAdminPage.kampanyaId.sendKeys(campId);
        }


    }

    @And("Telefon numarasına alanına {string} giriş yapar")
    public void telefonNumarasınaAlanınaGirişYapar(String telNoGir) {
        if (telNoGir.isEmpty()) {
            ucmsAdminPage.telefonNumarasi.sendKeys(telNoGir);
        } else {
            String telNo = (telNoGir + Faker.instance().phoneNumber().cellPhone()).replaceAll("[^0-9]", "");
            ucmsAdminPage.telefonNumarasi.sendKeys(telNo);
        }


    }

    @And("ClientId alanına {string} giriş yapar")
    public void clientıdAlanınaGirişYapar(String clientIdGir) {

        if (clientIdGir.isEmpty()) {
            ucmsAdminPage.clientId.sendKeys(clientIdGir);
        } else {
            String clientId = (clientIdGir + ReusableMethods.randomİnt(100)).replaceAll("[^0-9]", "");
            ucmsAdminPage.clientId.sendKeys(clientId);
        }

    }

    @Then("Manuel DNC Kaydı eklenip eklenmedigini doğrular")
    public void manuelDNCKaydıEklendiğiniDoğrular() {

        Assert.assertEquals(ucmsAdminPage.manuelDncKaydiEklendiPopUp.size(), 1);
    }

    @And("Arama katagorisinden {string} yu seçer")
    public void aramaKatagorisindenYuSeçer(String aramaKatagori) {
        aramaKatagorisiSec = aramaKatagori;
        ucmsAdminPage.aramaKatagorisi.click();
        WebElement aramaKatagorisi = Driver.getDriver().findElement(By.xpath("//span[text()='" + aramaKatagorisiSec + "']"));
        aramaKatagorisi.click();
    }

    @And("İçerik ara kısmına aramak istediği DNC in {string} sunu girer")
    public void içerikAraKısmınaAramakIstediğiDNCInSunuGirer(String data) {

        ucmsAdminPage.icerikAramaSearchBox.sendKeys(data);

    }

    @And("Ara butonuna tıklar")
    public void araButonunaTıklar() {

        ucmsAdminPage.araButton.click();

    }

    @And("Var olan DNC'in olduğunu görür")
    public void varOlanDNCInOlduğunuGörür() {
        WebElement aramaKatagorisi = Driver.getDriver().findElement(By.xpath("//span[text()='" + aramaKatagorisiSec + "']"));
        aramaKatagorisi.isDisplayed();

    }

    @And("Açılan pencerede dosya seç butonu ile {string} dosya seçilir")
    public void açılanPenceredeDosyaSeçButonuIleDosyaSeçilir(String path) {

        ucmsAdminPage.dosyaSecButton.sendKeys(path);
    }

    @And("İşlem combosunda DNC Liste ekle seçilir")
    public void işlemCombosundaDNCListeEkleSeçilir() {
        //ucmsAdminPage.dncListEkle.click();
    }

    @Then("DNC Kaydı eklenmediğini doğrular")
    public void dncKaydıEklenmediğiniDoğrular() {
        Assert.assertTrue(ucmsAdminPage.uygunOlmayanFormattaDncPopUp.isDisplayed());
    }

    @Then("Listedeki satırlar kadar DNC Kaydı eklendiğini doğrular")
    public void listedekiSatırlarKadarDNCKaydıEklendiğiniDoğrular() {

        Assert.assertTrue(ucmsAdminPage.dncListEkleniyorPopUp.isDisplayed());

    }

    @And("İşlem combosunda DNC Liste sil seçilir")
    public void işlemCombosundaDNCListeSilSeçilir() {
        ucmsAdminPage.dncListEkle.click();
        ucmsAdminPage.dncListSil.click();
    }

    @Then("Listedeki satırlar kadar DNC Kaydı silinğini doğrular")
    public void listedekiSatırlarKadarDNCKaydıSilinğiniDoğrular() {

        Assert.assertTrue(ucmsAdminPage.dncListSiliniyorPopUp.isDisplayed());
    }


}
