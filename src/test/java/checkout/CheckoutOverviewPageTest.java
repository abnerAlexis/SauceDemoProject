package checkout;

import base.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CheckoutOverviewPageTest extends BaseTests {
    @BeforeMethod
    public void starter() {
        loginPage.login();
        productsPage.addToShoppingCart();
        shoppingCart.removeItem();
        shoppingCart.checkOut();
        checkoutInfo.fillInformationForm("Lulu", "Butterbiscuit", "12308");
    }

    @Test
    public void getPageBanner() {
        String actual = checkoutOverviewPage.getPageBanner();
        String expected = "CHECKOUT: OVERVIEW";
        assertEquals(actual, expected);
    }

    @Test
    public void getSubTotal() {
        String actual = checkoutOverviewPage.getSubTotal();
        String expected = "Item total: $79.98";
    }
}
