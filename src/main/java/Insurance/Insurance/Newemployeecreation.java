package Insurance.Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Newemployeecreation {
	
	public static WebElement Employeename(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_lblErr"));
	  return element;
	}
	public static WebElement Employeepassword(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtEmployeePassword"));
	  return element;
	}
	public static WebElement Employeefathername(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtFatherName"));
	  return element;
	}
	public static WebElement Employeedateofbirth(WebDriver driver)
	{
		 WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtFatherName"));
		  return element;

	}
	public static Select Employeegender(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("ContentPlaceHolder1_rdoMale")));
	  
	}
	public static WebElement Employeecompanyname1(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_ddlCompanyName"));
	  return element;
	}
	public static WebElement Employeeregdate(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtRegDate"));
	  return element;
	}
	public static WebElement Employeeaddress(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_txtAddress"));
	  return element;
	}
	public static WebElement Employeesave(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
	  return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
