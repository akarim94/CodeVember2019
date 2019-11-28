package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.ABTestPage;
import PageObject.InputsPage;
import PageObject.LoginPage;
import PageObject.SecureAreaPage;

import static org.testng.Assert.*;

import org.openqa.selenium.WebElement;

public class InputsTest extends Browser {

    @Test
    public void testWithInputs(){
    	InputsPage inputPage = homePage.clickInputs();
    	
    	inputPage.enterCharacter("abcd"); 
    	assertEquals(inputPage.getInputValue(), "", "The field is accepting alphabet characters");
    	
    	int i = 232332;
    	inputPage.enterNumber(i);
    	int j = Integer.parseInt(inputPage.getInputValue());
    	assertEquals(j, i, "The field is not accepting numbers");

    }
    
}
