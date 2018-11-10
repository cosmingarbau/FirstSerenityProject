package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;

public class CartPage extends PageObject {


    @FindBy(css = ".menu-container")
    private WebElementFacade menu;

    @FindBy(css = ".menu-static-width  a[href*=\"articole-mamici\"]")
    private WebElementFacade articoleMamiciMenu;

    @FindBy(css = ".product-name [title~=Negru]")
    private WebElementFacade articolBlackPrenatalBelt;

    @FindBy(css = "#qty")
    private WebElementFacade selectNumberOfProductsBox;

    @FindBy(css = "#qty")
    private WebElementFacade insertNumberOfProducts;

    @FindBy (css = ".icon-cart")
    private WebElementFacade addToCartButton;

    public void clickMenu() {
        menu.click();
    }

    public void clickArticoleMamici() {
        articoleMamiciMenu.click();
    }

    public void clickProduct() {
        articolBlackPrenatalBelt.click();
    }

    public void clickNumberOfProductsBox() {
        selectNumberOfProductsBox.clear();
    }

    public void setNumberOfProducts(String nr) {
        typeInto(selectNumberOfProductsBox, nr);
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }
}

