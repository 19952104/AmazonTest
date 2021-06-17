package org.amazon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShoppingBasketPage extends PageObject {


    @FindBy(css = "select[name='quantity']")
    private WebElementFacade selectQuantifyButton;


    public void setSelectQuantify() {

        waitForElement();
        selectQuantifyButton.selectByValue("4");


    }
}