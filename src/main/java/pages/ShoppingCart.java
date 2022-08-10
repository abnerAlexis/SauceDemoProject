package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
    private WebDriver driver;
    private By removeBikeLightBtn = By.cssSelector("#remove-sauce-labs-bike-light");
    private By checkoutBtn = By.cssSelector("#checkout");
    private By pageTitle = By.cssSelector(".title");

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutInfo manageShoppingCart() {
        driver.findElement(removeBikeLightBtn).click();
        driver.findElement(checkoutBtn);
        return new CheckoutInfo(driver);
    }

    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }
}
