package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class CategoryProduct2Page {
    By TextCenter=By.className("text-center");
    By PlusIcon=By.className("fa-plus");
    By CategoryProduct3 =By.cssSelector("a[href=\"/category_products/3\"]");

    public String CheckTextCenter(){return driver.findElement(TextCenter).getText();}
    public void ClickMenPlusIcon(){driver.findElements(PlusIcon).get(1).click();}
    public void ClickTshirt(){driver.findElement(CategoryProduct3).click();}
}
