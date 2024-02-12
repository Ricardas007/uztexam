package lt.techin.uztexam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class OpenCartTest extends BaseTest {

    @Test
    void openPageInList() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        String firstProduct = "Code Confusion Raccoon";
        openCart.openPageInList();
        String firstProductName = openCart.getFirstProductName();
        System.out.println(firstProductName);
        Assertions.assertEquals(firstProduct, firstProductName, "First product in list must match with item product name");
        Thread.sleep(5000);
    }

    @Test
    void openPageSecondProductInList() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        String secondProduct = "Debug Duck";
        openCart.openPageInList();
        String secondProductName = openCart.getSecondProductName();
        Assertions.assertEquals(secondProduct, secondProductName, "Second product in list must match with item product name");
        Thread.sleep(5000);
    }

    @Test
    void openPageThirdProductInList() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        String thirdProduct = "Java Genius Duck";
        openCart.openPageInList();
        String thirdProductName = openCart.getThirdProductName();
        Assertions.assertEquals(thirdProductName, thirdProduct, "Third product in list must match with item product name");
        Thread.sleep(5000);
    }

    @Test
    void openPageFourthProductInList() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        String fourthProduct = "Code Calm pills";
        openCart.openPageInList();
        String thirdProductName = openCart.getFourthProductName();
        Assertions.assertEquals(thirdProductName, fourthProduct, "Forth product in list must match with item product name");
        Thread.sleep(5000);
    }

    @Test
    void selectOpenThisProduct() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        openCart.openPageInList();
        openCart.openThisProduct();
        Random rn = new Random();
        int randomNumber = rn.nextInt(20) + 1;
//        System.out.println(randomNumber);
        String value = Integer.toString(randomNumber);
        Thread.sleep(5000);
        openCart.enterQtyNumber(value);
        openCart.clickAddToCart();
        String sentence = openCart.checkIfProductInCart();
        Assertions.assertEquals(sentence, "You have added Code Confusion Raccoon to your shopping cart!");
        String cartProductName = openCart.getProductNameInShoppingCart();
        Thread.sleep(5000);
        System.out.println(cartProductName);
//        Assertions.assertEquals();
    }

    @Test
    void whatIsInShoppingCart() throws InterruptedException {
        OpenCartPage openCart = new OpenCartPage(driver);
        openCart.openPageInList();
        openCart.openThisProduct();
        Random rn = new Random();
        int randomNumber = rn.nextInt(20) + 1;
        String value = Integer.toString(randomNumber);
//        Thread.sleep(5000);
        openCart.enterQtyNumber(value);
        openCart.clickAddToCart();
        openCart.clickCloseOnShoppingMessage();
        Thread.sleep(5000);
        openCart.clickOnShoppingCart();
        String cartProductName = openCart.getProductNameInShoppingCart();
        System.out.println(cartProductName);
    }
}
