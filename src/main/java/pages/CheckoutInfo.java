package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutInfo {
    private WebDriver driver;
    private By firstnameField = By.cssSelector("#first-name");
    private By lastnameField = By.cssSelector("#last-name");
    private By zipCodeField = By.cssSelector("#postal-code");
    private By form = By.cssSelector(".checkout_info");
    private By continueButton = By.cssSelector("#continue");
    private By firstName = By.cssSelector("#first-name");
    private By lastName = By.cssSelector("#last-name");
    private By zipCode = By.cssSelector("#postal-code");
    private By banner = By.cssSelector(".header_secondary_container");

    public CheckoutInfo(WebDriver driver) {
        this.driver = driver;
    }

    public void waitVisibility() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(form));
    }

    public String getPageBannerText() {
        return driver.findElement(banner).getText();
    }

    public CheckoutOverviewPage fillInformationForm(String name, String lastname, String zipCode) {
        waitVisibility();
        driver.findElement(firstnameField).sendKeys(name);
        driver.findElement(lastnameField).sendKeys(lastname);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(continueButton).click();
        return new CheckoutOverviewPage(driver);
    }
    public String getFirstName() {
        return driver.findElement(firstName).getText();
    }

    public String getLastName() {
        return driver.findElement(lastName).getText();
    }

    public String getZipCode() {
        return driver.findElement(zipCode).getText();
    }
}
