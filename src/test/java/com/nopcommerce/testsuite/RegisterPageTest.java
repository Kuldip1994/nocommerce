package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homepage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test

    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickOnRegisterLink();
        String actualmsg = registerPage.RegisterText();
        String expectedmsg = "Register";
        Assert.assertEquals(actualmsg,expectedmsg,"RegisterText verified");
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homepage.clickOnRegisterLink();
        registerPage.RegisterButton();
        String actualMsg = registerPage.Firstnameerro();
        String expectedMsg = "First name is required.";
        Assert.assertEquals(actualMsg,expectedMsg,"Firstname is required");

        String actualMsg1 = registerPage.LastnameRequreiederror();
        String expectedMsg1 = "Last name is required.";
        Assert.assertEquals(actualMsg1,expectedMsg1,"Lastname is required");

        String actualMsg2 = registerPage.emailrequired();
        String expectedMsg2 = "Email is required.";
        Assert.assertEquals(actualMsg2,expectedMsg2,"Email is required");

        String actualMsg3 = registerPage.passwordreqired();
        String expectedMsg3 = "Password is required.";
        Assert.assertEquals(actualMsg3,expectedMsg3,"Password is required");

        String actualMsg4 = registerPage.Confirmpassword();
        String expectedMsg4 = "Password is required.";
        Assert.assertEquals(actualMsg4,expectedMsg4);
    }
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homepage.clickOnRegisterLink();
        registerPage.femaleRadio();
        registerPage.Firstname("john");
        registerPage.Lastname("patel");
        registerPage.DayofBirthdrop("14");
        registerPage.Monthofbirt("July");
        registerPage.YearofBorn("1994");
        registerPage.emailAddress("john03@gmail.com");
        registerPage.password("123456");
        registerPage.confirmpassword("123456");
        registerPage.RegisterButton();

        String actualMsg = registerPage.registercomplete();
        String expectedmsg = "Your registration completed";
        Assert.assertEquals(actualMsg,expectedmsg,"register complete verified");

    }

}
