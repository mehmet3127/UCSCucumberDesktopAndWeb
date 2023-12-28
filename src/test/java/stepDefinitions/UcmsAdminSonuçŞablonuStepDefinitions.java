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
    static String güncellenecekŞablonAdı;

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
        güncellenecekŞablonAdı =şablonAdı;

        WebElement düzenlenecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + güncellenecekŞablonAdı + "')]//following-sibling::td[contains(@class,'Edit')]"));
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
        ReusableMethods.waitFor(1);
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

    @And("İnaktif sonuç şablonları listelendiği görülür")
    public void inaktifSonuçŞablonlarıListelendiğiGörülür() {
        List<WebElement> inaktifSonuçŞablonları = ucmsAdminPage.pasifSonuçŞablonuList;

        boolean nextPageExists = true;
        int toplamPasifSonuçŞablonuSize = 0;

        while (nextPageExists) {
            System.out.println("inaktifSonuçŞablonları.size = " + inaktifSonuçŞablonları.size());
            toplamPasifSonuçŞablonuSize += inaktifSonuçŞablonları.size();
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
        System.out.println("pasifSonuçŞablonuSize = " + toplamPasifSonuçŞablonuSize);

    }

    @And("Açılan Devre dışı bırakılanlar toggle'ı kapatılır")
    public void devreDışıBırakılanlarToggleIKapatılır() {
        ucmsAdminPage.sonuçŞablonuDevreDışıBırakılanlar.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.sonuçŞablonuDevreDışıBırakılanlar.click();

    }

    @And("Yalnızca aktif sonuç şablonları listelendiği görülür")
    public void yalnızcaAktifSonuçŞablonlarıListelendiğiGörülür() {
        List<WebElement> aktifSonuçŞablonları = ucmsAdminPage.aktifSonuçŞablonuList;

        boolean nextPageExists = true;
        int toplamAktifSonuçŞablonuSize = 0;

        while (nextPageExists) {
            System.out.println("aktifSonuçŞablonları.size = " + aktifSonuçŞablonları.size());
            toplamAktifSonuçŞablonuSize += aktifSonuçŞablonları.size();
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
        System.out.println("aktifSonuçŞablonuSize = " + toplamAktifSonuçŞablonuSize);
    }

    //Sonuç Şablonları Aktifleştirme-Pasifleştirme
    @And("İnaktif olan sonuç şablonunun {string} Aktif et iconuna tıklanır")
    public void inaktifOlanSonuçŞablonununAktifEtIconunaTıklanır(String şablonAdı) {
        WebElement aktifEdilecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + şablonAdı + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitFor(1);
        aktifEdilecekSonuçŞablonu.click();
        ReusableMethods.waitFor(1);

    }

    @And("Sonuç şablonunun aktif edildiği görülür")
    public void sonuçŞablonununAktifEdildiğiGörülür() {
        List<WebElement> sonuçŞablonuAktifPasifEtmePopUp = ucmsAdminPage.sonuçŞablonuAktifPasifEtmePopup;
        Assert.assertEquals(sonuçŞablonuAktifPasifEtmePopUp.size(), 1);

    }

    @And("İnaktif olan sonuç şablonunun {string} Pasif et iconuna tıklanır")
    public void inaktifOlanSonuçŞablonununPasifEtIconunaTıklanır(String şablonAdı) {
        WebElement aktifEdilecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + şablonAdı + "')]//following-sibling::td[contains(@class,'IsActive')]"));
        ReusableMethods.waitFor(1);
        aktifEdilecekSonuçŞablonu.click();
        ReusableMethods.waitFor(1);
    }

    @And("Sonuç şablonunun Pasif edildiği görülür")
    public void sonuçŞablonununPasifEdildiğiGörülür() {
        List<WebElement> sonuçŞablonuAktifPasifEtmePopUp = ucmsAdminPage.sonuçŞablonuAktifPasifEtmePopup;
        Assert.assertEquals(sonuçŞablonuAktifPasifEtmePopUp.size(), 1);
    }

    //CheckBox ile Sonuç şablonlarının aktif-pasif edilmesi
    @And("Listelenen sonuç şablonlarının solundaki checkbox kullanılarak bir tanesi {string} seçilir")
    public void listelenenSonuçŞablonlarınınSolundakiCheckboxKullanılarakBirTanesiSeçilir(String şablonAdı) {
        WebElement sonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[text()='" + şablonAdı + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        sonuçŞablonu.click();
    }

    @And("Sağ üst köşede beliren aktif_pasif iconuna tıklanır")
    public void sağÜstKöşedeBelirenAktif_pasifIconunaTıklanır() {
        ucmsAdminPage.aktifPasifİcon.click();
    }

    @Then("Seçilen şablonun güncellendiği görülür")
    public void seçilenŞablonunGüncellendiğiGörülür() {
        List<WebElement> checkBoxŞablonGüncellendiPopUp = ucmsAdminPage.checkBoxAktifPasifEtmePopup;
        Assert.assertEquals(checkBoxŞablonGüncellendiPopUp.size(), 1);

    }

    @And("Listelenen sonuç şablonlarının solundaki checkbox kullanılarak birden fazla {string} {string} seçilir")
    public void listelenenSonuçŞablonlarınınSolundakiCheckboxKullanılarakBirdenFazlaSeçilir(String şablonAdı1, String şablonAdı2) {
        WebElement sonuçŞablonu1 = Driver.getDriver().findElement(By.xpath("//td[text()='" + şablonAdı1 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        sonuçŞablonu1.click();
        WebElement sonuçŞablonu2 = Driver.getDriver().findElement(By.xpath("//td[text()='" + şablonAdı2 + "']//preceding-sibling::td[contains(@class, 'mat-column-Select')]"));
        sonuçŞablonu2.click();

    }
    //Sonuş Şablonu Ekle modalında Devre dışı bırakılanlar ikonu ile sonuç şablonlarını listeleme
    @And("Açılan modaldaki devre dışı bırakılanlar toggle'ı aktif edilir")
    public void açılanModaldakiDevreDışıBırakılanlarToggleIAktifEdilir() {
        ucmsAdminPage.sonuçŞablonuEkleGüncelleDevreDışıBırakılanlarIcon.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Devre dışı bırakılan sonuç kodlarının listelendiği görülür")
    public void devreDışıBırakılanSonuçKodlarınınListelendiğiGörülür() {
        List<WebElement> devreDışıBırakılanSonuçKodlarıList =ucmsAdminPage.sonuçŞablonuEkleDevreDışıBırakılanSonuçKodları;
        System.out.println("devreDışıBırakılanSonuçKodlarıList.size = " + devreDışıBırakılanSonuçKodlarıList.size());
    }

    @And("Açılan modaldaki devre dışı bırakılanlar toggle'ı kapatılır")
    public void açılanModaldakiDevreDışıBırakılanlarToggleIKapatılır() {
        ucmsAdminPage.sonuçŞablonuEkleGüncelleDevreDışıBırakılanlarIcon.click();
        ReusableMethods.waitFor(1);
        ucmsAdminPage.sonuçŞablonuEkleGüncelleDevreDışıBırakılanlarIcon.click();
    }

    @Then("Sonuç kodlarının listelendiği görülür")
    public void sonuçKodlarınınListelendiğiGörülür() {

    }

    @And("Güncellenen sonuç kodu şablonunun versiyon ikonuna tıklar")
    public void güncellenenSonuçKoduŞablonununVersiyonIkonunaTıklar() {
        WebElement versionDeğişecekSonuçŞablonu = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'"+güncellenecekŞablonAdı+"')]//following-sibling::td[contains(@class,'History')]"));

        versionDeğişecekSonuçŞablonu.click();

    }
}
