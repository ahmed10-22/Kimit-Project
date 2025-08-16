package TestSteps;

import Pages.HomePage;
import Pages.TestCasesPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends TestBases {
    HomePage hm =new HomePage();
    TestCasesPage tc=new TestCasesPage();
    @Test
            public void VerifyTestCases() {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenTestCases();
        Assert.assertEquals(tc.CheckTitle(),"Automation Practice Website for UI Testing - Test Cases");
        int size =tc.CheckSize();
        for (int i = 0; i < size; i++){
            Assert.assertTrue(tc.CheckPanelTitles(i).contains("Test Case"));
        }
    }

}
