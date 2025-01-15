package utilities;

import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DesignerPage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ReusableMethods {

    public static WindowsDriver<WebElement> winAppDriver;
    public static WebDriver driver;


    //========ScreenShot(Syafanın resmini alma)=====//
    public static String getScreenshot(String name) {

        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        TakesScreenshot tsWeb = (TakesScreenshot) Driver.webDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);

        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return target;
    }


    //========ScreenShot Web Element(Bir webelementin resmini alma)=====//
    public static String getScreenshotWebElement(String name, WebElement element) {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        File source = element.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + date + ".png";
        File finalDestination = new File(wElementSS);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wElementSS;
    }

    //========Switching Window(Pencereler arası geçiş)=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over(Elementin üzerinde beklemek)=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //========Click Element With Java Script(JavaScript İle Elemente Tıklama)=====//
    public static void clickWithJs(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", element);
    }

    public static void clickWithJsWeb(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.webDriver();
        jse.executeScript("arguments[0].click();", element);
    }

    //========Scroll Into View Java Script(JavaScript İle Elemente Tıklama)=====//
    public static void scroolWithJs(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static int randomİnt(int randomRnd) {
        Random random = new Random();
        int anahtarDeğer = random.nextInt(randomRnd);
        return anahtarDeğer;
    }


    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }


    //ARD WAIT WITH THREAD.SLEEP
    //waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//

    public static WebElement waitForVisibility( WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibilityWeb(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.webDriver(), (timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibilityLocate(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablilityWeb(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.webDriver(), (timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }


    public static void altF4() {
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ALT)
                .sendKeys(Keys.F4)
                .keyUp(Keys.ALT)
                .build()
                .perform();
    }

    public static WindowsDriver<WebElement> designer() {

        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(ConfigReader.getProperty("winAppDriverPath")));
            ReusableMethods.waitFor(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", ConfigReader.getProperty("designerPath"));
        try {
            winAppDriver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/"), capabilities) {
            };
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return winAppDriver;
    }


    public static void designerClose() {
        DesignerPage designerPage = new DesignerPage();

        if (Driver.getDriver().getTitle().contains("UcmsDesigner")) {
            designerPage.pencereKapat.click();
            ReusableMethods.waitForClickablility(designerPage.pencereKapatEvet, 10);
            designerPage.pencereKapatEvet.click();
        } else {
            designerPage.loginVazgecButton.click();
        }

    }

    public static void webDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void winAppDriverStart() {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(ConfigReader.getProperty("winAppDriverPath")));
            ReusableMethods.waitFor(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void winAppDriverStop() {
        try {
            // WinAppDriver işlemini sistemde sonlandır
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
            } else {
                System.out.println("WinAppDriver sadece Windows sistemlerde kullanılabilir.");
            }
            ReusableMethods.waitFor(1);
        } catch (IOException e) {
            throw new RuntimeException("WinAppDriver kapatılırken bir hata oluştu.", e);
        }
    }
}