package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerBankPage extends Page{

    @FindBy (xpath = "//a[text() = 'Купить']")
    private WebElement buyButton;

    @FindBy(xpath = "//span[@class = 'js_plus btn-count btn-count--plus ']")
    private WebElement cartPopUpPlusButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement itemsCount;


    @FindBy( id = "js_cart")
    private WebElement cartPopUp;

    public PowerBankPage(WebDriver driver) {
        super(driver);
    }

    public void addOnePowerBankToOrder () {
        cartPopUpPlusButton.click();
    }

    public void addPowerBankToCart () {
        buyButton.click();
    }

    public WebElement getCartPopUpPlusButton() {
        return cartPopUpPlusButton;
    }

    public String getItemsCount () {
        return itemsCount.getText();
    }

    public WebElement getCartPopUp() {
        return cartPopUp;
    }
}
