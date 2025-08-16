package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUser extends TestBases{
 HomePage hm =new HomePage();
 LoginPage lg =new LoginPage();
 SignupPage si=new SignupPage();
 AccountCreatedPage ac=new AccountCreatedPage();
 DeletedAccountPage dc=new DeletedAccountPage();

 @Test
    public void VerifyRegisterUserSuccess() throws InterruptedException {
  Assert.assertEquals(hm.CheckUrl(),"https://www.automationexercise.com/");
  Assert.assertEquals(hm.CheckColor("color"),"#ffa500");
     hm.OpenLoginPage();
     Assert.assertTrue(lg.CheckSignupText().contains("New User Signup!"));
     lg.EnterName("Ahmed");
     lg.EnterSignupEmail("ahmed10isco22@gmail.com");
     lg.ClickSignup();
  Assert.assertTrue(si.CheckNewAccountText().contains("ENTER ACCOUNT INFORMATION"));
     si.SelectDay(8);
     si.SelectMonth("June");
     si.SelectYear("2000");
     Thread.sleep(2000);
     si.MarkOffer();
     si.MarkNewsLetter();
     si.ChooseTitle();
     si.EnterPassword("123");
     si.EnterFirstName("Ahmed");
     si.EnterLastName("Raafat");
     si.EnterCompany("Phosphate");
     si.EnterCity("London");
     si.EnterAddress("home");
     si.EnterState("L.A");
     si.EnterPhone("123445556");
     si.EnterZipCode("1234");
     si.ClickCreate();
     Assert.assertTrue(ac.CheckAccountCreatedText().contains("ACCOUNT CREATED"));
     ac.ClockContinue();
     Assert.assertTrue(hm.CheckLoggedInText().contains("Logged in as Ahmed"));
     hm.DeleteAccount();
     Assert.assertTrue(dc.CheckAccountDeletedText().contains("ACCOUNT DELETED"));
     Assert.assertEquals(dc.CheckAccountDeletedColor("color"),"#008000");
     dc.ClickContinue();


 }

}
