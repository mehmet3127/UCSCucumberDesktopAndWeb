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
    @FindBy(name = "Kapat")
    public WebElement pencereKapat;
    @FindBy(name = "Evet")
    public WebElement pencereKapatEvet;
    @FindBy(className = "WindowsForms10.RichEdit20W.app.0.3e2f22e_r9_ad1")
    public WebElement hataMesajı;
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
    public WebElement varsayilanSonucKoduSec;
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
    //public static WebElement tbLeftPanel() {
    //    return Driver.getDriver().findElementByAccessibilityId("tbLeftPanel");
    //}

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
    @FindBy(name = "Akış Tasarımı")
    public WebElement akisTasarim;
    @FindBy(name = "toolboxFormAddOutbound")
    public WebElement formEkle;
    @FindBy(name = "toolboxWSAddOutbound")
    public WebElement webServiceEkleOB;
    @FindBy(name = "toolboxReadSessionOutbound")
    public WebElement sessiondanDegerOku;

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
    @FindBy(xpath = "//TitleBar[@AutomationId='TitleBar']")
    public WebElement ozelliklerpenceresiTitle;
    @FindBy(name = "toolboxZoomOutIVR")
    public WebElement tasarimEkraniniUzaklastir;
    @FindBy(name = "toolboxZoomInIVR")
    public WebElement tasarimEkraniniYakinlastir;
    @FindBy(name = "toolboxZoomOffIVR")
    public WebElement tasarimEkraniniNormalBoyuttaGoster;
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
