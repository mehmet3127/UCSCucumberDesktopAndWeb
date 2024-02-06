package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;

public class UcmsAdminSmsStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Actions actions = new Actions(Driver.getDriver());

    static String smsSablonAdi;

    @And("Sms butonuna tıklar")
    public void smsButonunaTıklar() {

        ucmsAdminPage.smsSekmesi.click();
    }

    @And("Şablonlar sekmesine tıklar")
    public void şablonlarSekmesineTıklar() {
        ucmsAdminPage.smsSablonlar.click();

    }

    @And("Sms şablonu ekle ikonuna tıklar")
    public void smsŞablonuEkleIkonunaTıklar() {
        ucmsAdminPage.sablonEkleIkon.click();
    }

    @And("Sms Şablon adı {string} girer")
    public void smsŞablonAdıGirer(String smsSablonAdiGir) {

        if (smsSablonAdiGir.isEmpty()) {
            smsSablonAdi = smsSablonAdiGir;
            ucmsAdminPage.alanAdı.sendKeys(smsSablonAdiGir);

        } else {
            smsSablonAdi = (smsSablonAdiGir + Faker.instance().idNumber().valid());
            smsSablonAdi = smsSablonAdi.replace("-", "");
            ucmsAdminPage.şablonAdı.clear();
            ucmsAdminPage.şablonAdı.sendKeys(smsSablonAdi);
        }


    }

    @And("Veri seti alanında eklemek istediği veri setini seçer")
    public void veriSetiAlanındaEklemekIstediğiVeriSetiniSeçer() {
    }

    @And("Şablon metni alanına on karakterden uzun bir metin girer")
    public void şablonMetniAlanınaOnKarakterdenUzunBirMetinGirer() {
        ucmsAdminPage.smsSablonuEklemeSablonMetni.sendKeys("Lütfen müsait olunca tekrar arayın...");
    }

    @Then("Sms şablonunun eklendiğini görür")
    public void smsŞablonununEklendiğiniGörür() {

        Assert.assertEquals(ucmsAdminPage.smsSablonuEklendiPopUp.size(), 1);
    }


}
