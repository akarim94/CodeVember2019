package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Base.PropertyReader;

public class CheckBoxesPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public CheckBoxesPage(WebDriver driver){
        this.driver = driver;
    }
		   

    private By chkbox_CheckBoxes(){
		by = By.xpath(PropertyReader.readORProperty("LOC_CHKBOX"));
    	return by;
    	}	
 	
    public List<WebElement> getCheckBoxes(){
        return driver.findElements(chkbox_CheckBoxes());        
        }   
    
    public void clickCheckBox(WebElement element){
        element.click();
        } 

    public boolean getSelectionStatus(WebElement element){
        return element.isSelected();
        } 


}
