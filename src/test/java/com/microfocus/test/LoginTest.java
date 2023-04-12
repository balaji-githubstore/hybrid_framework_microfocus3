package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import com.microfocus.utils.DataUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Test methods related to login scenario
 */
public class LoginTest extends WebDriverWrapper {

    @Test(dataProviderClass = DataUtils.class,dataProvider = "invalidLoginData")
    public void invalidLoginTest(String username,String password,String expectedError) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError, expectedError);
    }

    @Test
    public void validLoginTest() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        String actualHeader = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
        Assert.assertEquals(actualHeader, "Dashboard");
    }
}
