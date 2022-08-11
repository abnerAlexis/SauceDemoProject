package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCart {
    private WebDriver driver;
    private By removeBikeLightBtn = By.cssSelector("#remove-sauce-labs-bike-light");
    private By checkoutBtn = By.cssSelector("#checkout");
    private By pageTitle = By.cssSelector(".title");
    private By numberOfItemsBeforeRemoval = By.cssSelector("#shopping_cart_container > a > span");
    private By checkoutButton = By.cssSelector("#checkout");

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public String getNumberOfItems() {
        return driver.findElement(numberOfItemsBeforeRemoval).getText();
    }

    public void removeItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeBikeLightBtn)).click();
        //driver.getCurrentUrl().contains("cart.html");
    }

    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

    public CheckoutInfo checkOut() {
        driver.findElement(checkoutBtn).click();
        return new CheckoutInfo(driver);
    }
}
