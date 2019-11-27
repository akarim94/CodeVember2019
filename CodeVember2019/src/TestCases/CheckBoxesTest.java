package TestCases;

import Base.Browser;
import org.testng.annotations.Test;
import PageObject.CheckBoxesPage;



import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CheckBoxesTest extends Browser {
   
    @Test 
    public void testCheckBoxes() throws InterruptedException{
    	CheckBoxesPage chkboxesPage = homePage.clickCheckboxes();
    	 List<WebElement> list_chkbox = chkboxesPage.getCheckBoxes();    	 
    	 int i = list_chkbox.size();    	 
    	 System.out.println("Number of Check Boxes Present: " + i);     	    	 
    	 chkboxesPage.clickCheckBox(list_chkbox.get(0));
    	 assertEquals(chkboxesPage.getSelectionStatus(list_chkbox.get(0)), true, "Check Box1 is not selected");
    	 chkboxesPage.clickCheckBox(list_chkbox.get(1));
    	 assertEquals(chkboxesPage.getSelectionStatus(list_chkbox.get(1)), false, "Check Box2 is selected");
	 

    }
}
