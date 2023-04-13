package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import com.microfocus.pages.LoginPage;
import com.microfocus.utils.DataUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeTest extends WebDriverWrapper {

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"smoke","high"})
    public void addEmployeeTest(String username,String password,String firstname,String middlename,String lastname,String expectedProfileName)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLogin();

        //click on pim menu
        //click on add employee

        System.out.println(firstname);
        System.out.println(middlename);
        System.out.println(lastname);
        System.out.println(expectedProfileName);
    }
}
