package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @FindBy(name = "data.group.CrmId")
    public WebElement crmId;
    @FindBy(id = "mat-input-2")
    public WebElement grupAdıEkle;
    @FindBy(xpath = "//span[text()='Kaydet']")
    public WebElement kaydetButton;
    @FindBy(xpath = "//button[text()='Evet']")
    public WebElement onayButton;
    @FindBy(xpath = "//*[contains(text(), 'Zorunlu alanları doldurunuz.')]")
    public WebElement zorunluAlanlarıDoldurunuzPopup;
    @FindBy(id = "swal2-html-container")
    public WebElement kodGrubuSilinemezPopup;


    //Sonuç Kodu Ekleme Senaryosu Location
    @FindBy(xpath = "//span[text()='237 - otomasyon_03']")
    public WebElement eklenenKodGrubu;
    @FindBy(xpath = "//mat-icon[text()='add']")
    public WebElement sonuçKoduEkleIkon;
    @FindBy(id = "mat-input-1")
    public WebElement sonuçKoduBaşlık;


    //Aksiyon Tipi Combo Secenekleri
    @FindBy(id = "mat-select-0")
    public WebElement actionTipiCombo;
    @FindBy(xpath = "//span[text()='Kaydı Kapat']")
    public WebElement kaydıKapat;
    @FindBy(xpath = "//span[text()='Randevuyu Sistem Belirlesin']")
    public WebElement randevuyuSistemBelirlesin;
    @FindBy(xpath = "//span[text()='Randevuyu Agent Belirlesin']")
    public WebElement randevuyuAgentBelirlesin;
    @FindBy(xpath = "//span[text()='Yalnızca Çağrıyı Kapat']")
    public WebElement yalnızcaÇağrıyıKapat;


    //Kara Liste (DNC)
    @FindBy(xpath = "//span[text()=' Bu müşteri aranmasın ']")
    public WebElement karaListeBuMüşteriAranmasın;
    @FindBy(xpath = "//span[text()=' Bu telefon aranmasın ']")
    public WebElement karaListeBuTelefonAranmasın;
    @FindBy(xpath = "//span[text()=' Bu kampanya için aranmasın ']")
    public WebElement karaListeBuKampanyaİçinAranmasın;


    //Aksiyon Tipi: Randevuyu Sistem Belirlesin Randevu Özellikleri
    @FindBy(id = "mat-select-value-11")
    public WebElement randevuTipi;
    @FindBy(xpath = "//span[text()='Otomatik Kişisel Randevu']")
    public WebElement otomatikKişiselRandevu;
    @FindBy(xpath = "//span[text()='Otomatik Grup Randevu']")
    public WebElement otomatikGrupRandevu;
    @FindBy(id = "mat-input-5")
    public WebElement randevuÖzellikleriDakika;


    //Aksiyon Tipi: Randevuyu Sistem Sonraki Arama Davranışı
    @FindBy(xpath = "//span[text()=' Bir Sonraki Kontağa Geç ']")
    public WebElement birSonrakiKontağaGeç;
    @FindBy(xpath = "//span[text()=' Bu Kontağı Arama Sıralamasından Çıkart ']")
    public WebElement buKontağıAramaSıralamasındanÇıkart;


    //Aksiyon Tipi: Randevuyu Agent Belirlesin Randevu Özellkikleri
    @FindBy(xpath = "//span[text()=' Kişisel Randevu Verebilir ']")
    public WebElement kişiselRandevuVerebilir;
    @FindBy(xpath = "//span[text()=' Grup Randevusu Verebilir ']")
    public WebElement grupRandevusuVerebilir;


    //Genel Özellikler TabI
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
    @FindBy(xpath = "//span[text()='Kapat']")
    public WebElement altGrupKapat;


    //Sonuç Kodu İçerik Arama
    @FindBy(id = "mat-input-0")
    public WebElement içerikAramaSearchBox;


    //Devre Dışı Bırakma
    @FindBy(xpath = "//button[@mattooltip='Devre Dışı Bırakılanlar']")
    public WebElement devreDışıBırakılanlarIkon;
    @FindBy(xpath = "//del")
    public List<WebElement> devreDışıBırakılanSonuçKodları;


    //Sonuç Kodu Taşıma
    @FindBy(xpath = "//button[text()='Vazgeç']")
    public WebElement vazgeçButton;

    @FindBy(xpath = "//*[contains(text(),'başlıklı dizin altına taşındı')]")
    public List<WebElement> sonuçKoduTaşındıUyarısı;
    @FindBy(xpath = "//button[@mattooltip='İptal']//span[@class='mat-button-wrapper']")
    public WebElement taşımaİptalButton;


    //Sonuç Kodu Güncelleme Versiyon Değişikliği
    @FindBy(xpath = "//span[text()='Güncelle']")
    public WebElement güncelleButton;
    @FindBy(xpath = "//*[contains(text(),'sonuç kodu güncellendi')]")
    public List<WebElement> sonuçKoduGüncellendiPopup;
    @FindBy(xpath = "//td[text()='Oluşturma']//following::button[@mattooltip='Bu versiyonla devam et']")
    public WebElement oluşturmaTipiBuVersiyonİleDevamEt;
    @FindBy(xpath = "//span[text()='Versiyon Değiştir']")
    public WebElement versiyonDeğiştirButton;


    //Sonuç Şablonu Ekleme
    @FindBy(xpath = "//a[text()=' Sonuç Şablonları ']")
    public WebElement sonuçŞablonlarıMenü;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement sonuçŞablonuEkleIkon;
    @FindBy(xpath = "//input[@data-placeholder='Şablon Adı']")
    public WebElement şablonAdı;
    @FindBy(xpath = "//textarea[@data-placeholder='Açıklama']")
    public WebElement şablonEkleAçıklama;
    @FindBy(xpath = "//*[contains(text(), 'Lütfen bir veya birden fazla sonuç kodu seçiniz')]")
    public WebElement sonuçKoduseçinizPopup;
    @FindBy(xpath = "//*[contains(text(),'sonuç şablonu eklendi')]")
    public List<WebElement> sonuçŞablonuEklendiPopup;

    //Sonuç Şablonu Güncelleme
    @FindBy(xpath = "//*[contains(text(),'sonuç şablonu güncellendi')]")
    public List<WebElement> sonuçŞablonuGüncellendiPopup;

    //Sonuç Şablonu Listeleme
    @FindBy(xpath = "//label[@for='mat-slide-toggle-5-input']")
    public WebElement sonuçŞablonuDevreDışıBırakılanlar;
    @FindBy(xpath = "//mat-icon[contains(@class,'green')]")
    public List<WebElement> aktifSonuçŞablonuList;
    @FindBy(xpath = "//mat-icon[contains(@class,'red')]")
    public List<WebElement> pasifSonuçŞablonuList;
    @FindBy(xpath = "//button[@aria-label='Next page']")
    public WebElement nextPageButton;
    @FindBy(xpath = "//label[@for='mat-slide-toggle-6-input']")
    public WebElement sonuçŞablonuEkleGüncelleDevreDışıBırakılanlarIcon;

    @FindBy(xpath = "//del")
    public List<WebElement> sonuçŞablonuEkleDevreDışıBırakılanSonuçKodları;


    //Sonuç Şablonu Aktif-Pasif Etme
    @FindBy(xpath = "//*[contains(text(),'kaydı güncellendi')]")
    public List<WebElement> sonuçŞablonuAktifPasifEtmePopup;
    @FindBy(xpath = "//button[@mattooltip='Aktif/Pasif']")
    public WebElement aktifPasifİcon;
    @FindBy(xpath = "//*[contains(text(),'kayıt güncellendi')]")
    public List<WebElement> checkBoxAktifPasifEtmePopup;


    //Veri Setleri-İlişkili Veriler Menüsü
    @FindBy(xpath = "//span[text()='Veri Setleri']")
    public WebElement verilerSetleriSekmesi;
    @FindBy(xpath = "//a[text()=' İlişkili Veriler ']")
    public WebElement ilişkiliVerilerMenü;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement veriEkleİkon;
    @FindBy(xpath = "//*[contains(text(),'Excel row number cannot be single digit.')]")
    public WebElement uygunFormattaVeriEkleyinPoUp;
    @FindBy(xpath = "//*[contains(text(),'Bu dosya adında bir kayıt zaten var.')]")
    public WebElement aynıİsimdeVeriEklenemezPopup;


    //Veri Setleri-Veri Seti Şablonu Ekleme
    @FindBy(xpath = "//a[text()=' Veri Seti Şablonları ']")
    public WebElement veriSetiŞablonlarıMenü;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement veriSetiŞablonuEkleİkon;
    @FindBy(xpath = "//div[contains(@style,'padding-top')]")
    public WebElement veriSetTaşımaAlanı;
    @FindBy(xpath = "//*[contains(text(),'veri seti şablonu eklendi.')]")
    public List<WebElement> veriSetiŞablonuEklendiPopup;
    @FindBy(xpath = "//*[contains(text(),'Yaptığınız işlem gerçekleştirilemedi.')]")
    public List<WebElement> şablonAdıBoşBırakılamazPopUp;
    @FindBy(xpath = "//*[contains(text(),'Bir veya birden fazla Form Alanı seçiniz')]")
    public List<WebElement> formAlanıSeçinizPopUp;


    //Veri Setleri-Veri Seti Şablonu Düzenleme
    @FindBy(xpath = "//*[contains(text(),'veri seti şablonu güncellendi')]")
    public List<WebElement> veriSetiŞablonuGüncellendiPopUp;
    @FindBy(xpath = "//div[contains(@style,'margin-right')]")
    public WebElement veriSetiAlanı;


    //Veri Setleri-Veri Seti Şablonu Listeleme
    @FindBy(xpath = "//mat-icon[contains(@class,'red')]")
    public List<WebElement> pasifVeriSetiŞablonuList;
    @FindBy(xpath = "//mat-icon[contains(@class,'green')]")
    public List<WebElement> aktifVeriSetiŞablonuList;

    //Veri Setleri-Veri Seti Şablonu Aktif Pasif Etme
    @FindBy(xpath = "//*[contains(text(),'kayıt güncellendi')]")
    public List<WebElement> verSetiŞablonuAktifPasifEtmePopup;
}
