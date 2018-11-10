package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import com.fast.pages.RecoverPasswordPage;
import com.fast.pages.RegisterPage;
import com.fast.Utils.NewUser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RecoverPasswordSteps extends ScenarioSteps {

    LoginPage loginPage;
    MyAccountPage myAccountPage;
    private WebDriver driver;
    private String baseUrl;
    RecoverPasswordSteps recoverPasswordSteps;
    RecoverPasswordPage recoverPasswordPage;

    @Before
    public void SetUp() {
        driver = new InternetExplorerDriver();
        baseUrl = "http://qa.firstkid.ro";
    }

    @Step
    public void navigateToLoginPage() {
        loginPage.open();
    }

    @Step
    public void hoverMyAccount() {
        recoverPasswordPage.hoverTheMyAccount();
    }

    @Step
    public void clickOnRecoverPassword() {
        recoverPasswordPage.clickOnTheRecoverPasswordLink();
    }

    @Step
    public void enterEmailAddress(String mail){
        recoverPasswordPage.enterTheEmailAdress(mail);
    }

    @Step
    public void clickSendButton(){
        recoverPasswordPage.clickOnTheSendButton();
    }

    @Step
    public void verifyTheEmailSend(String sendText){
        Assert.assertTrue(recoverPasswordPage.getTextEmailSend().contains(sendText));
    }
}


