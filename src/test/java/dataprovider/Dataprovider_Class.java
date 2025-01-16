package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Class {

	@DataProvider(name = "Prachi")
	public Object[][] getData2() 
	{

		Object[][] arr1 = { { "Manual", "89" }, { "Sql", "90" }, { "CoreJava", "95" } };
		return arr1;

	}

	@DataProvider(name = "VishwaJeet")
	public Object[][] getData3() {

		Object[][] arr1 = { { "Manual", 95 }, { "Sql", 70 }, { "CoreJava", 89 } };
		return arr1;

	}

	//
	/*
	 * @Test(dataProvider="Darshana",dataProviderClass=DataProiveder_betweentheclass
	 * .class) public void useData(String Course, String score) {
	 * 
	 * System.out.println(Course+" "+score);
	 * 
	 * }
	 */
	@Test(dataProvider = "smitha", dataProviderClass=Dataprovider_Class2.class)
	public void useData1(String Course, String Score) {
		System.out.println(Course + " " + Score);
	}

}