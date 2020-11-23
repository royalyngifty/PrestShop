package com.it.pop;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PageElements extends BaseClass{
    public void ClickLinkItem(String menu){
        driver.findElement(By.xpath("//a[contains(text(),'"+menu+"')]")).click();

    }

    public void CheckTitle(String title){
        assertEquals(title,driver.getTitle());
    }

    public void ClickElementXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void ClickElementByCss(String css){
        driver.findElement(By.cssSelector(css)).click();
    }
    public void CheckUrl(String url){
        assertEquals(url,driver.getCurrentUrl());
    }
    public void ClickElementById(String id){
        driver.findElement(By.id(id)).click();
    }

    public void EnterText(String locator,String text){//Make sure to use only xpath
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }



}
