package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginPageTest extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        ProductsPage products = loginPage.clickLoginButton();
        loginPage.setUserName("Jojo");
        loginPage.setPassword("Butterbisquit");
        loginPage.clickLoginButton();
    }
}
