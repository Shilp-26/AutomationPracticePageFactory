package com.automationpractice.pages;



import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "passwd")
    WebElement password;

    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "city")
    WebElement city;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement state;

    @CacheLookup
    @FindBy(id = "id_state")
    WebElement zipcode;

    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(id = "alias")
    WebElement reference;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerbtn;

    public void clickOnRegisterBtn() {
        clickOnElement(registerbtn);

    }

    public void enterAddress(String text) {
        sendTextToElement(address, text);

    }

    public void enterCity(String text) {
        sendTextToElement(city, text);


    }

    public void enterZipCode(String text) {
        sendTextToElement(zipcode, text);

    }

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);
    }

    public void enterReference(String text) {
        sendTextToElement(reference, text);

    }

    public void selectState(String text) {
        sendTextToElement(state, text);

    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);

    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);

    }

    public void enterFirstNameField(String text) {
        sendTextToElement(firstNameField, text);

    }

    public void enterLastNameField(String text) {
        sendTextToElement(lastNameField, text);

    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);

    }


}
