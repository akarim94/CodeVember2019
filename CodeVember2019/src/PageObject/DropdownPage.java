package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;
import Base.PropertyReader;


public class DropdownPage  extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    
 	private By list_dropDown(){
		by = By.xpath(PropertyReader.readORProperty("LOC_LIST_dropdown"));
		return by;
	}
   
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    
    public String getSelectedOption(){
    	return findDropDownElement().getFirstSelectedOption().getText();
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(list_dropDown()));
    }
}
