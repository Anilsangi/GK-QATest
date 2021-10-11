package com.disc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class YourCartPage extends TestBase
{
	
	


	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	WebElement cartOptionButton;
	

	@FindBy(xpath="//button[@id='checkout']")
	WebElement chcckOutButton;

	
	public YourCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void CheckOut()
	{
		cartOptionButton.click();
		chcckOutButton.click();
		
	}

}
