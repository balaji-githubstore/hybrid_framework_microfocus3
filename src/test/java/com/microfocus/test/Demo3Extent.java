package com.microfocus.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo3Extent {
    public static void main(String[] args) {


        //run only once in the beginning - @BeforeSuite
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

        //run before @Test method - @BeforeMethod
        ExtentTest test= extent.createTest("MyFirstTest");

        //run after @Test method - @AfterMethod
        test.log(Status.FAIL, "This is a logging event for MyFirstTest, and it passed!");


        //run at the end of the session - @AfterSuite
        extent.flush();


    }
}
