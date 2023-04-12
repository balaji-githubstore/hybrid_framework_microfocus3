package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import com.microfocus.utils.DataUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeTest extends WebDriverWrapper {

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
    public void addEmployeeTest(String username,String password,String firstname,String middlename,String lastname,String expectedProfileName)
    {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //click on pim menu
        //click on add employee

        System.out.println(firstname);
        System.out.println(middlename);
        System.out.println(lastname);
        System.out.println(expectedProfileName);
    }
}
