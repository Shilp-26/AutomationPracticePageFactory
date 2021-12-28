package com.automationpractice.testsuite;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.pages.*;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class SummerDressesTest extends TestBase {

    HomePage homePage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;
    ShoppingCartPage shoppingCartPage;
    TshirtsPage tshirtsPage;
    OurStoresPage ourStoresPage;
    SummerDressesPage summerDressesPage;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();
        shoppingCartPage = new ShoppingCartPage();
        tshirtsPage = new TshirtsPage();
        ourStoresPage = new OurStoresPage();
        summerDressesPage = new SummerDressesPage();
    }

    @Test
    public void userShouldBeAbleToBrowseOurStores() {
        homePage.hoverOnDresses();
        homePage.clickOnSummerDressesOption();
        homePage.clickOnSummerDressesOption();
        summerDressesPage.verifySummerDressesPage("Summer Dresses");
    }

    @Test
    public void verifyUserShouldAbleToChangePriceRangeThroughSlider() throws InterruptedException {
        homePage.hoverOnDresses();
        homePage.clickOnSummerDressesOption();
        summerDressesPage.selectPriceRange();
    }
}

