package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProiveder_betweentheclass {

	@DataProvider(name = "Pinky")
	public Object[][] getData3() 
	{
		Object[][] arr = { { "Manual", "70" }, { "Sql", "95" }, { "Selenium", "89" }

		};
		return arr;

	}

}
