package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Class2
{
	@DataProvider(name="Shwetha")
	public Object[][] getData2()
	{
		Object[][] arr= {
				{"Manual", "70"},
				{"SQL","99"},
				{"Selenium","99"}
				
		};
		return arr;
		
	}

}