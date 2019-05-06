package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.TestBase;

 public class TestUtil extends TestBase {
	
	public static String fileName;
	
	public static void captureScreenshot() throws IOException
	{
		
		Date d = new Date();
		
		fileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+fileName));
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\"+fileName));
	}
	
	
	public static Object[][] getData(String sheetName){
		
			int rows = excel.getRowCount(sheetName);
			int cols = excel.getColumnCount(sheetName);
			
			// System.out.println("Total Rows are:" + rows+ "----" + "Total Columns are:" + cols);
			
			// System.out.println(excel.getCellData(sheetName, 0, 2));
			
			Object[][] data = new Object[rows-1][cols];
			
			for(int rowNum=2; rowNum<=rows; rowNum++ ){
				for(int colNum=0; colNum<cols; colNum++){
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				}
			}
			
			
		  return data;
		    
		}

		
		
	}
	

		