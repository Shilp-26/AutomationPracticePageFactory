package com.automationpractice.testsuite;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.pages.*;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class DeleteItemsFromBasketTest extends TestBase {

    HomePage homePage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;
    ShoppingCartPage shoppingCartPage;
    TshirtsPage tshirtsPage;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();
        shoppingCartPage = new ShoppingCartPage();
        tshirtsPage = new TshirtsPage();
    }

    @Test
    public void deleteItemFromBasketSuccessfully() {
        homePage.selectMenu("Women");
        womenCategoryPage.selectProduct("Faded Short Sleeve T-shirts");
        productPage.clickOnAddToCartBtn();
        productPage.clickOnProceedCheckoutBtn();
        tshirtsPage.clickOnCart();
        shoppingCartPage.clickOnDeleteBtn();
        shoppingCartPage.verifyCartEmptyMsg("Your shopping cart is empty.");
    }
}
