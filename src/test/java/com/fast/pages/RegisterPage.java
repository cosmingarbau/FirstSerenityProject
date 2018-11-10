package com.fast.pages;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.fast.Utils.NewUser;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://qa.firstkid.ro/")
public class RegisterPage extends PageObject {

    private NewUser newUser;

    private void firstNameField() {
    }

    public void hoverTheMyAccount() {
        Actions builder = new Actions(getDriver());
        WebElement myAccount = getDriver().findElement(By.cssSelector("a.my-account-link"));
        Actions hoverOverLocationSelector = builder.moveToElement(myAccount);
        hoverOverLocationSelector.perform();
    }

    public void createNewAccount() {
        clickOn(createNewAccount);
    }

//    public NewUser getNewUser(){
//        return newUser;
//    }
//    public void setNewUser(NewUser user){
//        this.newUser=user;
//    }

    public void setFirstNameField(String pass) {
        typeInto(firstNameField, pass);
    }

    public void setLastNameField(String pass) {
        typeInto(lastNameField, pass);
    }

    public void setEmailAdressField(String pass) {
        typeInto(emailAdressField, pass);
    }

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    public void setConfirmPasswordField(String pass) {
        typeInto(confirmPasswordField, pass);
    }

    public void setRegisterButton(){
        registerButton.click();

    }

    public void cliclThePanoulDeControl() {
        panouDeControl.click();
    }

    public void clickNewButton()
    {
        newButton.click();
    }

    public void waitUntilLoad()
    {
        //withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".menu-container"));
        setImplicitTimeout(20, TimeUnit.SECONDS);
       waitFor(slowLoadingField);
    }


    @FindBy(css = ".create-account-link")
    private WebElementFacade createNewAccount;

    @FindBy(css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy(css = "#email_address")
    private WebElementFacade emailAdressField;

    @FindBy(css = "#day")
    private WebElementFacade dayOfBirthField;

    @FindBy(css = "#month")
    private WebElementFacade monthOfBirthField;

    @FindBy(css = "#year")
    private WebElementFacade yearOfBirthField;

    @FindBy(css = "#password")
    private WebElementFacade passwordField;

    @FindBy(css = "#confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css = ".button[title*=Trimite]", timeoutInSeconds = "10")
    private WebElementFacade registerButton;

    @FindBy(css = ".mini-my-account-link-panou-de-control-link")
    private WebElementFacade panouDeControl;

    @FindBy(css=".menu-container")
    public WebElementFacade slowLoadingField;


    @FindBy(css = "a.my-account-link", timeoutInSeconds = "20")
    private WebElementFacade newButton;

}


