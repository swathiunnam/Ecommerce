package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class NavigationPage extends ProjectSpecification {
	
	@FindBy(xpath="(//h4[text()='United States'])[1]")
	WebElement image;
	
	@FindBy(xpath = "//span[text()='Back to School']")
	WebElement backtoschool;
	
	
	@FindBy(xpath = "//a[text()='Back-to-School Checklist']")
	WebElement backtoschoolchecklist;
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealoftheday;
	
	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement bestbuysells;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement more;
	
	@FindBy(xpath = "(//a[text()='Gift Cards'])[2]")
	WebElement giftcards;
	

     @FindBy(xpath="//a[text()='Accessibility']")
     WebElement accessibility;
     
     @FindBy(xpath = "//a[text()='Privacy']")
     WebElement privacy;
     
     @FindBy(xpath = "//a[text()='Health Data Privacy']")
     WebElement healthdata ;
     
     @FindBy(xpath="//a[text()='State Privacy Rights']")
     WebElement stateprivacy;
	

	public NavigationPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickImage() {
		
		image.click();
	}
	
	
	 public  void clickBackToSchool() {
			
			backtoschool.click();
	 }
  
	
   public void clickBackToSchoolCheckList() {
		
		backtoschoolchecklist.click();
		Assert.assertEquals(driver.getTitle(), "Student Checklist - Best Buy");
		
		
	}
   
   public void clickTopDeals() {
		
		topdeals.click();
		Assert.assertEquals(driver.getTitle(), "Top Deals and Featured Offers on Electronics - Best Buy");
		
		
	}
   
   public void clickDealOfTheDay() {
		
		dealoftheday.click();
		Assert.assertEquals(driver.getTitle(), "Deal of the Day: Electronics Deals - Best Buy");
		
	}
   public void clickBestBuySellsThat() {
		
		bestbuysells.click();
		Assert.assertEquals(driver.getTitle(), "Yes, Best Buy Sells That – Best Buy");
		
	}
   
   public void clickMore() {
		
		more.click();
		
		
	}
   
   public void clickGiftCards() {
		
		giftcards.click();
		Assert.assertEquals(driver.getTitle(), "Gifts Cards and E-Gift Cards - Best Buy");
		
		
	}
   
   public void clickAccessibility() throws InterruptedException {
	   
     Thread.sleep(1000);
	accessibility.click();
	Assert.assertEquals(driver.getTitle(), "Accessibility - Best Buy");
	
		
	}
   public void clickPrivacy() {
		
		privacy.click();
		Assert.assertEquals(driver.getTitle(), "Privacy Policy Hub - Best Buy");
		
			
   }
   public void  clickHealthData() {
		
		healthdata.click();
		Assert.assertEquals(driver.getTitle(), "Health Data Privacy Information - Best Buy");
		
		}
   
   public void clickStatePrivacy() {
		
		stateprivacy.click();
		Assert.assertEquals(driver.getTitle(), "State Privacy Rights - Best Buy");
		
			
		}







}
