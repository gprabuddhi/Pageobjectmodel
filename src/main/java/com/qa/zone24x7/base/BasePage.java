package com.qa.zone24x7.base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver uiDriver;
    protected FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver){

        this.uiDriver= driver;
        this.wait= new FluentWait<>(uiDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);



    }
}
