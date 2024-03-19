package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPolicy {

	WebDriver driver;
	public SearchPolicy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		//driver.findElement(By.xpath("//input[@id='txtUN']")).sendKeys("aigadmin");
	}
	
	

	//WebElement username=driver.findElement(By.xpath("//input[@id='txtUN']"));
	//WebElement password=driver.findElement(By.xpath("//input[@id='txtPwd']"));
	//WebElement submit=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtPolicy']")
	WebElement policysearch;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSearch']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_GvPolicySearch_chkBox_0']")
	WebElement policyselect;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnViewSelected']")
	WebElement selected;
	

	public void policySearch(String psearch)
	
	{
		policysearch.sendKeys(psearch);
		
		search.click();
		policyselect.click();
		selected.click();
		
	}
	
}
