package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CaptureImages;
import pages.CheckoutInfo;
import pages.CheckoutOverviewPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.ShoppingCart;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected ShoppingCart shoppingCart;
    protected CheckoutInfo checkoutInfo;
    protected CheckoutOverviewPage checkoutOverviewPage;
    protected CaptureImages captureImages;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        shoppingCart = new ShoppingCart(driver);
        checkoutInfo = new CheckoutInfo(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        captureImages = new CaptureImages(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
