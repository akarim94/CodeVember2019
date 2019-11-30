package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Base.BaseClass;
import Base.PropertyReader;

public class HoversPage extends BaseClass {
    private WebDriver driver;
    private static By by = null;

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }
    
    private By img_figureBox(){
		by = By.className(PropertyReader.readORProperty("LOC_IMG_FigureBox"));
    	return by;
    	}	  
    
    private By img_figureCaption(){
		by = By.className(PropertyReader.readORProperty("LOC_IMG_FigureCap"));
    	return by;
    	}	     

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(img_figureBox()).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(img_figureCaption()));
    }

    public class FigureCaption{

       private WebElement caption;
    			
    	private By hdr_header(){
    		by = By.tagName(PropertyReader.readORProperty("LOC_HDR_Header"));
        	return by;
        	}
    	
    	private By lnk_link(){
    		by = By.tagName(PropertyReader.readORProperty("LOC_LNK_Link"));
        	return by;
        	}	
    	
    	
    	public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(hdr_header()).getText();
        }

        public String getLink(){
            return caption.findElement(lnk_link()).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(lnk_link()).getText();
        }
    }
}
