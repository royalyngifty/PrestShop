package com.it.pop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    static JavascriptExecutor js;
    public static String browser = "chrome";

    @BeforeAll
    public static void setUp(){
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();



        }
        else if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();


        }
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
    }
    @AfterEach
    public void SelectHomeIcon(){
        driver.findElement(By.id("logo")).click();
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
