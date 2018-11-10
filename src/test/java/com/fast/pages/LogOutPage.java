package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOutPage extends PageObject {

    @FindBy(css = "a.my-account-link")
    private WebElementFacade hoverTheMyAccount;

    @FindBy (css =".mini-my-account-link-logout-link")
    private WebElementFacade logOutButton;


    public void hoverTheMyAccount() {
        Actions builder = new Actions(getDriver());
        WebElement myAccount = getDriver().findElement(By.cssSelector("a.my-account-link"));
        Actions hoverOverLocationSelector = builder.moveToElement(myAccount);
        hoverOverLocationSelector.perform();
    }

    public void clickTheLogOutButton(){
        clickOn(logOutButton);
    }
}
