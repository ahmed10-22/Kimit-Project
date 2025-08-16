package TestSteps;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contactus extends TestBases{
    HomePage hm =new HomePage();
    ContactUsPage cu=new ContactUsPage();

    @Test
    public void VerifyContactUs() throws InterruptedException {
        Assert.assertEquals(hm.CheckUrl(),"https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"),"#ffa500");
        hm.OpenContactUs();
        Assert.assertEquals(cu.CheckContactUsColor("color"),"#fe980f");
        Assert.assertTrue(cu.CheckGetTouchedText().toUpperCase().contains("GET IN TOUCH"));
        cu.EnterName("Ahmed");
        cu.EnterEmail("ahmed@gmail.com");
        cu.EnterSubject("Help i am being surrounded");
        cu.EnterMessage("I am invitable");
        cu.UploadFile("D:\\Testing\\Rania\\Product Search US.pdf");
        cu.ClickSubmit();
        Thread.sleep(2000);
        Assert.assertEquals(cu.CheckSuccessMessageColor("color"),"#3c763d");
        Assert.assertTrue(cu.CheckSuccessMessageText().contains("Success! Your details have been submitted successfully."));
        cu.ClickContinue();
        Assert.assertEquals(hm.CheckUrl(),"https://www.automationexercise.com/");
        Assert.assertEquals(hm.CheckColor("color"),"#ffa500");
    }
}
