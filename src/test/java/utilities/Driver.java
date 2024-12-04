package utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.DesignerPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Driver {

    private Driver() {
        //SingletonPattern tekli kullanım demektir bu CLass dan başka obje oluşturulmasını engellemek için kullanılır
    }

    public static WindowsDriver<WebElement> desktopDriver;
    public static WebDriver webDriver;


    /*
    static WebDriver driver2;
    public static WebDriver getDriver() {
        if (driver == null) {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Ucms\\Ucs.Ucms26.Designer 2.6.144.3\\Ucs.Ucms26.Designer.exe");
            try {
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap) {
                };
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        }
        return driver;
    }
    public static WebDriver getDriver2() {
        if (driver2 == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Ucms\\WDE-BaseModule\\InteractionWorkspace.exe");
            try {
                driver2 = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap) {
                };
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        }
        return driver2;
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static void quitDriver2() {
        if (driver2 != null) {
            driver2.quit();
            driver2 = null;
        }
    }

     */
    public static WindowsDriver<WebElement> getDriver() {

        if (desktopDriver == null) {


            switch (ConfigReader.getProperty("uygulama")) {

                case "wde":
                    ReusableMethods.winAppDriverStart();

                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("wdePath"));

                    try {
                        desktopDriver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/"), cap);
                        desktopDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        String widowHandle = desktopDriver.getWindowHandle();
                        desktopDriver.switchTo().window(widowHandle);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }

                    break;

                case "designer":
                    ReusableMethods.winAppDriverStart();

                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("app", ConfigReader.getProperty("designerPath"));
                    try {
                        desktopDriver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/"), capabilities);
                        desktopDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                //case "chrome":
                //    WebDriverManager.chromedriver().setup();
                //    driver = new ChromeDriver();
                //    driver.manage().window().maximize();
                //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                //    break;
//
                //case "edge":
                //    WebDriverManager.edgedriver().setup();
                //    driver = new EdgeDriver();
                //    driver.manage().window().maximize();
                //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                //    break;
                //default:
            }

        }
        return desktopDriver;
    }

    public static WebDriver webDriver() {

        if (webDriver == null) {

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;
                default:
                    throw new RuntimeException("Geçersiz uygulama seçimi!");
                    //System.out.println("Geçersiz tarayıcı seçimi!");
                    //throw new IllegalArgumentException("Geçersiz tarayıcı seçimi!");

                    //case "chrome":
                    //    WebDriverManager.chromedriver().setup();
                    //    driver = new ChromeDriver();
                    //    driver.manage().window().maximize();
                    //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    //    break;
//
                    //case "edge":
                    //    WebDriverManager.edgedriver().setup();
                    //    driver = new EdgeDriver();
                    //    driver.manage().window().maximize();
                    //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    //    break;
                    //default:
            }
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        return webDriver;
    }


    public static void closeWebDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;

        }
    }

    public static void quitWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

    public static void designerClose() {

        DesignerPage designerPage = new DesignerPage();

        if (Driver.getDriver().getTitle().contains("UcmsDesigner")) {
            designerPage.pencereKapat.click();
            ReusableMethods.waitForClickablility(designerPage.pencereKapatEvet, 10);
            designerPage.pencereKapatEvet.click();
            ReusableMethods.winAppDriverStop();
            desktopDriver = null;
        } else {
            designerPage.loginVazgecButton.click();
            ReusableMethods.winAppDriverStop();
            desktopDriver = null;
        }

    }
}


