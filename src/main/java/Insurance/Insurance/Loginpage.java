package Insurance.Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{

	public static WebElement Adminname(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtAdminUserName"));
	  return element;
	}
	public static WebElement Adminpassword(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtAdminPassword"));
	  return element;
	}
	
	public static WebElement Login(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_btnAdministrator"));
	  return element;
	}
}
