package TestSteps;

import Pages.CategoryProduct2Page;
import Pages.CategoryProduct3Page;
import Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ViewCategoryProduct extends TestBases {
    HomePage hm =new HomePage();
    CategoryProduct2Page c2=new CategoryProduct2Page();
    CategoryProduct3Page c3=new CategoryProduct3Page();

    @Test
    public void VerifyViewCategoryProduct() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        Assert.assertTrue(hm.CheckCategoryText().toLowerCase().contains("category"));
        hm.ClickWomenPlusIcon();
        hm.ClickTops();
        Assert.assertTrue(c2.CheckTextCenter().contains("WOMEN - TOPS PRODUCTS"));
        c2.ClickMenPlusIcon();
        c2.ClickTshirt();
        Assert.assertTrue(c3.CheckTextCenter().toLowerCase().contains("men - tshirts products"));

    }

}
