package shoppingCart;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ShoppingCartTest extends BaseTests {
    @Test
    public void removeItemTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToShoppingCart();
        int numberOfCheckedItems = Integer.parseInt(shoppingCart.getNumberOfItems());
        shoppingCart.removeItem();
        int numberOfCheckedItemsAfterRemoval = Integer.parseInt(shoppingCart.getNumberOfItems());
        assertEquals(numberOfCheckedItems - 1, numberOfCheckedItemsAfterRemoval);
    }
}
