package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.BrokenImagesPage;
import PageObject.CheckBoxesPage;



import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.WebElement;

public class BrokenImagesTest extends Browser {
   
    @Test 
    public void testBrokenImage() throws InterruptedException{
    	BrokenImagesPage brokenimagePage = homePage.clickBrokenImages();    	
  
    	 List<WebElement> list_image = brokenimagePage.getImages();    	 
  	 
    	 System.out.println("Number of Images Present: " + list_image.size()); 
    	 
    	 for (WebElement image : list_image)
    	 		{
    		 boolean brokenImageStatus;
    		 brokenImageStatus = brokenimagePage.imageExists(image);
    		 
    		 if (!brokenImageStatus) {
    			 System.out.println(image.getAttribute("outerHTML") + " is broken.");
    			 
    		 			}
    		 	}
    }
}
