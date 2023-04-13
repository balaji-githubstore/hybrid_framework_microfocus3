package com.microfocus.pages;

import com.microfocus.base.AutomationKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends AutomationKeywords {

    private WebDriver driver;

    private By dashboardHeaderLocator = By.xpath("//h6[contains(normalize-space(),'Dash')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getHeader() {
        return getTextByLocator(dashboardHeaderLocator);

    }
}
