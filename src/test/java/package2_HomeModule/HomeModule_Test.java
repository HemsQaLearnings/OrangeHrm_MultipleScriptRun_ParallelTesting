package package2_HomeModule;

import org.testng.annotations.Test;

public class HomeModule_Test{
	
	@Test(priority = 0,groups = {"FunctionalTesting"})
	public void HomeModule_AdminStory_Test()
	{
		System.out.println("Verify UserName as Admin");
	}
	
	@Test(priority = 1,groups = {"FunctionalTesting"})
	public void HomeModule_PimStory_Test()
	{
		System.out.println("Verify password as admin123");
	}
	
	@Test(priority = 2,groups = {"FunctionalTesting"})
	public void HomeModule_Leave_Test()
	{
		System.out.println("Click on Login Button");
	}
	
}