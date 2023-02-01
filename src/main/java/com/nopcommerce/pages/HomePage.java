package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By myaccountLink = By.linkText("My account");

    By Logo = By.xpath("//div[@class='header-logo']");

    By logoutLink = By.linkText("Log out");

    By sevenMenu = By.xpath("//ul[@class='top-menu notmobile']");

    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')] ");

    By electronicsmenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]");

    By Apparelmenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel ')]");

    By digitaldownloadsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads ')]");

    By booksmenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");

    By jewelryMemu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]");

    By GiftcardsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]");

    public void clickOnLoginLink() {
        Reporter.log("Click on login link" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link" + registerLink.toString());
        clickOnElement(registerLink);

    }

    public void clickOnMyaccountLink() {
        Reporter.log("Click on my account link" + myaccountLink.toString());
        clickOnElement(myaccountLink);
    }

    public void logoOutLink() {
        Reporter.log("Click on logo out link" + logoutLink.toString());
        clickOnElement(logoutLink);
    }

    public void clickonLogo() {
        Reporter.log("Click on nocommerce logo" + Logo.toString());
        clickOnElement(Logo);
    }

    public void clickOnsevenmenuLink() {
        Reporter.log("Click on any of the seven menu" + sevenMenu.toString());
        clickOnElement(sevenMenu);
    }

    public void clickonComputermenu() {
        Reporter.log("Click on Computer menu " + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public void clickonElectronicsmenu() {
        Reporter.log("Click on Electronic menu" + electronicsmenu.toString());
        clickOnElement(electronicsmenu);
    }

    public void clickOnApparelmenu() {
        Reporter.log("Click on Apparel menu" + Apparelmenu.toString());
        clickOnElement(Apparelmenu);
    }

    public void clickOndigitaldownloadsMenu() {
        Reporter.log("Click on Digital Download Menu" + digitaldownloadsMenu.toString());
        clickOnElement(digitaldownloadsMenu);
    }

    public void clickOnbooksmenu() {
        Reporter.log("Cick on Books Menu" + booksmenu.toString());
        clickOnElement(booksmenu);

    }
    public void clickOnjewelryMenu(){
        Reporter.log("Click on JewelryMenu"+jewelryMemu.toString());
        clickOnElement(jewelryMemu);
    }
    public void clickOnGiftcardsMenu(){
        Reporter.log("Click on Gift Card Menu"+GiftcardsMenu.toString());
        clickOnElement(GiftcardsMenu);
    }

    public String veifylogout(){
        return getTextFromElement(logoutLink);
    }

    public String verifyLoginLink(){
        return getTextFromElement(loginLink);
    }
    public String verifyregister(){
        return  getTextFromElement(registerLink);
    }


}
