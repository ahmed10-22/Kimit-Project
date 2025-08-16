package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class AccountCreatedPage {
    By ContinueButton=By.className("fa-lock");
    By AccountCreatedText=By.className("text-center");

    public void ClockContinue(){driver.findElement(ContinueButton).click();}
    public String CheckAccountCreatedText(){return driver.findElement(AccountCreatedText).getText();}
}
