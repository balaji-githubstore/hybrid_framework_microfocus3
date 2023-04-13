package com.microfocus.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class AutomationKeywords {
    private WebDriver driver;

    public AutomationKeywords(WebDriver driver) {
        this.driver = driver;
    }

    public void typeByLocator(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void clickByLocator(By locator) {
        driver.findElement(locator).click();
    }

    public String getTextByLocator(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getAttributeByLocator(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public void switchTabByTitle(String title)
    {
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        for (String win : windows) {
            driver.switchTo().window(win);
            if (driver.getTitle().equals(title)) {
                break;
            }
        }
    }
}

