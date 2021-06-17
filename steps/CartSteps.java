package org.amazon.steps;

import net.thucydides.core.annotations.Step;
import org.amazon.pages.BooksPage;
import org.amazon.pages.HomePage;
import org.amazon.pages.ProductPage;
import org.amazon.pages.ShoppingBasketPage;
import org.junit.Assert;

public class CartSteps {

    private HomePage homePage;
    private BooksPage booksPage;
    private ProductPage productPage;
    private ShoppingBasketPage shoppingBasketPage;


    @Step
    public void addToCart() {
        homePage.open();
        homePage.clickBooksButton();
        booksPage.clickBiographyBooksDepartment();
        booksPage.clickWomenCategoriesBooks();
        booksPage.selectBook();
        productPage.clickAddToCart();

    }

    @Step
    public void checkAddToBasketMessage(String expected) {
        String message = booksPage.getAddedToBasketMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void editBasket() {
        booksPage.clickEditBasketButton();

    }
    @Step
    public void selectQuantify(){
        shoppingBasketPage.setSelectQuantify();
    }
}