package org.swaglabs.components;

import org.swaglabs.body.Header;
import org.swaglabs.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class HeaderComponentsTest {

    BasePage basePage = new BasePage();
    Header header = new Header();

    @AfterMethod
    public void logout() {
        header.clickOnBurgerMenu();
        header.clickOnLogoutButton();
    }

    @Test
    public void verifyLogoIsDisplayedOnScreen() {
        basePage.clickOnUsernameField();
        String user = "standard_user";
        basePage.typeOnUserNameField(user);
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField("secret_sauce");
        basePage.clickOnLoginButton();
        assertTrue(header.validateLogoIsDisplayedOnScreen());

    }

    @Test
    public void verifyCartIcon() {
        basePage.clickOnUsernameField();
        String user = "standard_user";
        basePage.typeOnUserNameField(user);
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField("secret_sauce");
        basePage.clickOnLoginButton();
        assertTrue(header.validateCartIconIsDisplayed(), "Expected cart icon to be displayed.");
        assertTrue(header.validateCartIconIsEnabled(), "Expected cart icon to be enabled.");
    }

    @Test
    public void verifBurgerMenu() {
        basePage.clickOnUsernameField();
        String user = "standard_user";
        basePage.typeOnUserNameField(user);
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField("secret_sauce");
        basePage.clickOnLoginButton();
        assertTrue(header.validateBurgerMenuIsDisplayed(), "Expected burger menu to be displayed.");
        assertTrue(header.validateBurgerMenuIsEnabled(), "Expected burger menu to be enabled.");


    }
}
