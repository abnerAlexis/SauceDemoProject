package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
    private WebDriver driver;
    private By removeBikeLightBtn = By.cssSelector("#remove-sauce-labs-bike-light");
    private By checkoutBtn = By.cssSelector("#checkout");

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutInfo manageShoppingCart() {
        driver.findElement(removeBikeLightBtn).click();
        driver.findElement(checkoutBtn);
        return new CheckoutInfo(driver);
    }
}
