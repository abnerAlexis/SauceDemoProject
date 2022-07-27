package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    private WebDriver driver;
    private By finishBtn = By.cssSelector("#finish");
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void finisShopping() {
        driver.findElement(finishBtn).click();
    }
}
