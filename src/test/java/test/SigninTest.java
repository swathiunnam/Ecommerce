package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.SigninPage;

public class SigninTest extends ProjectSpecification{
	
	@Test
	public void signinTest() {
		
		SigninPage obj=new SigninPage(driver);
		obj.clickImage();
		obj.clickOnAccount();
		obj.clickOnSignin();
         obj.enterEmail("Testuser@gmail.com");
		obj.enterPassword("Test@123456");
		obj.clickSigninbtn();
	}

}
