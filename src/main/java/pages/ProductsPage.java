package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    private WebDriver driver;
    By addBackpack = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By addBikeLight = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    By addFleeceJacket = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    By shoppingCart = By.cssSelector("#shopping_cart_container > a");
    private By title = By.cssSelector(".title");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPageTitle() {
        return driver.findElement(title);
    }

    public ShoppingCart addToShoppingCart() {
        driver.findElement(addBackpack).click();
        driver.findElement(addBikeLight).click();
        driver.findElement(addFleeceJacket).click();
        driver.findElement(shoppingCart).click();
        return new ShoppingCart(driver);
    }
}
