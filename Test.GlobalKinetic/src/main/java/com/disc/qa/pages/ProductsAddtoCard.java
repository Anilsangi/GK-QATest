package com.disc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class ProductsAddtoCard extends TestBase {

	
	
	
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement ProductsAddtoCard1;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement ProductsAddtoCard2;
	
	
	
	
	public ProductsAddtoCard()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void CartAdd()
	{
		ProductsAddtoCard1.click();
		ProductsAddtoCard2.click();
		

	}
}
