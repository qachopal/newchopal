package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.TestBase;


public class RegisterConfirmedTest extends TestBase{
	
	@Test(priority=2, description="Test Case: 1 ==> User Successfully Register confirmation Page")
	public void regConfirm()
	{
		 System.out.println(driver.findElement(By.id(OR.getProperty("Name"))).getText());
		 System.out.println(driver.findElement(By.id(OR.getProperty("UserName"))).getText());
		 System.out.println(driver.findElement(By.id(OR.getProperty("Password"))).getText());
		 System.out.println(driver.findElement(By.id(OR.getProperty("Email"))).getText());
		 System.out.println(driver.findElement(By.id(OR.getProperty("ProgLang"))).getText());
		 System.out.println(driver.findElement(By.id(OR.getProperty("T&C_Check"))).getText());
		 driver.findElement(By.id(OR.getProperty("RegUsrBtn"))).click();
		 
		 

	}
}
