package Insurance.Insurance;


import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Repository 
{
public WebDriver driver;
public String com;


	
	//laucnhing the application
	public void launch()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.4/Insurance");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void admin()
	{
		Adminpage.Login(driver).click();
		Adminpage.Admin(driver).click();
		
	}
	
   public void login()
   {
	   Loginpage.Adminname(driver).sendKeys("admin");
	   Loginpage.Adminpassword(driver).sendKeys("admin");
	   Loginpage.Login(driver).click();
   }
   public void users()
   {
	   Users.Users1(driver).click();
	   Users.Createcompany(driver).click();
	   
   }
   public void createcompany()
   {
	   companyreg.companyname(driver).sendKeys("mindq");
	   companyreg.username(driver).sendKeys("raju");
	   companyreg.password(driver).sendKeys("1234");
	   companyreg.Emaiid(driver).sendKeys("rajasekharareddy.1991@gmail.com");
	   companyreg.mobile(driver).sendKeys("9666784653");
	   companyreg.address(driver).sendKeys("kphp");
	   companyreg.save(driver).click();
	 com=companyreg.companyname(driver).getText();
   }
   public void createemployee() throws Exception
   {
	   Users.Users1(driver).click();
	   Users.CreateEmployee(driver).click();
	   Newemployeecreation.Employeename(driver).sendKeys("siva");
	   Newemployeecreation.Employeepassword(driver).sendKeys("1234");
	   Newemployeecreation.Employeefathername(driver).sendKeys("sambi");

       driver.switchTo().frame("gToday:normal:agenda.js");
       yearselection();
       
       driver.switchTo().parentFrame();
       Newemployeecreation.Employeegender(driver).selectByVisibleText("Male");
       Newemployeecreation.Employeecompanyname1(driver).sendKeys(com);
       //Newemployeecreation.Employeeregdate(driver)
       
	   
   }
   
   public void yearselection() throws Exception
   {
	   boolean flag=false;
       
       
       WebElement table1 = driver.findElement(By.id("outerTable"));
       List<WebElement>tr=table1.findElements(By.tagName("tr"));
       for(int i=0;i<tr.size();i++)
       {
    	   List<WebElement>tcol=tr.get(i).findElements(By.linkText("td"));
    	   for(int j=0;j<tcol.size();j++)
    	   {
    		  
    	   }
      
       
   	 WebElement table2 = driver.findElement(By.xpath("//*[@id='innerDiv']/table"));
   	 
        List<WebElement> tr2 = table2.findElements(By.tagName("tr"));
        System.out.println("trows size is:"+tr2.size());
       
   	for(int j=0;j<tr2.size();j++)
   	{
   		System.out.println("col no:"+j);
   		List<WebElement> td = tr2.get(3).findElements(By.tagName("td"));
   		System.out.println("tcols size is:"+td.size());
   		for(int k=0;k<td.size();k++)
   		{
   			System.out.println("col no:"+k);
   			if(td.get(k).getText().equals("16"))
   			{
   				System.out.println("Matches");
   				td.get(k).findElement(By.tagName("div")).click();
   				flag=true;
   				break;
   			}
   		}
   		if(flag==true)
   		{
   			break;
   		}
   	}
   	if(flag==true)
		{
			break;
		}
   	
       }
       
	   }
}
