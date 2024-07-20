package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecification;

public class ShopByDepartPage extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(xpath = "//button[contains(@class,'hamburger-menu-button')]")
	WebElement menu;
	
	
	@FindBy(xpath = "(//button[contains(@class,'hamburger-menu-flyout-list-item')])[4] ")
	WebElement cellphones;
	
	@FindBy(xpath = "(//button[contains(@class,'hamburger-menu-flyout-list-item')])[2] ")
	WebElement samsunggalaxy;
	
	@FindBy(xpath = "//a[text()='Samsung Galaxy S24']")
	WebElement samsunggalaxys24;
	
	@FindBy(xpath = "//a[text()='Shop Galaxy S24']")
	WebElement shopgalaxys24;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[4]")
	WebElement addtocart;
	
	@FindBy(xpath ="//a[text()='Go to Cart']")
	WebElement gotocart;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath = "//span[text()='Continue to Payment Information']")
	WebElement cotinuetopayment;
	
	@FindBy(xpath = "//input[@id='number']")
	WebElement cardno;
	
	@FindBy(xpath = "//select[@id='expMonth']")
	WebElement month;
	
	@FindBy(xpath = "//select[@id='expYear']")
	WebElement year;
	
	@FindBy(xpath = "//input[@id='cvv']")
	WebElement cvv;
	
	@FindBy(xpath ="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath ="//input[@id='lastName']" )
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement address;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//span[text()='Place Your Order'")
	WebElement placeorder;
	
	
	
 public ShopByDepartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
 public void clickImage() {
	
	image.click();
}
 public void clickMenu() {
	
	menu.click();
}
 
 
 public void clickOnCellPhones() {
		
	cellphones.click();
 }
 public void clickOnSamsungGalaxy() {
		
		samsunggalaxy.click();
		
	}
 public void clickOnSamsungGalaxyS24() {
		
		samsunggalaxys24.click();
		
	}
 public void clickSamsungGalaxyS24() {
		
		shopgalaxys24.click();
		
	}
 public void clickAddToCart() throws InterruptedException {
		
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Thread.sleep(2000);
      js.executeScript("window.scrollBy(0,1000)");
		addtocart.click();
		
	}
 
 public void clickGoToCart() throws InterruptedException {
		
	 Thread.sleep(1000);
		gotocart.click();
		
	}
 
 public void clickCheckOut() {
		
		checkout.click();
		
	}
 public ShopByDepartPage enterEmail() {
		
	  email.sendKeys("Testuser@gmail.com");
	  		return this;
	  	}
 
 public void enterPassword() throws InterruptedException {
		
	 Thread.sleep(1000);
    password.sendKeys("Test@123456");
		
	}
 
 public void clickSignin() {
		
	signin.click();
	 		
	 	}
 
 public void clickContinuePayment() {
		
		cotinuetopayment.click();
		 		
 }
 public void enterCardNumber() {
		
		cardno.sendKeys("5459 6492 0384 6064");
		
	}
public void enterMonth() {
		
		month.click();
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("01");
		
	}
public void enterYear() {
		
		year.click();
		Select yearDropDown=new Select(year);
		yearDropDown.selectByVisibleText("2032");
		
	}

public void enterCvv() {
		
		cvv.sendKeys("5024");;
		
	}


	public void enterFirstName() {
		
		firstname.sendKeys("Test");
		
	}
public void enterLastName() {
		
		lastname.sendKeys("user");
		
	}

public void enterAddress() {
		
		address.sendKeys("user");
		
	}
public void enterCity() {
		
		city.sendKeys("Hyderabad");
		
	}
public void clickState() {
	    
	  Select titleDropDown=new Select(state);
		titleDropDown.selectByVisibleText("AP");
		state.click();
		
	}
public void enterZipcode() {
	    
	 
		zipcode.sendKeys("523109");
		
	}
public void clickPlaceOrder() {
	    
		 
		placeorder.click();
}
	
	



}
