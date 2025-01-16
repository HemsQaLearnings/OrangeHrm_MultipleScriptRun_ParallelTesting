package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert {
	@Test
	public void soft_assert1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']")); 
		pass.sendKeys("admin321");// invalid pass

		String Exp="admin123";
		String Act="admin321";
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement invalid_msg = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String text = invalid_msg.getText();
		
	System.out.println(text);
		/*
		 * SoftAssert soft = new SoftAssert(); soft.assertEquals(invalid_msg,
		 * "please enter the valid msg");
		 */
		Thread.sleep(3000);
		driver.quit();
		// soft.assertAll(); // mandatorily we have to use this statement when ever we
		// use softassert
	}

	

	

}
