package com.microfocus.test;

import com.microfocus.base.WebDriverWrapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {

    @DataProvider
    public Object[][] validData() {
        Object[][] arr = new Object[3][2];
        //i-> number of test case
        //j-> number of parameters
        arr[0][0] = "saul";
        arr[0][1] = "saul123";

        arr[1][0] = "kim";
        arr[1][1] = "kim123";

        arr[2][0] = "paul";
        arr[2][1] = "paul123";

        return arr;
    }

    @Test(dataProvider = "validData")
    public void validLogin(String username, String password) {
        System.out.println("hello " + username + password);
    }
}
