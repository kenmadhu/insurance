package Insurance.Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class companyreg {
	/*public static WebElement Createcompany(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath("//*[@id='menuItems:submenu:3']/li[1]/a"));
	  return element;
	}*/
	public static WebElement companyname(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtCompanyName"));
	  return element;
	}
	public static WebElement username(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtUserName"));
	  return element;
	}
	public static WebElement password(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
	  return element;
	}
	public static WebElement Emaiid (WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtEmailId"));
	  return element;
	}
	public static WebElement mobile(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo"));
	  return element;
	}
	public static WebElement address(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtAddress"));
	  return element;
	}
	public static WebElement save(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
	  return element;
	}

}
