package com.automationpractice.pages;



import com.automationpractice.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "quantity_wanted")
    WebElement quantity;

    @FindBy(id = "group_1")
    WebElement size;

    @FindBy(className = "attribute_list")
    WebElement colour;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;

    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeBtn;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement proceedToCheckout;

    public void clickOnProceedCheckoutBtn(){
        clickOnElement(proceedToCheckout);
    }

    public void clickOnCloseBtn() {
        clickOnElement(closeBtn);

    }

    public void verifyPopUpDisplayMsg(String text) {
        verifyThatTextIsDisplayed(popUpDisplay, text);

    }

    public void clickOnAddToCartBtn() {
        clickOnElement(addToCartBtn);

    }

    public void selectColour(String color) {
        clickOnElement(colour, color);

    }

    public void selectSize(String text) {
        selectByVisibleTextFromDropDown(size, text);
    }

    public void changeQuantity(String num) {
        sendKeysToElement(quantity, Keys.BACK_SPACE + num);

    }

}
