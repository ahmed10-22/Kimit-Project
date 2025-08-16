package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class ProductDetailsPage1 {
    By ProductInfo=By.className("product-information");
    By ProductQuantity=By.id("quantity");
    By AddToCart =By.className("cart");
    By ViewCart=By.className("text-center");
    By WriteReviewText=By.className("active");
    By NameField=By.id("name");
    By EmailField=By.id("email");
    By ReviewField=By.id("review");
    By ReviewSubmit=By.id("button-review");
    By ReviewSuccessMessage=By.cssSelector("span[style=\"font-size: 20px;\"]");


    public String CheckProductDetail(){return driver.findElement(ProductInfo).getText();}
    public String CheckUrl(){return driver.getCurrentUrl();}
    public void ClearQuantity(){driver.findElement(ProductQuantity).clear();}
    public void AddProduct(String num){driver.findElement(ProductQuantity).sendKeys(num);}
    public void ClickAddToCart(){driver.findElement(AddToCart).click();}
    public void ClickViewCart(){driver.findElements(ViewCart).get(1).click();}
    public String CheckWriteReviewText(){return driver.findElement(WriteReviewText).getText().toLowerCase();}
    public void EnterName(String name){driver.findElement(NameField).sendKeys(name);}
    public void EnterEmail(String email){driver.findElement(EmailField).sendKeys(email);}
    public void EnterReview(String review){driver.findElement(ReviewField).sendKeys(review);}
    public String CheckReviewSuccessMessage(){return driver.findElement(ReviewSuccessMessage).getText();}
    public void ClickReviewSubmit(){driver.findElement(ReviewSubmit).click();}

}
