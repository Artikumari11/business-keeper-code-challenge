package com.ecommerce.pages;

import com.ecommerce.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class BuyProductPage extends BaseTest {
    @FindBy(css = "ul[class*='menu-content'] > li:last-of-type")
    private WebElement tShirtsButton;

    @FindBy(css="div.product-container div.product-image-container")
    //@FindBy(css="span.availability")
    private WebElement imagesLink;

    @FindBy(css="p#add_to_cart button[type='submit']")
    private WebElement addCartButton;

    @FindBy(css="div.button-container a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(css="p.cart_navigation.clearfix a[title='Proceed to checkout']")
    private WebElement stepNextProceedToCheckButton;

    @FindBy(css="form[method='post'] button[name='processAddress']")
    private WebElement addressProceedToCheckButton;

    @FindBy(css="div.checker input[type='checkbox']")
    private WebElement inputAgree;

    @FindBy(css="form[method='post'] button[name='processCarrier']")
    private WebElement shippingProceedToCheckButton;

    @FindBy(css="div#HOOK_PAYMENT p.payment_module a.bankwire")
    private WebElement payByBankWire;

    @FindBy(css = "div#HOOK_PAYMENT p.payment_module a.cheque")
    private WebElement payByCheck;

    @FindBy(css = "p#cart_navigation button[type='submit']")
    private WebElement iConformMyOrder;

    @FindBy(css = "div#center_column")
    private WebElement orderConformationPage;

    @FindBy(css = "a.login")
    private WebElement buttonSignIn;

    @FindBy(css = "input#email")
    private WebElement emailid;

    @FindBy(css = "input#passwd")
    private WebElement inputPassword;

    @FindBy(css = "button#SubmitLogin")
    private WebElement signInButton;



    public BuyProductPage() { PageFactory.initElements(driver, this);
    }
    public void clickOnTshirtButton() {
        tShirtsButton.click();

    }
    public void clickOnImageLink() {
       Actions actions= new Actions(driver);
               WebElement link=imagesLink;

               imagesLink.click();
        //actions.moveToElement(link).click().build().perform();


       }


    public void clickOnAddToCartButton()
    {
        driver.switchTo().frame(0);
        addCartButton.click();
        driver.switchTo().parentFrame();
    }
    public void clickProceedToCheckoutButton()
    {
        proceedToCheckoutButton.click();
    }
    public void clickOnNextStepProceedToCheckoutButton()
    {
        stepNextProceedToCheckButton.click();
        addressProceedToCheckButton.click();
        inputAgree.click();
        shippingProceedToCheckButton.click();
    }

    public void selectPaymentButton(String payment) {
        if (payment.equals("bank")) {
            payByBankWire.click();
        } else {
            payByCheck.click();
        }
    }
    public void clickOnIConformMyOderButton() {

        iConformMyOrder.click();

    }
    public void verifyorderConfomationpage()
    {
        Assert.assertTrue(orderConformationPage.isDisplayed(),"order Not Conformation Page");
    }

        public void clickOnSignButton() {

            buttonSignIn.click();

        }
        public void enterEmailId(String email)
        {
            emailid.sendKeys(email);
        }
    public void enterPassword(String password)
    {
        inputPassword.sendKeys(password);
    }
    public void clickOnSignInButton()
    {
        signInButton.click();
    }
        }

