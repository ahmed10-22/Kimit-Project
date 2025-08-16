package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserWithExistingEmail extends TestBases{
    HomePage hm =new HomePage();
    LoginPage lg =new LoginPage();


    @Test
    public void VerifyRegisterUserWithExistingEmail() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(), "https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"), "#ffa500");
        hm.OpenLoginPage();
        Assert.assertTrue(lg.CheckSignupText().contains("New User Signup!"));
        lg.EnterName("Ahmed");
        lg.EnterSignupEmail("ahmed10isco@gmail.com");
        lg.ClickSignup();
        Assert.assertTrue(lg.CheckErrorMessageText().contains("Email Address already exist!"));
        Assert.assertEquals(lg.CheckErrorMessageColor("color"),"#ff0000");
    }
}
