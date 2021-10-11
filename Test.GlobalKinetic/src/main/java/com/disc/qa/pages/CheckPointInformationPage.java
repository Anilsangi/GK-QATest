package com.disc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class CheckPointInformationPage extends TestBase
{
	
	
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement fristName;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue1;

	@FindBy(xpath="//button[@id='cancel']")
	WebElement cancel;
	
	public CheckPointInformationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkInfo(String fn, String ln,String zc)
	{
		fristName.sendKeys(fn);
		lastName.sendKeys(ln);
		postalcode.sendKeys(zc);
		continue1.click();
		
		
	}

}
