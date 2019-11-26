package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.ABTestPage;
import PageObject.AddRemoveElementsPage;
import PageObject.LoginPage;
import PageObject.SecureAreaPage;

import static org.testng.Assert.*;

public class AddRemoveElementTest extends Browser {
   
    @Test 
    public void testAddDeleteElement(){
    	AddRemoveElementsPage addRemoveElementsPage = homePage.clickAddRemoveElements();
    	addRemoveElementsPage.clickAddElementButton();
    	System.out.println("Number of Button added: " + addRemoveElementsPage.getNumberofButtons());
    	addRemoveElementsPage.clickDeleteElementButton(); 
    	System.out.println("Number of Button remain after delete: " + addRemoveElementsPage.getNumberofButtons());
    	assertEquals(addRemoveElementsPage.getNumberofButtons(), 0);    	
    }
}
