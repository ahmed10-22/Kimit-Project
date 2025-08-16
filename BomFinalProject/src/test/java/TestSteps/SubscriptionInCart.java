package TestSteps;

import Pages.HomePage;
import Pages.ViewCartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionInCart extends TestBases{
    HomePage hm =new HomePage();
    ViewCartPage vc=new ViewCartPage();

    @Test
    public void VerifySubscriptionInCart() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenCart();
        Assert.assertTrue(vc.CheckSubscriptionText().toLowerCase().contains("subscription"));
        vc.EnterSubscriptionEmail("ahmed10isco@gmail.com");
        vc.ClickSubscriptionButton();
        Assert.assertTrue(vc.CheckSubscriptionSuccessMessage().contains("You have been successfully subscribed!"));

    }
}
