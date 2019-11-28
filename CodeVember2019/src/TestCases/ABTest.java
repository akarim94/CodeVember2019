package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.ABTestPage;

import static org.testng.Assert.*;

public class ABTest extends Browser {

    @Test
    public void testABTesting(){
        ABTestPage abTestPage = homePage.clickABTesting();
        assertTrue(abTestPage.getabTestMsgText().contains("Also known as split testing"), "A/B Test Variation page is not opened !");
    }
}
