package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddRemoveScreen extends BaseClass {
    public static String headingText = "Add/Remove Elements";
    public static WebElement addRemovePageHeading = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
    //public static WebElement addRemoveButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
    //public WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

    private static final By addButtonLocator = By.xpath("//button[@onclick='addElement()']");
    private static final By deleteButtonLocator = By.xpath("//button[@onclick='deleteElement()']");
    private static final String deleteNthButtonXpath1 = "//button[@onclick='deleteElement()'][";
    private static final String deleteNthButtonXpath2 = "]";

    public AddRemoveScreen() {
        //super();
    }

    public static void clickAddElementButton() {
        driver.findElement(addButtonLocator).click();
    }

    public static List<WebElement> getDeleteButtonList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(deleteButtonLocator));
    }

    public static WebElement getNthDeleteButton(int num) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteNthButtonXpath1 + num + deleteNthButtonXpath2)));
    }

    public static void clickDeleteButton() {
        driver.findElement(deleteButtonLocator).click();
    }

    public static void clickDeleteButtonNtimes(int num) {
        for (int i = 0; i < num; i++) {
            driver.findElement(deleteButtonLocator).click();
        }
    }

}
