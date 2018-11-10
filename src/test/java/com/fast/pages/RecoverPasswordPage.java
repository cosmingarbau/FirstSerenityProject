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

@DefaultUrl("https://qa.firstkid.ro/")
public class RecoverPasswordPage extends PageObject {

    public void hoverTheMyAccount() {
        Actions builder = new Actions(getDriver());
        WebElement myAccount = getDriver().findElement(By.cssSelector("a.my-account-link"));
        Actions hoverOverLocationSelector = builder.moveToElement(myAccount);
        hoverOverLocationSelector.perform();
    }

    @FindBy(css = ".forgot-password")
    private WebElementFacade forgotPassword;

    @FindBy(css = "#email_address")
    private WebElementFacade emailAdressField;

    @FindBy(css = ".button[title=Trimite]")
    private WebElementFacade sendButton;

    @FindBy(css = "")
    private WebElementFacade verifyEmailSend;

    public void clickOnTheRecoverPasswordLink() {
        forgotPassword.click();
    }

    public void enterTheEmailAdress(String email){
        typeInto(emailAdressField, email);
    }

    public void clickOnTheSendButton(){
        sendButton.click();
    }

    public String getTextEmailSend(){
        return verifyEmailSend.getText();

    }
}
