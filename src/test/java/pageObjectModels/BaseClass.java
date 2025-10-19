package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;
    public WebDriverWait wait;

    public BaseClass() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void clickOnLinkWithLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
