package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ShoppingCartPage extends Utility {

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(className = "icon-trash")
    WebElement deleteBtn;

    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement emptyMsg;

    public void verifyCartEmptyMsg(String expMsg){
        verifyThatTextIsDisplayed(emptyMsg,expMsg);
    }

    public void clickOnDeleteBtn(){
        clickOnElement(deleteBtn);
    }
}
