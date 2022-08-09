package login;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert. *;
import pages.ProductsPage;

public class LoginPageTest extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        ProductsPage products = loginPage.clickLoginButton();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        String actual = products.getPageTitle().getText();
        String expected = "PRODUCTS";
        assertEquals(actual, expected);
    }
}
