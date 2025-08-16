package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

import static TestSteps.TestBases.driver;
import static TestSteps.TestBases.wait;

public class HomePage {
    By LoginTab =By.className("fa-lock");
    By DeleteTab =By.cssSelector("a[href=\"/delete_account\"]");
    By ContactUsTab=By.className("fa-envelope");
    By TestCasesTab=By.cssSelector("a[href=\"/test_cases\"]");
    By ProductsTab=By.className("card_travel");
    By CartTab=By.className("fa-shopping-cart");
    By SubscriptionEmail=By.id("susbscribe_email");
    By SubscriptionButton=By.id("subscribe");
    By SubscriptionSuccessMessage=By.className("container");
    By HomeColor=By.className("fa-home");
    By LoggedInText =By.className("navbar-nav");
    By SubscriptionText=By.className("single-widget");
    By CategoryText=By.className("left-sidebar");
    By PlusIcon=By.className("fa-plus");
    By CategoryProduct2=By.cssSelector("a[href=\"/category_products/2\"]");
    By ViewProduct=By.className("nav-justified");
    By UpArrow=By.className("fa-angle-up");
    By TextCenter=By.className("text-center");
    By AddToCart=By.className("add-to-cart");


    public void OpenLoginPage(){driver.findElement(LoginTab).click();}
    public void DeleteAccount(){driver.findElement(DeleteTab).click();}
    public void OpenContactUs(){driver.findElement(ContactUsTab).click();}
    public void OpenTestCases(){driver.findElement(TestCasesTab).click();}
    public void OpenProducts(){driver.findElement(ProductsTab).click();}
    public String CheckUrl(){return driver.getCurrentUrl();}
    public String CheckColor(String color){return
        Color.fromString(driver.findElement(HomeColor).getCssValue(color)).asHex();}
    public String CheckLoggedInText(){return driver.findElement(LoggedInText).getText();}
    public String CheckSubscriptionText(){ Scroll(driver.findElement(SubscriptionText));
        return driver.findElement(SubscriptionText).getText();}
    public void EnterSubscriptionEmail(String email){driver.findElement(SubscriptionEmail).sendKeys(email);}
    public void ClickSubscriptionButton(){
        driver.findElement(SubscriptionButton).click();}
    public String CheckSubscriptionSuccessMessage(){return driver.findElements(SubscriptionSuccessMessage).get(3).getText();}
    public String CheckCategoryText(){Scroll(driver.findElement(CategoryText));
        return driver.findElement(CategoryText).getText();}
    public void ClickWomenPlusIcon(){driver.findElement(PlusIcon).click();}
    public void ClickTops(){driver.findElement(CategoryProduct2).click();}
    public void OpenCart(){driver.findElement(CartTab).click();}
    public void ClickViewProduct(){driver.findElement(ViewProduct).click();}
    public void ClickUpArrow(){driver.findElement(UpArrow).click();}
    public String CheckRecommended(int i){Scroll(driver.findElements(TextCenter).get(i));
        return driver.findElements(TextCenter).get(i).getText();}
    public void ClickAddToCart(int i){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(AddToCart).get(i)));
        driver.findElements(AddToCart).get(i).click();}
    public void ClickViewCart(int i){driver.findElements(TextCenter).get(i).click();}
    public void Scroll(WebElement element){
        String Script= "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,element);
    }
    public void ScrollUp(){
        Scroll(driver.findElement(LoginTab));
    }

}
