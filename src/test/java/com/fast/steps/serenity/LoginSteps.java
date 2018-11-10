package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    MyAccountPage myAccountPage;
    private WebDriver driver;
    private String baseUrl;

    @Step
    public void navigateToLoginPage() {
        loginPage.open();
    }

    @Step
    public void hoverMyAccount() {
        loginPage.hoverTheMyAccount();
    }

    @Step
    public void enterEmailAdress(String email) {
        loginPage.setEmailAdressField(email);
    }

    @Step
    public void enterPassword(String pass) {
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyLoggedIn(String userName) {
        Assert.assertTrue(myAccountPage.isLoggedIn().contains(userName));
    }

    @StepGroup
    public void performLogin(String userEmail, String pass, String userName) {
        navigateToLoginPage();
        hoverMyAccount();
        enterEmailAdress(userEmail);
        enterPassword(pass);
        clickLogin();
        verifyLoggedIn(userName);
    }

    @Before
    public void SetUp() {
        driver = new InternetExplorerDriver();
        baseUrl = "http://qa.firstkid.ro";

    }


}

