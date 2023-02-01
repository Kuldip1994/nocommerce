package com.nopcommerce.pages;

import com.github.dockerjava.core.NameParser;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    By buildyourowncomputerLink = By.xpath("//div[@class='products-container']/div[2]/div/div/div[1]/div/div[2]/h2/a");
    By buildyourownText = By.xpath("//div[@class='master-wrapper-content']/div[1]/div[2]/div/div/form/div[2]/div/div[2]/div/h1[contains(text(),'Build your own computer')]");

    By processorDropdown = By.xpath("//select[@id='product_attribute_1']");

    By Ramdropdwon = By.xpath("//select[@id='product_attribute_2']");

    By HDDradioclick = By.xpath("//input[@id='product_attribute_3_6']");

    By osradioclick = By.xpath("//input[@id='product_attribute_4_8']");

    By softwarecheckBox = By.xpath("//input[@id='product_attribute_5_10']");

    By Addtocartbutton = By.xpath("//button[@id='add-to-cart-button-1']");

    By addedtoshoppingchart = By.xpath("//div[@class='bar-notification success']/p");

    public void clickOnBuildyourcomputer() {
        Reporter.log("Click on Build your own computer link" + buildyourowncomputerLink.toString());
        clickOnElement(buildyourowncomputerLink);
    }

    public String buildyourOwnText() {
        return getTextFromElement(buildyourownText);
    }

    public void processorbyDrop(String value) {
        Reporter.log("Click on the processor "+processorDropdown.toString());
        selectByVisibleTextFromDropDown(processorDropdown, value);

    }

    public void Ramdropdown(String value) {
        Reporter.log("select Ram from drop down"+Ramdropdwon.toString());
       selectByValueFromDropDown(Ramdropdwon,value);

    }

    public void HDDradioclick(){
        Reporter.log("Click HDD on radio button"+HDDradioclick.toString());
        clickOnElement(HDDradioclick);

    }
    public void OSradiobutton (){
        Reporter.log("Click on OS software which you would like "+osradioclick);
        clickOnElement(osradioclick);
    }

    public void checkboxsoftware (){
        WebElement checkbox = driver.findElement(By.xpath("//div[@class='attributes']/dl/dd[5]/ul/li[2]/input"));
        clickOnElement(softwarecheckBox);
    }

    public void addtocartbutton(){
        Reporter.log("click on add to cart button"+Addtocartbutton.toString());
        clickOnElement(Addtocartbutton);
    }

    public String addedtoshoppingChart(){
        return getTextFromElement(addedtoshoppingchart);
    }

}
