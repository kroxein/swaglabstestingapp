package org.swaglabs;

import org.swaglabs.pages.BasePage;
import org.testng.annotations.Test;

public class LoginTest {

    BasePage basePage = new BasePage();

    @Test
    public void userCanLoginWithValidUsers () {
        basePage.clickOnUsernameField ();
        String user = "standard_user";
        basePage.typeOnUserNameField ( user );
        basePage.clickOnPasswordField ();
        basePage.typeOnPasswordField ( "secret_sauce" );
        basePage.clickOnLoginButton ();
        basePage.validateHeaderContainsCartIcon ();
    }


}
