package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ComputerPage computerPage = new ComputerPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){

        computerPage.clickonComputertab();
        String actualmsg = computerPage.getcomputerText();
        String expectedmsg = "Computers";
        Assert.assertEquals(actualmsg,expectedmsg,"Computer text verified");

    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerPage.clickonComputertab();
        computerPage.clickondesktoplink();

        String actualmsg= computerPage.getdesktoptext();
        String expectedmsg = "Desktops";
        Assert.assertEquals(actualmsg,expectedmsg,"Desktops text verified");

    }
    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
        computerPage.clickonComputertab();
        computerPage.clickondesktoplink();
        buildYourOwnComputerPage.clickOnBuildyourcomputer();
        buildYourOwnComputerPage.processorbyDrop("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.Ramdropdown("5");
        buildYourOwnComputerPage.HDDradioclick();
        buildYourOwnComputerPage.OSradiobutton();
        buildYourOwnComputerPage.checkboxsoftware();
        buildYourOwnComputerPage.addtocartbutton();

        String actualMSG = buildYourOwnComputerPage.addedtoshoppingChart();
        String expectedMSG = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMSG,expectedMSG,"Product added to your is verified");


    }

}
