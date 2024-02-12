package lt.techin.uztexam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenCartPage extends BasePage{

    public OpenCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-item:nth-of-type(1) .nav-link")
    WebElement navLinkQa;

    @FindBy(id = "button-list")
    WebElement buttonList;

    @FindBy(css = "div:nth-of-type(1) > .product-thumb h4 > a")
    WebElement firstProductName;

    @FindBy(css = "div:nth-of-type(2) > .product-thumb h4 > a")
    WebElement secondProductName;

    @FindBy(css = "div:nth-of-type(3) > .product-thumb h4 > a")
    WebElement thirdProductName;

    @FindBy(css = "div:nth-of-type(4) > .product-thumb h4 > a")
    WebElement fourthProductName;

    @FindBy(css = "img[alt='Code Confusion Raccoon']")
    WebElement firstProductPict;

    @FindBy(css = "#input-quantity")
    WebElement quantityInputField;

    @FindBy(id = "button-cart")
    WebElement clickAddToCart;

    @FindBy(css = "#alert")
    WebElement addToCartPopUpMessage;

    @FindBy(css = ".btn btn-lg btn-inverse btn-block dropdown-toggle")
    WebElement clickOnItemsShoppingCart;
    @FindBy(css = ".text-start")
    WebElement productNameInShoppingCart;

    @FindBy(css = ".btn-close")
    WebElement closeShoppingMessage;

    public void openPageInList() {
        navLinkQa.click();
        buttonList.click();
    }
    public String getFirstProductName() {
        return firstProductName.getText();
    }

    public String getSecondProductName() {
        return secondProductName.getText();
    }

    public String getThirdProductName() {
        return thirdProductName.getText();
    }

    public String getFourthProductName() {
        return fourthProductName.getText();
    }

    public void openThisProduct() {
        firstProductPict.click();
    }

    public void enterQtyNumber(String randomNumber) {
        quantityInputField.clear();
        quantityInputField.sendKeys(randomNumber);
    }

    public void clickAddToCart() {
        clickAddToCart.click();
    }

    public String checkIfProductInCart() {
        String addToshopingCardSentence = addToCartPopUpMessage.getText();
        String newSentenseToShopingCard = addToshopingCardSentence.substring(9, 69).trim();
       return newSentenseToShopingCard;
    }

    public String getProductNameInShoppingCart() {
        return productNameInShoppingCart.getText();
    }

    public void clickOnShoppingCart() {
        wait.until(ExpectedConditions.elementToBeClickable(clickOnItemsShoppingCart));
        clickOnItemsShoppingCart.click();
    }

    public void clickCloseOnShoppingMessage() {
        closeShoppingMessage.click();
    }
}
