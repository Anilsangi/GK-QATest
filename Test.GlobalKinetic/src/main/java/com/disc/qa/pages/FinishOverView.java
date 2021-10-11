package com.disc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.disc.qa.base.TestBase;

public class FinishOverView extends TestBase
{
	@FindBy(xpath="//*[@id='finish']")
	WebElement finshButtom;
	
	
	public FinishOverView()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FinshClick()
	{
		finshButtom.click();
				

	}

}
