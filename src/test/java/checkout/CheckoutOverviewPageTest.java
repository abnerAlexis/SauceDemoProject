package checkout;

import base.BaseTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CheckoutOverviewPageTest extends BaseTests {
    @BeforeMethod
    public void starter() {
        loginPage.loginStandardUser();
        productsPage.addToShoppingCart();
        shoppingCart.removeItem();
        shoppingCart.checkOut();
        checkoutInfo.fillInformationForm("Lulu", "Butterbiscuit", "12308");
    }

    @AfterMethod
    private void finishShoppping() {
        checkoutOverviewPage.finisShopping();
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

    @Test
    public void getTax() {
        String actual = checkoutOverviewPage.getTax();
        String expected = "Tax: $6.40";
    }

    @Test
    public void getTotal() {
        String actual = checkoutOverviewPage.getTotal();
        String expected = "Total: $86.38";
    }
}
