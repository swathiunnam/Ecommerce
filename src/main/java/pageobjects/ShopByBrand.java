package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecification;

public class ShopByBrand extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(xpath = "//button[contains(@class,'hamburger-menu-button')]")
	WebElement menu;
	
	@FindBy(xpath="(//button[contains(@class,'v-fw-medium')])[3]")
	WebElement brands;
	
	@FindBy(xpath = "//a[text()='Samsung']")
	WebElement samsung;
	
	@FindBy(xpath="//a[text()='Smartphones & Watches']")
	WebElement smartphoneandwatches;
	
	@FindBy(xpath="(//a[@class='panel-category-link'])[2]")
	WebElement galaxysmartphones;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	WebElement galaxyzfold6;
	

	@FindBy(xpath="(//button[contains(@class,'add-to-cart-button')])[4] ")
	WebElement addtocart;
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;
	
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
	
	
	
   
  public ShopByBrand(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
  public void clickImage() {
		
		image.click();
  }
  public void clickMenu() {
		
		menu.click();
  }
  
  
  public void clickBrands() {
		
		brands.click();
		
	}
  
  public void clickSamsung() {
		
		samsung.click();
		
	}
  public void clickSmartPhoneAndWatches() {
		
		smartphoneandwatches.click();
  }
  
  public void clickGalaxySmartPhones() {
		
		galaxysmartphones.click();
		
	}
  
  public void clickShopGalaxyZfold() throws InterruptedException {
		
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Thread.sleep(2000);
      js.executeScript("window.scrollBy(0,600)");
		galaxyzfold6.click();
		
	}
 
  
  public void clickAddToCart() throws InterruptedException {
		
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  for(int i=0;i<9;i++) {
		  js.executeScript("window.scrollBy(0,150)");
		  Thread.sleep(500);
	  }
		addtocart.click();
		
	}
  
  public void clickCart() {
		
		cart.click();
		
	}
  public void clickcheckOut() {
		
		checkout.click();
		
	}
  public void enterEmail() {
		
	  email.sendKeys("Testuser@gmail.com");
	  		
	  	}
  
  public void enterPassword() {
		
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










