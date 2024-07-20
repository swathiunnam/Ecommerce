package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.NavigationPage;

public class NavigationPageTest  extends ProjectSpecification{
	@Test
	public void navigationTest() throws InterruptedException {
		
		NavigationPage obj=new NavigationPage(driver);
	     obj.clickImage();
	     obj.clickBackToSchool();
	     obj.clickBackToSchoolCheckList();
	     obj.clickTopDeals();
	     obj.clickDealOfTheDay();
	     obj.clickBestBuySellsThat();
	     obj.clickMore();
	     obj.clickGiftCards();
	     obj.clickAccessibility();	
	     obj.clickPrivacy();
	     obj.clickHealthData();
	     obj.clickStatePrivacy();
	
		
	}

}

