package steps;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import pageObjectModels.BaseClass;

import static pageObjectModels.AddRemoveScreen.*;
import static pageObjectModels.HerokuHomeScreen.*;


public class AddRemoveElementScreenStepDefinition {

//    @Given("I am on herokuApp")
//    public void i_am_on_herokuApp() {
//        System.out.println("I am navigating to herokuapp");
//        goToUrl(herokuHomePageUrl);
//        Assert.assertEquals(driver.getTitle(),herokuHomePageTitle);
//        System.out.println("I successfully navigated to herokuapp");
//    }
//
//    @When("I click on AddRemove Elements link")
//    public void iClickOnAddRemoveElementsLink() {
//        System.out.println("I am clicking on Add Remove Elements link");
//        clickOnLinkWithLinkText(addRemoveElementsLinkText);
//        System.out.println("I successfully clicked on Add Remove Elements link");
//    }
//
//    @And("I navigate to AddRemove Elements Screen")
//    public void i_navigate_to_add_remove_elements_screen() {
//        System.out.println("I am checking if I navigated to AddRemove Elements Screen");
//        Assert.assertTrue(addRemovePageHeading.isDisplayed());
//        System.out.println("I successfully navitaged to Add Remove Elements screen");
//    }
//
//
//
//    @When("I Press Add Element Button {int} times")
//    public void press_add_element_button(int times) {
//        System.out.println("I am checking clicking on Add Element Button");
//        for (int i = 0; i < times; i++) {
//            clickAddElementButton();
//        }
//
//        System.out.println("I successfully clicked on Add Element Button");
//    }
//
//    @Then("Element gets added {int} times")
//    public void element_gets_added(int times) {
//        System.out.println("I am checking if Element gets added");
//        for (int i = 0; i < times; i++) {
//            Assert.assertTrue(getNthDeleteButton(times).isDisplayed());
//        }
//
//        System.out.println("I have successfully checked if Element gets added");
//    }
//
//    @When("I Press Delete Button {int} times")
//    public void iPressDeleteButtonTimes(int times) {
//        System.out.println("I am clicking Delete button many times");
//        clickDeleteButtonNtimes(times);
//        System.out.println("I successfully clicked delete button  many times");
//    }
//
//    @Then("Only {int} Delete Button stays")
//    public void elementGetsDeletedTimes(int times) {
//        System.out.println("I am checking how many Delete Buttons stay");
//        Assert.assertEquals(getDeleteButtonList().size(), times);
//        System.out.println("Number of Delete Buttons stay are: " + getDeleteButtonList().size());
//    }
//
//
//    @After
//    public void afterClass() {
//        driver.quit();
//    }

}
