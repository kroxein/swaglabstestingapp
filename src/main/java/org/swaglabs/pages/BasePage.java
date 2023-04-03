package org.swaglabs.pages;

import com.codeborne.selenide.SelenideElement;
import org.swaglabs.body.Header;

import static com.codeborne.selenide.Selenide.$;

public class BasePage extends Page{
private final Header header;
    private final String title = "Swag Labs";
    private final String logo;
    private final SelenideElement username = $("#user-name");
    private final SelenideElement password =  $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final String robotIcon;

    public BasePage() {
        this.logo = "SWAG LABS";
        this.robotIcon = "bot_column";
        header = new Header();
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
        this.password.click();
    }


    public void typeOnPasswordField(String passwordToType) {
        this.password.sendKeys( passwordToType );
    }

    public void clickOnLoginButton() {
        this.loginButton.click();
    }

    public void validateHeaderContainsCartIcon() {
        this.header.validateHeaderContainsCartIcon();
    }
}
