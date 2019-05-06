package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class NewUserRegistrationTest extends TestBase {
	
	@Test(priority=1, description ="Test Case:2 => User Registration", dataProvider="getData")
	public void newUsrReg(String Username, String Email, String Password, String Name){
		
		System.out.println("-----Start User Registration------");
		System.out.println("Enter User Name");
	    driver.findElement(By.id(OR.getProperty("User_Name"))).sendKeys(Username);
		
		System.out.println("Enter Email Id");
		driver.findElement(By.id(OR.getProperty("emil"))).sendKeys(Email);
		
		System.out.println("Enter pwd");
		driver.findElement(By.id(OR.getProperty("password"))).sendKeys(Password);
	
		System.out.println("Enter your name");
		driver.findElement(By.id(OR.getProperty("Name"))).clear();
		driver.findElement(By.id(OR.getProperty("Name"))).sendKeys(Name);
	
		//System.out.println("Click on the T&C checkbox");
		//driver.findElement(By.id(OR.getProperty("T&C_checkbox"))).click();
		
		
		System.out.println("Click on Registration Button");
		driver.findElement(By.id(OR.getProperty("Registration_Btn"))).click();	  	  
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("NewUserRegistrationTest");	
	
	}
}
