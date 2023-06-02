package org.swaglabs;

import org.openqa.selenium.devtools.v85.cachestorage.model.Header;
import org.swaglabs.pages.BasePage;

public class SwagLabsTestingApp {
    public static final String APP_TITLE = "     *****      Testing Simulator     *****     ";
    public static final String SWAG_LABS_TITLE = "Swag Labs";

    public static void main(String[] args) {
        System.out.println ( APP_TITLE );
        BasePage basePage = new BasePage ();
        basePage.getTitle ();
        verifyStaticBasePage ( basePage );

        basePage.clickOnUsernameField ();
        String user = "standard_user";
        basePage.typeOnUserNameField ( user );
        basePage.clickOnPasswordField ();
        basePage.typeOnPasswordField ( "secret_sauce" );
        basePage.clickOnLoginButton ();


    }

    private static void verifyStaticBasePage(BasePage basePage) {
        basePage.validateThatLogoIsDisplayedOnScreen ();
        basePage.validateThatUsernameFieldIsDisplayedOnScreen ();
        basePage.validateThatPasswordFieldIsDisplayedOnScreen ();
        basePage.validateThatLoginButtonIsDisplayedOnScreen ();
        basePage.validateThatRobotIconIsDisplayedOnScreen ();
    }
}