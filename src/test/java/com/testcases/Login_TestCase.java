package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.Login;

public class Login_TestCase extends Base {

	
	@Test
	public void loginTest()
	{
		//driver.get(baseUrl);
		Login lo=new Login(driver);
		logger.info("Accessing the Customercare application");
		lo.loginPage(username, password);
		logger.info("Login the Customercare application successfully");
	}
}
