package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    By Desktopstext = By.xpath("//div[@class='page category-page']//h1[contains(text(),'Desktops')]");

    By Sortbytext = By.xpath("//div[@class='product-selectors']/div[2]/span[contains(text(),'Sort by')]");
    By Displaytext = By.xpath("//div[@class='product-selectors']/div[3]/span[contains(text(),'Display')]");

    public String getDisplaytext() {
        return getTextFromElement(Desktopstext);
    }

    public String getSortbytext() {
        return getTextFromElement(Sortbytext);
    }

    public String displaytext() {
        return getTextFromElement(Displaytext);
    }

    public void clickOnList(){
        Actions actions = new Actions(driver);
        WebElement list = driver.findElement(By.xpath("//a[@title='List']"));
        actions.moveToElement(list).click().build().perform();
        System.out.println(list.isDisplayed());

        if(list.isDisplayed()){
            Assert.assertTrue(list.isDisplayed());
        }
    }


}
