package com.qa.zone24x7.pages;

import com.qa.zone24x7.base.BasePage;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void isPageLodded (){
        System.out.println("Dashboard is loaded successfully");

    }
}
