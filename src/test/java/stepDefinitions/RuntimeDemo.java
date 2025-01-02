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
    @Given("Eke acilir")
    public void ekeAcilir() {

        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:/UcsDemo/TestEdge/TestEdge.exe", "--remote-debugging-port=9222");
        try {
            processBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

        ReusableMethods.waitFor(3);//Name	Start Flow


        WebElement iframeElement = Driver.getDriver().findElement(By.name("Start Flow"));
       //now using the switch command to switch to main frame.
        //iframeElement.click();
        //Driver.getDriver().switchTo().frame(0);


        WebElement agentName = Driver.getDriver().findElement(By.xpath("//Edit[@AutomationId='txtAgentName']"));
        agentName.click();
        agentName.clear();
        agentName.sendKeys("mehmet.demir");



        Driver.getDriver().switchTo().frame("//Document[@AutomationId='RootWebArea']");
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(2);

        WebElement agentId = Driver.getDriver().findElement(By.name("BrowserWindow"));
        System.out.println(agentId.getText());



        /*
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
