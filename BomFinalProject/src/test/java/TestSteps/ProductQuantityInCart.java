package TestSteps;

import Pages.HomePage;
import Pages.ProductDetailsPage1;
import Pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductQuantityInCart extends TestBases{
    HomePage hm =new HomePage();
    ProductDetailsPage1 pd=new ProductDetailsPage1();
    ViewCartPage vc=new ViewCartPage();

    @Test
    public void VerifyProductQuantityInCart() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.ClickViewProduct();
        pd.ClearQuantity();
        pd.AddProduct("4");
        pd.ClickAddToCart();
        pd.ClickViewCart();
        Assert.assertTrue(vc.CheckDescription(0).contains("Blue Top"));
        Assert.assertTrue(vc.CheckQuantity(0).contains("4"));
    }
}
