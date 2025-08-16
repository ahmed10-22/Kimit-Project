package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static TestSteps.TestBases.driver;
import static TestSteps.TestBases.wait;

public class ViewCartPage {
    By ProductDescription=By.className("cart_description");
    By ProductPrice=By.className("cart_price");
    By ProductQuantity=By.className("disabled");
    By ProductTotalPrice=By.className("cart_total_price");
    By CartTab=By.className("fa-shopping-cart");
    By DeleteProduct=By.className("cart_quantity_delete");
    By EmptyPage=By.id("empty_cart");
    By LoginTab=By.className("fa-lock");
    By SubscriptionEmail=By.id("susbscribe_email");
    By SubscriptionButton=By.id("subscribe");
    By SubscriptionSuccessMessage=By.className("footer-widget");
    By SubscriptionText=By.className("single-widget");

    public String CheckDescription(int i){return driver.findElements(ProductDescription).get(i).getText();}
    public String CheckPrice(int i){return driver.findElements(ProductPrice).get(i).getText();}
    public String CheckQuantity(int i){return driver.findElements(ProductQuantity).get(i).getText();}
    public String CheckTotalPrice(int i){return driver.findElements(ProductTotalPrice).get(i).getText();}
    public String CheckUrl(){return driver.getCurrentUrl();}
    public String CheckColorCartTab(String color){return Color.fromString(driver.findElement(CartTab).getCssValue(color)).asHex();
    }
    public void ClickDeleteProduct(int i){driver.findElements(DeleteProduct).get(i).click();}
    public void OpenLoginTab(){driver.findElement(LoginTab).click();}
    public String CheckSubscriptionSuccessMessage(){return driver.findElement(SubscriptionSuccessMessage).getText();}
    public void EnterSubscriptionEmail(String email){driver.findElement(SubscriptionEmail).sendKeys(email);}
    public void ClickSubscriptionButton(){driver.findElement(SubscriptionButton).click();}
    public String CheckSubscriptionText(){Scroll(driver.findElement(SubscriptionText));
        return driver.findElement(SubscriptionText).getText();}
    public String CheckPageEmpty(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(EmptyPage)));
       return driver.findElement(EmptyPage).getText();
    }
    public void Scroll(WebElement element){
        String Script= "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,element);
    }
}
