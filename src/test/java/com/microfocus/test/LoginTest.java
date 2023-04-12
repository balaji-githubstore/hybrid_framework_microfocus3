package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Test methods related to login scenario
 */
public class LoginTest extends WebDriverWrapper {
    @Test
    public void invalidLoginTest()
    {
        driver.findElement(By.name("username")).sendKeys("john");
        //enter password as john123
        //click on login

        //Assert the error - Invalid credentials
    }
}
