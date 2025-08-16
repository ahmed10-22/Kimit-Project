package TestSteps;

import Pages.HomePage;
import Pages.ProductsPage;
import Pages.ViewCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProduct extends TestBases{
    HomePage hm =new HomePage();
    ProductsPage ps =new ProductsPage();
    ViewCartPage vc=new ViewCartPage();

    @Test
    public void VerifyRemoveProduct() throws InterruptedException {
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
        Assert.assertEquals(vc.CheckUrl(),"https://www.automationexercise.com/view_cart");
        Assert.assertEquals(vc.CheckColorCartTab("color"),"#ffa500");
        vc.ClickDeleteProduct(0);
        vc.ClickDeleteProduct(1);
        Assert.assertTrue(vc.CheckPageEmpty().toLowerCase().contains("cart is empty"));
    }
}
