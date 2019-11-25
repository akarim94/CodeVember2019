package TestCases;

import Base.Browser;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import PageObject.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends Browser {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getSuccessMsgText()
                .contains("You logged into a secure area!"), "Login is not Successed");
    }
}
