package testcases.user_registration;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC01_RegistrationProcess extends BaseTest {


    RegistrationPage registrationPage;

    public TC01_RegistrationProcess() {
        super();

    }

    @BeforeClass
    private void startTest() {
        setup();
        registrationPage=new RegistrationPage();
    }

    @Test(priority = 1)
    public void openRegistrationForm()
    {
        registrationPage.goToRegistrationPage();
        registrationPage.openRegistrationForm("xyzx@yahoo.com");
    }

    @Test(priority = 2)
    public void fillRegistrationForm()
    {
        registrationPage.selectTitle("Mr");
    }

    @Test(priority = 3)
    public void selectName()
    {
        registrationPage.selectName("nick");
        registrationPage.selectName("jon");

    }
    @Test(priority = 4)
    public void enterPassword()
    {
        registrationPage.enterPassword("nick@2020");}

    @Test(priority = 5)
    public void enterAddress()
    {
        registrationPage.enterAddress("Alameda 510");
        registrationPage.enterAddress("left apartments");

    }
    @Test(priority = 6)
    public void enterCity(){
        registrationPage.enterCity("Alameda");
    }
    @Test(priority = 7)
    public void selectState(){
        registrationPage.selectState();
    }
    @Test(priority = 8)
    public void enterPostelCode()
    {
        registrationPage.enterPostelCode("90221");
    }
    @Test(priority = 9)
    public void selectCountry()
    {
        registrationPage.selectCountry();
    }
    @Test(priority = 10)
    public void PhoneNumber()
    {
        registrationPage.PhoneNumber("9092605439");
    }
    @Test(priority = 11)
    public void addresstitleforfuturereference()
    {
     registrationPage.aliasForFutureReference("my address");
    }
    @Test(priority = 12)
    public void clickOnRegisterButton()
    {
        registrationPage.clickOnRegisterButton();
    }
    @Test(priority = 13)
            public void verifyAccountCreatedSucessfully() {
        registrationPage.verifyAccountCreatedSucessfully();

    }
    @AfterClass
    private void terminateTest() {
        tearDown();
    }


}
