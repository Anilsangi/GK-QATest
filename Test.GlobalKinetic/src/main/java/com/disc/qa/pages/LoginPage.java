package com.disc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class LoginPage  extends TestBase{
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Login;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage Login(String un, String pw)
	{
		Username.sendKeys(un);
		Password.sendKeys(pw);
		Login.click();
		return new HomePage();
	}
}
