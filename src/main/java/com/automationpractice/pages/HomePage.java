package com.automationpractice.pages;


import com.automationpractice.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Our stores')]")
    WebElement ourStoresLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement dresses;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirts;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement summerDresses;

    public void clickOnOurStoresLink(){
        clickOnElement(ourStoresLink);
    }

    public void hoverOnDresses(){
        mouseHoverToElement(dresses);
    }

    public void clickOnSummerDressesOption(){
        clickOnElement(summerDresses);
    }

    public void clickOnSignInLink(){
        clickOnElement(signInLink);

    }

    public void clickOnTshirtsLink(){
        clickOnElement(tshirts);

    }

    public void verifyLogo(){
        verifyThatElementIsDisplayed(logo);

    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@id='block_top_menu']"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }

    }

}
