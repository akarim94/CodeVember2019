package TestCases;

import Base.Browser;
import org.testng.annotations.Test;
import PageObject.FileUploadPage;
import PageObject.FileUploadedPage;
import Utility.FilePath;

import static org.testng.Assert.*;


public class FileUploadTest extends Browser implements FilePath  {
	String filePath = FileUploadPath + "FileUploadTest.txt";

    @Test
    public void testFileUpload(){
    	
        FileUploadPage fileuploadPage = homePage.clickFileUpload();
        System.out.println(filePath);        
        fileuploadPage.uploadFile(filePath);
        FileUploadedPage fileuploadedPage = fileuploadPage.clickUploadButton();
        assertEquals(fileuploadedPage.getUploadedFiles(), "FileUploadTest.txt", "Uploaded files incorrect");
    }
}
