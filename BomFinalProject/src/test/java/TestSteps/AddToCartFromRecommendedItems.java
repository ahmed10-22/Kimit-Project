package TestSteps;

import Pages.HomePage;
import Pages.ViewCartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartFromRecommendedItems extends TestBases{
HomePage hm=new HomePage();
ViewCartPage vc=new ViewCartPage();

@Test
    public void VerifyAddToCartFromRecommendedItems(){
    Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
    Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
    Assert.assertTrue(hm.CheckRecommended(37).contains("RECOMMENDED ITEMS"));
    hm.ClickAddToCart(68);
    hm.ClickViewCart(2);
    Assert.assertTrue(vc.CheckDescription(0).contains("Blue Top"));
}
}
