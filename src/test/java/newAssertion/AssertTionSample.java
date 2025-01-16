package newAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class AssertTionSample {

	@Test
	public void OrangeHrm_Assertion() throws InterruptedException {
		// soft assert
		SoftAssert sf = new SoftAssert();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to the URL and set timeouts
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Perform login
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin321"); // Invalid password

		// Hard assertion for expected vs actual
		String expectedPassword = "admin123";
		String actualPassword = "admin321";
		Assert.assertEquals(actualPassword, expectedPassword, "Passwords do not match!");

		// Click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Validate the invalid login message
		WebElement invalidMsg = driver
				.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String actualMessage = invalidMsg.getText();

		System.out.println("Program executed");
		// Close the browser
		driver.quit();
	}

}
