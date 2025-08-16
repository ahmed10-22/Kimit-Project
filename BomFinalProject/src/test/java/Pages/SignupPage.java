package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static TestSteps.TestBases.driver;

public class SignupPage {
    WebElement YearDropList;
    WebElement DayDropList;
    WebElement MonthDropList;
    By Year=By.id("years");
    By Month=By.id("months");
    By Day=By.id("days");
    By Title=By.className("top");
    By Password=By.id("password");
    By FirstName=By.id("first_name");
    By LastName=By.id("last_name");
    By Company=By.id("company");
    By Address1=By.id("address1");
    By City   =By.id("city");
    By State =By.id("state");
    By PhoneNumber=By.id("mobile_number");
    By ZipCode=By.id("zipcode");
    By NewsLetter=By.cssSelector("div[class=\"checkbox\"] label[for=\"newsletter\"]");
    By SpecialOffer=By.xpath("//label[@for=\"optin\"]");
    By CreateButton=By.className("btn-default");
    By NewAccountText =By.className("text-center");

    public void ChooseTitle(){driver.findElement(Title).click();}
    public void EnterPassword(String pass){driver.findElement(Password).sendKeys(pass);}
    public void EnterFirstName(String first){driver.findElement(FirstName).sendKeys(first);}
    public void EnterLastName(String last){driver.findElement(LastName).sendKeys(last);}
    public void EnterCompany(String company){driver.findElement(Company).sendKeys(company);}
    public void EnterAddress(String address){driver.findElement(Address1).sendKeys(address);}
    public void EnterCity(String city){driver.findElement(City).sendKeys(city);}
    public void EnterState(String state){driver.findElement(State).sendKeys(state);}
    public void EnterPhone(String num){driver.findElement(PhoneNumber).sendKeys(num);}
    public void EnterZipCode(String code){driver.findElement(ZipCode).sendKeys(code);}
    public void MarkNewsLetter(){driver.findElement(NewsLetter).click();}
    public void MarkOffer(){driver.findElement(SpecialOffer).click();}
    public void SelectDay(int day){DayDropList =driver.findElement(Day);
    Select DayList =new Select(DayDropList);
    DayList.selectByIndex(day);}

    public void SelectMonth(String month){MonthDropList =driver.findElement(Month);
        Select MonthList=new Select(MonthDropList);
        MonthList.selectByVisibleText(month);
    }
    public void SelectYear(String year){YearDropList =driver.findElement(Year);
        Select yearList =new Select(YearDropList);
        yearList.selectByValue(year);}

    public void ClickCreate(){driver.findElement(CreateButton).click();}
    public String CheckNewAccountText(){return driver.findElement(NewAccountText).getText();}
}
