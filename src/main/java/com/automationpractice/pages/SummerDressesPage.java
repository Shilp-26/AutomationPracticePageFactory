package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage extends Utility {

    public SummerDressesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement pageMsg;

    @FindBy(xpath = "//div[@id='layered_price_slider']")
    WebElement slider;

    public void verifySummerDressesPage(String expMsg){
        verifyThatTextIsDisplayed(pageMsg,expMsg);
    }

    public void selectPriceRange(){
        Actions action = new Actions(driver);

        int width = slider.getSize().width;
        action.dragAndDropBy(slider,width/4,0).build().perform();
    }
}
