package org.swaglabs;

import org.swaglabs.pages.BasePage;

public class SwagLabsTestingApp {
    public static final String APP_TITLE = "     *****      Testing Simulator     *****     ";
    public static final String SWAG_LABS_TITLE = "Swag Labs";

    public static void main(String[] args) {
        System.out.println ( APP_TITLE );
        BasePage basePage = new BasePage ();
        basePage.getTitle ();
        basePage.validateThatLogoIsDisplayedOnScreen ();
        basePage.validateThatUsernameFieldIsDisplayedOnScreen ();
        basePage.validateThatPasswordFieldIsDisplayedOnScreen ();
        basePage.validateThatLoginButtonIsDisplayedOnScreen();
        basePage.validateThatRobotIconIsDisplayedOnScreen();


    }
}