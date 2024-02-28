package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

    static String telefonNumarasi;
    static String cikisNumaralariSablonAdi;

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

        if (telNo.isEmpty()) {
            telefonNumarasi = telNo;
        } else {
            ucmsAdminPage.cikisNumaralariTelNo.clear();
            telefonNumarasi = Faker.instance().phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
            ucmsAdminPage.cikisNumaralariTelNo.sendKeys(telefonNumarasi);
        }

    }

    @And("Açılan ekle modalına var olan telefon {string} no girer")
    public void açılanEkleModalınaVarOlanTelefonNoGirer(String telNo) {
        ucmsAdminPage.cikisNumaralariTelNo.clear();
        ucmsAdminPage.cikisNumaralariTelNo.sendKeys(telNo);
    }

    @And("Açılan ekle modalına geçersiz karakter olan telefon {string} no girer")
    public void açılanEkleModalınaGeçersizKarakterOlanTelefonNoGirer(String telNo) {
        ucmsAdminPage.cikisNumaralariTelNo.clear();
        ucmsAdminPage.cikisNumaralariTelNo.sendKeys(telNo);
    }

    @And("Açılan ekle modalına telefon {string} no girer.")
    public void açılanEkleModalınaTelefonNoGirer(String telNo) {
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

        By elementSelector = By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]//following-sibling::td[contains(@class,'Edit')]");
        while (true) {
            try {
                ReusableMethods.waitForVisibility(elementSelector, 10);
                WebElement telNoEdit = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]//following-sibling::td[contains(@class,'Edit')]"));
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
        By elementSelector = By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]//following-sibling::td[contains(@class,'Delete')]");
        while (true) {
            try {
                ReusableMethods.waitForVisibility(elementSelector, 10);
                WebElement scriptDelete = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]//following-sibling::td[contains(@class,'Delete ')]//preceding-sibling::mat-icon[contains(@mattooltip,'Sil')]"));
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
        List<WebElement> telNoDelete = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]"));
        Assert.assertEquals(telNoDelete.size(), 0);

    }

    @Then("Çıkış numarasının {string} silinmediği dogrular")
    public void çıkışNumarasınınSilinmediğiDogrular(String telNo) {
        List<WebElement> telNoDelete = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + telefonNumarasi + "')]"));
        Assert.assertEquals(telNoDelete.size(), 1);
    }

    @And("En az üç basamaklı telefon no {string} değeri girer")
    public void enAzBasamaklıTelefonNoDeğeriGirer(String telNo) {

        ucmsAdminPage.içerikAramaSearchBox.sendKeys(telefonNumarasi);

    }

    @Then("Çıkış numarasının {string} listede oldugu görülür.")
    public void çıkışNumarasınınListedeOlduguGörülür(String telNo) {
        WebElement tlfNo = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + telefonNumarasi + "')]"));
        Assert.assertTrue(tlfNo.isDisplayed());
    }

    @And("En az üç basamaklı id değeri girer")
    public void enAzÜçBasamaklıIdDeğeriGirer() {
        ucmsAdminPage.içerikAramaSearchBox.clear();
        WebElement cikisNumarasiId = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + telefonNumarasi + "')]//preceding-sibling::td[contains(@class,'Id mat-column-Id')]"));
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(cikisNumarasiId.getText());
    }

    //Ortam Tanımları-Şablonlar-Çıkış Numaraları Şablon ekleme
    @And("Şablonlar menusune tıklar")
    public void şablonlarMenusuneTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.ortamTanimlariSablonlarMenu);

    }

    @And("Açılan pencerede şablon adını {string} girer")
    public void açılanPenceredeşablonAdınıGirer(String sablonAdi) {
        ucmsAdminPage.şablonAdı.clear();
        cikisNumaralariSablonAdi=sablonAdi+Faker.instance().idNumber().valid().replace("-","");
        ucmsAdminPage.şablonAdı.sendKeys(cikisNumaralariSablonAdi);
    }
    @And("Açılan pencerede var olan şablon adını {string} girer")
    public void açılanPenceredeVarOlanŞablonAdınıGirer(String sablonAdi) {
        ucmsAdminPage.şablonAdı.sendKeys(sablonAdi);
    }

    @And("En az bir adet numara {string} seçer")
    public void enAzBirAdetNumaraSeçer(String telNo) {
        WebElement secilenNumara = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + telNo + "')]"));

        actions.clickAndHold(secilenNumara).moveToElement(ucmsAdminPage.veriSetTaşımaAlanı).release(ucmsAdminPage.veriSetTaşımaAlanı).build().perform();
        ReusableMethods.waitFor(1);
    }

    @And("Çıkış Numaraları şablonu eklendiğini doğrular")
    public void çıkışNumaralarıŞablonuEklendiğiniDoğrular() {
       Assert.assertTrue(ucmsAdminPage.cikisNumaraSablonuEklendiPopUp.isDisplayed());
    }


    @And("Bu isimle bir şablon zaten var uyarısını görür")
    public void buIsimleBirŞablonZatenVarUyarısınıGörür() {
        Assert.assertTrue(ucmsAdminPage.buIsimleBirSablonVarPopUp.isDisplayed());
    }

    @And("Bir veya birden fazla numara seçiniz uyarısını doğrular")
    public void birVeyaBirdenFazlaNumaraSeçinizUyarısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.birdenFazlaNumaraSecinizPopUp.isDisplayed());
    }

    //Ortam Tanımları-Şablonlar-Çıkış Numaraları Şablon düzenleme
    @And("Çıkış Numaraları şablonu {string} düzenleme ikonuna tıklar")
    public void çıkışNumaralarıŞablonuDüzenlemeIkonunaTıklar(String cikisNoSablon) {
        WebElement cikisNumaralariSablonu=Driver.getDriver().findElement(By.xpath("//td[contains(text(),'"+cikisNumaralariSablonAdi+"')]//following-sibling::td[contains(@class,'Edit')]//preceding-sibling::mat-icon[contains(@mattooltip,'Düzenle')]"));
        cikisNumaralariSablonu.click();
    }

    @And("Seçili numarasını {string} iptal eder")
    public void seçiliNumaralarıIptalEder(String seciliNumara) {
        WebElement numara = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + seciliNumara + "')]"));
        actions.clickAndHold(numara).moveToElement(ucmsAdminPage.veriSetiAlanı).release(ucmsAdminPage.veriSetiAlanı).build().perform();

    }

    @Then("Çıkış Numaraları şablonu güncellendiğini doğrular")
    public void çıkışNumaralarıŞablonuGüncellendiğiniDoğrular() {
        Assert.assertTrue(ucmsAdminPage.cikisNumaraSablonuGuncellendiPopUp.isDisplayed());
    }

    //Ortam Tanımları-Şablonlar-Çıkış Numaraları Şablonu arama
    @And("Var olan Çıkış Numaraları şablonunun ismini {string} girer")
    public void varOlanÇıkışNumaralarıŞablonununIsminiGirer(String cikisNumaralariSablonu) {

        ucmsAdminPage.içerikAramaSearchBox.sendKeys(cikisNumaralariSablonAdi);
    }

    @Then("Var olan Çıkış Numaraları şablonunun {string} olduğunu doğrular")
    public void varOlanÇıkışNumaralarıŞablonununOlduğunuDoğrular(String cikisNumaralariSablonu) {
        WebElement cikisNumaralariSablon = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + cikisNumaralariSablonAdi + "')]"));
        Assert.assertTrue(cikisNumaralariSablon.isDisplayed());
    }

    @And("Var olan Çıkış Numaraları şablonunun ıd sini girer")
    public void varOlanÇıkışNumaralarıŞablonununIdSiniGirer() {
        ucmsAdminPage.içerikAramaSearchBox.clear();
        WebElement cikisNumarasiSablonuId = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + cikisNumaralariSablonAdi + "')]//preceding-sibling::td[contains(@class,'TemplateId')]"));
        System.out.println(cikisNumarasiSablonuId.getText());
        ucmsAdminPage.içerikAramaSearchBox.sendKeys(cikisNumarasiSablonuId.getText());
    }

    //Ortam Tanımları-Baglantı Ekleme
    @And("Bağlantı sekmesine tıklar")
    public void bağlantıSekmesineTıklar() {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.ortamTanimlariBaglantiMenu);

    }

    @And("Bağlantı adı {string} girilir")
    public void bağlantıAdıGirilir(String baglantiName) {
        jse.executeScript("arguments[0].click();", ucmsAdminPage.baglantiAdi);
        ucmsAdminPage.baglantiAdi.sendKeys(baglantiName);
    }

    @And("Bağlantı tipi combosundan MSSQL seçilir")
    public void bağlantıTipiCombosundanMSSQLSeçilir() {
    }

    @And("Bağlantı Cümlesi girilir")
    public void bağlantıCümlesiGirilir() {
        ucmsAdminPage.baglantiCumlesi.
                sendKeys("Data Source=teres.ucs.pvt,2433;Initial Catalog=TestUcsQuartz;Persist " +
                        "Security Info=True;User ID=ucssa;Password=Korgeneral!1");
    }

    @And("Bağlantıyı test et butonuna tıklar")
    public void bağlantıyıTestEtButonunaTıklar() {
        ucmsAdminPage.baglantiyiTestEt.click();
    }

    @And("Test başarılı yazısını doğrular")
    public void testBaşarılıYazısınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.testBasariliPopUp.isDisplayed());
        ucmsAdminPage.popupKapat.click();
    }

    @And("Kaydet butonunun aktif olduğu görülür")
    public void kaydetButonununAktifOlduğuGörülür() {
        Assert.assertTrue(ucmsAdminPage.veriSetiKaydetButton.isDisplayed());
    }

    @Then("İşlemin tamamlandığını doğrular")
    public void işleminTamamlandığınıDoğrular() {

    }
}
