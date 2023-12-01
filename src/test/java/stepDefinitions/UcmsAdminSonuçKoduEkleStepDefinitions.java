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
        eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'SonuçKoduOtomasyonu')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSonuçKoduEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'SonuçKoduOtomasyonu')]/following::button[@mattooltip='Sonuç Kodu Ekle']"));
        eklenenkodGrubuSonuçKoduEkle.click();
    }


    @And("Başlık kısmına isim {string} girer ve Aksiyon tipi-başarı durumu-müsteriye ulaşılma durumu-müşteriye temas durumunu seçer")
    public void başlıkKısmınaIsimGirerVeAksiyonTipiBaşarıDurumuMüsteriyeUlaşılmaDurumuMüşteriyeTemasDurumunuSeçer(String sonuçKoduBaşlık) {

        eklenenSonuçKoduName = sonuçKoduBaşlık;

        if (sonuçKoduBaşlık.equals("")) {
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
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu1")) {
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
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu2")) {
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
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu3")) {
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
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu4")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu5")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu6")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu7")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu8")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu9")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu10")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu11")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu12")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu13")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu14")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu15")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu16")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu17")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu18")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiKişiselRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu19")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu20")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu21")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu22")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu23")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu24")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipiComboBox.click();
            ucmsAdminPage.randevuTipiGrupRandevu.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu25")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu26")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu27")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu28")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu29")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu30")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu31")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu32")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu33")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu34")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu35")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu36")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu37")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu38")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu39")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu40")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.kriterDışı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu41")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu42")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu43")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu44")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarısız.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu45")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu46")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşılamadı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu47")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu48")) {
            ucmsAdminPage.SonuçKoduBaşlık.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelÖzelliklerTab.click();
            ucmsAdminPage.başarıDurumuComboBox.click();
            ucmsAdminPage.başarılı.click();
            ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
            ucmsAdminPage.müşteriyeUlaşıldı.click();
            ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.müşteriyeTemasEdildi.click();
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
        Assert.assertTrue(eklenenSonuçKodu.isDisplayed());
    }
}
