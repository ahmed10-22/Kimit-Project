package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserWithCorrectEmailAndPassword extends TestBases{
    HomePage hm =new HomePage();
    LoginPage lg =new LoginPage();
    DeletedAccountPage dc=new DeletedAccountPage();

    @Test
    public void VerifyLoginUserWithCorrectEmailAndPassword() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenLoginPage();
        Assert.assertTrue(lg.CheckLoginText().contains("Login to your account"));
        lg.EnterLoginEmail("ahmed10isco@gmail.com");
        lg.EnterLoginPassword("fm@abW7FVM9aEh");
        lg.ClickLogin();
        Assert.assertTrue(hm.CheckLoggedInText().contains("Logged in as Ahmed"));
        hm.DeleteAccount();
        Assert.assertTrue(dc.CheckAccountDeletedText().contains("ACCOUNT DELETED"));
        Assert.assertEquals(dc.CheckAccountDeletedColor("color"),"#008000");
        dc.ClickContinue();
    }


}
