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
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;


public class UcmsAdminVeriSetleriStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();

    Actions actions = new Actions(Driver.getDriver());
    static String dosyaYolu;
    static String silenecekVeriAdi;
    static String indirilecekDosyaAdı;
    static String arananVeriAdi;
    static String veriSetiŞablonAdı;
    static String güncelVeriSetiŞablonAdi;
    static String veriTipiSeçeneği;
    static String formAlanTipiSeçeneği;
    static int eklenecekVeriSayısı;
    static int maxVeriUzunlugu;
    static String anahtarDeger;
    static String görünenDeger;
    static String alanAdi;
    static String etiketAdi;
    static String dbAdi;


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

        System.out.println("silinecekVeri.size = " + silinecekVeri.size());
        Assert.assertEquals(silinecekVeri.size(), 0);
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

    //Veri Setler-İlişkili Veriler Dosya indirme Steps
    @And("İndirmek istediği dosyanın {string} dosya indir ıkonuna tıklar")
    public void indirmekIstediğiDosyanınDosyaIndirIkonunaTıklar(String dosyaAdı) {
        indirilecekDosyaAdı = dosyaAdı;
        WebElement indirilecekDosya = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + indirilecekDosyaAdı + "')]//following-sibling::td[contains(@class,'Download')]"));
        indirilecekDosya.click();

    }

    @Then("Dosyanın indirildiğini doğrular")
    public void dosyanınIndirildiğiniDoğrular() {
        ReusableMethods.waitFor(5);
        // Örnek olarak, dosyanın indirildiği klasörü belirtmek için
        String downloadFolderPath = "C:\\Users\\demir\\Downloads";
        // Dosya adını belirleyin


        // Dosya yolu oluşturun
        String filePath = downloadFolderPath + "\\" + indirilecekDosyaAdı;

        // Dosya var mı yok mu kontrol edin

        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Dosya indirildi.");
        } else {
            System.out.println("Dosya indirilmedi.");
        }
    }

    //Veri Setler-İlişkili Veriler Veri Arama Steps
    @And("Var olan veri ismini {string} girer")
    public void varOlanVeriIsminiGirer(String veriAdi) {
        arananVeriAdi = veriAdi;
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(arananVeriAdi);

    }

    @Then("Var olan verinin olduğunu doğrular")
    public void varOlanVerininOlduğunuDoğrular() {
        WebElement arananVeri = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + arananVeriAdi + "')]"));
        Assert.assertTrue(arananVeri.isDisplayed());
        ReusableMethods.waitFor(1);

    }

    //Veri Setler-Veri Seti Şablonu Veri Seti Şablonu Ekleme
    @And("Veri seti şablonları sekmesine tıklar")
    public void veriSetiŞablonlarıSekmesineTıklar() {
        ucmsAdminPage.veriSetiŞablonlarıMenü.click();
    }

    @And("Veri seti şablonu ekleme ikonuna tıklar")
    public void veriSetiŞablonuEklemeIkonunaTıklar() {
        ucmsAdminPage.veriSetiŞablonuEkleİkon.click();
    }

    @And("Şablon adı {string} girer")
    public void şablonAdıGirer(String şablonAdı) {
        veriSetiŞablonAdı = şablonAdı;
        ucmsAdminPage.şablonAdı.sendKeys(şablonAdı);
    }

    @And("En az bir adet veri seti {string} seçer")
    public void enAzBirAdetFromAlanıSeçer(String formAdı) {

        WebElement formAlanı = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + formAdı + "')]"));

        actions.clickAndHold(formAlanı).moveToElement(ucmsAdminPage.veriSetTaşımaAlanı).release(ucmsAdminPage.veriSetTaşımaAlanı).build().perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Veri seti şablonunun eklendiğini doğrular")
    public void veriSetiŞablonununEklendiĞiniDoğrular() {
        List<WebElement> veriSetiŞablonuEklendiUyarısı = ucmsAdminPage.veriSetiŞablonuEklendiPopup;
        Assert.assertEquals(veriSetiŞablonuEklendiUyarısı.size(), 1);
    }

    @Then("Şablon adı boş bırakılamaz uyarısını doğrular")
    public void şablonAdıBoşBırakılamazUyarısınıDoğrular() {
        List<WebElement> şablonAdıBoşBırakılmazPopUp = ucmsAdminPage.şablonAdıBoşBırakılamazPopUp;
        Assert.assertEquals(şablonAdıBoşBırakılmazPopUp.size(), 1);
    }

    @Then("Bir veya birden fazla form alanı seçiniz uyarısnı doğrular")
    public void birVeyaBirdenFazlaFormAlanıSeçinizUyarısnıDoğrular() {
        List<WebElement> birdenFazlaFormAlanıSeçinizPopUp = ucmsAdminPage.formAlanıSeçinizPopUp;
        Assert.assertEquals(birdenFazlaFormAlanıSeçinizPopUp.size(), 1);
    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Düzenleme
    @And("Düzenlemek istediği veri seti şablonunun {string} düzenle ikonuna tıklar")
    public void düzenlemekIstediğiVeriSetiŞablonununDüzenleIkonunaTıklar(String veriSetiŞablonu) {
        WebElement düzenlenecekVeriSetiŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + veriSetiŞablonAdı + "')]//following-sibling::td[contains(@class,'Edit')]"));
        düzenlenecekVeriSetiŞablonu.click();
    }

    @And("Açılan pencerede Şablon adını {string} değiştirir")
    public void açılanPenceredeŞablonAdınıDeğiştirir(String güncellenenŞablonAdı) {
        güncelVeriSetiŞablonAdi = güncellenenŞablonAdı;
        ucmsAdminPage.şablonAdı.clear();
        ucmsAdminPage.şablonAdı.sendKeys(güncelVeriSetiŞablonAdi);
    }

    @Then("Veri seti şablonunun güncellendiğini doğrular")
    public void veriSetiŞablonununGüncellendiğiniDoğrular() {

        List<WebElement> veriSetiŞablonuGüncellendiUyarısı = ucmsAdminPage.veriSetiŞablonuGüncellendiPopUp;
        Assert.assertEquals(veriSetiŞablonuGüncellendiUyarısı.size(), 1);
    }

    @And("Seçilen veri setlerini {string} iptal eder")
    public void seçilenVeriSetleriniIptalEder(String versiSeti) {
        WebElement formAlanı = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + versiSeti + "')]"));

        actions.clickAndHold(formAlanı).moveToElement(ucmsAdminPage.veriSetiAlanı).release(ucmsAdminPage.veriSetiAlanı).build().perform();


    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Düzenleme
    @And("Aramak istediği veri seti şablonunun {string} ismini girer")
    public void aramakIstediğiVeriSetiŞablonununIsminiGirer(String aranacakŞablonAdı) {

        ucmsAdminPage.içerikAramaSearchBox.sendKeys(veriSetiŞablonAdı);
    }

    @Then("Veri seti şablonunun olduğunu doğrular")
    public void veriSetiŞablonununOlduğunuDoğrular() {
        WebElement sonuçŞablonu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + veriSetiŞablonAdı + "')]"));
        Assert.assertTrue(sonuçŞablonu.isDisplayed());

    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Listeleme
    @Then("İnaktif veri seti şablonlarının listelendiği görülür")
    public void inaktifVeriSetiŞablonlarınınListelendiğiGörülür() {

        List<WebElement> inaktifVeriSetiŞablonları = ucmsAdminPage.pasifVeriSetiŞablonuList;

        boolean nextPageExists = true;
        int toplamPasifVeriSetiŞablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("inaktifVeriSetiŞablonları.size = " + inaktifVeriSetiŞablonları.size());
            toplamPasifVeriSetiŞablonuSize += inaktifVeriSetiŞablonları.size();
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
        System.out.println("toplamPasifVeriSetiŞablonuSize = " + toplamPasifVeriSetiŞablonuSize);

    }

    @Then("Yalnızca aktif veri seti şablonlarının listelendiği görülür")
    public void yalnızcaAktifVeriSetiŞablonlarınınListelendiğiGörülür() {
        List<WebElement> aktifVeriSetiŞablonları = ucmsAdminPage.aktifVeriSetiŞablonuList;

        boolean nextPageExists = true;
        int toplamAktifVeriSetiŞablonuSize = 0;

        while (nextPageExists) {
            //System.out.println("aktifVeriSetiŞablonları.size = " + aktifVeriSetiŞablonları.size());
            toplamAktifVeriSetiŞablonuSize += aktifVeriSetiŞablonları.size();
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
        System.out.println("toplamAktifVeriSetiŞablonuSize = " + toplamAktifVeriSetiŞablonuSize);

    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Aktif-Pasif Etme
    @And("Aktif olan veri seti şablonunun {string} Aktif-Pasif et iconuna tıklanır")
    public void aktifOlanVeriSetiŞablonununPasifEtIconunaTıklanır(String pasifEdilecekVeriSetiŞablonu) {

        WebElement aktifEdilecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + güncelVeriSetiŞablonAdi + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitFor(1);
        aktifEdilecekSonuçŞablonu.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kayıt güncellendi yazısnı doğrular")
    public void kayıtGüncellendiYazısnıDoğrular() {
        List<WebElement> veriSetiŞablonuGüncellendiPopUp = ucmsAdminPage.verSetiŞablonuAktifPasifEtmePopup;
        Assert.assertEquals(veriSetiŞablonuGüncellendiPopUp.size(), 1);

    }

    @And("Pasif etmek istediği şablonun {string} checkboxına tıklar")
    public void pasifEtmekIstediğiŞablonunCheckboxınaTıklar(String veriSetiŞablonu) {
        WebElement pasifEdilecekVeriSetiŞablonu = Driver.getDriver().findElement(By.xpath("//td[text()='" + güncelVeriSetiŞablonAdi + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        pasifEdilecekVeriSetiŞablonu.click();
    }

    //Veri Setler-Veri Seti Şablonu-Veri Seti Şablonu Versiyon Değiştirme
    @And("Güncellenen veri seti şablonunun {string} versiyon ikonuna tıklar")
    public void güncellenenVeriSetiŞablonununVersiyonIkonunaTıklar(String versiyonDeğişecekVeriSetiŞablonu) {

        WebElement versionDeğişecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + versiyonDeğişecekVeriSetiŞablonu + "')]//following-sibling::td[contains(@class,'History')]"));

        versionDeğişecekSonuçŞablonu.click();
    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Seti Ekleme
    @And("Veri setleri Menüsüne tıklar")
    public void veriSetleriMenüsüneTıklar() {
        ucmsAdminPage.veriSetleriMenü.click();
    }

    @And("Veri seti ekle ikonuna tıklar")
    public void veriSetiEkleIkonunaTıklar() {
        ucmsAdminPage.veriSetiEkleİkon.click();
    }

    @And("Form alan tipini {string} seçer")
    public void formAlanTipiniSeçer(String formAlanTipi) {
        formAlanTipiSeçeneği = formAlanTipi;

        if (!formAlanTipi.isEmpty()) {
            ucmsAdminPage.formAlanTipi.click();
            WebElement formAlanTipiSeç = Driver.getDriver().findElement(By.xpath("//span[text()='" + formAlanTipi + "']"));

            ReusableMethods.waitForVisibility(formAlanTipiSeç, 10);

            ReusableMethods.clickWithJs(formAlanTipiSeç);
        }

    }

    @And("Veri tipini {string} seçer")
    public void veriTipiniSeçer(String veriTipi) {
        veriTipiSeçeneği = veriTipi;

        if (!veriTipi.isEmpty()) {
            if (formAlanTipiSeçeneği.equals("MultilineTextBox") || formAlanTipiSeçeneği.equals("CheckBox")) {

            } else {
                ucmsAdminPage.veriTipi.click();
                WebElement veriTipiSeç = Driver.getDriver().findElement(By.xpath("//span[text()='" + veriTipi + "']"));
                ReusableMethods.waitForVisibility(veriTipiSeç, 10);
                ReusableMethods.clickWithJs(veriTipiSeç);
            }
        }
    }

    @Then("Özellikler tabının etkin olduğu görülür")
    public void özelliklerTabınınEtkinOlduğuGörülür() {

        if (!veriTipiSeçeneği.isEmpty()) {
            Assert.assertTrue(ucmsAdminPage.veriSetiÖzelliklerTab.isEnabled());
        }
    }

    @Then("Veriler tabının etkin olduğu görülür")
    public void verilerTabınınEtkinOlduğuGörülür() {

        if (!veriTipiSeçeneği.isEmpty()) {
            if (formAlanTipiSeçeneği.equals("ComboBox") || formAlanTipiSeçeneği.equals("ListBox")) {
                Assert.assertTrue(ucmsAdminPage.veriSetiVerilerTab.isEnabled());
            }
        }


    }

    @And("Alan adını {string} girer")
    public void alanAdınıGirer(String alanAdiGir) {

        if (alanAdiGir.isEmpty()) {
            alanAdi = alanAdiGir;
            ucmsAdminPage.alanAdı.sendKeys(alanAdiGir);

        } else {
            alanAdi = (alanAdiGir + Faker.instance().idNumber().valid());
            alanAdi = alanAdi.replace("-", "");
            ucmsAdminPage.alanAdı.clear();
            ucmsAdminPage.alanAdı.sendKeys(alanAdi);
        }

    }

    @And("Etiket adını {string} girer")
    public void etiketAdınıGirer(String etiketAdiGir) {

        if (etiketAdiGir.isEmpty()) {
            etiketAdi = etiketAdiGir;
            ucmsAdminPage.etiketAdı.sendKeys(etiketAdiGir);

        } else {
            etiketAdi = (etiketAdiGir + Faker.instance().idNumber().valid());
            etiketAdi = etiketAdi.replace("-", "");
            ucmsAdminPage.etiketAdı.clear();
            ucmsAdminPage.etiketAdı.sendKeys(etiketAdi);
        }

    }

    @And("Db adını {string} girer")
    public void dbAdınıGirer(String dbAdiGir) {

        if (dbAdiGir.isEmpty()) {
            dbAdi = dbAdiGir;
            ucmsAdminPage.dbAdı.sendKeys(dbAdiGir);
        } else {
            dbAdi = (dbAdiGir + Faker.instance().idNumber().valid());
            dbAdi = dbAdi.replace("-", "");

            ucmsAdminPage.dbAdı.clear();
            ucmsAdminPage.dbAdı.sendKeys(dbAdi);

            char dbAdifirstChar = dbAdi.charAt(0);


            if (Character.isDigit(dbAdifirstChar)) { // || !dbAdi.matches("[a-zA-Z0-9 ]*")

                Assert.assertEquals(ucmsAdminPage.dbAdıIlkKarakternümerikOlamazPopup.size(), 1);
                ReusableMethods.waitFor(2);

            } else if (!dbAdi.matches(".*[0-9a-zA-Z].*")) {

                Assert.assertEquals(ucmsAdminPage.dbAdiOzelKarakterKullanilamazPopup.size(), 1);


            }
        }
    }

    @And("Özellikler tabına geçip Maksimum veri uzunluğunu {int} girilir")
    public void özelliklerTabınaGecipMaksimumVeriUzunluguGirilir(int veriUzunlugu) {

        maxVeriUzunlugu = veriUzunlugu;

        String stringMaxVeriUzunlugu = String.valueOf(maxVeriUzunlugu);

        if (!(veriTipiSeçeneği.isEmpty() || formAlanTipiSeçeneği.isEmpty())) {

            if (dbAdi.isEmpty() || !(Character.isDigit(dbAdi.charAt(0)) || dbAdi.matches(".*[^0-9a-zA-Z].*"))) {

                ucmsAdminPage.veriSetiÖzelliklerTab.click();

                switch (formAlanTipiSeçeneği) {

                    case "TextBox":

                        if (veriTipiSeçeneği.equals("Tarih")) {
                            System.out.println("Max veri uzunluğu defoult olarak 10 karakter gelir...");
                        } else {
                            ucmsAdminPage.maxVeriUzunluğu.clear();
                            ucmsAdminPage.maxVeriUzunluğu.sendKeys(stringMaxVeriUzunlugu);
                        }
                        break;
                    case "MultilineTextBox":
                        ucmsAdminPage.maxVeriUzunluğu.clear();
                        ucmsAdminPage.maxVeriUzunluğu.sendKeys(stringMaxVeriUzunlugu);
                        break;
                    case "CheckBox":

                        if (veriTipiSeçeneği.equals("Nümerik Kod")) {

                            System.out.println("Max veri uzunluğu defoult olarak 1 karakter gelir...");
                        }

                        //ucmsAdminPage.varsayılanDeğer.click(); //Varsayılan değeri true olan veri seti ekleme

                        break;
                    case "ComboBox":

                        if (veriTipiSeçeneği.equals("Tarih")) {
                            System.out.println("Tarih seçeneği defoult olrak 10 karakter gelir...");
                        } else {
                            ucmsAdminPage.maxVeriUzunluğu.clear();
                            ucmsAdminPage.maxVeriUzunluğu.sendKeys(stringMaxVeriUzunlugu);
                        }

                        break;
                    case "ListBox":
                        if (veriTipiSeçeneği.equals("Tarih")) {
                            System.out.println("Tarih seçeneği defoult olrak 10 karakter gelir...");
                        } else {
                            ucmsAdminPage.maxVeriUzunluğu.clear();
                            ucmsAdminPage.maxVeriUzunluğu.sendKeys(stringMaxVeriUzunlugu);
                        }
                        break;

                    default:
                }

            }
        }

    }

    @And("Veriler tab'ına geçer")
    public void verilerTabInaGeçer() {

        if (!veriTipiSeçeneği.isEmpty()) {

            if (dbAdi.isEmpty() || !(Character.isDigit(dbAdi.charAt(0)) || dbAdi.matches(".*[^0-9a-zA-Z].*"))) {

                if (formAlanTipiSeçeneği.equals("ComboBox") || formAlanTipiSeçeneği.equals("ListBox")) {
                    ucmsAdminPage.veriSetiVerilerTab.click();
                }
            }
        }
    }

    @And("{int} adet anahtar değer ve görünen değer ekler")
    public void adetAnahtarDeğerVeGörünenDeğerEkler(int veriSayısı) {


        eklenecekVeriSayısı = veriSayısı;

        if (!veriTipiSeçeneği.isEmpty()) {
            if (dbAdi.isEmpty() || !(Character.isDigit(dbAdi.charAt(0)) || dbAdi.matches(".*[^0-9a-zA-Z].*"))) {

                if (formAlanTipiSeçeneği.equals("ComboBox") || formAlanTipiSeçeneği.equals("ListBox")) {

                    if (veriTipiSeçeneği.equals("Tarih")) {

                        for (int i = 1; i <= veriSayısı; i++) {
                            anahtarDeger = "" + Faker.instance().date().birthday();
                            görünenDeger = "" + Faker.instance().date().birthday();
                            ucmsAdminPage.anahtarDeğer.sendKeys(anahtarDeger);
                            ucmsAdminPage.görünenDeğer.sendKeys(görünenDeger);
                            ucmsAdminPage.veriKaydet.click();
                            if (eklenecekVeriSayısı < 2 || maxVeriUzunlugu < anahtarDeger.length()) {
                                break;
                            }
                        }

                    } else if (veriTipiSeçeneği.equals("Nümerik") || veriTipiSeçeneği.equals("Nümerik Kod")) {

                        for (int i = 1; i <= veriSayısı; i++) {

                            anahtarDeger = "" + Faker.instance().number().numberBetween(1, 100);
                            görünenDeger = "Gd_" + Faker.instance().number().numberBetween(1, 100);

                            ucmsAdminPage.anahtarDeğer.sendKeys(anahtarDeger);
                            ucmsAdminPage.görünenDeğer.sendKeys(görünenDeger);
                            ucmsAdminPage.veriKaydet.click();

                            if (eklenecekVeriSayısı < 2 || maxVeriUzunlugu < anahtarDeger.length()) {
                                break;
                            }
                        }

                    } else {

                        for (int i = 1; i <= veriSayısı; i++) {

                            anahtarDeger = "Ad_" + Faker.instance().internet().password();
                            görünenDeger = "Gd_" + Faker.instance().internet().password();

                            ucmsAdminPage.anahtarDeğer.sendKeys(anahtarDeger);
                            ucmsAdminPage.görünenDeğer.sendKeys(görünenDeger);
                            ucmsAdminPage.veriKaydet.click();

                            if (eklenecekVeriSayısı < 2 || maxVeriUzunlugu < anahtarDeger.length()) {
                                break;

                            }
                        }
                    }
                }
            }
        }
    }

    @And("Kaydet butonuna tıklar.")
    public void kaydetButonunaTıklar() {

        if (dbAdi.isEmpty() || !(Character.isDigit(dbAdi.charAt(0)) || dbAdi.matches(".*[^0-9a-zA-Z].*"))) {

            if (formAlanTipiSeçeneği.isEmpty() || veriTipiSeçeneği.isEmpty()) {

                ucmsAdminPage.veriSetiKaydetButton.click();

            } else {
                if (formAlanTipiSeçeneği.equals("ComboBox") || formAlanTipiSeçeneği.equals("ListBox")) {

                    if (maxVeriUzunlugu < anahtarDeger.length()) {

                    } else ucmsAdminPage.veriSetiKaydetButton.click();

                } else ucmsAdminPage.veriSetiKaydetButton.click();
            }
        }

    }

    @Then("Veri setinin eklendiğini doğrular")
    public void veriSetininEklendiğiniDoğrular() {

        if (dbAdi.isEmpty() || !(Character.isDigit(dbAdi.charAt(0)) || dbAdi.matches(".*[^0-9a-zA-Z].*"))) {

            if (formAlanTipiSeçeneği.isEmpty() || veriTipiSeçeneği.isEmpty()) {

                Assert.assertEquals(ucmsAdminPage.formAlanVeyaVeriTipiSeçinizPopup.size(), 1);

            } else {
                if (formAlanTipiSeçeneği.equals("ComboBox") || formAlanTipiSeçeneği.equals("ListBox")) {

                    if (maxVeriUzunlugu > anahtarDeger.length()) {

                        if (eklenecekVeriSayısı >= 1) {

                            if (alanAdi.isEmpty()) {

                                Assert.assertEquals(ucmsAdminPage.alanAdıBoşBırakılamazPopup.size(), 1);

                            } else if (etiketAdi.isEmpty()) {
                                Assert.assertEquals(ucmsAdminPage.etiketAdıBoşBırakılamazPopup.size(), 1);

                            } else if (dbAdi.isEmpty()) {
                                Assert.assertEquals(ucmsAdminPage.dbAdıBoşBırakılamazPopup.size(), 1);

                            } else {

                                if (eklenecekVeriSayısı == 1) {
                                    Assert.assertEquals(ucmsAdminPage.enAzİkiVeriGirmelisinizPopup.size(), 1);

                                } else
                                    Assert.assertEquals(ucmsAdminPage.verSetiEklendiPopup.size(), 1);
                            }
                        } else
                            Assert.assertEquals(ucmsAdminPage.anahtarVeGörünenDeğerAtanmadıPopup.size(), 1);
                    } else
                        Assert.assertEquals(ucmsAdminPage.maxVeriUzunluguPopup.size(), 1);

                } else {

                    if (alanAdi.isEmpty()) {
                        Assert.assertEquals(ucmsAdminPage.alanAdıBoşBırakılamazPopup.size(), 1);

                    } else if (etiketAdi.isEmpty()) {
                        Assert.assertEquals(ucmsAdminPage.etiketAdıBoşBırakılamazPopup.size(), 1);

                    } else if (dbAdi.isEmpty()) {
                        Assert.assertEquals(ucmsAdminPage.dbAdıBoşBırakılamazPopup.size(), 1);
                    } else
                        Assert.assertEquals(ucmsAdminPage.verSetiEklendiPopup.size(), 1);
                }
            }

        } else ucmsAdminPage.popupKapat.click();


    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Seti Arama
    @And("Aramak istediği veri setinin {string} ismini girer")
    public void aramakIstediğiVeriSetininIsminiGirer(String veriSetiAdi) {

        //Veri setinin Id ile aranması
        //WebElement veriSetiId = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Etiket_086524108')]//preceding-sibling::td[contains(@class,'Id mat-column-Id')]"));
        //ucmsAdminPage.içerikAramaSearchBox.sendKeys(veriSetiId.getText());

        ucmsAdminPage.içerikAramaSearchBox.sendKeys(etiketAdi);
    }

    @Then("Veri setinin olduğunu doğrular")
    public void veriSetininOlduğunuDoğrular() {
        WebElement veriSeti = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + etiketAdi + "')]"));
        Assert.assertTrue(veriSeti.isDisplayed());
        //Veri setinin Id ile aranıp doğrulanması
        //WebElement veriSetiId = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Etiket_086524108')]//preceding-sibling::td[contains(@class,'Id mat-column-Id')]"));
        //Assert.assertTrue(veriSetiId.isDisplayed());
    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Listeleme
    @Then("İnaktif veri setilerinin listelendiği görülür")
    public void inaktifVeriSetilerininListelendiğiGörülür() {

        List<WebElement> inaktifVeriSetiList = ucmsAdminPage.pasifVeriSetiList;

        boolean nextPageExists = true;
        int toplamPasifVeriSetiSize = 0;

        while (nextPageExists) {
            //System.out.println("inaktifVeriSetiList.size = " + inaktifVeriSetiList.size());
            toplamPasifVeriSetiSize += inaktifVeriSetiList.size();
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
        System.out.println("toplamPasifVeriSetiSize = " + toplamPasifVeriSetiSize);


    }

    @Then("Yalnızca aktif veri setlerinin listelendiği görülür")
    public void yalnızcaAktifVeriSetlerininListelendiğiGörülür() {

        List<WebElement> aktifVeriSetiList = ucmsAdminPage.aktifVeriSetiList;

        boolean nextPageExists = true;
        int toplamAktifVeriSetiSize = 0;

        while (nextPageExists) {
            //System.out.println("AktifVeriSetiList.size = " + AktifVeriSetiList.size());
            toplamAktifVeriSetiSize += aktifVeriSetiList.size();
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
        System.out.println("toplamAktifVeriSetiSize = " + toplamAktifVeriSetiSize);
    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Aktif-Pasif Etme
    @And("Aktif olan veri setinin {string} Aktif-Pasif et iconuna tıklanır")
    public void aktifOlanVeriSetininAktifPasifEtIconunaTıklanır(String veriSeti) {

        WebElement aktifEdilenVeriSeti = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + etiketAdi + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitForVisibility(aktifEdilenVeriSeti, 5);
        aktifEdilenVeriSeti.click();
    }

    @Then("Veri setinin aktif-Pasif edildiğini doğrular")
    public void veriSetininAktifPasifEdildiğiniDoğrular() {

        Assert.assertEquals(ucmsAdminPage.veriSetiAktifPasifEtmePopup.size(), 1);
    }

    @And("Aktif yada Pasif etmek istediği veri setinin {string} checkboxına tıklar")
    public void pasifEtmekIstediğiVeriSetininCheckboxınaTıklar(String veriSeti) {

        WebElement pasifEdilecekVeriSeti = Driver.getDriver().findElement(By.xpath("//td[text()='" + etiketAdi + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        pasifEdilecekVeriSeti.click();
    }

    @And("Açılan pencereyi tutup sürükler")
    public void açılanPencereyiTutupSürükler() {

        WebElement veriSetiEkleModal = Driver.getDriver().findElement(By.xpath("//h1[text()='Veri Seti Ekle ']"));

        //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //actions.dragAndDropBy(veriSetiEkleModal,1200,330).build().perform();

    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Kopyalama
    @And("Kopyalamak istediği veri setinin {string} kopyala ikonuna tıklar")
    public void kopyalamakIstediğiVeriSetininKopyalaIkonunaTıklar(String kopyalanacakVeriSeti) {

        WebElement veriSetiKopyala = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + dbAdi + "')]//following-sibling::td[contains(@class,'Copy')]"));
        veriSetiKopyala.click();
        ReusableMethods.waitForVisibility(ucmsAdminPage.bosAlanAdi, 10);
    }

    @And("Kopyala butonuna tıklar")
    public void kopyalaButonunaTıklar() {

        ucmsAdminPage.kopyalaButton.click();

    }

    @Then("Veri setinin kopyalandığını görür")
    public void veriSetininKopyalandığınıGörür() {

        Assert.assertEquals(ucmsAdminPage.veriSetiKopyalandıPopup.size(), 1);
    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Güncelleme
    @And("Güncellemek istediği veri setinin {string} düzenle ikonuna tıklar")
    public void güncellemekIstediğiVeriSetininDüzenleIkonunaTıklar(String GüncellenecekVeriSeti) {

        WebElement veriSetiDüzenle = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + GüncellenecekVeriSeti + "')]//following-sibling::td[contains(@class,'Edit')]"));
        veriSetiDüzenle.click();
    }

    @And("Kaydet butona tıklar")
    public void kaydetButonaTıklar() {

        ucmsAdminPage.veriSetiKaydetButton.click();
    }

    @Then("Veri setinin güncellendiğini doğrular")
    public void veriSetininGüncellendiğiniDoğrular() {

        Assert.assertEquals(ucmsAdminPage.veriSetiGüncellendiPopUp.size(), 1);
    }

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Kontrol Ekleme-Silme
    @And("Kontrol eklemek istediği veri setinin {string} kontrol ıkonuna tıklar")
    public void kontrolEklemekIstediğiVeriSetininKontrolIkonunaTıklar(String kontrolVeriSeti) {

        WebElement veriSetiKontrol = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + kontrolVeriSeti + "')]//following-sibling::td[contains(@class,'Validator ')]"));
        veriSetiKontrol.click();
    }

    @And("Kontrol tipini {string} seçer")
    public void kontrolTipiniSeçer(String kontrolTipi) {

        ucmsAdminPage.veriSetiKontrolTipi.click();
        ucmsAdminPage.kontrolTipiGerekliAlan.click();
    }

    @And("Mesaj alanına içerik {string} girilir")
    public void mesajAlanınaIçerikGirilir(String mesaj) {

        ucmsAdminPage.kontrolMesajı.sendKeys(mesaj);

    }

    @And("Kaydet ikonuna tıklar")
    public void kaydetIkonunaTıklar() {

        ucmsAdminPage.kontrolMesajıKaydet.click();
    }

    @And("Kapat butonuna tıklar")
    public void kapatButonunaTıklar() {

        ReusableMethods.waitFor(3);
        ucmsAdminPage.kontrolKapatButton.click();

    }

    @And("Sil ıkonuna tıklar")
    public void silIkonunaTıklar() {

        List<WebElement> kontrolSil = ucmsAdminPage.kontrolSil;

        for (int i = 0; i < kontrolSil.size(); i++) {

            ucmsAdminPage.kontrolSil.get(i).click();

        }
    }
}
