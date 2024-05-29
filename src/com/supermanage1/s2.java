package com.supermanage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class s2 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(invocationCount = 5)
    public void testProcess() throws InterruptedException {
    	
    	long startTime = System.currentTimeMillis();
        long executionTime = 60 * 1000; // 1 minute in milliseconds
    	
        String url = "https://dev.business.supermanage.in/auth/mobile-login";
        driver.get(url);

        driver.findElement(By.xpath("//input[@id='floatingInput']")).sendKeys("7814434323");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#otp")).sendKeys("111111");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);

        jse.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)")).click();
        Thread.sleep(3000); // go to "Employee" section
        
        driver.findElement(By.cssSelector("div[id='avatar-container'] span")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector(".nav-dropdown-other")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector(".btn.btn-primary.confirm-btn-delete-modal.mb-0")).click();
        Thread.sleep(3000);
    }
}
