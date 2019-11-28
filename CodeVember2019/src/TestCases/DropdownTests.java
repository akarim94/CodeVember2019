package TestCases;

import Base.Browser;
import org.testng.annotations.Test;
import PageObject.DropdownPage;
import static org.testng.Assert.assertEquals;

public class DropdownTests extends Browser {

    @Test
    public void testDropDown(){
        DropdownPage dropDownPage = homePage.clickDropdown();
        String option = "Option 1";        
        dropDownPage.selectFromDropDown(option);        
        assertEquals(dropDownPage.getSelectedOption(), option, "Option selection is incorrect");         
    }   
}
