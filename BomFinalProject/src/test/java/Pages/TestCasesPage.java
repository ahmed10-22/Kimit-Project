package Pages;

import org.openqa.selenium.By;

import static TestSteps.TestBases.driver;

public class TestCasesPage {
    By PanelTitle=By.cssSelector("h4[class=panel-title] u");

    public String CheckTitle(){return driver.getTitle();}
    public int CheckSize(){return driver.findElements(PanelTitle).size();}
    public String CheckPanelTitles(int i){return driver.findElements(PanelTitle).get(i).getText();}
}