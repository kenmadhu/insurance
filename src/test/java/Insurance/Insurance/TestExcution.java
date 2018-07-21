package Insurance.Insurance;

import org.testng.annotations.*;

public class TestExcution extends Repository 
{
	@BeforeTest()
	public void verifyLaunch()
	{
		launch();
	}

	@Test(priority=0)
	public void verifyadmin()
	{
		admin();
	}
	@Test(priority=1)
	public void verifylogin()
	{
		login();
	}
	
	@Test(priority=2)
	public void verifyhome()
	{
		users();
	}
	@Test(priority=3)
	public void verifyreg()
	{
		createcompany();
	}
	/*@Test(priority=4)
	public void verifyemployee()
	{
		createemployee();
	}*/
}
