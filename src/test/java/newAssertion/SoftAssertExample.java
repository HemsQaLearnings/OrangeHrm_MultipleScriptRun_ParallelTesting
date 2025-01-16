package newAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	@Test
    public void OrangeHrm_Assertion() throws InterruptedException {
        // Initialize SoftAssert
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

            // Click on login button
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Validate the invalid login message
            WebElement invalidMsg = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
            String actualMessage = invalidMsg.getText();
            String expectedMessage = "Invalid credentials"; // Correct expected message for this scenario

            // Soft assertion
            //sf.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
            sf.assertEquals("Unexpected Text", expectedMessage, "Deliberate failure: Texts do not match!");
            // Confirmation of program execution
            System.out.println("Program executed");
            // Optional wait (for demo purposes)
            Thread.sleep(3000);
           
            driver.quit();
         
            // Assert all for soft assertions
            sf.assertAll();
        

    
    }
}
