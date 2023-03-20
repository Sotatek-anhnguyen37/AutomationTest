package testcase;

import base.BaseSetUp;
import constants.Common;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;

public class TestAll extends BaseSetUp {
    @Test(description = "D.A")
    public void loginAdmin(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.navigateTo(Common.LINK_ADMIN);
        loginPage.checkPlaceHolderEmail();
        loginPage.checkPlaceHolderPassword();
        loginPage.checkPlaceHolderPassword();
        loginPage.sendKeyEmailTextBox("admin@phptravels.com");
        loginPage.sendKeyPasswordTextBox("demoadmin");
        loginPage.clickRememeberMe();
        loginPage.checkStatusRememberMe();
        loginPage.clickLoginBtn();
        AdminPage adminPage = new AdminPage(getDriver());
        adminPage.checkDashBoardVisible();
    }
}
