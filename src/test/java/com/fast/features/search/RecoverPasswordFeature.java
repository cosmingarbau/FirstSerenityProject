package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.RecoverPasswordSteps;
import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class RecoverPasswordFeature {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    RecoverPasswordSteps recoverPasswordSteps;

    @Test
    public void recoverPasswordWithValidCredentials() {
        recoverPasswordSteps.navigateToLoginPage();
        recoverPasswordSteps.hoverMyAccount();
        recoverPasswordSteps.clickOnRecoverPassword();
        recoverPasswordSteps.enterEmailAddress(Constants.userEmail);
        recoverPasswordSteps.clickSendButton();
    }
}