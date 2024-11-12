package parameterization_package;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization
{

	@Parameters("browser")
	@Test
	public void Script_Test(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
			Thread.sleep(2000);
			
			driver.quit();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.quit();
		}
		else {
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.quit();
		}
		
	}
}
