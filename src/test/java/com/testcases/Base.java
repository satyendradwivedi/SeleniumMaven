package com.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	ReadConfig rcnfg=new ReadConfig();
	

	public String baseUrl=rcnfg.getApplicationurl();
	public String username=rcnfg.getUsername();
	public String password=rcnfg.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		
		logger=Logger.getLogger("Customer");
		PropertyConfigurator.configure("log4.properties");
		WebDriverManager.chromedriver().setup();

		WebDriverManager.firefoxdriver().setup();

		WebDriverManager.iedriver().setup();
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
		driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
	}
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}

}
