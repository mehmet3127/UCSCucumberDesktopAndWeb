package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.UcmsAdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class UcmsAdminSistemStepDefinition {

    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @And("Sistem Butonuna tıklar")
    public void sistemButonunaTıklar() {
        ucmsAdminPage.sistemSayfasi.click();
    }

    @And("Rol-Yetki matrisi  sekmesine tıklar")
    public void rolYetkiMatrisiSekmesineTıklar() {
        ucmsAdminPage.rolYetkiMatrisiMenu.click();
    }

    @And("Açılan pencerede yetki tipini {string} seçer")
    public void açılanPenceredeYetkiTipiOlarakRolSeçer(String yetkiTipi) {

        if (yetkiTipi.equals("Rol")) {

            ucmsAdminPage.yetkiTipi.click();
            ucmsAdminPage.yetkiTipiRol.click();

        } else if (yetkiTipi.equals("Kullanıcı")) {

            ucmsAdminPage.yetkiTipi.click();
            ucmsAdminPage.yetkiTipiKullanici.click();
        }

    }

    @And("İstediği Rol'ü {string} seçer")
    public void istediğiRolÜSeçer(String rol) {
        ucmsAdminPage.kullaniciRolSearchBox.click();
        WebElement verilecekRol = Driver.getDriver().findElement(By.xpath("//div[text()=' " + rol + " ']"));
        verilecekRol.click();
    }

    @And("Vermek istediği yetki'yi {string} seçer")
    public void vermekIstediğiYetkiYiSeçer(String yetki) {
        WebElement vermekIstedigiYetki = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + yetki + "')]//following-sibling::td[contains(@class,'Authority')]//child::input"));
        WebElement vermekIstedigiYetkiCheckBox = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + yetki + "')]//following-sibling::td[contains(@class,'Authority')]"));

        /*
        String ariaChecked = vermekIstedigiYetki.getAttribute("aria-checked");
        if (ariaChecked != null && ariaChecked.equals("true")) {
            System.out.println("Checkbox zaten seçili, tıklama yapılmayacak.");
        } else {
            // Checkbox seçili değilse, seç
            vermekIstedigiYetkiCheckBox.click();
            System.out.println("Checkbox seçildi.");
        }
        */
        if (vermekIstedigiYetki.isSelected()) {

            System.out.println("Bu yetki zaten verilmiş...");
        } else {
            vermekIstedigiYetkiCheckBox.click();
            System.out.println("Yetki Verildi...");

        }

    }

    @And("Yetki güncellendi mesajını doğrular")
    public void yetkininVerildiğiMesajınıDoğrular() {
        Assert.assertTrue(ucmsAdminPage.yetkiVeridiPopUp.isDisplayed());
    }

    @And("Kaldırmak istediği yetki'yi {string} seçer")
    public void kaldırmakIstediğiYetkiYiSeçer(String yetki) {

        WebElement vermekIstedigiYetki = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + yetki + "')]//following-sibling::td[contains(@class,'Authority')]//child::input"));
        WebElement vermekIstedigiYetkiCheckBox = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'" + yetki + "')]//following-sibling::td[contains(@class,'Authority')]"));

        /*
        String ariaChecked = vermekIstedigiYetki.getAttribute("aria-checked");
        if (ariaChecked != null && ariaChecked.equals("true")) {
            System.out.println("Checkbox zaten seçili, tıklama yapılmayacak.");
        } else {
            // Checkbox seçili değilse, seç
            vermekIstedigiYetkiCheckBox.click();
            System.out.println("Checkbox seçildi.");
        }
        */
        if (vermekIstedigiYetki.isSelected()) {
            vermekIstedigiYetkiCheckBox.click();
            System.out.println("Bu yetki kaldırıldı...");
        } else {

            System.out.println("Bu yetki zaten yok...");

        }
    }

    @And("Kullanıcı adını {string} girer")
    public void kullanıcıAdınıGirer(String kullaniciAd) {

        ucmsAdminPage.kullaniciRolSearchBox.sendKeys(kullaniciAd);
        ReusableMethods.waitFor(1);

        WebElement kullaniciAdi = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + kullaniciAd + "')]"));

        jse.executeScript("arguments[0].click();", kullaniciAdi);


    }

    @And("CRM ıd girilir")
    public void crmIdGirilir() {
    }

}
