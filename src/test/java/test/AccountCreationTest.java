package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.AccountCreation;

public class AccountCreationTest extends ProjectSpecification {

	@Test(priority = 1)
	
	public void accountCreationTest() {
	
		AccountCreation acc=new AccountCreation(driver);
		acc.clickImage();
		acc.clickOnAccount();
		acc.clickCreateAccount();
		acc.enterFirstName("Test");
		acc.enterLastName("user");
		acc.enterEmail("Testuser@gmail.com");
		acc.enterPassword("Test@123456");
		acc.reEnterPassword("Test@123456");
		acc.enterMobileno("9999999999");
		acc.clickOnCreateAnAccount();
		 String actual= "Best Buy | Official Online Store | Shop Now & Save";
         String expected=driver.getTitle();
         Assert.assertEquals(actual,expected);
         
		
	}
}
