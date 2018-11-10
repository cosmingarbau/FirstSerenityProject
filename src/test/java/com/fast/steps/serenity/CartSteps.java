package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class CartSteps extends ScenarioSteps {

    CartPage cartPage;

    public String getNumber()
    {
        Random generator = new Random();
        int i = generator.nextInt(10);
        return "";
    }

    @Step
    public void clickTheMenuContainer() {
        cartPage.clickMenu();
    }

    @Step
    public void clickTheArticoleMamiciButton() {
        cartPage.clickArticoleMamici();
    }

    @Step
    public void ClickTheProduct() {
        cartPage.clickProduct();
    }

    @Step
    public void BoxNumberOfProducts() {
        cartPage.clickNumberOfProductsBox();
    }

    @Step
    public void setNumberOfProducts() {
        cartPage.setNumberOfProducts("5");
    }

    @Step
    public void addToCart(){
        cartPage.clickAddToCartButton();
    }
}
