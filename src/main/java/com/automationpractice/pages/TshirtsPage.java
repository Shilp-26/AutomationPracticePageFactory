package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsPage extends Utility {

    public TshirtsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addProductToCart;

    @FindBy(className = "shopping_cart")
    WebElement cart;

    public void clickOnProduct(){
        mouseHoverToElementAndClick(addProductToCart);
    }

    public void clickOnCart(){
        clickOnElement(cart);
    }

}
