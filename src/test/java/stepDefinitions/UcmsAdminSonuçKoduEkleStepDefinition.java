package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminSonuçKoduEkleStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    static String eklenenSonucKoduName;
    static WebElement eklenenkodGrubu;
    static String eklenenKodGrubuName;
    Actions actions = new Actions(Driver.webDriver());

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

        eklenenSonucKoduName = sonuçKoduBaşlık;

        if (sonuçKoduBaşlık.equals("")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu1")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu2")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu3")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu4")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu5")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu6")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu7")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu8")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu9")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu10")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu11")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu12")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu13")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu14")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu15")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu16")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu17")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu18")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu19")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu20")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu21")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu22")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu23")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu24")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu25")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu26")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu27")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu28")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu29")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu30")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu31")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu32")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu33")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu34")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu35")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu36")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu37")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu38")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu39")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu40")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu41")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu42")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu43")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }

        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu44")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarisiz.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu45")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu46")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu47")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdilemedi.click();
        }
        if (sonuçKoduBaşlık.equals("sonuçKoduOtomasyonu48")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.yalnızcaÇağrıyıKapat.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.basarili.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasildi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat" ve Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuMüşteriAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat" ve Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuTelefonAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ReusableMethods.waitFor(2);
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuMüşteriVeBuTelefonAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuMüşteriVeBuKampanyaİçinAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuTelefonVeBuKampanyaİçinAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "kaydı kapat", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın", "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("KaraListeDNC-BuTelefonBuMüşteriVeBuKampanyaİçinAranmasın01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.kaydıKapat.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin" Randevu Özellikleri "Otomatik Kişisel Randevu" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("RandevuyuSistemBelirlesinOtomatikKişiselRandevu")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin" Randevu Özellikleri "Otomatik Kişisel Randevu" "Bir Sonraki Konraki Kontağa Geç"ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("RandevuyuSistemBelirlesinOtomatikKişiselRandevuBirSonrakiKonrakiKontağaGeç")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", "Bu Kontağı Arama Sıralamasından Çıkart" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("RandevuyuSistemBelirlesinOtomatikKişiselRandevuBirSonrakiKonrakiKontağaGeçBuKontağıAramaSıralamasındanÇıkart")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn01")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn02")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn04")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn06")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn07")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Kara Liste (DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn05")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn08")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn09")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn10")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn11")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn12")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn13")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn14")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn15")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn16")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn17")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn18")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Kişisel Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn19")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikKişiselRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn20")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn21")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", "Bu Kontağı Arama Sıralamasından Çıkart" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn22")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn23")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn24")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn25")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn26")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn27")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Kara Liste (DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn28")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("10");
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn29")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn30")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn31")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn32")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn33")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn34")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn35")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn36")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn37")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn38")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn39")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Sistem Belirlesin", Randevu Özellikleri "Otomatik Grup Randevu" Sonraki arama davranışı "Bir Sonraki Kontağa Geç" ve "Bu Kontağı Arama Sıralamasından Çıkart", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn40")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuSistemBelirlesin.click();
            ucmsAdminPage.randevuTipi.click();
            ucmsAdminPage.otomatikGrupRandevu.click();
            ucmsAdminPage.randevuÖzellikleriDakika.sendKeys("35");
            ucmsAdminPage.birSonrakiKontağaGeç.click();
            ucmsAdminPage.buKontağıAramaSıralamasındanÇıkart.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn41")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve  Kara Liste(DNC) "Bu telefon aranmasın"  ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn42")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn43")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn44")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn45")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın", "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn46")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin" ve Randevu Özellikleri "Kişisel Randevu Verebilir" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn47")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.grupRandevusuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup randevuyu kaldır.
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn48")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir" ve Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn49")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn50")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn51")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn52")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın", "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn53")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin" ve Randevu Özellikleri "Grup Randevusu Verebilir" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn54")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ucmsAdminPage.kişiselRandevuVerebilir.click(); //defoult olarak ikiside seçili geldiği için grup kişisel randevuyu kaldır.
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn55")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu telefon aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn56")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu telefon aranmasın"  ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn57")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu müşteri aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn58")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir", Kara Liste(DNC) "Bu telefon aranmasın" ve "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn59")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin", Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir",  Kara Liste(DNC) "Bu müşteri aranmasın", "Bu telefon aranmasın", "Bu kampanya için aranmasın" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn60")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();//Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.karaListeBuMüşteriAranmasın.click();
            ucmsAdminPage.karaListeBuTelefonAranmasın.click();
            ucmsAdminPage.karaListeBuKampanyaİçinAranmasın.click();
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }
        //Aksiyon tipi "Randevuyu Agent Belirlesin" ve Randevu Özellikleri "Kişisel Randevu Verebilir" ve "Grup Randevusu Verebilir" ile sonuç kodu ekleme
        if (sonuçKoduBaşlık.equals("otmsyn61")) {
            ucmsAdminPage.sonucKoduBaslik.sendKeys(sonuçKoduBaşlık);
            ucmsAdminPage.actionTipiCombo.click();
            ucmsAdminPage.randevuyuAgentBelirlesin.click();
            ReusableMethods.waitFor(1); //Defoult olarak Kişisel ve Grup randevu seçili geldiği için seçilmedi
            ucmsAdminPage.genelOzelliklerTab.click();
            ucmsAdminPage.basariDurumuComboBox.click();
            ucmsAdminPage.kriterDisi.click();
            ucmsAdminPage.musteriyeUlasilmaDurumuComboBox.click();
            ucmsAdminPage.musteriyeUlasilamadi.click();
            ucmsAdminPage.musteriyeTemasDurumuComboBox.click();
            ucmsAdminPage.musteriyeTemasEdildi.click();
        }

    }

    @And("Sonuç kodunun eklendiğini görür")
    public void sonuçKodununEklendiğiniGörür() {

        Assert.assertTrue(ucmsAdminPage.sonucKoduEklendiPopup.isDisplayed());

        /*
        //Sonuç kodu eklendiğini doğrulamak için PopUp cıkmadığı durumlarda 2.Yol

        Driver.webDriver().navigate().refresh();
        ucmsAdminPage.icerikAramaSearchBox.click();
        ucmsAdminPage.icerikAramaSearchBox.sendKeys(eklenenSonucKoduName);
        WebElement eklenenSonucKodu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenSonucKoduName + "')]"));
        ReusableMethods.waitForVisibility(eklenenSonucKodu,10);
        Assert.assertTrue(eklenenSonucKodu.isDisplayed());
        */
    }

}
