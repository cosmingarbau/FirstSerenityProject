package com.fast.steps.serenity;

import com.fast.pages.LogOutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogOutSteps extends ScenarioSteps {

    LogOutPage logOutPage;

    @Step
    public void hoverMyAccount() {
        logOutPage.hoverTheMyAccount();
    }

    @Step
    public void clickLogOutButton() {
        logOutPage.clickTheLogOutButton();
    }
}


