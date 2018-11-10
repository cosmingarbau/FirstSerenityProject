package com.fast.features.search;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import com.fast.steps.serenity.LogOutSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



@RunWith(SerenityRunner.class)
public class RegisterFeature {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    RegisterSteps registerSteps;

    @Steps
    LogOutSteps logoOutSteps;


    @Test
    public void registerWithValidCredentials() {

        try {
            registerSteps.navigateToLoginPage();

            registerSteps.hoverMyAccount();
            registerSteps.createNewAccount();
            registerSteps.enterLastName();
            registerSteps.enterFirstName();
            registerSteps.enterEmail();
            registerSteps.enterConfirmPassword();
            registerSteps.enterPassword();

            registerSteps.clickSendButton();

            registerSteps.waitUntilLoad();
            //registerSteps.waitUntilLoad();

            registerSteps.clickNewButton();
            try {
                registerSteps.clickPanouDeControl();
            }
            catch (Exception ex)
            {
                registerSteps.clickNewButton();
               // registerSteps.hoverMyAccount();
                registerSteps.clickPanouDeControl();
            }
            registerSteps.verifyLoggedIn();
        }
        finally {
            logoOutSteps.hoverMyAccount();
            logoOutSteps.clickLogOutButton();
        }


    }
}