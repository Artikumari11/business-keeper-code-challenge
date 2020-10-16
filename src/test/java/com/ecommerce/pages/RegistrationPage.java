package com.ecommerce.pages;

import com.ecommerce.base.BaseTest;
//import com.sun.java.util.jar.pack.DriverResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegistrationPage extends BaseTest {

    @FindBy(css = "a.login")
    private WebElement buttonSignIn;

    @FindBy(css = "input#email_create")
    private WebElement inputEmailForRegistration;

    @FindBy(css = "button#SubmitCreate")
    private WebElement buttonCreateAccount;

    /*
     *  Personal Information elements
     */

    @FindBy(css = "input#id_gender1")
    private WebElement radioButtonMale;

    @FindBy(css = "input#id_gender2")
    private WebElement radioButtonFemale;

    @FindBy(css = "input#customer_firstname")
    private WebElement inputFirstName;

    @FindBy(css = "input#customer_lastname")
    private WebElement inputLastName;

    @FindBy(css = "input#email")
    private WebElement inputEmail;

    @FindBy(css = "input#passwd")
    private WebElement inputPassword;

    @FindBy(css = "select#days")
    private WebElement selectDobDate;

    @FindBy(css = "select#months")
    private WebElement selectDobMonth;

    @FindBy(css = "select#years")
    private WebElement selectDobYear;

    /*
     *  Address Data elements
     */

    @FindBy(css = "input#firstname")
    private WebElement inputFirstNameForAddress;

    @FindBy(css = "input#lastname")
    private WebElement inputLastNameForAddress;

    @FindBy(css = "input#company")
    private WebElement inputCompanyForAddress;

    @FindBy(css = "input#address1")
    private WebElement inputAddress;

    @FindBy(css = "input#address2")
    private WebElement inputAddressLine2;

    @FindBy(css = "input#city")
    private WebElement inputCity;

    @FindBy(css = "select#id_state")
    private WebElement selectState;

    @FindBy(css = "input#postcode")
    private WebElement inputPostcode;

    @FindBy(css = "select#id_country")
    private WebElement selectCountry;

    @FindBy(css = "textarea#other")
    private WebElement inputAdditionalInformation;

    @FindBy(css = "input#phone")
    private WebElement inputHomePhone;

    @FindBy(css = "input#phone_mobile")
    private WebElement inputMobilePhone;

    @FindBy(css = "input#alias")
    private WebElement inputAlias;

    @FindBy(css = "button#submitAccount")
    private WebElement buttonRegister;

    @FindBy(css="p.info-account")
    private WebElement myAccountDetails;


    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToRegistrationPage() {
        buttonSignIn.click();
    }

    public void openRegistrationForm(String email) {
        inputEmailForRegistration.sendKeys(email);
        buttonCreateAccount.click();
    }

    public void selectTitle(String title) {
        if (title.equals("Mr")) {
            radioButtonMale.click();
        } else {
            radioButtonFemale.click();
        }
    }

    public void selectName(String name) {
        inputFirstName.sendKeys(name);
        inputLastName.sendKeys(name);
    }

    public void enterPassword(String password) {

        inputPassword.sendKeys(password);

    }

    public void enterAddress(String line) {
        inputAddress.sendKeys(line);
        inputAddressLine2.sendKeys(line);
    }

    public void enterCity(String cityname) {
        inputCity.sendKeys(cityname);

    }
    public void selectState() {
        Select select= new Select(selectState) ;

        select.selectByVisibleText("California");
    }

    public void enterPostelCode(String zip) {
        inputPostcode.sendKeys(zip);

    }
    public void selectCountry() {
        Select select= new Select(selectCountry) ;

        select.selectByVisibleText("United States");
    }
    public void PhoneNumber(String number) {
        inputMobilePhone.sendKeys(number);

    }
    public void aliasForFutureReference(String alias)
    {
        inputAlias.sendKeys(alias);
    }
    public void clickOnRegisterButton()
    {
        buttonRegister.click();
    }
    public void verifyAccountCreatedSucessfully()
    {
         Assert.assertTrue(myAccountDetails.isDisplayed(),"Login Failed");
    }
}