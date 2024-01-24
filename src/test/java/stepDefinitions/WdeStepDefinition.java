package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import pages.WdePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class WdeStepDefinition {

    WdePage wdePage = new WdePage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public static WebDriver driver;


    @Given("Kullanıcıc wde uygulamasına gider")
    public void kullanıcıcWdeUygulamasınaGider() {
        Driver.getDriver();

    }

    @When("Kullanıc wde için geçerli username girer")
    public void kullanıcWdeIçinGeçerliUsernameGirer() {
        wdePage.userName.clear();
        wdePage.userName.sendKeys("mehmet.demir");

    }

    @And("Kullanıcı wde için geçerli password girer")
    public void kullanıcıWdeIçinGeçerliPasswordGirer() {
        wdePage.password.sendKeys("x");

    }

    @And("Kullanıc wde için Login button tıklar")
    public void kullanıcWdeIçinLoginButtonTıklar() {
        wdePage.login.click();

        ReusableMethods.waitFor(15);
        /*
        int windowCount = Driver.getDriver().getWindowHandles().size();
        System.out.println(windowCount);
        String windows = Driver.getDriver().getWindowHandles().iterator().next();
        Driver.getDriver().switchTo().window(windows).getTitle();
        System.out.println(Driver.getDriver().switchTo().window(windows).getTitle());
        */
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowList.size = " + windowList.size());
        System.out.println("Driver.getDriver().getTitle = " + Driver.getDriver().getTitle());
        if (windowList.size() == 2) {

            Driver.getDriver().switchTo().window(windowList.get(1));
        } else {
            Driver.getDriver().switchTo().window(windowList.get(0));
        }
        ReusableMethods.waitFor(1);
        System.out.println(Driver.getDriver().getTitle());
    }

    @And("Kullanıcı hamburger menu ye tiklar")
    public void kullanıcıHamburgerMenuYeTiklar() {

        wdePage.hamburgerButton.click();
    }

    @And("My Campains e tıklar")
    public void myCampainsETıklar() {

        wdePage.myCampaigns.click();

    }

    @And("My campains sayfasında get rocords butonu na tıklar")
    public void myCampainsSayfasındaGetRocordsButonuNaTıklar() throws MalformedURLException {
        wdePage.getRecord.click();

        ReusableMethods.waitFor(1);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowList = " + windowList.size());


        /*
        WindowsElement iframeBrowser = (WindowsElement) driver.findElement(By.className("Browser"));
        Thread.sleep(2000);
        driver.switchTo().frame(iframeBrowser);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();", wdePage.aramaButton);
         */

        /*
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        RemoteWebDriver driver2 =new ChromeDriver();
        driver2=new RemoteWebDriver(new URL("http://localhost:9515"),capabilities);
        driver2.findElementById("cmdCallDialog").click();

         */

        /*
        int x =1073;
        int y =229;
        actions.moveByOffset(x,y).click().perform();
         */


        DesiredCapabilities cap = DesiredCapabilities.chrome();
        System.out.println("cap.getBrowserName() = " + cap.getBrowserName());
        RemoteWebDriver driver1 = new RemoteWebDriver(new URL("http://test-windows.ucs.pvt:3080/html/ucms.interaction.html?custkey=143028&campid=32&agentid=mehmet.demir&agentname=mehmet%20demir&agentloginid=mehmet.demir&agentgroupid=AG_MEHMETDEMIR&agentgroupname=AG_MEHMETDEMIR&agentcompanyid=&companyid=&agentteam=Teres%20Users&agentsv=Persons&agentlocation=Resources&connid=&channeltype=2&telno=&teltype=4&dialingmode=3&bundleid=36e94885-aa8d-4986-b267-b9067e78d43f"), cap);

        HttpCommandExecutor executor = (HttpCommandExecutor) driver1.getCommandExecutor();
        URL url = executor.getAddressOfRemoteServer();
        SessionId session_id = driver1.getSessionId();
        System.out.println("driver1.getTitle() = " + driver1.getTitle());
        System.out.println("driver1.getWindowHandles() = " + driver1.getWindowHandles().size());
        ReusableMethods.waitFor(3);
        /*
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        if (windowList.size() == 1) {
            Driver.getDriver().switchTo().window(windowList.get(0));
        } else {
            Driver.getDriver().switchTo().window(windowList.get(1));
        }
        Thread.sleep(1000);
        System.out.println(Driver.getDriver().getTitle());


        /*
        int windowCount = Driver.getDriver().getWindowHandles().size();
        System.out.println(windowCount);
        Thread.sleep(5000);
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(0));
        System.out.println(Driver.getDriver().getTitle());
        
        Thread.sleep(5000);
        Driver.getDriver().switchTo().window(windowList.get(1));
        System.out.println(Driver.getDriver().getTitle());
        Thread.sleep(3000);
        */


    }

    @And("Runtıme penceresi içerisin de arama butonuna tıklar")
    public void runtımePenceresiIçerisinDeAramaButonunaTıklar() throws InterruptedException {
        /*
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        System.out.println(windowList.size());
        driver.switchTo().window(windowList.get(0));
        System.out.println(driver.getTitle());
        */

        jse.executeScript("arguments[0].click();", wdePage.aramaButton);

    }
    @And("Açılan arama penceresinde kaydın ilk numarasını tıklar")
    public void açılanAramaPenceresindeKaydınIlkNumarasınıTıklar() {

    }

    @And("Arama penceresi kapatılır")
    public void aramaPenceresiKapatılır() {

    }

    @And("Runtime içerisinde bitir butonuna tıklar")
    public void runtimeIçerisindeBitirButonunaTıklar() {
    }

    @And("Kapatıcı sonuç kodu girer")
    public void kapatıcıSonuçKoduGirer() {
    }

    @And("Bitir butonuna tıklar")
    public void bitirButonunaTıklar() {
    }

    @Then("onay butonun da evet tıklar")
    public void onayButonunDaEvetTıklar() {
    }
}
