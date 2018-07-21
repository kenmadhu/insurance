package Insurance.Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adminpage {
	
	public static WebElement Login(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath("//*[@id='menuItems']/ul/li[7]/a"));
	  return element;
	}
	
	
	public static WebElement Admin(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath("//*[@id='form1']/div[3]/table[1]/tbody/tr/td[2]/div[1]/button[4]"));
	  return element;
	}
	
	

}
