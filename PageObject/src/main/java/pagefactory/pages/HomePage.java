package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(xpath = "//a[contains(@class,'header-top__item lgreen-color js_addMessage_btn')]")
    private WebElement sendMessageToDirector;

    @FindBy(xpath = "//div[@class='tab-content shown']//button[@type='submit'][contains(text(),'Отправить сообщение')]")
    private WebElement submitMessageSend;

    @FindBy(xpath = "//div[contains(@class,'form-field input-field col-xs-6 error')]")
    private WebElement emptyFieldsErrorMessage;

    @FindBy(id = "js_addMessage")
    private WebElement SendMessageToDirectorPopUp;

    @FindBy(xpath = "//input [@class= 'search-query']")
    private WebElement searchField;

    @FindBy(xpath = "//img[@alt='Внешний аккумулятор (Power Bank) PowerPlant PP-LA9305']")
    private WebElement soughtElementWithinSearchPopUp;

    @FindBy (xpath = "//div[@class='sidebar']")
    private WebElement sideBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickSendMessageToDirectorLink() {
        sendMessageToDirector.click();
    }

    public void submitMessageToDirectorForm() {
        submitMessageSend.click();
    }

    public WebElement getSendMessageToDirectorPopUp() {
        return sendMessageToDirector;
    }

    public WebElement getEmptyFieldsErrorMessage() {
        return emptyFieldsErrorMessage;
    }

    public void clickOnSoughtElementWithinSearchPopUp() {
        soughtElementWithinSearchPopUp.click();
    }

    public void
    searchForPowerBank() {
        searchField.sendKeys("power bank", Keys.ENTER);
    }

    public String [] getSidebarElements () {
        return sideBar.getText().split("\n");
    }
    public WebElement getSoughtElementWithinSearchPopUp() {
        return soughtElementWithinSearchPopUp;
    }
}
