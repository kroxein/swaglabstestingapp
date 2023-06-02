package org.swaglabs;

import org.swaglabs.body.Header;
import org.swaglabs.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest {

    BasePage basePage = new BasePage();
    Header header = new Header();

    @Test
    public void userCanLoginWithValidUsers() {
        basePage.clickOnUsernameField();
        String user = "standard_user";
        basePage.typeOnUserNameField(user);
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField("secret_sauce");
        basePage.clickOnLoginButton();
        assertTrue(header.validateLogoIsDisplayedOnScreen(),"Expected Logo to be displayed on screen.");
        header.clickOnBurgerMenu();
        header.clickOnLogoutButton();
        assertTrue(basePage.validateThatUsernameFieldIsDisplayedOnScreen(),"Expected username field to be displayed on screen.");





    }


}
