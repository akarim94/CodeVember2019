package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class AddRemoveElementsPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public AddRemoveElementsPage(WebDriver driver){
        this.driver = driver;
    }
		   

    private By btn_addElement(){
		by = By.xpath(PropertyReader.readORProperty("LOC_BTN_AddElement"));
    	return by;
    	}	
 	
    private By btn_DleteElement(){
		by = By.xpath(PropertyReader.readORProperty("LOC_BTN_DeleteElement"));
    	return by;
    	}	
 	
    
    public void clickAddElementButton(){
        driver.findElement(btn_addElement()).click();
        } 
    
    public void clickDeleteElementButton(){    	
        driver.findElement(btn_DleteElement()).click();
        } 
    
    public int getNumberofButtons(){
        return driver.findElements(btn_DleteElement()).size();        
        }   
 


}
