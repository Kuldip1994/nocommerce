package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homepage = new HomePage();
    LoginPage loginPage=new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){

        homepage.clickOnLoginLink();
        String actualMsg = loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMsg,expectedMessage,"Login page verified");

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailID("John1234@gmail.com");
        loginPage.enterPasword("123456");
        loginPage.clickOnLoginButton();
        String actual = loginPage.errologin();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with invalid credentials");

    }
    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailID("john1224@gmail.com");
        loginPage.enterPasword("123456");
        loginPage.clickOnLoginButton();
        homepage.veifylogout();
    }
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailID("john1224@gmail.com");
        loginPage.enterPasword("123456");
        loginPage.clickOnLoginButton();
        homepage.logoOutLink();
        homepage.verifyLoginLink();
    }

}
