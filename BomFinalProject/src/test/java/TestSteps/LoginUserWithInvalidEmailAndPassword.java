package TestSteps;

import Pages.DeletedAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserWithInvalidEmailAndPassword extends TestBases{
    HomePage hm =new HomePage();
    LoginPage lg =new LoginPage();
    DeletedAccountPage dc=new DeletedAccountPage();

    @Test
    public void VerifyLoginUserWithInvalidEmailAndPassword() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenLoginPage();
        Assert.assertTrue(lg.CheckLoginText().contains("Login to your account"));
        lg.EnterLoginEmail("ahmed10isco22@gmail.com");
        lg.EnterLoginPassword("fm@abW7FVM9aEh");
        lg.ClickLogin();
        Assert.assertTrue(lg.CheckErrorMessageText().contains("Email Address already exist!"));
        Assert.assertEquals(lg.CheckErrorMessageColor("color"),"#ff0000");

    }
}
