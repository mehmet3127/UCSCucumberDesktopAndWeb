package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class GensysAdminPage {

    public GensysAdminPage(){

        PageFactory.initElements(Driver.getDriver(), this);
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
