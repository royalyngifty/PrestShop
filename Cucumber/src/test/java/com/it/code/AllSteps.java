package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class AllSteps extends TestClass {
    static JavascriptExecutor js;


    @Given("^User is on the homepage$")
    public void openHome(){
        driver = new ChromeDriver();
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
        assertEquals("PrestShop",driver.getTitle());
    }
    @When("^User clicks on Art Category$")
    public void artCategory(){
        clickArt();
    }
    @And("^User clicks on Art Category$")
    public void artCategoryClick(){
        clickArt();
    }

    public void clickArt(){
        driver.findElement(By.xpath("//a[contains(text(),'Art')]")).click();
        String category ="ART";
        assertEquals(category,driver.findElement(By.xpath("//div[@id='left-column']/div/ul/li")).getText());

    }
}
