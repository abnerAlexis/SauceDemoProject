package checkout;

import base.BaseTests;
import org.asynchttpclient.util.Assertions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CheckoutInfoTest extends BaseTests {
    @Test
    public void fillInformationFormTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToShoppingCart();
        shoppingCart.removeItem();
        shoppingCart.checkOut();
        checkoutInfo.fillInformationForm("Lulu", "Butterbiscuit", "12308");
    }
}
