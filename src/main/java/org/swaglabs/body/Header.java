package org.swaglabs.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header {

   private final SelenideElement cartIcon = $("#shopping_cart_container");
    public Header() {

    }

    public boolean validateHeaderContainsCartIcon() {
        return this.cartIcon.exists () && this.cartIcon.isDisplayed ();
    }
}
