package org.swaglabs.pages;

import com.codeborne.selenide.SelenideElement;
import org.swaglabs.body.Header;

import static com.codeborne.selenide.Selenide.$;

public class BasePage extends Page {
    private final Header header;
    private final String title = "Swag Labs";
    private final String logo = "SWAG LABS";
    private final SelenideElement username = $ ( "#user-name" );
    private final SelenideElement password = $ ( "#password" );
    private final SelenideElement loginButton = $ ( "#login-button" );



    private final SelenideElement robotIcon = $(".bot_column");

    public BasePage() {


        header = new Header ();
    }

    /**
     * Getters
     */
    public String getTitle() {
        return title;
    }

    public String getLoginLogo() {
        return logo;


    }

    public SelenideElement getUsername() {
        return username;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }
    public SelenideElement getRobotIcon() {
        return robotIcon;
    }

    /**
     * Validators - displayed
     */
    public void validateThatLogoIsDisplayedOnScreen() {
        System.out.println ( "Verify that logo is : " + logo );
    }

    public boolean validateThatUsernameFieldIsDisplayedOnScreen() {
        System.out.println ( "Verify that username field is : " + username );
        return this.username.exists() && this.username.isDisplayed();
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


    public void typeOnUserNameField(String userToType) {
        this.username.sendKeys ( userToType );
    }

    /**
     * Clicks
     */
    public void clickOnUsernameField() {
        this.username.click ();
    }

    public void clickOnPasswordField() {
        this.password.click ();
    }

    /**
     * Types
     */
    public void typeOnPasswordField(String passwordToType) {
        this.password.sendKeys ( passwordToType );
    }

    public void clickOnLoginButton() {
        this.loginButton.click ();
    }




}
