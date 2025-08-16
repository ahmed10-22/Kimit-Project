package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class CategoryProduct3Page {
    By TextCenter=By.className("text-center");

    public String CheckTextCenter(){return driver.findElement(TextCenter).getText();}
}
