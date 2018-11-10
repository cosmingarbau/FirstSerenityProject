package com.fast.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://qa.firstkid.ro/")
public class LoginPage extends PageObject {


    @FindBy(css = "#mini-login")
    private WebElementFacade emailAdressField;

    @FindBy(css = "#mini-password")
    private WebElementFacade passwordField;

    @FindBy(css = ".actions .button")
    private WebElementFacade loginButton;

    public void setEmailAdressField(String email) {

        typeInto(emailAdressField, email);
    }

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
        String x = RandomStringUtils.randomAlphabetic(20);
        String email = x + "@email.com";
    }

    public void hoverTheMyAccount() {
        Actions builder = new Actions(getDriver());
        WebElement myAccount = getDriver().findElement(By.cssSelector("a.my-account-link"));
        Actions hoverOverLocationSelector = builder.moveToElement(myAccount);
        hoverOverLocationSelector.perform();
    }



    }



