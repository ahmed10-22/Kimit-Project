package TestSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBases {
    public static WebDriver driver;
    public static WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    @BeforeTest
    public void BeforeTest(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @BeforeMethod
    public void Setup(){
        driver.get("https://www.automationexercise.com/");
    }

}
