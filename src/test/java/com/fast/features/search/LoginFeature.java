package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.LogOutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginFeature {


    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    LogOutSteps logoOutSteps;



    @Test
    public void loginWithValidCredentials() {
        loginSteps.navigateToLoginPage();
        loginSteps.hoverMyAccount();
        loginSteps.enterEmailAdress(Constants.userEmail);
        loginSteps.enterPassword(Constants.userPass);
        loginSteps.clickLogin();
        loginSteps.verifyLoggedIn(Constants.userName);
        logoOutSteps.hoverMyAccount();
        logoOutSteps.clickLogOutButton();
    }

}
