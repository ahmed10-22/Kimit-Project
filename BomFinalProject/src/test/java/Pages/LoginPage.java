package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static TestSteps.TestBases.driver;

public class LoginPage {
    By SignupName =By.name("name");
    By Email =By.name("email");
    By SignupButton=By.className("btn-default");
    By NewSignupText =By.className("signup-form");
    By LoginText=By.className("login-form");
    By LoginPassword=By.name("password");
    By LoginButton=By.className("btn-default");
    By ErrorMessage =By.cssSelector("p[style=\"color: red;\"]");

    public void EnterName(String name){driver.findElement(SignupName).sendKeys(name);}
    public void EnterSignupEmail(String email){driver.findElements(Email).get(1).sendKeys(email);}
    public void ClickSignup(){driver.findElements(SignupButton).get(1).click();}
    public String CheckSignupText(){ return driver.findElement(NewSignupText).getText();}
    public String CheckLoginText(){return driver.findElement(LoginText).getText();}
    public void EnterLoginEmail(String email){driver.findElement(Email).sendKeys(email);}
    public void EnterLoginPassword(String password){driver.findElement(LoginPassword).sendKeys(password);}
    public void ClickLogin(){driver.findElement(LoginButton).click();}
    public String CheckUrl(){return driver.getCurrentUrl();}
    public String CheckErrorMessageText(){return driver.findElement(ErrorMessage).getText();}
    public String CheckErrorMessageColor(String color){return Color.fromString(driver.findElement(ErrorMessage).getCssValue(color)).asHex();}
}
