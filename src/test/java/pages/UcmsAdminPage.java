package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UcmsAdminPage {

    public UcmsAdminPage() {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.webDriver(), this);
    }


    //UcmsAdmin Login Senaryosu Location

    @FindBy(xpath = "//h4[text()='UCMS Admin Paneli']")
    public WebElement ucmsAdminLoginPage;
    @FindBy(id = "mat-input-0")
    public WebElement userName;

    @FindBy(id = "mat-input-1")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girisButton;
    @FindBy(xpath = "//span[contains(text(),'Kullanıcı bilgileri hatalı')]")
    public WebElement hataliKullaniciBilgileriPopup;
    @FindBy(id = "mat-select-value-1")
    public WebElement uygulamalar;
    @FindBy(id = "mat-option-0")
    public WebElement ucmsConfig;
    @FindBy(xpath = "//a[text()=' mehmet.demir']")
    public WebElement homePageUser;
    @FindBy(xpath = "//img[@alt='user']")
    public WebElement profilIcon;
    @FindBy(xpath = "//button[text()=' Çıkış ']")
    public WebElement cikisButton;

    //Kod Grubu Ekeleme Senaryosu Location
    @FindBy(xpath = "//span[text()='Sonuç Kodları']")
    public WebElement sonuçKodlarıButton;
    @FindBy(xpath = "//a[text()=' Sonuç Kodları ']")
    public WebElement sonuçKodlarSekmesi;
    @FindBy(xpath = "//button[@mattooltip='Kod Grubu Ekle']")
    public WebElement kodGrubuEkleIkon;
    @FindBy(name = "data.group.CrmId")
    public WebElement crmId;
    @FindBy(name = "data.group.Title")
    public WebElement grupAdiEkle;
    @FindBy(xpath = "//span[text()='Kaydet']")
    public WebElement kaydetButton;
    @FindBy(xpath = "//button[text()='Evet']")
    public WebElement onayButton;
    @FindBy(xpath = "//*[contains(text(), 'Zorunlu alanları doldurunuz.')]")
    public WebElement zorunluAlanlarıDoldurunuzPopup;
    @FindBy(id = "swal2-html-container")
    public WebElement kodGrubuSilinemezPopup;
    @FindBy(xpath = "//*[contains(text(), 'başlıklı sonuç kodu grubu silindi.')]")
    public WebElement kodGrubuSilindiPopup;


    //Sonuç Kodu Ekleme Senaryosu Location
    @FindBy(xpath = "//button[@mattooltip='Sonuç Kodu Ekle']")
    public WebElement sonucKoduEkleIkon;
    @FindBy(name = "dataItem.Title")
    public WebElement sonucKoduBaslik;
    @FindBy(name = "dataItem.InformationNote")
    public WebElement sonucKoduBilgilendirmeNotu;
    @FindBy(name = "dataItem.Description")
    public WebElement sonucKoduAciklama;
    @FindBy(name = "dataItem.CrmId")
    public WebElement crmSonucKodu;
    @FindBy(name = "dataItem.CtiId")
    public WebElement ctiSonucKodu;


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
    public WebElement genelOzelliklerTab;


    //Başarı Durumu Combo Box
    @FindBy(id = "mat-select-value-3")
    public WebElement basariDurumuComboBox;
    @FindBy(xpath = "//span[text()='Kriter Dışı']")
    public WebElement kriterDisi;
    @FindBy(xpath = "//span[text()='Başarısız']")
    public WebElement basarisiz;
    @FindBy(xpath = "//span[text()='Başarılı']")
    public WebElement basarili;


    //Müşteriye Ulaşılma Durumu Combo Box
    @FindBy(id = "mat-select-value-5")
    public WebElement musteriyeUlasilmaDurumuComboBox;
    @FindBy(xpath = "//span[text()='Müşteriye Ulaşılamadı']")
    public WebElement musteriyeUlasilamadi;
    @FindBy(xpath = "//span[text()='Müşteriye Ulaşıldı']")
    public WebElement musteriyeUlasildi;


    //Müşteriye Temas Durumu Combo Box
    @FindBy(id = "mat-select-value-7")
    public WebElement musteriyeTemasDurumuComboBox;
    @FindBy(xpath = "//span[text()='Müşteriye Temas Edilemedi']")
    public WebElement musteriyeTemasEdilemedi;
    @FindBy(xpath = "//span[text()='Müşteriye Temas Edildi']")
    public WebElement musteriyeTemasEdildi;


    //Alt Grup Ekle
    @FindBy(name = "data.group.Title")
    public WebElement altGrupBaslik;
    @FindBy(xpath = "//span[text()='Kapat']")
    public WebElement altGrupKapat;


    //Sonuç Kodu İçerik Arama
    @FindBy(id = "mat-input-0")
    public WebElement icerikAramaSearchBox;
    @FindBy(xpath = "//*[contains(text(), 'adlı sonuç kodu eklendi.')]")
    public WebElement sonucKoduEklendiPopup;

    //Devre Dışı Bırakma
    @FindBy(xpath = "//button[@mattooltip='Devre Dışı Bırakılanlar']")
    public WebElement devreDisiBirakilanlarIkon;
    @FindBy(xpath = "//del")
    public List<WebElement> devreDisiBirakilanSonucKodlari;


    //Sonuç Kodu Taşıma
    @FindBy(xpath = "//button[text()='Vazgeç']")
    public WebElement vazgecButton;

    @FindBy(xpath = "//*[contains(text(),'başlıklı dizin altına taşındı')]")
    public List<WebElement> sonucKoduTasindiUyarisi;
    @FindBy(xpath = "//button[@mattooltip='İptal']//span[@class='mat-button-wrapper']")
    public WebElement tasimaIptalButton;


    //Sonuç Kodu Güncelleme Versiyon Değişikliği
    @FindBy(xpath = "//span[text()='Güncelle']")
    public WebElement guncelleButton;
    @FindBy(xpath = "//*[contains(text(),'sonuç kodu güncellendi')]")
    public List<WebElement> sonucKoduGuncellendiPopup;
    @FindBy(xpath = "//td[text()='Oluşturma']//following::button[@mattooltip='Bu versiyonla devam et']")
    public WebElement olusturmaTipiBuVersiyonIleDevamEt;
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
    public WebElement veriSetleriSekmesi;
    @FindBy(xpath = "//a[text()=' İlişkili Veriler ']")
    public WebElement ilişkiliVerilerMenü;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement veriEkleİkon;
    @FindBy(xpath = "//*[contains(text(),'Excel row number cannot be single digit.')]")
    public WebElement uygunFormattaVeriEkleyinPoUp;
    @FindBy(xpath = "//*[contains(text(),'Bu dosya adında bir kayıt zaten var.')]")
    public WebElement aynıİsimdeVeriEklenemezPopup;


    //Veri Setleri-Veri Seti Şablonu Menüsü-Veri Seti Şablonu Ekleme
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


    //Veri Setleri-Veri Seti Şablonu Menüsü-Veri Seti Şablonu Düzenleme
    @FindBy(xpath = "//*[contains(text(),'veri seti şablonu güncellendi')]")
    public List<WebElement> veriSetiŞablonuGüncellendiPopUp;
    @FindBy(xpath = "//div[contains(@style,'margin-right')]")
    public WebElement veriSetiAlanı;


    //Veri Setleri-Veri Seti Şablonu Menüsü-Veri Seti Şablonu Listeleme
    @FindBy(xpath = "//mat-icon[contains(@class,'red')]")
    public List<WebElement> pasifVeriSetiŞablonuList;
    @FindBy(xpath = "//mat-icon[contains(@class,'green')]")
    public List<WebElement> aktifVeriSetiŞablonuList;

    //Veri Setleri-Veri Seti Şablonu Menüsü-Veri Seti Şablonu Aktif Pasif Etme
    @FindBy(xpath = "//*[contains(text(),'kayıt güncellendi')]")
    public List<WebElement> verSetiŞablonuAktifPasifEtmePopup;


    //Veri Setleri-Veri Setleri Menüsü Veri Seti Ekleme
    @FindBy(xpath = "//a[text()=' Veri Setleri ']")
    public WebElement veriSetleriMenü;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement veriSetiEkleIkon;

    //Form Alan Tipi
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    public WebElement formAlanTipi;
    @FindBy(xpath = "//span[text()='TextBox']")
    public WebElement formAlanTipiTextBox;
    @FindBy(xpath = "//span[text()='MultilineTextBox']")
    public WebElement formAlanTipiMultilineTextBox;
    @FindBy(xpath = "//span[text()='CheckBox']")
    public WebElement formAlanTipiCheckBox;
    @FindBy(xpath = "//span[text()='ComboBox']")
    public WebElement formAlanTipiComboBox;
    @FindBy(xpath = "//span[text()='ListBox']")
    public WebElement formAlanTipiListBox;

    //Veri Tipi
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    public WebElement veriTipi;
    @FindBy(xpath = "//span[text()='Karakter']")
    public WebElement verTipiKarakter;
    @FindBy(xpath = "//span[text()='Nümerik']")
    public WebElement verTipiNümerik;
    @FindBy(xpath = "//span[text()='Nümerik Kod']")
    public WebElement verTipiNümerikKod;
    @FindBy(xpath = "//span[text()='Tarih']")
    public WebElement verTipiTarih;


    @FindBy(name = "data.Name")
    public WebElement alanAdi;
    @FindBy(xpath = "//input[@aria-label='Alan Adı']//descendant-or-self::input[contains(@class,'invalid')]")
    public WebElement bosAlanAdi;
    @FindBy(name = "data.Label")
    public WebElement etiketAdi;
    @FindBy(name = "data.ObjectName")
    public WebElement dbAdi;
    @FindBy(name = "data.ExternalId")
    public WebElement veriKaynagiAlanAdi;
    @FindBy(name = "data.Description")
    public WebElement veriSetiAciklama;
    @FindBy(xpath = "//span[text()=' Veriyi Şifrele ']")
    public WebElement veriyiŞifrele;
    @FindBy(xpath = "//span[text()=' Kaydet ']")
    public WebElement veriSetiKaydetButton;
    @FindBy(xpath = "//span[text()=' Vazgeç']")
    public WebElement veriSetiVazgeçButton;


    //Veri Seti Özellikler Tab'ı
    @FindBy(xpath = "//div[text()='Özellikler']")//ancestor::div[@aria-disabled='false']
    public WebElement veriSetiOzelliklerTab;

    @FindBy(name = "attribute.LenMax")
    public WebElement maxVeriUzunlugu;
    @FindBy(xpath = "//span[text()=' Varsayılan Değer ']")
    public WebElement varsayılanDeğer;

    //Veri Seti Veriler Tab'ı
    @FindBy(xpath = "//div[text()='Veriler']//ancestor::div[@aria-disabled='false']")
    public WebElement veriSetiVerilerTab;
    @FindBy(name = "optionItem.Key")
    public WebElement anahtarDeğer;
    @FindBy(name = "optionItem.Value")
    public WebElement görünenDeğer;
    @FindBy(xpath = "//button[@mattooltip='Kaydet']")
    public WebElement veriKaydet;
    @FindBy(xpath = "//*[contains(text(),'veri seti eklendi.')]")
    public List<WebElement> verSetiEklendiPopup;
    @FindBy(xpath = "//*[contains(text(),'En az 2 tane veri girmelisiniz.')]")
    public List<WebElement> enAzİkiVeriGirmelisinizPopup;
    @FindBy(xpath = "//*[contains(text(),'değerinden büyük olamaz')]")
    public List<WebElement> maxVeriUzunluguPopup;
    @FindBy(xpath = "//button[text()='Kapat']")
    public WebElement popupKapat;

    //Veri seti ekleme zorunlu alanlar boş bırakılamaz popUp
    @FindBy(xpath = "//*[contains(text(),'tipi seçiniz')]")
    public List<WebElement> formAlanVeyaVeriTipiSeçinizPopup;
    @FindBy(xpath = "//*[contains(text(),'Alan Adı boş geçilemez.')]")
    public List<WebElement> alanAdıBoşBırakılamazPopup;
    @FindBy(xpath = "//*[contains(text(),'Etiket Adı boş geçilemez.')]")
    public List<WebElement> etiketAdıBoşBırakılamazPopup;
    @FindBy(xpath = "//*[contains(text(),'Db Adı boş geçilemez.')]")
    public List<WebElement> dbAdıBoşBırakılamazPopup;
    @FindBy(xpath = "//*[contains(text(),'İlk karakter nümerik olamaz.')]")
    public List<WebElement> dbAdıIlkKarakternümerikOlamazPopup;
    @FindBy(xpath = "//*[contains(text(),'özel karakter kullanılamaz')]")
    public List<WebElement> dbAdiOzelKarakterKullanilamazPopup;
    @FindBy(xpath = "//*[contains(text(),'Lütfen kontrol edip tekrar deneyin.')]")
    public List<WebElement> alanEtiketVeDbAdiAynıOlamazPopup;

    @FindBy(xpath = "//*[contains(text(),'alanlarına herhangi bir değer atanmamıştır.')]")
    public List<WebElement> anahtarVeGörünenDeğerAtanmadıPopup;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Listeleme
    @FindBy(xpath = "//mat-icon[contains(@class,'red')]")
    public List<WebElement> pasifVeriSetiList;
    @FindBy(xpath = "//mat-icon[contains(@class,'green')]")
    public List<WebElement> aktifVeriSetiList;

    @FindBy(xpath = "//*[contains(text(),'kaydı güncellendi')]")
    public List<WebElement> veriSetiAktifPasifEtmePopup;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Listeleme
    @FindBy(className = "cdk-overlay-pane")
    public WebElement ekleModalıDraggable;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Kopyalama
    @FindBy(xpath = "//span[text()=' Kopyala']")
    public WebElement kopyalaButton;
    @FindBy(xpath = "//*[contains(text(),'veri seti kopyalandı.')]")
    public List<WebElement> veriSetiKopyalandıPopup;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]//following::mat-select[contains(@class,'disable')]")
    public WebElement veriTipiDisabled;
    @FindBy(xpath = "(//mat-select[@role='combobox']//ancestor-or-self::mat-select[contains(@class,'disable')])[2]")
    public WebElement formAlanTipiDisabled;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Güncelleme
    @FindBy(xpath = "//*[contains(text(),'veri seti güncellendi.')]")
    public List<WebElement> veriSetiGüncellendiPopUp;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Kontrol Ekleme-Silme
    @FindBy(name = "validator.ValidatorType")
    public WebElement veriSetiKontrolTipi;
    @FindBy(xpath = "//mat-option[@value='required']//following::span[text()='Gerekli Alan']")
    public WebElement kontrolTipiGerekliAlan;
    @FindBy(xpath = "//span[text()='Kontrol Deseni']")
    public WebElement kontrolTipiKontrolDeseni;
    @FindBy(name = "validator.Message")
    public WebElement kontrolMesajı;
    @FindBy(xpath = "//button[@mattooltip='Kaydet']")
    public WebElement kontrolMesajıKaydet;
    @FindBy(xpath = "//span[text()='Kapat']")
    public WebElement kontrolKapatButton;
    @FindBy(xpath = "//button[@mattooltip='Sil']")
    public List<WebElement> kontrolSil;

    //Veri Setleri-Veri Setleri Menüsü-Veri Setleri Versiyon Değiştirme
    @FindBy(xpath = "//span[text()=' Versiyonu Geri Al ']")
    public WebElement versiyonGeriAl;


    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Ekleme
    @FindBy(xpath = "//span[text()='SMS']")
    public WebElement smsSekmesi;
    @FindBy(xpath = "//a[contains(@href,'/sms/templates')]")
    public WebElement smsSablonlar;
    @FindBy(xpath = "//button[@mattooltip='Ekle']")
    public WebElement ekleIkon;
    @FindBy(xpath = "//input[@data-placeholder='Veri Seti']")
    public WebElement smsSablonuEklemeVeriSeti;
    @FindBy(xpath = "//div[@aria-label='Rich Text Editor, main']")
    public WebElement smsSablonuEklemeSablonMetni;
    @FindBy(xpath = "//*[contains(text(),'sms şablonu eklendi.')]")
    public List<WebElement> smsSablonuEklendiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Şablon metni alanına en az 10 karakter girilmeli.')]")
    public List<WebElement> sablonMetniOnKarakterOlmalıPopUp;

    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Ekleme
    @FindBy(xpath = "//*[contains(text(),'sms şablonu güncellendi.')]")
    public List<WebElement> smsSablonuGuncellendiPopUp;

    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Listeleme
    @FindBy(xpath = "//mat-icon[contains(@class,'red')]")
    public List<WebElement> pasifSmsSablonuList;
    @FindBy(xpath = "//mat-icon[contains(@class,'green')]")
    public List<WebElement> aktifSmsSablonuList;

    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Aktif-Pasif Etme
    @FindBy(xpath = "//*[contains(text(),'kayıt güncellendi')]")
    public List<WebElement> smsSablonuAktifPasifEdildPopUp;

    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Silme
    @FindBy(xpath = "//button[@mattooltip='Sil']")
    public WebElement silIkon;
    @FindBy(xpath = "//*[contains(text(),'kayıt silindi')]") //sms şablonu güncellendi.
    public List<WebElement> smsSablonuSilindiPopUp;

    //SMS Sayfası-Şablonlar Menüsü-Sms şablonu Silme
    @FindBy(xpath = "//span[text()='Versiyonu Geri Al']")
    public WebElement versiyonuGeriAl;
    @FindBy(xpath = "//*[contains(text(),'sms şablonu güncellendi.')]")
    public List<WebElement> versiyonGuncellendi;


    //SMS Sayfası-Sms Yaratıcı Menüsü-Sms Yaratıcı oluşturma
    @FindBy(xpath = "//a[text()=' Sms Yaratıcı ']")
    public WebElement smsSablonYaratici;
    @FindBy(xpath = "//input[contains(@data-placeholder,'Yaratıcı Id')]")
    public WebElement smsYaraticiId;
    @FindBy(xpath = "//input[contains(@data-placeholder, 'Yaratıcı Adı')]")
    public WebElement smsYaraticiAdi;
    @FindBy(xpath = "//*[contains(text(),'Sms Tanımı Oluşturuldu.')]")
    public List<WebElement> smsYaraticiOlusturulduPopUp;

    //SMS Sayfası-Sms Yaratıcı Menüsü-Sms Yaratıcı Güncelle
    @FindBy(xpath = "//span[text()=' Güncelle ']")
    public WebElement smsGuncelleButton;
    @FindBy(xpath = "//*[contains(text(),'Sms Tanımı Güncellendi.')]")
    public List<WebElement> smsYaraticiGuncellendiPopUp;

    //Listeler Sayfası-DNC Menüsü-Manuel DNC ekleme
    @FindBy(xpath = "//span[text()='Listeler']")
    public WebElement listelerSekmesi;
    @FindBy(xpath = "//a[text()=' DNC  ']")
    public WebElement dncMenu;
    @FindBy(xpath = "//div[text()='MANUEL DNC KAYDI EKLE']")
    public WebElement manuelDncKaydiEkleTab;
    @FindBy(name = "dncModel.CampId")
    public WebElement kampanyaId;
    @FindBy(name = "dncModel.TelNo")
    public WebElement telefonNumarasi;
    @FindBy(name = "dncModel.ClientNo")
    public WebElement clientId;
    @FindBy(xpath = "//*[contains(text(),'Kayıt Eklendi')]")
    public List<WebElement> manuelDncKaydiEklendiPopUp;
    @FindBy(xpath = "//mat-select[@placeholder='Arama Katagorisi']")
    public WebElement aramaKatagorisi;
    @FindBy(xpath = "//span[text()='ClientNo']")
    public WebElement aramaKatagorisiClientNo;
    @FindBy(xpath = "//span[text()='TelNo']")
    public WebElement aramaKatagorisiTelNo;
    @FindBy(xpath = "//span[text()='CampId']")
    public WebElement aramaKatagorisiCampId;
    @FindBy(xpath = "//mat-icon[text()='search']")
    public WebElement araButton;

    //Listeler Sayfası-DNC Menüsü-DNC List ekleme-silme
    @FindBy(xpath = "//input[@type='file']")
    public WebElement dosyaSecButton;
    @FindBy(xpath = "//span[text()='DNC Liste Ekle']")
    public WebElement dncListEkle;
    @FindBy(xpath = "//span[text()='DNC Liste Sil']")
    public WebElement dncListSil;
    @FindBy(xpath = "//div[text()='DNC LİSTE EKLE-SİL']")
    public WebElement dncListeEkleSilTab;
    @FindBy(xpath = "//*[contains(text(),'Kayıtlar Ekleniyor...')]")
    public WebElement dncListEkleniyorPopUp;
    @FindBy(xpath = "//*[contains(text(),'Kayıtlar Silinyor...')]")
    public WebElement dncListSiliniyorPopUp;
    @FindBy(xpath = "//*[contains(text(),'Excel formatı uygun değildir')]")
    public WebElement uygunOlmayanFormattaDncPopUp;


    //Sİstem Sayfası-Rol/Yetki Matrisi Menüsü
    @FindBy(xpath = "//span[text()='Sistem']")
    public WebElement sistemSayfasi;
    @FindBy(xpath = "//a[text()=' Rol/Yetki Matrisi ']")
    public WebElement rolYetkiMatrisiMenu;
    @FindBy(xpath = "//mat-select[@role='combobox']")
    public WebElement yetkiTipi;
    @FindBy(xpath = "//span[text()='Kullanıcı']")
    public WebElement yetkiTipiKullanici;
    @FindBy(xpath = "//mat-option[@value='rol']")
    public WebElement yetkiTipiRol;
    @FindBy(id = "searchForContent")
    public WebElement kullaniciRolSearchBox; //
    @FindBy(xpath = "//*[contains(text(),'Güncelleme başarı ile yapıldı!')]")
    public WebElement yetkiVeridiPopUp;


    //Task-Scheduler Sayfası-İş zamanlayıcı Menüsü
    @FindBy(xpath = "//span[text()='Task Scheduler']")
    public WebElement taskSchedulerSayfasi;
    @FindBy(xpath = "//a[text()=' İş Zamanlayıcı ']")
    public WebElement isZamanlayiciMenu;

    @FindBy(xpath = "//input[@data-placeholder='İş Adı']")
    public WebElement isAdi;
    @FindBy(xpath = "//mat-select[@name='data.ScriptId']")
    public WebElement script;
    @FindBy(xpath = "//a[text()=' Dakika ']")
    public WebElement dakikaTab;
    @FindBy(xpath = "//select[contains(@class,'minutes form-control cron-editor-select ng-untouched ng-pristine ng-valid')]")
    public WebElement dakikaGir;
    @FindBy(xpath = "//select[contains(@class,'seconds form-control cron-editor-select ng-untouched ng-pristine')]")
    public WebElement saniyeGir;

    @FindBy(xpath = "//a[text()=' Saat ']")
    public WebElement saatTab;
    @FindBy(xpath = "//select[contains(@class,'hours form-control cron-editor-select ng-untouched')]")
    public WebElement saatGir;
    @FindBy(xpath = "(//select[contains(@class,'seconds form-control cron-editor-select ng-untouched ng-pristine')])[2]")
    public WebElement saatIcinSaniyeGir;

    @FindBy(xpath = "//a[text()=' Gün ']")
    public WebElement gunTab;
    @FindBy(xpath = "//select[contains(@class,'days form-control cron-editor-select ng-untouched')]")
    public WebElement gunGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[1]")
    public WebElement gunIcinSaatGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[2]")
    public WebElement gunIcinDakikaGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[2]")
    public WebElement gunIcinSaniyeGir;


    @FindBy(xpath = "//a[text()=' Hafta ']")
    public WebElement haftaTab;
    @FindBy(xpath = "//label[contains(text(),'Pazartesi')]")
    public WebElement pazartesi;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[4]")
    public WebElement haftaIcinSaatGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[5]")
    public WebElement haftaIcinDakikaGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[5]")
    public WebElement haftaIcinSaniyeGir;


    @FindBy(xpath = "//a[text()=' Ay ']")
    public WebElement ayTab;
    @FindBy(xpath = "//select[contains(@class,'months-small form-control cron-editor-select ng-untouched')]")
    public WebElement ayGir;
    @FindBy(xpath = "(//select[contains(@class,'month-days form-control cron-editor-select ng-untouched')])[1]")
    public WebElement ayIcinGunGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[7]")
    public WebElement ayIcinSaatGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[8]")
    public WebElement ayIcinDakikaGir;
    @FindBy(xpath = "(//select[contains(@class,'timeFormControl form-control cron-editor-select ng-untouched')])[8]")
    public WebElement ayIcinSaniyeGir;


    @FindBy(xpath = "//*[contains(text(),'İş Adı Boş Geçilemez')]")
    public WebElement isAdiBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Script Adı Boş Geçilemez')]")
    public WebElement scriptAdiBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Lütfen gerekli alanları doldurun.')]")
    public WebElement isZamanlayiciEklendiPopUp;
    //Başarılı şekilde eklendi uyarısı çıkmadığı için şimdilik bu popup ile doğrulama yapılıyor
    @FindBy(xpath = "//*[contains(text(),'Çalıştırıldı!')]")
    public WebElement planlanmisIsiCasitirPopUp;
    @FindBy(xpath = "//*[contains(text(),'Zamanlanan İş Durduruldu')]")
    public WebElement zamanlananIsDurdurulduPopUp;
    @FindBy(xpath = "//td[contains(text(),'is zamanlayici_809-57-3708')]//following-sibling::td[contains(@class,'Resume')]//preceding-sibling::mat-icon[@mattooltip='Çalıştırmaya Devam Et']")
    public WebElement calistirmayaDevamEtIcon;

    @FindBy(xpath = "//*[contains(text(),'Durdurulmuş İş Tekrar Çalıştırıldı!')]")
    public WebElement durdurulanIşTekrarÇalıştırıldıPopUp;
    @FindBy(xpath = "//td[contains(text(),'is zamanlayici_809-57-3708')]//following-sibling::td[contains(@class,'Resume')]//preceding-sibling::mat-icon[@mattooltip='Durdur']")
    public WebElement durdurIcon;

    //Task-Scheduler Sayfası-İş zamanlayıcı Güncelleme
    @FindBy(xpath = "//*[contains(text(),'Eklemeye çalıştığınız iş aynı bilgilerle önceden oluşturulmuştur')]")
    public WebElement ayniIsimdeIsOlusturulduPopUp;
    @FindBy(xpath = "//*[contains(text(),'Planlanmış iş güncellendi.')]")
    public WebElement planlanmisIsGuncellendiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Planlanmış iş silindi.')]")
    public List<WebElement> planlanmisIsSilindiPopUp;
    @FindBy(xpath = "//mat-slide-toggle[@mattooltip='Devre Dışı Bırakılanlar']")
    public WebElement taskSchedulerDevreDisiBirakIkon;


    //Task-Scheduler Sayfası-Log Menüsü
    @FindBy(xpath = "//a[text()=' Log ']")
    public WebElement logMenu;
    @FindBy(xpath = "//input[@data-placeholder='İş Adı']")
    public WebElement logIsAdiSearchBox;
    @FindBy(xpath = "//input[@data-placeholder='Oluşturan']")
    public WebElement logIsOlusturanSearchBox;
    @FindBy(xpath = "//input[@data-placeholder='Başlangıç Tarihi']")
    public WebElement logBaslangicTarihi;
    @FindBy(xpath = "(//mat-icon[text()='settings_backup_restore'])[1]")
    public WebElement logBaslangicTarihiSifirla;
    @FindBy(xpath = "//input[@data-placeholder='Bitiş Tarihi']")
    public WebElement logBitisTarihi;
    @FindBy(xpath = "(//mat-icon[text()='settings_backup_restore'])[2]")
    public WebElement logBitisTarihiSifirla;
    @FindBy(xpath = "//span[text()='Filtrele']")
    public WebElement logFiltrele;
    @FindBy(xpath = "//span[text()='Sıfırla']")
    public WebElement logSifirla;
    @FindBy(xpath = "//div[text()='İş Adı']")
    public WebElement logIsAdiSirala;
    @FindBy(xpath = "//div[text()='İş Adı']//ancestor::th[@aria-sort='ascending']")
    public WebElement logIsAdiSiralaDogrula;

    @FindBy(xpath = "//div[text()='Oluşturan']")
    public WebElement logOlusturanSirala;
    @FindBy(xpath = "//div[text()='Oluşturan']//ancestor::th[@aria-sort='ascending']")
    public WebElement logOlusturanSiralaDogrula;

    @FindBy(xpath = "//div[text()='Log']")
    public WebElement logSirala;
    @FindBy(xpath = "//div[text()='Log']//ancestor::th[@aria-sort='ascending']")
    public WebElement logSiralaDogrula;

    @FindBy(xpath = "//div[text()='Tarih']")
    public WebElement logTarihSirala;
    @FindBy(xpath = "//div[text()='Tarih']//ancestor::th[@aria-sort='ascending']")
    public WebElement logTarihSiralaDogrula;


    //Task-Scheduler Sayfası-Script Tanımı-Script Ekleme
    @FindBy(xpath = "//a[text()=' Script Tanımı ']")
    public WebElement scriptTanimiMenu;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement yeniScriptscriptAdi;
    @FindBy(xpath = "//mat-select[@role='combobox']")
    public WebElement yeniScriptbaglanti;
    @FindBy(xpath = "//input[contains(@type,'number')]")
    public WebElement yeniScriptkomutZamanAsimi;
    @FindBy(xpath = "//textarea[@data-placeholder='Script . . .']")
    public WebElement yeniScriptScript;
    @FindBy(xpath = "//*[contains(text(),'Script başarıyla kaydedildi.')]")
    public WebElement scriptEklendiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Script Adı Boş Geçilemez')]")
    public WebElement ScriptAdiBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Bağlantı Boş Geçilemez')]")
    public WebElement baglantiBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Konut Zaman Aşımı Boş Geçilemez')]")
    public WebElement komutZamanAsimiBosGecilemezPopUp;
    @FindBy(xpath = "//input[contains(@type,'number')]//descendant-or-self::input[contains(@class,'invalid')]")
    public WebElement komutZamanAsimiBos;
    @FindBy(xpath = "//*[contains(text(),'Script Alanı Boş Geçilemez')]")
    public WebElement ScriptAlaniBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Eklemeye çalıştığınız script aynı bilgilerle önceden oluşturulmuştur')]")
    public WebElement scriptAdiAyniPopUp;


    //Task-Scheduler Sayfası-Script Tanımı-Script Ekleme
    @FindBy(xpath = "//*[contains(text(),'Script başarıyla güncellendi.')]")
    public WebElement ScriptBasariylaGuncellendiPopUp;

    //Task-Scheduler Sayfası-Script Tanımı-Script Ekleme
    @FindBy(xpath = "//*[contains(text(),'Script silindi')]")
    public WebElement scriptSilindiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Script silindi')]")
    public List<WebElement> scriptSilinmediPopUp;


    //Ortam Tanımları Sayfası-Çıkış Numaraları
    @FindBy(xpath = "//span[text()='Ortam Tanımları']")
    public WebElement ortamTanimlariSayfasi;
    @FindBy(xpath = "//a[text()=' Çıkış Numaraları ']")
    public WebElement cikisNumaralariMenu;
    @FindBy(name = "cpnNumberModel.TelNo")
    public WebElement cikisNumaralariTelNo;
    @FindBy(xpath = "//*[contains(text(),'telefon numarası eklendi.')]")
    public List<WebElement> telefonNumarasiEklendiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Telefon numarası boş geçilemez.')]")
    public WebElement telefonNumarasiBosGecilemezPopUp;
    @FindBy(xpath = "//*[contains(text(),'Aynı telefon numarasıyla zaten bir kayıt var.')]")
    public WebElement ayniTelNoVarPopUp;
    @FindBy(xpath = "//*[contains(text(),'telefon numarası güncellendi.')]")
    public List<WebElement> telefonNumarasiGuncellendiPopUp;


    //Ortam Tanımları Sayfası-Çıkış Numaraları
    @FindBy(xpath = "//a[contains(@href,'/env-definition/cpn-template')]")
    public WebElement ortamTanimlariSablonlarMenu;
    @FindBy(xpath = "//*[contains(text(),'çıkış numara şablonu eklendi.')]")
    public WebElement cikisNumaraSablonuEklendiPopUp;
    @FindBy(xpath = "//*[contains(text(),'Bu isimle bir şablon zaten var.')]")
    public WebElement buIsimleBirSablonVarPopUp;
    @FindBy(xpath = "//*[contains(text(),'Bir veya birden fazla numara seçiniz.')]")
    public WebElement birdenFazlaNumaraSecinizPopUp;
    @FindBy(xpath = "//*[contains(text(),'çıkış numara şablonu güncellendi.')]")
    public WebElement cikisNumaraSablonuGuncellendiPopUp;

    //Ortam Tanımları Sayfası-Baglantı Menüsü
    @FindBy(xpath = "//a[text()=' Bağlantı ']")
    public WebElement ortamTanimlariBaglantiMenu;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement baglantiAdi;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement baglantiCumlesi;
    @FindBy(xpath = "//span[text()=' Bağlantıyı Test Et ']")
    public WebElement baglantiyiTestEt;
    @FindBy(xpath = "//*[contains(text(),'Test Başarılı!')]")
    public WebElement testBasariliPopUp;
    @FindBy(xpath = "//*[contains(text(),'Bağlantı Hatası')]")
    public WebElement formatiHataliPopUp;


    //Kampanyalar Sayfası-Arama Limitleri Menüsü
    @FindBy(xpath = "//span[text()='Kampanyalar']")
    public WebElement kampanyalarSayfasi;
    @FindBy(xpath = "//a[text()=' Arama Limitleri ']")
    public WebElement aramaLimitleriMenu;
    @FindBy(xpath = "(//mat-checkbox[@name='isChoisedNextSessionCampaign'])[1]")
    public WebElement BirSonrakiLoginIslemindeBuKampanyaIleAcilsin;
    @FindBy(id = "showChosenCampaign")
    public WebElement kampanyaSecButton;
    @FindBy(xpath = "//span[text()='Seç']")
    public WebElement aramaLimitleriSecButton;
    @FindBy(xpath = "//span[text()='Ana Sayfaya Dön']")
    public WebElement anaSayfayaDon;
    @FindBy(xpath = "//span[text()='Ekle']")
    public WebElement limitEkleButton;
    @FindBy(xpath = "//h4[contains(text(),'Kampanyası İçin İşlem Yapmaktasınız')]")
    public WebElement kampanyaIleIslemYapilmakta;
    @FindBy(xpath = "//input[@data-placeholder='Kayıt Günü']")
    public WebElement limitEkleKayitGunu;
    @FindBy(xpath = "(//input[@data-placeholder='Kayıt Günü'])[2]")
    public WebElement limitEkleKayitGunuIki;
    @FindBy(xpath = "//input[@data-placeholder='Arama Sayısı']")
    public WebElement limitEkleAramaSayisi;
    @FindBy(xpath = "//mat-select[@role='combobox']")
    public WebElement limitEkleKampanyalar;
    @FindBy(xpath = "//span[text()='Tüm günlere uygula']")
    public WebElement tumGunlereUygula;
    @FindBy(xpath = "//span[text()='Tüm günlere uygula']")
    public WebElement limitSilIkon;
    @FindBy(xpath = "//*[contains(text(),'1. sıradaki Kayıt günü alanını doldurunuz.')]")
    public WebElement kayitGunuAlaniniDoldurunuzPopUp;
    @FindBy(xpath = "//*[contains(text(),'1. sıradaki Arama sayısı alanını doldurunuz.')]")
    public WebElement aramaSayisiAlaniniDoldurunuzPopUp;
    @FindBy(xpath = "//*[contains(text(),'İlk gün limiti sıfır olamaz.')]")
    public WebElement IlkGUnLimitiSifirOlamazPopUp;
    @FindBy(xpath = "//*[contains(text(),'Aynı gün için tek bir kayıt girilebilir.')]")
    public WebElement ayniGunIcinTekBirKayitGirilebilirPopUp;
    @FindBy(xpath = "//*[contains(text(),'Seçtiğiniz kampanyaların ilgili günlerinde farklı tanımlar bulunmaktadır')]")
    public WebElement ayniKayitGünüVarPopUp;
    @FindBy(xpath = "//mat-slide-toggle[@mattooltip='Silinenleri Göster']")
    public WebElement silinenAramaLimitleriniGosterToggle;
    @FindBy(xpath = "//td[contains(@class,'CallingDayAndLimitInfo passiveRecord')]")
    public List<WebElement> silinenAramaLimitleriList;


    //Kampanyalar Sayfası-Arama Limitleri Menüsü
    @FindBy(xpath = "//a[text()=' Çağrı Aksiyonları ']")
    public WebElement cagriAksiyonlariMenu;
    @FindBy(name = "selectedResultTemplates")
    public WebElement cagriAksiyonuSonucKoduSablonuEkle;
    @FindBy(xpath = "//mat-slide-toggle[@mattooltip='Tümü']")
    public WebElement tumSonucKodlariSecToggle;
    @FindBy(xpath = "//mat-slide-toggle[@mattooltip='Tüm kampanyalara uygula']")
    public WebElement tumKampanyalaraUygulaToggle;
    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[2]")
    public WebElement kosulTipiComboBox;
    @FindBy(xpath = "//span[text()=' Ardışık ']")
    public WebElement kosulTipiArdisik;
    @FindBy(xpath = "//span[text()=' Toplam ']")
    public WebElement kosulTipiToplam;
    @FindBy(xpath = "//span[text()=' Attempt ']")
    public WebElement kosulTipiAttempt;

    @FindBy(xpath = "//input[@data-placeholder='Değer']")
    public WebElement cagriAksiyonuEkleDeger;
    @FindBy(xpath = "(//input[contains(@onkeypress,'return event.charCode')])[2]")
    public WebElement cagriAksiyonuEkleDakika;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[3]")
    public WebElement aksiyonTipiComboBox;
    @FindBy(xpath = "//span[text()=' Sms gönder ']")
    public WebElement aksiyonTipiSmsGonder;
    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[4]")
    public WebElement smsTamplateComboBox;
    @FindBy(xpath = "//span[text()=' Kayıt durumu güncelle ']")
    public WebElement aksiyonTipiKayitDurumuGuncelle;
    @FindBy(xpath = "//mat-select[@placeholder='Kayıt Durumu']")
    public WebElement kayitDurumuComboBox;
    @FindBy(xpath = "//span[text()=' Web Servis Çağır ']")
    public WebElement aksiyonTipiKayitWebServisCagir;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement webServisLink;
    @FindBy(xpath = "//mat-icon[text()='delete']")
    public WebElement aksiyonSil;
    @FindBy(xpath = "//*[contains(text(),'alanını doldurunuz')]")
    public WebElement kosulTipiBosGecilemezPopUp;


}
