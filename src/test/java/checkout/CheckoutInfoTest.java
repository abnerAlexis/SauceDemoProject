package checkout;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CheckoutInfoTest extends BaseTests {

    @Test
    public void fillInformationFormTest() {
        loginPage.loginStandardUser();
        productsPage.addToShoppingCart();
        shoppingCart.removeItem();
        shoppingCart.checkOut();
        String expected = "CHECKOUT: YOUR INFORMATION";
        String actual = checkoutInfo.getPageBannerText();
        assertEquals(actual, expected);
        checkoutInfo.fillInformationForm("Lulu", "Butterbiscuit", "12308");
    }
}
