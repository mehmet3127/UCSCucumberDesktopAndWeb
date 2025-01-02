package stepDefinitions;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import pages.WdePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utilities.Driver.desktopDriver;


public class WdeStepDefinition {

    WdePage wdePage = new WdePage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public static WebDriver driver;


    @Given("Kullanıcı wde uygulamasına gider")
    public void kullanıcıWdeUygulamasınaGider() {
        Driver.getDriver();


    }

    @When("Kullanıci wde için geçerli username girer")
    public void kullaniciWdeIçinGeçerliUsernameGirer() {
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
    public void myCampainsSayfasındaGetRocordsButonuNaTıklar() throws IOException {

        wdePage.getRecord.click();

        ReusableMethods.waitFor(5);

        for (String window : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(window);
            if (Driver.getDriver().getTitle().contains("Workspace")) {
                break;
            }
        }

        ReusableMethods.waitFor(10);


        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "http://127.0.0.1:9222");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://localhost:9092/api/v1/command");




        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String handle : handles) {
            System.out.println("Handle: " + handle);

            WebDriver webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723"), new ChromeOptions());
            webDriver.switchTo().window(handle);
        }



        // iframe var mı
        List<WebElement> iframes = Driver.getDriver().findElements(By.tagName("Webview2"));
        System.out.println("Bulunan iframe sayısı: " + iframes.size());

        // Web elemanlarına erişim
        WebElement webViewElement = Driver.getDriver().findElementByName("Ucs Webbrowser");

        // WebView içine geçiş yapılır
        Driver.getDriver().switchTo().frame(webViewElement);




        /*
        // WebView2
        WebElement webViewElement = Driver.getDriver().findElementById("//Custom[@AutomationId='MyMainToolbarInteractionContainerView']");
        String nativeWindowHandle = webViewElement.getAttribute("NativeWindowHandle");

        // NativeWindowHandle değerini Selenium için uygun formata çevirme
        String windowHandleHex = Integer.toHexString(Integer.parseInt(nativeWindowHandle));

        // Selenium ile WebView2'ye geçiş yap
        DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();
        seleniumCapabilities.setCapability("debugConnectToRunningApp", true);
        seleniumCapabilities.setCapability("appTopLevelWindow", windowHandleHex);

        WebDriver webDriver = new WindowsDriver<>(new URL("http://127.0.0.1:4723"), seleniumCapabilities);


        WebElement runtimeBitirButton = Driver.webDriver().findElement(By.id("cmdFinishFlow"));
        actions.click(runtimeBitirButton).perform();
        /*


        // WebView'e geçiş
        WebElement webView = Driver.getDriver().findElement(By.xpath("//Custom[@AutomationId='MyMainToolbarInteractionContainerView']"));
        System.out.println("webView Elemani= " + webView);
        Driver.getDriver().switchTo().frame(webView);

        WebElement iframeBrowser =Driver.getDriver().findElement(By.xpath("//Text[contains(@Name,'Ucms')]"));
        ReusableMethods.waitFor(1);
        driver.switchTo().frame(iframeBrowser);
        ReusableMethods.waitFor(1);

        WebElement runtimeBitirButton = Driver.webDriver().findElement(By.id("cmdFinishFlow"));
        jse.executeScript("arguments[0].click();", wdePage.aramaButton);
        actions.click(runtimeBitirButton).perform();

         */

        /*
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println("windowList = " + windowList.size());


        for (String windowHandle : windowList) {
            Driver.getDriver().switchTo().window(windowHandle);
            System.out.println("Pencere Başlığı: " + Driver.getDriver().getTitle());
        }


        for (String window : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(window);
            if (Driver.getDriver().getTitle().contains("Workspace")) {
                break;
            }
        }
       */

        /*
        List<String> windowList2 = new ArrayList<>(Driver.webDriver().getWindowHandles());
        System.out.println("windowList2 = " + windowList2.size());

        for (String windowHandle : windowList2) {
            Driver.webDriver().switchTo().window(windowHandle);
            System.out.println("Pencere Başlığıweb: " + Driver.webDriver().getTitle());
        }
        */

        /*
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        RemoteWebDriver driver2 =new ChromeDriver();
        driver2=new RemoteWebDriver(new URL("http://localhost:9515"),capabilities);
        driver2.findElementById("cmdCallDialog").click();

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        System.out.println("cap.getBrowserName() = " + cap.getBrowserName());
        RemoteWebDriver driver1 = new RemoteWebDriver(new URL("http://test-windows.ucs.pvt:3080/html/ucms.interaction.html?custkey=143028&campid=32&agentid=mehmet.demir&agentname=mehmet%20demir&agentloginid=mehmet.demir&agentgroupid=AG_MEHMETDEMIR&agentgroupname=AG_MEHMETDEMIR&agentcompanyid=&companyid=&agentteam=Teres%20Users&agentsv=Persons&agentlocation=Resources&connid=&channeltype=2&telno=&teltype=4&dialingmode=3&bundleid=36e94885-aa8d-4986-b267-b9067e78d43f"), cap);

        HttpCommandExecutor executor = (HttpCommandExecutor) driver1.getCommandExecutor();
        URL url = executor.getAddressOfRemoteServer();
        SessionId session_id = driver1.getSessionId();
        System.out.println("driver1.getTitle() = " + driver1.getTitle());
        System.out.println("driver1.getWindowHandles() = " + driver1.getWindowHandles().size());
        ReusableMethods.waitFor(3);
       */

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
