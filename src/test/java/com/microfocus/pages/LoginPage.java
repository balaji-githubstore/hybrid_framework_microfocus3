package com.microfocus.pages;

import com.microfocus.base.AutomationKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AutomationKeywords {
    private WebDriver driver;

    private By usernameLocator = By.name("username");
    private By passwordLocator = By.name("password");
    private By loginLocator = By.xpath("//button[normalize-space()='Login']");
    private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void enterUsername(String username) {
//        driver.findElement(usernameLocator).sendKeys(username);
        typeByLocator(usernameLocator,username);
    }


    public void enterPassword(String password) {
//        driver.findElement(passwordLocator).sendKeys(password);
        super.typeByLocator(passwordLocator,password);
    }

    public void clickOnLogin() {
//        driver.findElement(loginLocator).click();
        clickByLocator(loginLocator);
    }

    public String getInvalidErrorMessage() {
        return getTextByLocator(errorLocator);
    }

    public String getUsernamePlaceholder() {
        return getAttributeByLocator(usernameLocator,"placeholder");
    }

    public String getPasswordPlaceholder() {
        return getAttributeByLocator(passwordLocator,"placeholder");
    }
}
