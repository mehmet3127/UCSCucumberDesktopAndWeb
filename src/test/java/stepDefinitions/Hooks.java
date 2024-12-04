package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import pages.DesignerPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class Hooks {

    //@After
    //public void tearDown(Scenario scenario) {
    //    DesignerPage designerPage = new DesignerPage();
    //    final byte[] screenshot = ((TakesScreenshot)
    //            Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    //    if (scenario.isFailed()) {
    //        scenario.attach(screenshot, "image/png", "screenshots");
    //    }
    //    //if (Driver.getDriver().getTitle().contains("UcmsDesigner")) {
    //    //    Driver.designerClose();
    //    //}
    //    //Driver.quitWebDriver();
    //}
}
