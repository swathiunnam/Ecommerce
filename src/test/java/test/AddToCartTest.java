package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.AddToCart;

public class AddToCartTest extends ProjectSpecification {
	@Test
	
	public void addCart() throws InterruptedException {
		
		AddToCart obj=new AddToCart(driver);
		obj.clickImage();
		obj.clickSearch();
		obj.clickOnSearchIcon();
		obj.clickOnPhone();
		obj.clickOnAddTOCart();
		
	}

}
