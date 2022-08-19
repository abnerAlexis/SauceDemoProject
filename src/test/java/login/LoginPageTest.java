package login;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert. *;
import pages.ProductsPage;

public class LoginPageTest extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductsPage products = loginPage.clickLoginButton();
        String actual = products.getPageTitle().getText();
        String expected = "PRODUCTS";
        assertEquals(actual, expected);
    }

    @Test
    public void justLogin() {
        loginPage.loginStandardUser();
    }

    @Test
    public void testProblemUserLogin() {
        loginPage.loginProblemUser();
    }
}
