package org.swaglabs.pages;

public class BasePage {

    private final String title = "Swag Labs";
    private final String logo;
    private final String username;
    private final String password;
    private final String loginButton;
    private final String robotIcon;

    public BasePage() {
        this.logo = "SWAG LABS";
        this.username = "user-name";
        this.password = "password";
        this.loginButton = "login";
        this.robotIcon = "bot_column";
    }

    /**
     * Getters
     */
    public String getTitle() {
        return title;
    }

    /**
     * Validators - displayed
     */
    public void validateThatLogoIsDisplayedOnScreen() {
        System.out.println ( "Verify that logo is : " + logo );
    }

    public void validateThatUsernameFieldIsDisplayedOnScreen() {
        System.out.println ( "Verify that username field is : " + username );
    }

    public void validateThatPasswordFieldIsDisplayedOnScreen() {
        System.out.println ( "Verify that password field is : " + password );
    }

    public void validateThatLoginButtonIsDisplayedOnScreen() {
        System.out.println ( "Verify that login button is : " + loginButton );
    }

    public void validateThatRobotIconIsDisplayedOnScreen() {
        System.out.println ( "Verify that robot icon is : " + robotIcon );
    }
}
