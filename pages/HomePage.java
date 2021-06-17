package org.amazon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.co.uk/")
public class HomePage extends PageObject {

    @FindBy(css = "#nav-xshop > a:nth-child(7)")
    private WebElementFacade booksButton;


    public void clickBooksButton() {
        waitForElement();
        clickOn(booksButton);

    }


}
