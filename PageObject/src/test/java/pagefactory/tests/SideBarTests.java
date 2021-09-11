package pagefactory.tests;

import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class SideBarTests extends BaseTest {

    private short NUMBER_OF_ELEMENTS_WITHIN_SIDEBAR = 13;

    @Test(priority = 3)
    public void checkNumberOfElementsWithinSidebar() {
        assertEquals(getHomePage().getSidebarElements().length, NUMBER_OF_ELEMENTS_WITHIN_SIDEBAR);
    }
}
