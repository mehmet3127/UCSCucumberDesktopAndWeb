package pages;

import io.appium.java_client.pagefactory.WindowsFindBys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;


public class DesignerPage {
    public DesignerPage() {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//Edit[@AutomationId='txtUserName']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//Edit[@AutomationId='txtPassword']")
    public WebElement sifre;

    @FindBy(xpath = "//Button[@AutomationId='cmdLogin']")
    public WebElement sistemeGiris;

    @FindBy(xpath = "//Button[@Name='Close']")
    public WebElement close;

    @FindBy(name = "Evet")
    public WebElement closeEvet;

    @FindBy(className = "WindowsForms10.RichEdit20W.app.0.3e2f22e_r9_ad1")
    public WebElement hataMesajı;

    @FindBy(className = "WindowsForms10.BUTTON.app.0.3e2f22e_r9_ad1")
    public WebElement tamam;

    @FindBy(xpath = "//Tree[@AutomationId='tvwCampaigns']//TreeItem[@Name='Campaigns']")
    public WebElement campaigns;

    @FindBy(xpath = "//TreeItem[@Name='MehmetDemir']")
    public WebElement mehmetDemir;

    @FindBy(xpath = "//MenuItem[@Name='Kampanya Ekle']")
    public WebElement kampanyaEkle;

    @FindBy(className = "WindowsForms10.EDIT.app.0.3e2f22e_r9_ad1")
    public WebElement kampanyaAdi;

    @FindBy(xpath = "//Button[@AutomationId='cmdSave']")
    public WebElement kampanyaKaydet;

    @FindBy(xpath = "//Button[@AutomationId='cmdEdit']")
    public WebElement kampanyaDüzenleme;

    @FindBy(xpath = "//Pane[@AutomationId='chkCampOutbound']")
    public WebElement outbound;

    @FindBy(xpath = "//Pane[@AutomationId='cmdSelectResultId']")
    public WebElement varsayılanSonuçKoduSeç;

    @FindBy(xpath = "//TreeItem[@Name='Cagri Cevaplanmadi (3)']")
    public WebElement çagrıCevaplanmadı;

    @FindBy(xpath = "//TreeItem[@Name='Mesgul (1071)']")
    public WebElement mesgul1071;

    @FindBy(xpath = "//Button[@AutomationId='cmdOk']")
    public WebElement tamamSonuçKodu;

    @FindBy(xpath = "//Button[@AutomationId='cmdCampSave']")
    public WebElement kaydet;

    @FindBy(name = "CUCUMBERTEST02 (266)")
    public WebElement cucumberTest01;

    @FindBy(name = "Akış Tasarımı")
    public WebElement akışTasarım;

    @FindBy(name = "toolStripButton30")
    public WebElement formEkle;

    @FindBy(name = "Ara")
    public WebElement formAra;

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



}
