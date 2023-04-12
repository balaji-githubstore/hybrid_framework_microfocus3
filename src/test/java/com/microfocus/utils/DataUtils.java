package com.microfocus.utils;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * This class contains all the dataprovider methods
 */
public class DataUtils {

    /**
     * DataProvider for invalidLoginTest()
     *
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

    /**
     * Common dataprovider
     * Helps to connect to the sheet with the test method name and fetch the data
     *
     * @return
     * @throws IOException
     */
    @DataProvider
    public Object[][] commonDataProvider(Method mtd) throws IOException {
        //Test method name is the sheetname
        String testName = mtd.getName();
        Object[][] arr = ExcelUtils.getSheetIntoTwoDimArray("test_data/orange_data.xlsx", testName);
        return arr;
    }
}
