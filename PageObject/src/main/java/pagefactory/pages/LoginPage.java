package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    @FindBy(xpath = ".//div[@class='header-bottom__right-icon']//i[@class='icon icon-user-big']")
    private WebElement userImage;

    @FindBy(xpath = ".//form[@action='https://avic.ua/authorization']//input[@class='validate']")
    private WebElement loginField;

    @FindBy(xpath = ".//input[@class='validate show-password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//button[@class='button-reset main-btn submit main-btn--green']")
    private WebElement signInButton;

    @FindBy(xpath = ".//div[text()='Вы успешно авторизовались!']")
    private WebElement greetingMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnUserImage(){
        userImage.click();
    }

    public void clickOnLoginLoginTextArea(){
        loginField.clear();
    }

    public void enterLogin(String login){
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void clickOnPasswordTextArea(){
        passwordField.clear();
    }

    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnSignIn(){
        signInButton.click();
    }

    public WebElement getGreetingMessage() {
        return greetingMessage;
    }
}