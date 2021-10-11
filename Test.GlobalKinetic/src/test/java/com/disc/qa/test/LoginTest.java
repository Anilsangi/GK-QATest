package com.disc.qa.test;

import org.testng.annotations.Test;

import com.disc.qa.base.TestBase;
import com.disc.qa.pages.CheckPointInformationPage;
import com.disc.qa.pages.FinishOverView;
import com.disc.qa.pages.HomePage;
import com.disc.qa.pages.LoginPage;
import com.disc.qa.pages.ProductsAddtoCard;
import com.disc.qa.pages.YourCartPage;

public class LoginTest  extends TestBase{

	
	LoginPage loginpage;
	HomePage homepage;
	ProductsAddtoCard ProductsAddtoCard;
	
	
	//Call constructor from base class
		public LoginTest() {
			super();
			
		}
		
	
		
@Test()
	public void LoginTest() throws InterruptedException {
	
	initialization();
	loginpage = new LoginPage();
			loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	
			 ProductsAddtoCard=new ProductsAddtoCard();	
			 YourCartPage YourCartPage=new YourCartPage();
			 CheckPointInformationPage CheckPointInformationPage=new CheckPointInformationPage();
			 FinishOverView finish=new FinishOverView();
			 ProductsAddtoCard.CartAdd();
			 YourCartPage.CheckOut();
			 CheckPointInformationPage.checkInfo("test", "Testing", "1686");
			
			finish.FinshClick();
			 
			 

	
			}



	 
	  	
}
	

