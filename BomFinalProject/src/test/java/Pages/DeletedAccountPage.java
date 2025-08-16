package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static TestSteps.TestBases.driver;

public class DeletedAccountPage {
    By Continue=By.className("pull-right");
    By AccountDeletedText=By.className("text-center");
    By AccountDeletedColor=By.className("text-center");

    public void ClickContinue(){driver.findElements(Continue).get(1).click();}
    public String CheckAccountDeletedText(){return driver.findElement(AccountDeletedText).getText();}
    public String CheckAccountDeletedColor(String color){return
            Color.fromString(driver.findElement(AccountDeletedColor).getCssValue(color)).asHex();
    }

}
