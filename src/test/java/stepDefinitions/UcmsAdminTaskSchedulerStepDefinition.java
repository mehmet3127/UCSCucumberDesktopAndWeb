package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminTaskSchedulerStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    static String isZamanlayiciAdi;
    static String scriptAdi;


    @And("Test Scheduler butonuna tıklar")
    public void testSchedulerButonunaTıklar() {
        ucmsAdminPage.taskSchedulerSayfasi.click();

    }

    @And("İş zamanlayıcı sekmesine tıklar")
    public void işZamanlayıcıSekmesineTıklar() {
        ucmsAdminPage.isZamanlayiciMenu.click();

    }

    @And("İş adı alanına {string} giriş yapar")
    public void işAdıAlanınaGirişYapar(String isAdi) {

        if (!isAdi.isEmpty()) {
            isZamanlayiciAdi = isAdi + Faker.instance().idNumber().ssnValid();
            ucmsAdminPage.isAdi.sendKeys(isZamanlayiciAdi);
        } else {
            isZamanlayiciAdi = isAdi;
        }


    }

    @And("Scripts combosundan bir script {string} seçer")
    public void scriptsCombosundanBirScriptSeçer(String script) {
        scriptAdi = script;
        if (!script.isEmpty()) {
            //ReusableMethods.waitForClickablility(ucmsAdminPage.script, 10);
            ReusableMethods.waitFor(1);
            jse.executeScript("arguments[0].click();", ucmsAdminPage.script);
            WebElement scriptSec = Driver.getDriver().findElement(By.xpath("//span[text()='" + script + "']"));
            ReusableMethods.waitForClickablility(scriptSec, 10);
            scriptSec.click();
        }
    }

    @And("Ay Tab'ına geçer")
    public void ayTabInaGeçer() {
        ucmsAdminPage.ayTab.click();
    }

    @And("Ay combosundan değer {int} girer")
    public void ayCombosundanDeğerGirer(int ayGir) {
        Select select = new Select(ucmsAdminPage.ayGir);
        select.selectByIndex(ayGir);
    }

    @And("Gün combosunda deger {int} girer")
    public void günCombosundaDegerGirer(int ayIcinGun) {
        Select select = new Select(ucmsAdminPage.ayIcinGunGir);
        select.selectByIndex(ayIcinGun);
    }

    @And("Saat combosunda değer {int} girer")
    public void saatCombosundaDeğerGirer(int ayIcinSaat) {
        Select select = new Select(ucmsAdminPage.ayIcinSaatGir);
        select.selectByIndex(ayIcinSaat);

    }

    @And("Dakika combosunda değer {int} girer")
    public void dakikaCombosundaDeğerGirer(int ayIcinDakika) {
        Select select = new Select(ucmsAdminPage.ayIcinDakikaGir);
        select.selectByIndex(ayIcinDakika);

    }

    @And("Saniye combosunda değer {int} girer")
    public void saniyeCombosundaDeğerGirer(int ayIcinSaniye) {
        Select select = new Select(ucmsAdminPage.ayIcinSaniyeGir);
        select.selectByIndex(ayIcinSaniye);

    }

    @And("Hafta Tab'ına geçer")
    public void haftaTabInaGeçer() {
        ucmsAdminPage.haftaTab.click();
    }

    @And("Bir gün {string} seçer")
    public void birGünSeçer(String haftaIcinGun) {
        WebElement haftaIcinGunSec = Driver.getDriver().findElement(By.xpath("//label[contains(text(),'" + haftaIcinGun + "')]"));

        if (haftaIcinGun.equals("Pazartesi")) {

        } else {
            ucmsAdminPage.pazartesi.click();
            haftaIcinGunSec.click();
        }

    }

    @And("Saat combosundan değer {int} girer")
    public void saatCombosundanDeğerGirer(int haftaIcinSaat) {
        Select select = new Select(ucmsAdminPage.haftaIcinSaatGir);
        select.selectByIndex(haftaIcinSaat);

    }

    @And("Dakika combosundan değer {int} girer")
    public void dakikaCombosundanDeğerGirer(int haftaIcinDakika) {
        Select select = new Select(ucmsAdminPage.haftaIcinDakikaGir);
        select.selectByIndex(haftaIcinDakika);
    }

    @And("Saniye combosundan değer {int} girer")
    public void saniyeCombosundanDeğerGirer(int haftaIcinSaniye) {
        Select select = new Select(ucmsAdminPage.haftaIcinSaniyeGir);
        select.selectByIndex(haftaIcinSaniye);
    }

    @And("Gün Tab'ına geçer")
    public void günTabInaGeçer() {
        ucmsAdminPage.gunTab.click();
    }

    @And("Gün combosunda deger {int} seçer")
    public void günCombosundaDegerSeçer(int gun) {
        Select select = new Select(ucmsAdminPage.gunGir);
        select.selectByIndex(gun);
    }

    //Gün için saat girer
    @And("Saat combosunda değer {int} seçer")
    public void saatCombosundaDeğerSeçer(int gunIcinSaat) {
        Select select = new Select(ucmsAdminPage.gunIcinSaatGir);
        select.selectByIndex(gunIcinSaat);
    }

    //Gün için dakika girer
    @And("Dakika combosunda değer {int} seçer")
    public void dakikaCombosundaDeğerSeçer(int gunIcinDakika) {
        Select select = new Select(ucmsAdminPage.gunIcinDakikaGir);
        select.selectByIndex(gunIcinDakika);
    }

    //Gün için saniye girer
    @And("Saniye combosunda değer {int} seçer")
    public void saniyeCombosundaDeğerSeçer(int gunIcinSaniye) {
        Select select = new Select(ucmsAdminPage.gunIcinSaniyeGir);
        select.selectByIndex(gunIcinSaniye);
    }

    @And("Saat Tab'ına geçer")
    public void saatTabInaGeçer() {
        ucmsAdminPage.saatTab.click();
    }

    @And("Saat combosundan değer {int} seçer")
    public void saatCombosundanDeğerSeçer(int saat) {

        Select select = new Select(ucmsAdminPage.saatGir);
        select.selectByIndex(saat);
    }

    @And("Dakika tabını geçer")
    public void dakikaTabınıGeçer() {
        ucmsAdminPage.dakikaTab.click();
    }

    @And("Dakika combosundan değer {int} seçer")
    public void dakikaTabınıSeçipDakikaCombosundanDeğerSeçer(int dakika) {
        Select select = new Select(ucmsAdminPage.dakikaGir);
        select.selectByIndex(dakika);
    }

    @And("Saniye combosundan değer {int} seçer")
    public void saniyeCombosundanDeğerSeçer(int saniye) {
        Select select = new Select(ucmsAdminPage.saniyeGir);
        select.selectByIndex(saniye);
    }

    @Then("Kaydın eklendiğip eklenmedigini doğrular")
    public void kaydınEklendiğiniDoğrular() {

        if (isZamanlayiciAdi.isEmpty()) {

            Assert.assertTrue(ucmsAdminPage.isAdiBosGecilemezPopUp.isDisplayed());

        } else if (scriptAdi.isEmpty()) {

            Assert.assertTrue(ucmsAdminPage.scriptAdiBosGecilemezPopUp.isDisplayed());

        } else if ((isZamanlayiciAdi.isEmpty() && scriptAdi.isEmpty())) {

            Assert.assertTrue(ucmsAdminPage.isAdiBosGecilemezPopUp.isDisplayed());

        } else {

            Assert.assertTrue(ucmsAdminPage.isZamanlayiciEklendiPopUp.isDisplayed());
            //Başarılı şekilde eklendi uyarısı çıkmadığı için şimdilik bu popup ile doğrulama yapılıyor
        }
    }

}
