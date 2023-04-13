package com.microfocus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    private By dashboardHeaderLocator = By.xpath("//h6[contains(normalize-space(),'Dash')]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() {
        return driver.findElement(dashboardHeaderLocator).getText();
    }
}
