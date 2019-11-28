package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Base.PropertyReader;

public class BrokenImagesPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public BrokenImagesPage(WebDriver driver){
        this.driver = driver;
    }
		   

    private By img_Images(){
		by = By.xpath(PropertyReader.readORProperty("LOC_IMG"));
    	return by;
    	}	
 	
    public List<WebElement> getImages(){
        return driver.findElements(img_Images());        
        }   
    
    public boolean imageExists(WebElement image)
   		{
        return !image.getAttribute("naturalWidth").equals("0");
   		}


}
