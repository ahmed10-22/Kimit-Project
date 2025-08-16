package TestSteps;

import Pages.DeletedAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutUser extends TestBases{
    HomePage hm =new HomePage();
    LoginPage lg =new LoginPage();
    DeletedAccountPage dc=new DeletedAccountPage();

    @Test
    public void VerifyLogoutUser() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenLoginPage();
        Assert.assertTrue(lg.CheckLoginText().contains("Login to your account"));
        lg.EnterLoginEmail("ahmed10isco@gmail.com");
        lg.EnterLoginPassword("fm@abW7FVM9aEh");
        lg.ClickLogin();
        Assert.assertTrue(hm.CheckLoggedInText().contains("Logged in as Ahmed"));
        hm.OpenLoginPage();
        Assert.assertTrue(lg.CheckLoginText().contains("Login to your account"));
        Assert.assertEquals(lg.CheckUrl(),"https://www.automationexercise.com/login");
    }
}
