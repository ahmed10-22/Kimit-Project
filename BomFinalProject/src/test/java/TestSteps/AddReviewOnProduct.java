package TestSteps;

import Pages.HomePage;
import Pages.ProductDetailsPage1;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReviewOnProduct extends TestBases{
HomePage hm=new HomePage();
ProductsPage ps=new ProductsPage();
ProductDetailsPage1 pd=new ProductDetailsPage1();

@Test
    public void VerifyAddReviewOnProduct(){
    Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
    Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
    hm.OpenProducts();
    Assert.assertEquals(ps.CheckUrl(), "https://www.automationexercise.com/products");
    Assert.assertTrue(ps.CheckTitle().contains("All Products"));
    ps.ClickOnProduct();
    Assert.assertTrue(pd.CheckWriteReviewText().contains("write your review"));
    pd.EnterName("Ahmed");
    pd.EnterEmail("ahmed@gmail.com");
    pd.EnterReview("Help");
    pd.ClickReviewSubmit();
    Assert.assertTrue(pd.CheckReviewSuccessMessage().contains("Thank you for your review"));

}
}
