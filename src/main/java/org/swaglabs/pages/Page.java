package org.swaglabs.pages;

import static com.codeborne.selenide.Selenide.open;

public class Page {


    public Page() {
        System.out.println ("Opening Page.");
        open("https://www.saucedemo.com/");
    }
}
