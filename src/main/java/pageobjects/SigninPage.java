package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SigninPage extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signin;
	
	
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin_btn;
	
	public SigninPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	 public  void clickImage() {
			
			image.click();
				
		}
	 public void clickOnAccount() {
			
			
			
			account.click();
	 }
	 public void clickOnSignin() {
			
			
			signin.click();
	 }
	
	public void enterEmail(String eid) {
		
		email.sendKeys(eid);
		
	}
	
     public void enterPassword(String epassword) {
		
		password.sendKeys(epassword);
		
	}
     
     public void clickSigninbtn() {
 		
 		signin_btn.click();
 		
 	}



}
