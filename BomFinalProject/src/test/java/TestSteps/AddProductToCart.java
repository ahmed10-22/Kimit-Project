package TestSteps;

import Pages.HomePage;
import Pages.ProductsPage;
import Pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCart extends TestBases{
    HomePage hm =new HomePage();
    ProductsPage ps =new ProductsPage();
    ViewCartPage vc=new ViewCartPage();

    @Test
    public void VerifyAddProductToCart() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenProducts();
        Assert.assertEquals(ps.CheckUrl(), "https://www.automationexercise.com/products");
        Assert.assertTrue(ps.CheckTitle().contains("All Products"));
        ps.AddBlueTopToCart(5);
        ps.ClickContinueShoppingButton();
        ps.AddMenTShirtToCart(5);
        ps.ClickContinueShoppingButton();
        ps.OpenCart();
        Assert.assertTrue(vc.CheckDescription(0).contains("Blue Top"));
        Assert.assertTrue(vc.CheckDescription(1).contains("Men Tshirt"));
        Assert.assertTrue(vc.CheckPrice(0).contains("Rs. 500"));
        Assert.assertTrue(vc.CheckPrice(1).contains("Rs. 400"));
        Assert.assertTrue(vc.CheckQuantity(0).contains("1"));
        Assert.assertTrue(vc.CheckQuantity(1).contains("1"));
        Assert.assertTrue(vc.CheckTotalPrice(0).contains("Rs. 500"));
        Assert.assertTrue(vc.CheckTotalPrice(1).contains("Rs. 400"));
    }
}
