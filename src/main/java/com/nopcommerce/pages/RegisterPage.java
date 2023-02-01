package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.awt.dnd.DropTargetDragEvent;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    By maleradio = By.xpath("//div[@class='gender']//input[@id='gender-male']");

    By female = By.xpath("//div[@class='gender']//input[@id='gender-female']");


    By firstname = By.id("FirstName");
    By lastname = By.id("LastName");

    By DayofBirthday = By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthDay']");

    By DayofBirth = By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthMonth']");

    By DayofYear = By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthYear']");

    By emailAddress = By.id("Email");

    By Password = By.name("Password");

    By confirmPassword = By.name("ConfirmPassword");

    By registerButton = By.xpath("//button[@id='register-button']");



    By registercomplete = By.xpath("//div[@class='page-body']//div[contains(text(),'Your registration completed')]");

    By continuebutton = By.xpath("//div[@class='page-body']/div[2]//a[contains(text(),'Continue')]");

    By Firstverify = By.xpath("//span[contains(text(),'First name is required.')]");

    By Lastnameverify= By.xpath("//span[contains(text(),'Last name is required.')]");

    By emailaddressverify = By.xpath("//span[contains(text(),'Email is required.')]");

    By passwordverify = By.xpath("//div[@class='inputs']//span[@id='Password-error']");

    By confirmpasswordverify = By.xpath("//span[@data-valmsg-for='ConfirmPassword']/span[contains(text(),'Password is required.')]");





    public String RegisterText (){
        return getTextFromElement(registerText);
    }
    public void maleRadio (){
        Reporter.log("Click on male button"+maleradio.toString());
        clickOnElement(maleradio);
    }
    public void femaleRadio(){
        Reporter.log("Click on female radio button"+female.toString());
    }
    public void Firstname (String Firstname){sendTextToElement(firstname,Firstname);
    }
    public void Lastname (String Lastname){sendTextToElement(lastname,Lastname);
    }
    public void DayofBirthdrop(String Day){
        Reporter.log("Select Day of Birth"+DayofBirthday.toString());
        sendTextToElement(DayofBirthday,Day);
    }
    public void Monthofbirt(String Month){
        Reporter.log("Select day of month "+DayofBirth.toString());
        sendTextToElement(DayofBirth,Month);
    }
    public void YearofBorn(String Year){
        Reporter.log("Select year of born"+DayofYear);
        sendTextToElement(DayofYear,Year);
    }

    public void emailAddress(String email){sendTextToElement(emailAddress,email);
    }
    public void password (String password){sendTextToElement(Password, password);
    }
    public void confirmpassword(String Confirmpass) {sendTextToElement(confirmPassword,Confirmpass);
    }

    public void RegisterButton(){
        Reporter.log("Click on register button"+registerButton.toString());
        clickOnElement(registerButton);
    }
    public String Firstnameerro(){
        return getTextFromElement(Firstverify);
    }
    public String LastnameRequreiederror(){
        return getTextFromElement(Lastnameverify);
    }
    public String emailrequired (){
        return getTextFromElement(emailaddressverify);
    }
    public String passwordreqired (){
        return getTextFromElement(passwordverify);
    }
    public String Confirmpassword () {
        return getTextFromElement(confirmpasswordverify);
    }
    public String registercomplete (){
        return getTextFromElement(registercomplete);
    }
    public void continueButton (){
        Reporter.log("Click on contiune button"+continuebutton.toString());
        clickOnElement(continuebutton);
    }

}
