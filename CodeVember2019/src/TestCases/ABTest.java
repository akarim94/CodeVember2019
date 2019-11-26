package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.ABTestPage;
import PageObject.LoginPage;
import PageObject.SecureAreaPage;

import static org.testng.Assert.*;

public class ABTest extends Browser {

    @Test
    public void testSuccessfulLogin(){
        ABTestPage abTestPage = homePage.clickABTesting();
        assertTrue(abTestPage.getabTestMsgText().contains("Also known as split testing"), "A/B Test Variation page is not opened !");
    }
}
