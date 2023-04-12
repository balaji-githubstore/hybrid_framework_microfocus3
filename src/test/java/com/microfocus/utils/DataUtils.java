package com.microfocus.utils;

import org.testng.annotations.DataProvider;

/**
 * This class contains all the dataprovider methods
 */
public class DataUtils {
    /**
     * DataProvider for invalidLoginTest()
     * @return Object[][]
     */
    @DataProvider
    public Object[][] invalidLoginData() {
        Object[][] arr = new Object[2][3];
        arr[0][0] = "peter";
        arr[0][1] = "admin123";
        arr[0][2] = "Invalid credentials";

        arr[1][0] = "john";
        arr[1][1] = "john123";
        arr[1][2] = "Invalid credentials";

        return arr;
    }
}
