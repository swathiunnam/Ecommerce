package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AddToCart extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(id="gh-search-input")
	WebElement search;
	
	@FindBy(xpath = "//span[@class='header-search-icon']//*[name()='svg']")
	WebElement searchicon;
	
	@FindBy(xpath="(//img[@class='product-image'])[1]")
	WebElement phone;
	
	@FindBy(xpath = "(//button[text()='Add to Cart'])[4]")
	WebElement addtocart;
	
	
	public AddToCart(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 public  void clickImage() {
			
			image.click();
				
		}
	 public void clickSearch() {
			
			search.sendKeys("phones");
	 }
	
    public void clickOnSearchIcon() {
		
		searchicon.click();
  }
	
  public void clickOnPhone() {
		
		phone.click();
		
 }
  public void clickOnAddTOCart() throws InterruptedException {
	
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	  for(int i=0;i<10;i++) {
		  js.executeScript("window.scrollBy(0,150)");
		  Thread.sleep(500);
	  }
	 addtocart.click();
  }
	
}
