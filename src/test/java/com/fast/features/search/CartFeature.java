package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LogOutSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartFeature {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    LogOutSteps logOutSteps;

    @Before
    public void login() {
        loginSteps.performLogin(Constants.userEmail, Constants.userPass, Constants.userName);
    }

    @Test
    public void addToCart() {
        cartSteps.clickTheMenuContainer();
        cartSteps.clickTheArticoleMamiciButton();
        cartSteps.ClickTheProduct();

        cartSteps.setNumberOfProducts();
        cartSteps.addToCart();
        logOutSteps.hoverMyAccount();
        logOutSteps.clickLogOutButton();
    }
}
