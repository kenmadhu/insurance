package Insurance.Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Users {
	
	
	public static  WebElement Users1(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.linkText("Users"));
	  return element;
	}
	public static WebElement Createcompany(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[1]/a"));
	  return element;
	}
	
	public static WebElement CreateEmployee(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[2]/a"));
	  return element;
	}
	public static WebElement Createagent(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[3]/a"));
	  return element;
	}
	public static WebElement Createcustomer(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[4]/a"));
	  return element;
	}
	public static WebElement viewcompany(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[5]/a"));
	  return element;
	}
	public static WebElement viewemployee(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[6]/a"));
	  return element;
	}
	public static WebElement viewagent(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[7]/a"));
	  return element;
	}
	public static WebElement viewcustomer(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='menuItems:submenu:3']/li[8]/a"));
	  return element;
	}
}
