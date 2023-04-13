package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import com.microfocus.pages.LoginPage;
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
    @Test(priority = 1,groups = {"smoke","low","UI"})
    public void validateTitleTest() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }

    @Test(priority = 2,groups = {"low","UI"})
    public void validatePlaceholderTest() {
        LoginPage loginPage=new LoginPage(driver);

        Assert.assertEquals(loginPage.getUsernamePlaceholder(), "Username");
        Assert.assertEquals(loginPage.getPasswordPlaceholder(), "Password");
    }

}
