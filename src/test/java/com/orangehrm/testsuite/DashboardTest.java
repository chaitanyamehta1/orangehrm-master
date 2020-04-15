package com.orangehrm.testsuite;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
//dashboard test class extends test base
public class DashboardTest extends TestBase {

    //dashboard page object created
    DashboardPage dashboardPage = new DashboardPage();
    //login page object created
    LoginPage loginPage = new LoginPage();

    @Test(groups = {"regression","smoke","sanity"})
    public void verifyUserShouldClickOnAdminFeature() {
        //below methods calling from pages package
        loginPage.setUserNameField();
        loginPage.setPasswordField();
        loginPage.setClickOnLoginButton();
        dashboardPage.clickOnAdminFeature();

    }

    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldAddEmployeeName() {
        //below methods calling from pages package
        loginPage.setUserNameField();
        loginPage.setPasswordField();
        loginPage.setClickOnLoginButton();
        dashboardPage.clickOnAdminFeature();
        dashboardPage.clickOnAdminFeature();
        dashboardPage.clickOnAddButton();

    }
}