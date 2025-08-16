package TestSteps;

import Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollUPAndScrollDownFunctionally extends TestBases{
    HomePage hm=new HomePage();

    @Test
            public void VerifyScrollUPAndScrollDownFunctionally() {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        Assert.assertTrue(hm.CheckSubscriptionText().toLowerCase().contains("subscription"));
        hm.ScrollUp();
    }
}

