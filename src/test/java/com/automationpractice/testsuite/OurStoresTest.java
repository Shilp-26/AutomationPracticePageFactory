package com.automationpractice.testsuite;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.pages.*;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class OurStoresTest extends TestBase {

    HomePage homePage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;
    ShoppingCartPage shoppingCartPage;
    TshirtsPage tshirtsPage;
    OurStoresPage ourStoresPage;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();
        shoppingCartPage = new ShoppingCartPage();
        tshirtsPage = new TshirtsPage();
        ourStoresPage = new OurStoresPage();
    }

    @Test
    public void userShouldBeAbleToBrowseOurStores() {
        homePage.clickOnOurStoresLink();
        ourStoresPage.location();
          }
}
