package org.swaglabs.dataprovider;

import org.swaglabs.Account;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public static Object[][] createLoginsProvider() {
        Account standard_userAccount = new Account("standard_user", "secret_sauce");
        Account performance_glitch_userAccount = new Account("performance_glitch_user", "secret_sauce");
        Account problem_userAccount = new Account("problem_user", "secret_sauce");
        return new Object[][]{new Object[]

                {standard_userAccount},
                {performance_glitch_userAccount},
                {problem_userAccount},

        };
    }
}
