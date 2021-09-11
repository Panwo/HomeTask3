package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "2";

    @Test (priority = 2)
    public void checkAddToCart() throws InterruptedException {
        getHomePage().searchForPowerBank();

        Thread.sleep(1500);      //can`t fix it yet :(
        getHomePage().waitVisibilityOfElement(30, getHomePage().getSoughtElementWithinSearchPopUp());
        getHomePage().clickOnSoughtElementWithinSearchPopUp();
        getPowerBankPage().addPowerBankToCart();
        Thread.sleep(1000);
        getPowerBankPage().waitVisibilityOfElement(30, getPowerBankPage().getCartPopUp());
        Thread.sleep(1000);
        getPowerBankPage().addOnePowerBankToOrder();
        Thread.sleep(1000);
        assertEquals(getPowerBankPage().getItemsCount(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
