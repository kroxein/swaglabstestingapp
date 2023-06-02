package org.swaglabs.components;

import com.codeborne.selenide.SelenideElement;
import org.swaglabs.pages.BasePage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasePageTest {
    BasePage basePage = new BasePage ();

    @Test
    public void verifyThatTitleIsDisplayedOnScreen() {
        assertEquals ( basePage.getTitle () , "Swag Labs" , "Application title is expected to be Swag Labs." );
    }

    @Test
    public void verifyBasePageContainsLogoIcon() {
        assertEquals ( basePage.getLoginLogo () , "SWAG LABS" , "Expected Logo to be SWAG LABS." );
    }

    @Test
    public void verifyUsernameField() {
        SelenideElement username = basePage.getUsername ();
        assertTrue ( username.exists () , "Expected username field to exist on page." );
        assertTrue ( username.isDisplayed () , "Expected username field to be displayed." );
        assertTrue ( username.isEnabled () , "Expected username field to be enabled." );
    }

    @Test
    public void verifyPasswordField() {
        SelenideElement password = basePage.getPassword ();
        assertTrue ( password.exists () , "Expected password field to exist on page." );
        assertTrue ( password.isDisplayed () , "Expected password field to be displayed." );
        assertTrue ( password.isEnabled () , "Expected password field to be enabled." );
    }

    @Test
    public void verifyLoginButton() {
        SelenideElement loginButton = basePage.getLoginButton ();
        assertTrue ( loginButton.exists () , "Expected login button to exist on page." );
        assertTrue ( loginButton.isDisplayed () , "Expected login button to be displayed." );
        assertTrue ( loginButton.isEnabled () , "Expected login button to be enabled." );
    }




}
