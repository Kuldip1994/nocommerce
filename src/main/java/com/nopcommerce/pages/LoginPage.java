package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailfield = By.id("Email");
    By passwordField = By.name("Password");

    By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    By errorlogin = By.xpath("//div[@class='returning-wrapper fieldset']/form//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");



    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public String errologin(){
        return getTextFromElement(errorlogin);
    }

    public void enterEmailID(String email) {
        sendTextToElement(emailfield, email);
    }

    public void enterPasword(String Password) {
        sendTextToElement(passwordField, Password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


}
