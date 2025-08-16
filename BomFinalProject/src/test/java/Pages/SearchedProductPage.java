package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class SearchedProductPage {
    By ProductWrapper=By.className("product-image-wrapper");
    By TextCenter=By.className("text-center");
    By AddToCartButton=By.className("add-to-cart");
    By ContinueButton=By.className("btn-block");
    By CartTab=By.className("fa-shopping-cart");

    public int CheckSize(){return driver.findElements(ProductWrapper).size();}
    public String CheckJeans(int i){return driver.findElements(ProductWrapper).get(i).getText();}
    public String CheckTextCenter(int i){return driver.findElements(TextCenter).get(i).getText();}
    public void ClickAddToCart(int i){driver.findElements(AddToCartButton).get(i).click();}
    public void ClickContinueButton(){driver.findElement(ContinueButton).click();}
    public void OpenCart(){driver.findElement(CartTab).click();}
}
