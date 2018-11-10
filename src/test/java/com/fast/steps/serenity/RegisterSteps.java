package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import com.fast.pages.RegisterPage;
import com.fast.Utils.NewUser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RegisterSteps extends ScenarioSteps {

    LoginPage loginPage;
    MyAccountPage myAccountPage;
    private WebDriver driver;
    private String baseUrl;
    RegisterPage registerPage;
    private NewUser user = new NewUser();

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
        registerPage.hoverTheMyAccount();
    }

    @Step
    public void createNewAccount() {
        registerPage.createNewAccount();
    }

    @Step
    public void enterFirstName() {
        registerPage.setFirstNameField(user.getFirstName());
    }

    @Step
    public void enterLastName() {
        registerPage.setLastNameField(user.getLastName());
    }

    @Step
    public void enterEmail() {
        registerPage.setEmailAdressField(user.getEmail());
    }

    @Step
    public void enterPassword() {
        registerPage.setPasswordField(user.getPassword());
    }

    @Step
    public void enterConfirmPassword() {
        registerPage.setConfirmPasswordField(user.getConfirmPassword());
    }

    @Step
    public void clickSendButton(){
        registerPage.setRegisterButton();
    }

    @Step
public void clickPanouDeControl(){
        registerPage.cliclThePanoulDeControl();
    }

    @Step
    public void verifyLoggedIn() {
        Assert.assertTrue(myAccountPage.isLoggedIn().contains(user.getFirstName()));
    }

    @Step
    public void waitUntilLoad()
    {
        registerPage.waitUntilLoad();
    }

    @Step
    public void clickNewButton()
    {
        registerPage.clickNewButton();
    }


//    @Step
//    public void verifyRegister(String name) {
//        Assert.assertTrue(myAccountPage.isLoggedIn().contains(firstName ; lastName);
//    }
}

