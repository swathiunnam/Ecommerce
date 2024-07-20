package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class BookingPage extends ProjectSpecification {
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath ="//button[text()='Sign In']")
	WebElement signin;
	
	public BookingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public BookingPage clickCheckOut() {
		
		checkout.click();
		return this;
	}
	
    public BookingPage enterPassword() {
		
		password.sendKeys("Testuser@123456");
		return this;
	}
    public BookingPage clickSignIn() {
		
		signin.click();
		return this;
	}


}
