package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;

import com.microfocus.pages.DashboardPage;
import com.microfocus.pages.LoginPage;
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

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
    public void invalidLoginTest(String username,String password,String expectedError) {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLogin();

        String actualError = loginPage.getInvalidErrorMessage();
        Assert.assertEquals(actualError, expectedError);
    }

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"smoke","high"})
    public void validLoginTest(String username,String password,String expectedHeader) {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLogin();

        DashboardPage dashboardPage=new DashboardPage(driver);
        String actualHeader = dashboardPage.getHeader();
        Assert.assertEquals(actualHeader, expectedHeader);
    }
}
