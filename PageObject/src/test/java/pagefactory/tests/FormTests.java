package pagefactory.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FormTests extends BaseTest {

    private String EXPECTED_FORM_RESPONSE = "Обязательное поле";
    private String FORM_ATTRIBUTE = "data-error";

    @Test (priority = 1)
    public void checkSubmitWithoutParametersError() {
        getHomePage().clickSendMessageToDirectorLink();
        getHomePage().waitVisibilityOfElement(30, getHomePage().getSendMessageToDirectorPopUp());
        getHomePage().submitMessageToDirectorForm();
        assertEquals(getHomePage().getEmptyFieldsErrorMessage().getAttribute(FORM_ATTRIBUTE), EXPECTED_FORM_RESPONSE);
    }
}
