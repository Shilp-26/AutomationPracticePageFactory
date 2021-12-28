package com.automationpractice.pages;


import com.automationpractice.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenCategoryPage extends Utility {



    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Women']")
    WebElement womenTxt;

    @FindBy(xpath = "")
    WebElement topsLink;

    @FindBy(xpath = "")
    WebElement dressesLink;

    @FindBy(xpath = "")
    WebElement sortByDropDown;

    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productList;


    public void verifyWomenTxt(String text) {
        verifyThatTextIsDisplayed(womenTxt, text);

    }

    public void selectProduct(String text) {
        clickOnElement(productList, text);

    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@id='block_top_menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }


    }
}
