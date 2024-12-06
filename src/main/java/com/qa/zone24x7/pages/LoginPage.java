package com.qa.zone24x7.pages;

import com.qa.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

        private final By userName= By.xpath("//*[@name='userName']");
        private final By passoword=By.xpath("//*[@name='password']");
        private final By button= By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String name){
        uiDriver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String password){
        uiDriver.findElement(passoword).sendKeys(password);

    }

    public  DashboardPage clickLoginButton () {
        uiDriver.findElement(button).click();
        return new DashboardPage(uiDriver);
    }
}

