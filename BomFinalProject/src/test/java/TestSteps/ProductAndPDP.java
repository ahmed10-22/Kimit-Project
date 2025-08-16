package TestSteps;

import Pages.HomePage;
import Pages.ProductDetailsPage1;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductAndPDP extends TestBases {
    HomePage hm =new HomePage();
    ProductsPage ps =new ProductsPage();
    ProductDetailsPage1 pd=new ProductDetailsPage1();

    @Test
    public void VerifyProductAndProductDetail() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenProducts();
        Assert.assertEquals(ps.CheckUrl(),"https://www.automationexercise.com/products");
        Assert.assertTrue(ps.CheckTitle().contains("All Products"));
        /*int size = ps.CheckSize();
        for (int i = 0; i < size; i++){
            Assert.assertTrue(ps.CheckAddToCart(i).contains("Add to cart"));
        */
        List<String> Products= ps.CheckAddToCart();
        int size =Products.size();
        for (int i=0;i<size;i++){
            Assert.assertTrue(Products.get(i).contains("Add to cart"));
        }
        ps.ClickOnProduct();
        Assert.assertEquals(pd.CheckUrl(),"https://www.automationexercise.com/product_details/1");
        Assert.assertTrue(pd.CheckProductDetail().contains("Blue Top"));
        Assert.assertTrue(pd.CheckProductDetail().contains("Condition"));
        Assert.assertTrue(pd.CheckProductDetail().contains("Availability"));
        Assert.assertTrue(pd.CheckProductDetail().contains("Category"));
        Assert.assertTrue(pd.CheckProductDetail().contains("500"));
        Assert.assertTrue(pd.CheckProductDetail().contains("Brand"));
    }
}
