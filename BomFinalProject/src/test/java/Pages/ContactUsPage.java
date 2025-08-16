package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static TestSteps.TestBases.driver;

public class ContactUsPage {
    By NameField=By.className("form-control");
    By EmailField=By.className("form-control");
    By SubjectField=By.className("form-control");
    By MessageField=By.className("form-control");
    By UploadFile=By.name("upload_file");
    By SubmitButton=By.name("submit");
    By ContactUsIconColor=By.className("text-center");
    By GetTouchedText =By.className("text-center");
    By SuccessMessage=By.className("alert-success");
    By ContinueButton=By.className("btn-success");

    public String CheckContactUsColor(String color){return
            Color.fromString(driver.findElement(ContactUsIconColor).getCssValue(color)).asHex();
    }
    public String CheckGetTouchedText(){return driver.findElements(GetTouchedText).get(1).getText();}
    public void EnterName(String name){driver.findElement(NameField).sendKeys(name);}
    public void EnterEmail(String email){driver.findElements(EmailField).get(1).sendKeys(email);}
    public void EnterSubject(String subject){driver.findElements(SubjectField).get(2).sendKeys(subject);}
    public void EnterMessage(String message){driver.findElements(MessageField).get(3).sendKeys(message);}
    public void UploadFile(String path){driver.findElement(UploadFile).sendKeys(path);}
    public void ClickSubmit(){driver.findElement(SubmitButton).click();}
    public String CheckSuccessMessageColor(String color){return
    Color.fromString(driver.findElement(SuccessMessage).getCssValue(color)).asHex();}
    public String CheckSuccessMessageText(){return driver.findElement(SuccessMessage).getText();}
    public void ClickContinue(){driver.findElement(ContinueButton).click();}

}
