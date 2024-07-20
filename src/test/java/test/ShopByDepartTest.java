package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.ShopByDepartPage;

public class ShopByDepartTest extends ProjectSpecification{
	@Test
	public void shopByDepart() throws InterruptedException {
		ShopByDepartPage obj=new ShopByDepartPage(driver);
		obj.clickImage();
		obj.clickMenu();
		obj.clickOnCellPhones();
		obj.clickOnSamsungGalaxy();
		obj.clickOnSamsungGalaxyS24();
		obj.clickSamsungGalaxyS24();
		obj.clickAddToCart();
		obj.clickGoToCart();
		obj.clickCheckOut();
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
