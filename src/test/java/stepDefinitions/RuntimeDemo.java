package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.IllegalFormatCodePointException;

public class RuntimeDemo {
    @Given("Exe acilir")
    public void ekeAcilir() {

        /*
        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:/UcsDemo/TestEdge/TestEdge.exe", "--remote-debugging-port=9222");
        try {
            processBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

    }

    @And("Initialize butonuna tiklanir")
    public void ınitializeButonunaTiklanir() {
        WebElement initialize = Driver.getDriver().findElement(By.name("Initialize"));
        initialize.click();

    }

    @And("Open Url tiklanir")
    public void openUrlTiklanir() {
        ReusableMethods.waitFor(1);
        WebElement openUrl = Driver.getDriver().findElement(By.name("Open Url"));
        openUrl.click();
    }

    @Then("Runtime'a gecis yapilir")
    public void runtimeAGecisYapilir() {


        WebElement iframeElement = Driver.getDriver().findElement(By.name("AgentId"));

        WebElement agentId = Driver.getDriver().findElement(By.xpath("//Edit[@AutomationId='txtAgentID']"));
        agentId.clear();
        agentId.sendKeys("hyalcin");

        ReusableMethods.waitFor(1);
        WebElement agentName = Driver.getDriver().findElement(By.xpath("//Edit[@AutomationId='txtAgentName']"));
        agentName.clear();
        agentName.sendKeys("Hasan Yalçın");

        WebElement startFlow = Driver.getDriver().findElement(By.name("Start Flow"));
        startFlow.click();

        WebElement uyariKapat = Driver.getDriver().findElement(By.name("×"));
        uyariKapat.click();
        ReusableMethods.waitFor(1);
        WebElement sonrakiButton = Driver.getDriver().findElement(By.xpath("//Button[contains(@Name,'Bitir')]"));
        sonrakiButton.click();

        /*
        Driver.getDriver().switchTo().frame("//Document[@AutomationId='RootWebArea']");
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(2);

        WebElement agentId = Driver.getDriver().findElement(By.name("BrowserWindow"));
        System.out.println(agentId.getText());


        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "http://127.0.0.1:9222");
        WebDriver driver = new ChromeDriver(options);


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=9222");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://test-windows.ucs.pvt:3080/default.html");

        */



    }
}
