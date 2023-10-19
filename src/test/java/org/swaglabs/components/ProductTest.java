package org.swaglabs.components;

import org.swaglabs.Account;
import org.swaglabs.body.Header;
import org.swaglabs.dataprovider.ProductDataProvider;
import org.swaglabs.pages.BasePage;
import org.swaglabs.products.Product;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

public class ProductTest {

    BasePage basePage = new BasePage();
    Header header = new Header();

    @BeforeTest
    public void setup() {
        Account account = new Account("standard_user", "secret_sauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(header.validateBurgerMenuIsDisplayed());
    }

    @AfterTest
    public void returnToBasePage() {
        header.clickOnBurgerMenu();
        header.clickOnLogoutButton();
    }

    @Test(testName = "Verify the product title to be displayed.",
            description = "This test verify if product title Products is displayed when user is logged.")
    public void productTitleIsDisplayed() {
        assertTrue(header.validateProductTitleIsDisplayed(), "Expected title Products to be displayed");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product link to be displayed.",
            description = "This test verify if product link is displayed when user is logged.")
    public void productLinkIsDisplayed(Product product) {

        assertTrue(product.validateProductLinkIsDisplayed(), "Expected product link to be displayed");
    }


}
