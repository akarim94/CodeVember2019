package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class FileUploadedPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public FileUploadedPage(WebDriver driver){
        this.driver = driver;
    }

  
    private By panel_file_upload(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_PANEL_FUploaded"));
    	return by;
    	}  		 			   
 
    public String getUploadedFiles(){
        return driver.findElement(panel_file_upload()).getText();
    }

}
