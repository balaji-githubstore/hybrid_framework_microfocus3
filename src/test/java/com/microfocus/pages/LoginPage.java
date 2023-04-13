package com.microfocus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameLocator = By.name("username");
    private By passwordLocator = By.name("password");
    private By loginLocator = By.xpath("//button[normalize-space()='Login']");
    private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickOnLogin() {
        driver.findElement(loginLocator).click();
    }

    public String getInvalidErrorMessage() {
        return driver.findElement(errorLocator).getText();
    }

    public String getUsernamePlaceholder() {
        return driver.findElement(usernameLocator).getAttribute("placeholder");
    }

    public String getPasswordPlaceholder() {
        return driver.findElement(passwordLocator).getAttribute("placeholder");
    }
}