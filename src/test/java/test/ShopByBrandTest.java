package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.ShopByBrand;

public class ShopByBrandTest extends  ProjectSpecification{
	@Test
	public void shopByBrand() throws InterruptedException {
		
		ShopByBrand obj=new ShopByBrand(driver);
		obj.clickImage();
		obj.clickMenu();
		obj.clickBrands();
		obj.clickSamsung();
		obj.clickSmartPhoneAndWatches();
		obj.clickGalaxySmartPhones();
		obj.clickShopGalaxyZfold();
		obj.clickAddToCart();
		obj.clickCart();
		obj.clickcheckOut();
		obj.enterEmail();
		obj.enterPassword();
		obj.clickSignin();
		obj.clickContinuePayment();
		obj.enterCardNumber();
		obj.enterMonth();
		obj.enterYear();
		obj.enterCvv();
		obj.enterFirstName();
		obj.enterLastName();
		obj.enterAddress();
		obj.enterCity();
		obj.clickState();
		obj.enterZipcode();
		obj.clickPlaceOrder();
	
		
	}

}
