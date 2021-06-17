package org.amazon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends PageObject {

    @FindBy(css = " div:nth-child(2) > ul > li:nth-child(4)  a > span")
    private WebElementFacade biographyBooks;

    @FindBy(css = " span:nth-child(6) > li > span > div > a> div.a-section.octopus-pc-category-card-v2-category ")
    private WebElementFacade womenCategoriesBooks;

    @FindBy(css = "  div:nth-child(2) > div.a-section.octopus-pc-card.octopus-best-seller-card > div.a-section.octopus-pc-card-content > ul > li:nth-child(3) > span > div > a > div.a-section.octopus-pc-item-image-section.octopus-pc-item-image-section-v3  ")
    private WebElementFacade selectedBook;

    @FindBy(css="#huc-v2-order-row-confirm-text > h1")
    private WebElementFacade addedToBasketMessage;

    @FindBy(id="hlb-view-cart-announce")
    private WebElementFacade editBasketButton;



    public void clickBiographyBooksDepartment() {
        waitForElement();
        clickOn(biographyBooks);
    }

    public void clickWomenCategoriesBooks() {
        waitForElement();
        clickOn(womenCategoriesBooks);
    }

    public void selectBook() {
        waitForElement();
        clickOn(selectedBook);
    }
    public String getAddedToBasketMessage(){
        return addedToBasketMessage.getText();
    }
    public void clickEditBasketButton(){
        waitForElement();
        clickOn(editBasketButton);
    }


}
