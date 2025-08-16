package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductsAndCartAfterLogin extends TestBases{
    HomePage hm =new HomePage();
    ProductsPage ps =new ProductsPage();
    ViewCartPage vc=new ViewCartPage();
    SearchedProductPage sp=new SearchedProductPage();
    LoginPage lg =new LoginPage();

    @Test
    public void VerifySearchProductsAndVerifyCartAfterLogin() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenProducts();
        Assert.assertEquals(ps.CheckUrl(), "https://www.automationexercise.com/products");
        Assert.assertTrue(ps.CheckTitle().contains("All Products"));
        ps.EnterSearchValue("Jeans");
        ps.ClickSearchButton();
        int size =sp.CheckSize();
        for (int i = 0; i < size; i++){
            Assert.assertTrue(sp.CheckJeans(i).contains("Jeans"));
        }
        Assert.assertTrue(sp.CheckTextCenter(0).contains("SEARCHED PRODUCTS"));
        sp.ClickAddToCart(0);
        sp.ClickContinueButton();
        sp.ClickAddToCart(2);
        sp.ClickContinueButton();
        sp.ClickAddToCart(4);
        sp.ClickContinueButton();
        sp.OpenCart();
        Assert.assertTrue(vc.CheckDescription(0).contains("Soft Stretch Jeans"));
        Assert.assertTrue(vc.CheckDescription(1).contains("Regular Fit Straight Jeans"));
        Assert.assertTrue(vc.CheckDescription(2).contains("Grunt Blue Slim Fit Jeans"));
        vc.OpenLoginTab();
        Assert.assertTrue(lg.CheckLoginText().contains("Login to your account"));
        lg.EnterLoginEmail("ahmed10isco@gmail.com");
        lg.EnterLoginPassword("fm@abW7FVM9aEh");
        lg.ClickLogin();
        hm.OpenCart();
        Assert.assertTrue(vc.CheckDescription(0).contains("Soft Stretch Jeans"));
        Assert.assertTrue(vc.CheckDescription(1).contains("Regular Fit Straight Jeans"));
        Assert.assertTrue(vc.CheckDescription(2).contains("Grunt Blue Slim Fit Jeans"));
    }
}
