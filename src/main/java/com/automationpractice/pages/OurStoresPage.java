package com.automationpractice.pages;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OurStoresPage extends Utility {
    public OurStoresPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement popupHandle;


    @CacheLookup
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOutButton;

    public void clickOKOnMap() {
        clickOnElement(popupHandle);
        CustomListeners.test.log(Status.PASS,"Click ok on Pop Up ");
    }

    public void location() {
        zoomOutButton.click();
        zoomOutButton.click();
        takeScreenShot("screenshot");
        CustomListeners.test.log(Status.PASS,"Take Screenshot ");
    }



}
