package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UcmsAdminPage {

    public UcmsAdminPage() {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.getDriver(), this);
    }


    //UcmsAdmin Login Senaryosu Location
    @FindBy(id = "mat-input-0")
    public WebElement userName;
    @FindBy(id = "mat-input-1")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girişButton;

    @FindBy(xpath = "//span[contains(text(),'Kullanıcı bilgileri hatalı')]")
    public WebElement hatalıKullanıcıBilgileriPopup;


    @FindBy(id = "mat-select-value-1")
    public WebElement uygulamalar;
    @FindBy(id = "mat-option-0")
    public WebElement ucmsConfig;

    @FindBy(xpath = "//a[text()=' mehmet.demir']")
    public WebElement homePageUser;


    //Kod Grubu Ekeleme Senaryosu Location
    @FindBy(xpath = "//span[text()='Sonuç Kodları']")
    public WebElement sonuçKodlarıButton;
    @FindBy(xpath = "//a[text()=' Sonuç Kodları ']")
    public WebElement sonuçKodlarSekmesi;
    @FindBy(xpath = "//button[@mattooltip='Kod Grubu Ekle']")
    public WebElement kodGrubuEkleIkon;
    @FindBy(id = "mat-input-1")
    public WebElement grupAdıEkle;
    @FindBy(xpath = "//span[text()='Kaydet']")
    public WebElement kaydetButton;
    @FindBy(xpath = "//button[text()='Evet']")
    public WebElement kaydetOnayButton;



    //Sonuç Kodu Ekleme Senaryosu Location
    @FindBy(xpath = "//span[text()='237 - otomasyon_01']")
    public WebElement eklenenKodGrubu;
    @FindBy(xpath = "//mat-icon[text()='add']")
    public WebElement sonuçKoduEkleIkon;
    @FindBy(id = "mat-input-1")
    public WebElement SonuçKoduBaşlık;



    //Aksiyon Tipi Combo Secenekleri
    @FindBy(id = "mat-select-0")
    public WebElement actionTipiCombo;
    @FindBy(xpath = "//span[text()='Kaydı Kapat']")
    public WebElement kaydıKapat;
    @FindBy(xpath = "//span[text()='Randevuyu Sistem Belirlesin']")
    public WebElement randevuyuSistemBelirlesin;



    //Genel Özellikler Tab
    @FindBy(id = "mat-tab-label-0-1")
    public WebElement genelÖzelliklerTab;


    //Başarı Durumu Combo Box
    @FindBy(id = "mat-select-value-3")
    public WebElement başarıDurumuComboBox;
    @FindBy(xpath = "//span[text()='Kriter Dışı']")
    public WebElement kriterDışı;
    @FindBy(xpath = "//span[text()='Başarısız']")
    public WebElement başarısız;
    @FindBy(xpath = "//span[text()='Başarılı']")
    public WebElement başarılı;



    //Müşteriye Ulaşılma Durumu Combo Box
    @FindBy(id = "mat-select-value-5")
    public WebElement müşteriyeUlaşılmaDurumuComboBox;
    @FindBy(xpath = "//span[text()='Müşteriye Ulaşılamadı']")
    public WebElement müşteriyeUlaşılamadı;
    @FindBy(xpath = "//span[text()='Müşteriye Ulaşıldı']")
    public WebElement müşteriyeUlaşıldı;



    //Müşteriye Temas Durumu Combo Box
    @FindBy(id = "mat-select-value-7")
    public WebElement müşteriyeTemasDurumuComboBox;
    @FindBy(xpath = "//span[text()='Müşteriye Temas Edilemedi']")
    public WebElement müşteriyeTemasEdilemedi;
    @FindBy(xpath = "//span[text()='Müşteriye Temas Edildi']")
    public WebElement müşteriyeTemasEdildi;

    //Alt Grup Ekle
    @FindBy(id = "mat-input-1")
    public WebElement altGrupBaşlık;


}
