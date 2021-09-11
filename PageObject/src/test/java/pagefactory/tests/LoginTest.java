package pagefactory.tests;


/*
* This test were added since in my previous homework almost all tests were related to "Home Page"
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private String LOGIN = "380939866036";
    private String PASSWORD = "123456";

    @Test(priority = 1)
    public void validLogin() {
        getLoginPage().clickOnUserImage();
        getLoginPage().clickOnLoginLoginTextArea();
        getLoginPage().enterLogin(LOGIN);
        getLoginPage().clickOnPasswordTextArea();
        getLoginPage().enterPassword(PASSWORD);
        getLoginPage().clickOnSignIn();
        Assert.assertTrue(getLoginPage().getGreetingMessage().isDisplayed(), "");
    }
}
