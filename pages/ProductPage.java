package org.amazon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    @FindBy(id="add-to-cart-button")
    private WebElementFacade addToCartButton;


    public void clickAddToCart(){
        waitForElement();
        clickOn(addToCartButton);
    }
}
