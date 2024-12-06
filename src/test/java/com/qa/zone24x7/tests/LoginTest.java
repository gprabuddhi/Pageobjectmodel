package com.qa.zone24x7.tests;

import com.qa.zone24x7.basetest.BaseTest;
import com.qa.zone24x7.pages.DashboardPage;
import com.qa.zone24x7.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

LoginPage loginPage;
DashboardPage dashboardPage;

@Test
    public void verifySuccessfulLogin(){
//verify if login page is loaded
    loginPage.enterUsername("testgmail.com");
    loginPage.enterPassword("123");
    dashboardPage= loginPage.clickLoginButton();
    // test comment
    // test comment2
}


}
