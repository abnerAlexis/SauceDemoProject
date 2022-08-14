package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameSelector = By.cssSelector("#user-name");
    private By passwordSelector = By.cssSelector("#password");
    private By loginButton = By.cssSelector("#login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {
        driver.findElement(userNameSelector).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordSelector).sendKeys(password);
    }

    public ProductsPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public void login() {
        setUserName("standard_user");
        setPassword("secret_sauce");
        clickLoginButton();
    }
}
