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
    public WebElement kampanyaDuzenleme;
    @FindBy(name = "Seç")
    public WebElement varsayilanSonucKoduSec;
    @FindBy(name = "Çağrı Cevaplanmadı (2)")
    public WebElement cagriCevaplanmadi;
    @FindBy(xpath = "//TreeItem[@Name='Mesgul (1071)']")
    public WebElement mesgul1071;

    @FindBy(xpath = "//Button[@AutomationId='cmdOk']")
    public WebElement tamamSonucKodu;

    @FindBy(name = "CUCUMBERTEST02 (266)")
    public WebElement cucumberTest01;

    @FindBy(name = "Akış Tasarımı")
    public WebElement akisTasarim;

    @FindBy(name = "toolStripButton30")
    public WebElement formEkle;

    @FindBy(name = "Ara")
    public WebElement formAra;

    @WindowsFindBy(windowsAutomation = "Find")
    public WebElement formBul;

    @FindBy(name = "Hepsini göster")
    public WebElement eklenenFormlar;


    @FindBy(name = "Form.4-Form4")
    public WebElement form4;
    // "//Pane[@AutomationId='searchPanelOutbound']/List[@AutomationId='FoundItems']/ListItem[@Name='Form.4-Form4']"
    // "//Pane[@AutomationId='addFlowOutbound']"

    @FindBy(name = "Form.3-Form3")
    public WebElement form3;
    @FindBy(name = "Form.2-Form2")
    public WebElement form2;
    @FindBy(name = "Form.1-Form1")
    public WebElement form1;

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

}
