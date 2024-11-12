package package3_LoanModule;

import org.testng.annotations.Test;

public class Pim_module_Test {

	
		@Test(priority = 0,groups = {"Integration","RegressionTest"})
		public void Employee_List_Module_Test()
		{
			System.out.println("click on Employee_List_moduleTest");
		}
		
		@Test(priority = 1,groups = {"Integration","RegressionTest"})
		public void Employee_List_Add_Test()
		{
			System.out.println("Enter All the Required Details");
		}
		
		@Test(priority = 2,groups = {"Integration","RegressionTest"})
		public void Employee_List_EmployeeSearch_Test()
		{
			System.out.println("Search for employee");
		}

	

	

}
