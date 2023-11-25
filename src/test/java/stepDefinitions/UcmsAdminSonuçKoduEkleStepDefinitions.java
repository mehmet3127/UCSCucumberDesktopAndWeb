package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminSonuçKoduEkleStepDefinitions {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    static String eklenenSonuçKoduName;
    static WebElement eklenenkodGrubu;
    static String eklenenKodGrubuName;
    Actions actions = new Actions(Driver.getDriver());

    @And("Kod grubunun sonuç kodu ekle ikonuna tıklar")
    public void kodGrubununSonuçKoduEkleIkonunaTıklar() {
        Driver.getDriver().navigate().refresh();
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'demir Test deneme')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSonuçKoduEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'demir Test deneme')]/following::button[@mattooltip='Sonuç Kodu Ekle']"));
        eklenenkodGrubuSonuçKoduEkle.click();
    }


    @And("Başlık kısmına isim {string} girer ve Aksiyon tipi-başarı durumu-müsteriye ulaşılma durumu-müşteriye temas durumunu seçer")
    public void başlıkKısmınaIsimGirerVeAksiyonTipiBaşarıDurumuMüsteriyeUlaşılmaDurumuMüşteriyeTemasDurumunuSeçer(String sonuçKoduBaşlık) {

        eklenenSonuçKoduName = sonuçKoduBaşlık;
        if (sonuçKoduBaşlık.equals("DemoOtomasyon01")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
            ucmsAdminPage.kaydetButton.click();

        }
        if (sonuçKoduBaşlık.equals("DemoOtomasyon02")){
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
            ucmsAdminPage.kaydetButton.click();

        }
        if (sonuçKoduBaşlık.equals("DemoOtomasyon03")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
            ucmsAdminPage.kaydetButton.click();
        }
    }

    @And("Sonuç kodunun eklendiğini görür")
    public void sonuçKodununEklendiğiniGörür() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
        ucmsAdminPage.içerikAramaSearchBox.click();
        ReusableMethods.waitFor(2);
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(eklenenSonuçKoduName);
        ReusableMethods.waitFor(2);
        WebElement eklenenSonuçKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonuçKoduName + "')]"));
        System.out.println("eklenenSonuçKodu.getText() = " + eklenenSonuçKodu.getText());
        Assert.assertTrue(eklenenSonuçKodu.isDisplayed());
    }
}
