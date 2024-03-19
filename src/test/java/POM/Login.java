package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.Base;

public class Login  {
 
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		//driver.findElement(By.xpath("//input[@id='txtUN']")).sendKeys("aigadmin");
	}
	
	

	//WebElement username=driver.findElement(By.xpath("//input[@id='txtUN']"));
	//WebElement password=driver.findElement(By.xpath("//input[@id='txtPwd']"));
	//WebElement submit=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	
	@FindBy(xpath="//input[@id='txtUN']")
	WebElement username;
	@FindBy(xpath="//input[@id='txtPwd']")
	WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement submit;
	public void loginPage(String uname,String pass)
	
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
		
	}
	
	
	
	
	
	
}
