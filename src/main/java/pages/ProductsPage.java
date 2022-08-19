package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ProductsPage {
    private WebDriver driver;
    private By addBackpack = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By addBikeLight = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    private By addFleeceJacket = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    private By shoppingCart = By.cssSelector("#shopping_cart_container > a");
    private By title = By.cssSelector(".title");
    private By backpackImageElement = By.cssSelector("#item_4_img_link > img");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPageTitle() {
        return driver.findElement(title);
    }

    public void waitElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public ShoppingCart addToShoppingCart() {
        waitElementVisibility(title);
        driver.findElement(addBackpack).click();
        driver.findElement(addBikeLight).click();
        driver.findElement(addFleeceJacket).click();
        driver.findElement(shoppingCart).click();
        return new ShoppingCart(driver);
    }
}
