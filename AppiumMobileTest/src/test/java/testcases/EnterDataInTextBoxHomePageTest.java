package testcases;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class EnterDataInTextBoxHomePageTest extends TestBase {

	@Test(priority=0, description="Test Case: 1 ==> Open Selendroid App & Enter Input data", dataProvider="getData")
	public void enterDataInTextBoxATHomePage(String UserName)
	{
		 //Enter the data in Textbox at Homepage
		  driver.findElement(By.id(OR.getProperty("TxtBox"))).clear();
		  driver.findElement(By.id(OR.getProperty("TxtBox"))).sendKeys(UserName);
		 
		  //Click on Registration button/Folder icon
		  driver.findElement(By.id(OR.getProperty("RegBtn"))).click();

	}
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("EnterDataInTextBoxHomePageTest");	
	
	}
	
}
