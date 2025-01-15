package pages;

import io.appium.java_client.pagefactory.WindowsFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class DesignerPage {
    public DesignerPage() {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //public static WebElement tbLeftPanel() {
    //    return Driver.getDriver().findElementByAccessibilityId("tbLeftPanel");
    //}

    //Login page locator
    @FindBy(xpath = "//Edit[@AutomationId='txtUserName']")
    public WebElement kullaniciAdi;
    @FindBy(xpath = "//Edit[@AutomationId='txtPassword']")
    public WebElement sifre;
    @FindBy(xpath = "//Button[@AutomationId='cmdLogin']")
    public WebElement sistemeGiris;
    @FindBy(name = "Vazgeç")
    public WebElement loginVazgecButton;
    @FindBy(xpath = "//Pane[@AutomationId='picDetay']")
    public WebElement loginDetayButton;
    @FindBy(name = "Uygulama")
    public WebElement uygulamaAdi;
    @FindBy(xpath = "//Edit[@AutomationId='txtHost']")
    public WebElement sunucu;
    @FindBy(xpath = "//Edit[@AutomationId='txtPort']")
    public WebElement port;


    //Ana Sayfa

    @FindBy(name = "Campaigns")
    public WebElement anaSayfaCampaignKlasor;
    @FindBy(name = "Environment")
    public WebElement anaSayfaEnvironment;
    @FindBy(name = "Test")
    public WebElement anaSayfaTest;
    @FindBy(name = "Kapat")
    public WebElement pencereKapat;
    @FindBy(name = "Evet")
    public WebElement pencereKapatEvet;
    @FindBy(name = "Tamam")
    public WebElement tamam;


    //Kampanya Ekleme ve Kampanuya Duzenleme Sayfasi
    @FindBy(xpath = "//TreeItem[@Name='Campaigns']")
    public WebElement campaigns;
    @FindBy(xpath = "//Edit[@AutomationId='txtSearchCamp']")
    public WebElement campSearchBox;
    @FindBy(xpath = "//TreeItem[@Name='MehmetDemir']")
    public WebElement mehmetDemir;
    @FindBy(name = "Kampanya Ekle")
    public WebElement kampanyaEkle;
    @FindBy(name = "Kampanya Adı")
    public WebElement kampanyaAdi;

    @FindBy(xpath = "//ComboBox[@AutomationId='cboFolder']")
    public WebElement eklencekKlasorComboBox;
    @FindBy(name = "Kanal Tipi")
    public WebElement kanalTipiComboBox;
    @FindBy(name = "Versiyonu hangi modda açmak istersiniz?")
    public WebElement versiyonAcmaModePenceresi;
    @FindBy(name = "Outbound")
    public WebElement outbound;
    @FindBy(name = "Inbound")
    public WebElement Inbound;
    @FindBy(name = "IVR")
    public WebElement ivr;
    @FindBy(name = "Klasör bilgisi boş, işlem yapılamaz")
    public WebElement klasorSec;
    @FindBy(name = "Kaydet")
    public WebElement kampanyaKaydet;
    @FindBy(name = "Ucms'te OTOMASYON_51 adında bir kampanya zaten mevcut.")
    public WebElement buIsimdeKampanyaMevcut;
    @FindBy(name = "DÜZENLEME")
    public WebElement kampanyaDuzenlemeModu;
    @FindBy(name = "Seç")
    public WebElement secButon;
    @FindBy(name = "Çağrı Cevaplanmadı (2)")
    public WebElement cagriCevaplanmadi;
    @FindBy(xpath = "//TreeItem[@Name='Mesgul (1071)']")
    public WebElement mesgul1071;
    @FindBy(name = "Tamam")
    public WebElement tamamButonu;
    @FindBy(name = "CUCUMBERTEST02 (266)")
    public WebElement cucumberTest01;


    //Kampanya Kopyalama
    @FindBy(name = "Kampanya Kopyala")
    public WebElement kampanyaKopyala;
    @FindBy(xpath = "//Document[@AutomationId='txtMsg']")
    public WebElement onayPenceresi;
    @FindBy(name = "Evet")
    public WebElement onayPenceresiEvet;
    @FindBy(name = "Hayır")
    public WebElement onayPenceresiHayir;
    @FindBy(xpath = "//Text[@AutomationId='65535']")
    public WebElement bilgiHataMesaji;


    //Kampanya Duzenleme
    @FindBy(name = "Kampanya Düzenle")
    public WebElement kampanyaDuznleButton;


    //Versiyon Yayinlama, Olusturma ve Versyon Silme
    @FindBy(name = "Kontrol ettim")
    public WebElement kontrolEttimCheckBox;
    @FindBy(name = "Versiyon Yayınla")
    public WebElement versiyonYayinlaButon;
    @FindBy(name = "Versiyon Oluştur")
    public WebElement versiyonOlusturButon;
    @FindBy(name = "Versiyon Sil")
    public WebElement versiyonSilButon;


    //Outboud Akis Tasarim Ekrani
    @FindBy(name = "Kampanya Tanım")
    public WebElement kampanyaTanimPenceresi;
    @FindBy(name = "CRM")
    public WebElement kampanyaTanimPenceresiCrmTab;
    @FindBy(xpath = "//Edit[@AutomationId='txtCampExtId1']")
    public WebElement hariciKampanyaId;
    @FindBy(name = "Dosya Kaynakları")
    public WebElement kampanyaTanimPenceresiDosyaKaynaklariTab;
    @FindBy(name = "Resim")
    public WebElement dosyaKaynaklariResim;
    @FindBy(name = "Ses Dosyası")
    public WebElement dosyaKaynaklariSesDosyasi;
    @FindBy(name = "XML Liste Kaynağı")
    public WebElement dosyaKaynaklariXmlListeKaynagi;
    @FindBy(name = "Sil")
    public WebElement silButon;
    @FindBy(name = "Öngörüm")
    public WebElement dosyaKaynaklariOngorum;
    @FindBy(name = "Dışa Ver")
    public WebElement dosyaKaynaklariDisaVer;
    @FindBy(name = "İçe Al")
    public WebElement dosyaKaynaklariIceAl;



    @FindBy(name = "Akış Tasarımı")
    public WebElement akisTasarimPenceresi;
    @FindBy(name = "Sonuç Kodu")
    public WebElement sonucKoduPenceresi;
    @FindBy(name = "Veri Seti")
    public WebElement veriSetiPenceresi;
    @FindBy(name = "Nesneler")
    public WebElement nesnelerPenceresi;
    @FindBy(name = "Hata")
    public WebElement hataPenceresi;


    //Iceri Veri Transferi Veri Kaynagi Secimi
    @FindBy(name = "Listeler")
    public WebElement listelerButon;
    @FindBy(name = "Kayıt Durum Değiştirme")
    public WebElement listelerEkraniKayitDurumDegistirmeTab;
    @FindBy(name = "Kayıt Güncelleme")
    public WebElement listelerEkraniKayitGuncellemeTab;
    @FindBy(name = "Arama Listesi Çevirme")
    public WebElement listelerEkraniAramaListesiCevirmeTab;
    @FindBy(name = "İçeri Veri Transferi")
    public WebElement listelerEkraniIceriVeriTransferiTab;
    @FindBy(name = "Veri Kaynağı Seçimi")
    public WebElement listelerEkraniIceriVeriTransferiVeriKaynagiSecimi;
    @FindBy(name = "Liste Yönetimi")
    public WebElement listelerEkraniListeYonetimiTab;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboTransferSrcType']")
    public WebElement iceriVeriTransferiVeriKaynagiTipi;
    @FindBy(name = "Dosya Formatı")
    public WebElement iceriVeriTransferiVeriKaynagiDosyaYolu;
    @FindBy(xpath = "//Edit[@AutomationId='txtTransferDelimiter']")
    public WebElement iceriVeriTransferiVeriKaynagiAyrac;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboTransferEncoding']")
    public WebElement iceriVeriTransferiVeriKaynagiFormati;
    @FindBy(name = "Sonraki")
    public WebElement iceriVeriTransferiSonrakiButon;
    @FindBy(name = "Önceki")
    public WebElement iceriVeriTransferiOncekiButon;

    //Iceri Veri Transferi Arama Listesi Secimi
    @FindBy(name = "Arama Listesi Seçimi")
    public WebElement iceriVeriTransferiAramaListesiSecimi;


    //Iceri Veri Transferi Kaynak-Hedef Alan Eşleştirme
    @FindBy(name = "Kaynak-Hedef Alan Eşleştirme")
    public WebElement iceriVeriTransferiKaynakHedefAlan;
    @FindBy(name = "Telefon Bilgileri")
    public WebElement iceriVeriTransferiKaynakHedefAlanTelefonBilgileri;
    @FindBy(name = "Type Row 1")
    public WebElement iceriVeriTransferiKaynakHedefAlanTelefonBilgileriTelTipi;


    @FindBy(name = "Müşteri Bilgileri")
    public WebElement iceriVeriTransferiKaynakHedefAlanMusteriBilgileri;
    @FindBy(name = "Kampanya Veri Seti")
    public WebElement iceriVeriTransferiKaynakHedefAlanKampanyaVeriSeti;
    @FindBy(name = "Kampanya Nesneleri")
    public WebElement iceriVeriTransferiKaynakHedefAlanKampanyaNesneleri;
    @FindBy(name = "Ulaşım Skoru")
    public WebElement iceriVeriTransferiKaynakHedefAlanUlasimSkoru;



    //Iceri Veri Transferi Transfer Şablonu Oluşturma
    @FindBy(name = "Transfer Şablonu Oluşturma")
    public WebElement iceriVeriTransferiTransferSablonu;



    //Iceri Veri Transferi Veri Transferi Sayfasi
    @FindBy(name = "Veri Transferi")
    public WebElement iceriVeriTransferiVeriTransferi;
    @FindBy(name = "Kaynaktaki Mükerrer Kayıtları İçeri Aktar")
    public WebElement veriTransferiKaynaktakiMukerrerKayitlarIceriAktar;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboTransferRecordStatus']")
    public WebElement veriTransferiBatchIdDurumu;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboShiftType']")
    public WebElement veriTransferiGecerlilikTarihi;
    //@FindBy(name = "Kontrol ettim")
    //public WebElement veriTransferiKontrolEttimCheckBox; //Baska yerde kullanilmis ordan alindi
    @FindBy(name = "Transferi Başlat")
    public WebElement veriTransferiTarnasferiBaslat;





    @FindBy(name = "toolboxZoomOutOutbound")
    public WebElement akisEkraniUzaklastirOB;
    @FindBy(name = "toolboxZoomInOutbound")
    public WebElement akisEkraniYakinlastirOB;
    @FindBy(name = "toolboxZoomOffOutbound")
    public WebElement akisEkraniNormalBoyuttaGosterOB;

    @FindBy(name = "toolboxFormAddOutbound")
    public WebElement formEkle;
    @FindBy(name = "Akış Başlangıç Formu")
    public WebElement akisBaslangicFormu;

    //WebService ekle Node
    @FindBy(name = "toolboxWSAddOutbound")
    public WebElement webServiceEkleOB;
    @FindBy(name = "Web Service")
    public WebElement webServiceTab;
    @FindBy(name = "Test Endpoint")
    public WebElement testEndpoint;
    @FindBy(xpath = "//Document[@AutomationId='txtJsonExample']")
    public WebElement ornekJson;
    @FindBy(name = "Yükle")
    public WebElement yukleButon;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboWsType']")
    public WebElement restSoapComboBox;
    @FindBy(xpath = "//Edit[@AutomationId='1001']")
    public WebElement soapUrl;
    @FindBy(name = "Parametre Değerleri")
    public WebElement parametreDegerleriButon;


    //Sessiondan deger oku
    @FindBy(name = "toolboxReadSessionOutbound")
    public WebElement sessiondanDegerOku;
    @FindBy(name = "Session'dan Değer Oku")
    public WebElement sessiondanDegerOkuTab;
    @FindBy(name = "FlexGrid")
    public WebElement veriSetiDegiskeniEklemeEkrani;
    @FindBy(name = "Değişken Ekle")
    public WebElement degiskenEkleButon;
    @FindBy(name = "Arama Metni")
    public WebElement degiskenEkleAramaMetniSearchBox;



    //Javascript Node
    @FindBy(name = "toolboxJsAddOutbound")
    public WebElement javaScriptEkle;
    @FindBy(name = "Javascript")
    public WebElement javaScriptTab;
    @FindBy(name = "Veri Seti Değişkeni")
    public WebElement javaScriptVeriSetiDegiskeni;
    @FindBy(name = "Ekranı Kapla")
    public WebElement ekranMaximize;
    @FindBy(name = "Sonuç Kodları")
    public WebElement sonucKodlariTab;

    //Script Node
    @FindBy(name = "toolboxScriptAddOutbound")
    public WebElement scriptEkleOB;
    @FindBy(name = "Script")
    public WebElement scriptTab;
    @FindBy(xpath = "//Document[@AutomationId='txtScript']")
    public WebElement scriptVeriSetiDegiskeniTxt;
    @FindBy(xpath = "//ComboBox[@AutomationId='cboScriptInsertVar']")
    public WebElement scriptVeriSetiDegiskeni;
    //scriptVeriSetiDegiskeni'nin Name'i yoktur
    @FindBy(xpath = "//Button[@AutomationId='cmdAddVariable']")
    public WebElement veriSetiDegiskeniEkleButon;
    @FindBy(name = "Ekle")
    public WebElement ekleButon;
    @FindBy(name = "Karar Nesnesi")
    public WebElement kararNesnesiComboBox;

    @FindBy(name = "toolboxObjAddOutbound")
    public WebElement kampanyaNesnesiEkle;
    @FindBy(name = "Standart Alanlar")
    public WebElement formTasarimiStandartAlanlar;
    @FindBy(name = "Etiket")
    public WebElement etiket;
    @FindBy(name = "Resim")
    public WebElement resim;
    @FindBy(name = "Non Client Input Sink Window")
    public WebElement screenShotClose;

    @FindBy(name = "Web Link")
    public WebElement webLink;
    @FindBy(name = "TextBox")
    public WebElement textBox;
    @FindBy(name = "MultilineTextBox")
    public WebElement multiLineTextBox;
    @FindBy(name = "ComboBox")
    public WebElement comboBox;
    @FindBy(name = "ListBox")
    public WebElement listBox;
    @FindBy(name = "CheckBox")
    public WebElement checkBox;
    @FindBy(name = "Veri Seti Değişkeni")
    public WebElement veriSetiDegiskeni;


    //IVR Akis Tasarim Ekrani
    @FindBy(name = "Kontrol Et")
    public WebElement kontrolEtButon;
    @FindBy(name = "Özellikler")
    public WebElement ozelliklerButon;
    @FindBy(name = "Inbound'a Kopyala")
    public WebElement inboundaKopyala;
    @FindBy(xpath = "//TitleBar[@AutomationId='TitleBar']")
    public WebElement ozelliklerpenceresiTitle;
    @FindBy(name = "toolboxZoomOutIVR")
    public WebElement akisEkraniUzaklastirIVR;
    @FindBy(name = "toolboxZoomInIVR")
    public WebElement akisEkraniYakinlastirIVR;
    @FindBy(name = "toolboxZoomOffIVR")
    public WebElement akisEkraniNormalBoyuttaGosterIVR;
    @FindBy(name = "toolboxAddPrompt")
    public WebElement anonsEkle;
    @FindBy(name = "toolboxAddInput")
    public WebElement veriGirisiEkle;
    @FindBy(name = "toolboxAddMenu")
    public WebElement menuEkle;
    @FindBy(name = "toolboxAddTransfer")
    public WebElement transferEkle;
    @FindBy(name = "toolboxAddAttachedDataIn")
    public WebElement cagridanVeriOku;
    @FindBy(name = "toolboxAddAttachedDataOut")
    public WebElement cagriyaVeriYaz;
    @FindBy(name = "toolboxAddHangUp")
    public WebElement gorusmeyiBitir;
    @FindBy(name = "toolboxAddIVRWebService")
    public WebElement webServiceEkleIVR;
    @FindBy(name = "toolboxAddIVRScript")
    public WebElement scriptEkleIVR;


    @FindBy(name = "Ara")
    public WebElement formAra;
    @WindowsFindBy(windowsAutomation = "Find")
    public WebElement formBul;
    @FindBy(name = "Hepsini göster")
    public WebElement eklenenTumNodelar;
    @FindBy(name = "Ekle")
    public WebElement formEkleButon;
    @FindBy(name = "Bağlantı Kur")
    public WebElement baglantiKurButon;
    @FindBy(name = "Bağlantı Sil")
    public WebElement baglantiSilButon;



}
