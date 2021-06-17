package org.amazon.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.amazon.steps.CartSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Before
    public void maximise(){
        driver.manage().window().maximize();
    }


    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart() {
        cartSteps.addToCart();
        cartSteps.checkAddToBasketMessage("Added to Basket");
        cartSteps.editBasket();
        cartSteps.selectQuantify();
}
    }