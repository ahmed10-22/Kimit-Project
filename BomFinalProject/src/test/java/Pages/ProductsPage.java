package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static TestSteps.TestBases.driver;
import static TestSteps.TestBases.wait;

public class ProductsPage {
    By ProductDetail=By.className("product-image-wrapper");
    By BlueTopProduct=By.cssSelector("a[href=\"/product_details/1\"]");
    By AddToCart=By.className("add-to-cart");
    By ContinueShoppingButton=By.className("btn-block");
    By CartTab=By.className("fa-shopping-cart");
    By SearchTab=By.id("search_product");
    By SearchButton=By.id("submit_search");

    public String CheckTitle(){return driver.getTitle();}
    public String CheckUrl(){return driver.getCurrentUrl();}
    //public int CheckSize(){return driver.findElements(ProductDetail).size();}
    //public String CheckAddToCart(int i){return driver.findElements(ProductDetail).get(i).getText();}
    public void ClickOnProduct(){driver.findElement(BlueTopProduct).click();}

    public void AddBlueTopToCart(int i){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AddToCart)));
        driver.findElement(AddToCart).click();
    }
    public void ClickContinueShoppingButton(){driver.findElement(ContinueShoppingButton).click();}
    public void AddMenTShirtToCart(int i){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(AddToCart).get(2)));
        driver.findElements(AddToCart).get(2).click();}
    public void OpenCart(){driver.findElement(CartTab).click();}
    public void EnterSearchValue(String value){driver.findElement(SearchTab).sendKeys(value);}
    public void ClickSearchButton(){driver.findElement(SearchButton).click();}
    public List<String> CheckAddToCart(){
        int size =driver.findElements(ProductDetail).size();
        List<String> ProductAddToCart =new ArrayList<>(size);
        for (int i=0;i<size;i++){
            ProductAddToCart.add(i,driver.findElements(ProductDetail).get(i).getText());
        }
        return ProductAddToCart;
    }
}
