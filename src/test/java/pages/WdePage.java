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

    @FindBy(xpath = "/Window/Custom/Edit[1]")
    public WebElement userName;

    @FindBy(xpath = "/Window/Custom/Edit[2]")
    public WebElement password;


    @FindBy(xpath = "/Window/Custom/Button[1]")
    public WebElement login;

    @FindBy(name = "Hamburger Button")
    public WebElement hamburgerButton;

    @FindBy(name = "My C_ampaigns")
    public WebElement myCampaigns;

    @FindBy(name = "Get Record")
    public WebElement getRecord;

    //Runtime
    @FindBy(xpath = "//Custom[@ClassName='Browser']")
    public WebElement ucsWebbrowser;


    @FindBy(id = "cmdCallDialog")
    public WebElement aramaButton;












}
