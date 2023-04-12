package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * This Test class contains Login Page UI related test methods
 */
public class LoginUITest extends WebDriverWrapper {
    @Test
    public void validateTitleTest() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }

    @Test
    public void validatePlaceholderTest() {
        String userPlaceholder = driver.findElement(By.name("username")).getAttribute("placeholder");
        String passPlaceholder = driver.findElement(By.name("password")).getAttribute("placeholder");

        Assert.assertEquals(userPlaceholder, "Username");
        Assert.assertEquals(passPlaceholder, "Password");
    }

}
