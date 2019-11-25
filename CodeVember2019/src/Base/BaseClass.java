
package Base;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import Utility.FilePath;


public class BaseClass implements FilePath{
	protected static Properties OR = null;
 
// Base Class constructor
	public BaseClass(){
	
		//Create object of Java Properties class
	    OR = new Properties();
	    
   	File fileOR = new File(FilePath.OBJECTREPOSITORYPath);
	
		try {
			FileReader frOR = new FileReader(fileOR);
	 
			try {
		
				OR.load(frOR);
			
				} catch (Exception e) {
			// TODO: handle exception
					e.printStackTrace();
				}
		      }
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}// end of constructor

}// end of class BaseClass
