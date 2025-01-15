package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class GensysAdminPage {

    public GensysAdminPage() {

        PageFactory.initElements(Driver.webDriver(), this);
    }

    //GensysAdmin Login Test Location
    @FindBy(id = "details-button")
    public WebElement advanced;

    @FindBy(id = "proceed-link")
    public WebElement link;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ApplicationName")
    public WebElement applicationName;

    @FindBy(id = "Host")
    public WebElement hostName;

    @FindBy(id = "Port")
    public WebElement Port;

    @FindBy(id = "ext-gen47")
    public WebElement loginButton;

    @FindBy(className = "cr-title-left")
    public WebElement homePageTitle;


    //GenesysAdmin WindowHandles Test Location
    @FindBy(id = "ext-comp-1002__Tab-MENU_MON")
    public WebElement monitoring;
    @FindBy(xpath = "//a[text()='Navigate to Provisioning Campaigns']")
    public WebElement provisioning;
    @FindBy(id = "ext-comp-1002__Tab-MENU_OPER")
    public WebElement operations;
    @FindBy(id = "ext-comp-1018")
    public WebElement campIdSearchBox;
    @FindBy(id = "ext-gen168")
    public WebElement campIdSearchBoxAraButon;
    @FindBy(id = "ext-comp-1110")
    public WebElement campFiltreleSearchBox;

    @FindBy(id = "ext-gen196")
    public WebElement loadButton;
    @FindBy(id = "ext-gen249")
    public WebElement dialingMode;
    @FindBy(id = "ext-gen205")
    public WebElement kampanyaStartButton;






    //Environment Sekmesi Menuleri
    @FindBy(xpath = "//span[text()='Environment']")
    public WebElement environment;
    @FindBy(xpath = "//a[text()='Applications']")
    public WebElement applications;
    @FindBy(xpath = "//span[text()='Options']")
    public WebElement optionsTab;
    @FindBy(id = "cfgGrid-column-optex-grid-2")
    public WebElement optionsFilter;
    @FindBy(xpath = "(//td[contains(@class, 'val')])[2]")
    public WebElement optionsFilterValueDegeri;
    @FindBy(xpath = "//button[text()='Save']")
    public WebElement save;







    @FindBy(id = "ext-gen542")
    public WebElement account;

    @FindBy(xpath = "//a[text()='Users']")
    public WebElement users;

    @FindBy(xpath = "//div[text()='Gokhanttest4']")
    public WebElement gökhanttest4;

    @FindBy(xpath = "//span[text()='Agent Groups']")
    public WebElement agentGroups;

    @FindBy(xpath = "//a[text()='OCS_Group_1']")
    public WebElement OCS_Group_1;


}
