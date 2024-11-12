package package1_SigninModule;

import org.testng.annotations.Test;

public class Signin_Module_Test{
	
	@Test(priority = 0,groups = {"smokeTest"})
	public void Signin_UserName_Test()
	{
		System.out.println("Verify UserName as Admin");
	}
	
	@Test(priority = 1,groups = {"smokeTest"})
	public void Signin_Password_Test()
	{
		System.out.println("Verify password as admin123");
	}
	
	@Test(priority = 2,groups = {"smokeTest"})
	public void Signin_LoginButton_Test()
	{
		System.out.println("Click on Login Button");
	}
	
}