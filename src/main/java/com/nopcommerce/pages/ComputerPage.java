package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import java.security.PublicKey;

public class ComputerPage extends Utility {

    By computertab = By.xpath("//ul[@class='top-menu notmobile']/li//a[@href='/computers']");
    By computertext = By.xpath("//div[@class='center-2']//h1[contains(text(),'Computers')]");


    By desktoplink = By.xpath("//h2[@class='title']//a[@href='/desktops']");

    By desktoptext = By.xpath("//div[@class='center-2']//h1[contains(text(),'Desktops')]");

    By notebookLink = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/notebooks'] ");

    By softwareLink = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/software']");


    public void clickonComputertab() {
        Reporter.log("click on computer tab" + computertab.toString());
        clickOnElement(computertab);
    }

    public String getcomputerText() {
        return getTextFromElement(computertext);
    }

    public String getdesktoptext() {
        return getTextFromElement(desktoptext);

    }

    public void clickondesktoplink() {
        Reporter.log("click on desktop" + desktoplink.toString());
        clickOnElement(desktoplink);
    }

    public void clickOnNotebook() {
        Reporter.log("Click on Notebook link" + notebookLink.toString());
        clickOnElement(notebookLink);
    }

    public void clickOnSoftwareLink() {
        Reporter.log("Click on Software Link" + softwareLink.toString());
        clickOnElement(softwareLink);
    }

//    public void mouseHover(){
//        Actions actions = new Actions(driver);
//        WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')]"));
//        WebElement desktop = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/desktops']"));
//        WebElement notebook = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/notebooks']"));
//        WebElement software =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/software']"));
//        actions.moveToElement(computer).moveToElement(desktop).moveToElement(notebook).moveToElement(software).click().build().perform();
}

