package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Login;
import POM.SearchPolicy;

public class PolicySearch_TestCase extends Base{

	
	@Test(priority=1)
	public void policySearch()
	{
		//driver.get(baseUrl);
		Login lo=new Login(driver);
		logger.info("Accessing the Customercare application");
		lo.loginPage(username, password);
		logger.info("Login the Customercare application successfully");
		SearchPolicy sp=new SearchPolicy(driver);
		sp.policySearch("C0229796");
		Assert.assertEquals("C0229796","C0229796" );
		
	}
	@Test(priority=2)
	public void policyDetail()
	{
		
		
	}
	
	
}
