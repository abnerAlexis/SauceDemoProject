package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfo {
    private WebDriver driver;
    private By firstnameField = By.cssSelector("#first-name");
    private By lastnameField = By.cssSelector("#last-name");
    private By zipCodeField = By.cssSelector("#postal-code");

    public CheckoutInfo(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutOverviewPage fillFormInfo() {
        driver.findElement(firstnameField).sendKeys("Jojo");
        driver.findElement(lastnameField).sendKeys("ButterBisquet");
        driver.findElement(zipCodeField).sendKeys("12308");
        return new CheckoutOverviewPage(driver);
    }
}
