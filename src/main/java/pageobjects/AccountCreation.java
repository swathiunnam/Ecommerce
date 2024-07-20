package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class AccountCreation extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createaccount;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement reenterpassword;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement mobileno;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createanaccount;
	
	
	
	public AccountCreation(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
   public  void clickImage() {
		
		image.click();
			
	}
   
   public void clickOnAccount() {
		
		account.click();
	     
	}
   public void clickCreateAccount() {
		
		createaccount.click();
		
		
  }
   public void enterFirstName(String fname) {
		
		firstname.sendKeys(fname);
		
	}
	
	public void enterLastName(String lname) {

		lastname.sendKeys(lname);
		
	}
	
   public void enterEmail(String eid) {
		
		email.sendKeys(eid);
		
	}
   
   public void enterPassword(String epassword) {
		
		password.sendKeys(epassword);
		
	}
   
   public void reEnterPassword(String cpassword) {
		
		reenterpassword.sendKeys(cpassword);
	
	}
   
   public void enterMobileno(String mobno) {
		
		mobileno.sendKeys(mobno);
		
	}
   
   
   public void clickOnCreateAnAccount() {
		Actions act=new Actions(driver);
		act.doubleClick(createanaccount).perform();
		createanaccount.sendKeys("9999123456");
   }


}
