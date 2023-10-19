package org.swaglabs.products;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Product {


    private final SelenideElement productLink;



    public Product(String productId) {
        this.productLink = $(String.format("#item_%s_title_link", productId));

    }


    /**
     * Validators-displayed
     */

    public boolean validateProductLinkIsDisplayed() {
        return this.productLink.exists() && this.productLink.isDisplayed();
    }

    /**
     * Clicks
     */
    public void clickOnProduct() {
        this.productLink.click();
    }
}

