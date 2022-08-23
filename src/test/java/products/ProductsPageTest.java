package products;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ProductsPageTest extends BaseTests {

    @Test
    public void addToCart() {
        loginPage.loginStandardUser();
        productsPage.addToShoppingCart();
        String actual = productsPage.getPageTitle().getText();
        String expected = "YOUR CART";
        assertEquals(actual, expected);
    }
}
