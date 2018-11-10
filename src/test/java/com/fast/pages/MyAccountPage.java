package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://qa.firstkid.ro/customer/account/")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade helloNametext;

    public String  isLoggedIn(){
 return helloNametext.getText();
    }
}
