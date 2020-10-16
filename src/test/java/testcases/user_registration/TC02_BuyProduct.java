package testcases.user_registration;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.BuyProductPage;
import com.ecommerce.pages.RegistrationPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC02_BuyProduct extends BaseTest {
    BuyProductPage buyProductPage;

    public TC02_BuyProduct() {
        super();

    }

    @BeforeClass
    private void startTest() {
        setup();
        buyProductPage = new BuyProductPage();
    }
    @Test(priority = 1)
    public void clickOnSignButton() {
        buyProductPage.clickOnSignButton();
    }
    @Test(priority = 2)
    public void enterEmailId() {
        buyProductPage.enterEmailId("xyzx@yahoo.com");
    }
    @Test(priority = 3)
    public void enterPassword() {
        buyProductPage.enterPassword("nick@2020");
    }
    @Test(priority = 4)
    public void clickOnSignInButton() {
        buyProductPage.clickOnSignInButton();
    }
    @Test(priority = 5)
    public void clickOnTshirtButton() {
        buyProductPage.clickOnTshirtButton();
    }

    @Test(priority = 6)
    public void clickOnImageLink(){
      buyProductPage.clickOnImageLink();
    }

@Test(priority = 7)
public void clickOnAddToCartButton()
{
    buyProductPage.clickOnAddToCartButton();
}
@Test(priority = 8)
public void clickProceedToCheckoutButton()
{
    buyProductPage.clickProceedToCheckoutButton();
}
@Test(priority =9 )
    public void lickOnNextStepProceedToCheckoutButton()
{
    buyProductPage.clickOnNextStepProceedToCheckoutButton();
}

@Test(priority =10 )
    public void selectPaymentButton()
{
    buyProductPage.selectPaymentButton("bank");
}

@Test(priority = 11)
    public void clickOnIConformMyOderButton()
{
    buyProductPage.clickOnIConformMyOderButton();
}
    @Test(priority = 12)
    public void verifyorderConfomationpage()
    {
        buyProductPage.verifyorderConfomationpage();
    }



    //@AfterClass
    //private void terminateTest() {
       // tearDown();
    //}

}
