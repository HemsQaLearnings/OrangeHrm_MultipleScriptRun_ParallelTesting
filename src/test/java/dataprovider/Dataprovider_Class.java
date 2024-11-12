package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Class
{
	


	@DataProvider(name="Sayeem")
	public Object[][] getData2(){
		
		Object[][] arr1= {
				{"Manual", "89"},
				{"Sql","90"},
				{"CoreJava","95"}
		};
		return arr1;
		
	}
	@DataProvider(name="nayanathara")
	public Object [] [] getData1()
	{
		Object [] [] arr2= {
				
				{"Manual", "90"},
				{"CoreJava", "95"},
				{"Seleneium", "40"},
		};
		return arr2;
	}
	 @Test(dataProvider="Shwetha",dataProviderClass=Dataprovider_Class2.class) 
	  public void useData(String Course, String score) { 
		  
		  System.out.println(Course+" "+score); 
		
	 }

			

}