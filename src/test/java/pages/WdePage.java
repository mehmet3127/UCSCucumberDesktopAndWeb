package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WdePage {

    public WdePage()  {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "InteractionWorkspace.exe")
    public WebElement wde;

    @FindBy(xpath = "//Edit[@AutomationId='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//Edit[@AutomationId='passwordBoxPassword']")
    public WebElement password;


    @FindBy(name = "_Log In")
    public WebElement login;

    @FindBy(name = "Hamburger Button")
    public WebElement hamburgerButton;

    @FindBy(name = "My C_ampaigns")
    public WebElement myCampaigns;

    @FindBy(name = "Get Record")
    public WebElement getRecord;

    //Runtime
    @FindBy(name = "UCMS Runtime Module")
    public WebElement runtimeModule;
    @FindBy(xpath = "//Button[@AutomationId='cmdFinishFlow']")
    public WebElement runtimeModuleBitir;
    @FindBy(id = "cmdCallDialog")
    public WebElement aramaButton;

    //@FindBy(xpath = "(//Hyperlink[@Name='Çağrı Cevaplanmadı'])[1]")
    //public WebElement cagriCevaplanmadi;

    @FindBy(xpath = "//Hyperlink[@ClassName='jstree-anchor']")
    public WebElement cagriCevaplanmadi;
    @FindBy(xpath = "//Edit[@AutomationId='txtSearch']")
    public WebElement sonucKoduAraSearchBox;
    @FindBy(name = "Görüşme Sonucu")
    public WebElement gorusmeSonucu;
    @FindBy(xpath = "//Button[@AutomationId='cmdFinish']")
    public WebElement sonucKoduBitirButon;
    @FindBy(name = "Tamam")
    public WebElement runtimeOnayButon;














}
