package org.swaglabs.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Header {

    private final SelenideElement appLogo = $(".app_logo");
    private final SelenideElement cartIcon = $("#shopping_cart_container");
    private final SelenideElement burgerMenu = $("#react-burger-menu-btn");
    private final SelenideElement logoutButton = $("#logout_sidebar_link");
    private final SelenideElement productTitle =  $(".title");

    public Header() {
    }

    /**
     * Validators - displayed
     */
    public boolean validateLogoIsDisplayedOnScreen() {
       return  this.appLogo.exists() && this.appLogo.isDisplayed();
    }
    public boolean validateCartIconIsDisplayed() {
        return this.cartIcon.exists() && this.cartIcon.isDisplayed();
    }

    public boolean validateBurgerMenuIsDisplayed() {
        return this.burgerMenu.exists() && this.burgerMenu.isDisplayed();

    }
    public boolean validateProductTitleIsDisplayed(){
        return  this.productTitle.exists() && this.productTitle.isDisplayed();
    }
    /**
     * Validators - enabled
     */

    public boolean validateCartIconIsEnabled() {
        return this.cartIcon.isEnabled();
    }
    public boolean validateBurgerMenuIsEnabled() {
        return this.burgerMenu.isEnabled();
    }

    /**
     * Clicks
     */
    public void clickOnBurgerMenu() {
        this.burgerMenu.click();
    }

    public void clickOnLogoutButton() {
        this.logoutButton.click();
        sleep(300);
    }



}
