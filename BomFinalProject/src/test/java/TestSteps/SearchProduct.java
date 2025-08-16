package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct extends TestBases{
    HomePage hm =new HomePage();
    ProductsPage ps =new ProductsPage();
    ViewCartPage vc=new ViewCartPage();
    SearchedProductPage sp=new SearchedProductPage();
    LoginPage lg =new LoginPage();

    @Test
    public void VerifySearchProduct() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenProducts();
        Assert.assertEquals(ps.CheckUrl(), "https://www.automationexercise.com/products");
        Assert.assertTrue(ps.CheckTitle().contains("All Products"));
        ps.EnterSearchValue("Blue Top");
        ps.ClickSearchButton();
        Assert.assertTrue(sp.CheckTextCenter(3).contains("Blue Top"));
    }
}
