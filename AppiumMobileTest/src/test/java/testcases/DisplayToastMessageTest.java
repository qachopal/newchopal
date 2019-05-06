package testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import base.TestBase;

public class DisplayToastMessageTest extends TestBase{
	
	@Test(priority=4)
	public void tostMessage(){
	driver.findElement(By.id(OR.getProperty("ToastMsg"))).click();
		
	}
	

}
