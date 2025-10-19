package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjectModels.BaseClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

import static pageObjectModels.HerokuHomeScreen.*;

public class BasicAuthScreenStepDef extends BaseClass {

    String mainWindowHandle = driver.getWindowHandle();
    String currentWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();

    @Given("I am on herokuApp")
    public void i_am_on_herokuApp() {
        System.out.println("I am navigating to herokuapp");
        goToUrl(herokuHomePageUrl);
        Assert.assertEquals(driver.getTitle(),herokuHomePageTitle);
        System.out.println("I successfully navigated to herokuapp");
        mainWindowHandle = driver.getWindowHandle();
        currentWindowHandle = driver.getWindowHandle();
        allWindowHandles = driver.getWindowHandles();
        System.out.println("Main Window Handle: " + mainWindowHandle);
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Page window handle: " + currentWindowHandle);
        System.out.println("Page url: " + driver.getCurrentUrl());
        System.out.println("All Window Handles: " + allWindowHandles);
        System.out.println("_________________________");
    }


    @When("I click on Basic Auth link")
    public void iClickOnBasicAuthLink() {
        System.out.println("I am going to click on Basic Auth link in when clause");
        clickOnLinkWithLinkText(BasicAuthLinkText);
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("I successfully clicked on Basic Auth link in when clause");
        currentWindowHandle = driver.getWindowHandle();
        allWindowHandles = driver.getWindowHandles();
        System.out.println("Main Window Handle: " + mainWindowHandle);
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Page window handle: " + currentWindowHandle);
        System.out.println("Page url: " + driver.getCurrentUrl());
        System.out.println("All Window Handles: " + allWindowHandles);
        System.out.println("_________________________");
    }

    @And("enter valid credentials user as {string} and password as {string}")
    public void enterValidCredentials(String username, String password) throws AWTException {

        Robot robot = new Robot();

        for(char c : username.toCharArray()) {
            int key = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(key);
            robot.keyRelease(key);
        }

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        for (char c : password.toCharArray()) {
            int key = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(key);
            robot.keyRelease(key);
        }


    }

    @Then("I land on Basic Auth page")
    public void iLandOnBasicAuthPage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

//    @And("enter valid credentials")
//    public void enterValidCredentials() {
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        for (String windowHandle : allWindowHandles) {
//            if (!windowHandle.equals(mainWindowHandle)) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }



}
