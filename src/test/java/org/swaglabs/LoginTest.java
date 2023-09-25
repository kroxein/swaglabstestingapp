package org.swaglabs;

import org.swaglabs.body.Header;
import org.swaglabs.dataprovider.LoginDataProvider;
import org.swaglabs.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.*;

public class LoginTest {

    BasePage basePage = new BasePage();
    Header header = new Header();

    @Test(testName = "User can login with valid username and valid password.",
            description = "This test verify if user can login with valid username (standard_user,problem_user,performance_glitch_user ) and valid password (secret_sauce).",
            dataProvider = "LoginDataProvider", dataProviderClass = LoginDataProvider.class)

    public void userCanLoginWithValidUsers(Account account) {
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(header.validateBurgerMenuIsDisplayed());
        header.clickOnBurgerMenu();
        header.clickOnLogoutButton();
        assertTrue(basePage.validateThatUsernameFieldIsDisplayedOnScreen(), "Expected username field to be displayed on screen.");
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }





    @Test(testName = "User can't login with locked user.",
            description = "This test verify if user can't login with locked user.")
    public void userCantLoginWithLockedUser() {
        Account account = new Account("locked_out_user", "secret_sauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateLockedMesageIsDisplayedOnScreen(), " Expected message: Sorry, this user has been locked out to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }

    @Test(testName = "User can't login with no username and no password.",
            description = "This test verify if user can't login with no username and no password.")
    public void userCantLoginWithNoUsernameAndNoPassword() {
        Account account = new Account("", "");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameIsRequiredMessageIsDisplayedOnScreen(), "Expected message: Username is required to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }

    @Test(testName = "User can't login with valid username and no password.",
            description = "This test verify if user can't login with valid username and no password.")
    public void userCantLoginWithValidUsernameAndNoPassword() {
        Account account = new Account("standard_user", "");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validatePasswordIsRequiredMessageIsDisplayedOnScreen(), "Expected message: Password is required to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());

    }
    @Test(testName = "User can't login with no username and valid password.",
            description = "This test verify if user can't login with no username and valid password.")
    public void userCantLoginWithNoUsernameAndValidPassword() {
        Account account = new Account("", "secret_sauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameIsRequiredMessageIsDisplayedOnScreen(), "Expected message: Username is required to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }
    @Test(testName = "User can't login with wrong username and wrong password.",
            description = "This test verify if user can't login with wrong username and wrong password.")
    public void userCantLoginWithWrongUsernameAndWrongPassword() {
        Account account = new Account("standarduser", "secretsauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameAndPasswordDoNotMatchMessageIsDisplayedOnScreen(),"Expected message: Username and password do not match to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());

    }
    @Test(testName = "User can't login with valid username and wrong password.",
            description = "This test verify if user can't login with valid username and wrong password.")
    public void userCantLoginWithValidUsernameAndWrongPassword() {
        Account account = new Account("standard_user", "secretsauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameAndPasswordDoNotMatchMessageIsDisplayedOnScreen(),"Expected message: Username and password do not match to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }

    @Test(testName = "User can't login with wrong username and valid password.",
            description = "This test verify if user can't login with wrong username and valid password.")
    public void userCantLoginWithWrongUsernameAndValidPassword() {
        Account account = new Account("standarduser", "secret_sauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameAndPasswordDoNotMatchMessageIsDisplayedOnScreen(),"Expected message: Username and password do not match to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }

    @Test(testName = "User can't login with wrong username and no password.",
            description = "This test verify if user can't login with wrong username and no password.")
    public void userCantLoginWithWrongUsernameAndNoPassword() {
        Account account = new Account("dno", "");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validatePasswordIsRequiredMessageIsDisplayedOnScreen(), "Expected message: Password is required to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());

    }

    @Test(testName = "User can't login with no username and wrong password.",
            description = "This test verify if user can't login with no username and wrong password.")
    public void userCantLoginWithNoUsernameAndWrongPassword() {
        Account account = new Account("", "secretsauce");
        basePage.clickOnUsernameField();
        basePage.typeOnUserNameField(account.getUsername());
        basePage.clickOnPasswordField();
        basePage.typeOnPasswordField(account.getPassword());
        basePage.clickOnLoginButton();
        assertTrue(basePage.validateUsernameIsRequiredMessageIsDisplayedOnScreen(), "Expected message: Username is required to be displayed on screen.");
        basePage.clickOnErrorButton();
        basePage.clickOnUsernameField();
        basePage.clearUsernameField();
        basePage.clickOnPasswordField();
        basePage.clearPasswordField();
        assertTrue(basePage.validateUsernameFieldIsEmpty());
        assertTrue(basePage.validatePasswordFieldIsEmpty());
    }

}
