package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;
    By addBackpack = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By addBikeLight = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    By addFleeceJacket = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    By shoppingCart = By.cssSelector("#shopping_cart_container > a");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCart addToShoppingCart() {
        driver.findElement(addBackpack).click();
        driver.findElement(addBikeLight).click();
        driver.findElement(addFleeceJacket).click();
        driver.findElement(shoppingCart).click();
        return new ShoppingCart(driver);
    }
}
