package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    private WebDriver driver;
    private By finishBtn = By.cssSelector("#finish");
    private By pageBanner = By.cssSelector(".header_secondary_container");
    private By subTotal = By.cssSelector(".summary_subtotal_label");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageBanner() {
        return driver.findElement(pageBanner).getText();
    }

    public String getSubTotal() {
        return driver.findElement(subTotal).getText();
    }

    public void finisShopping() {
        driver.findElement(finishBtn).click();
    }
}
