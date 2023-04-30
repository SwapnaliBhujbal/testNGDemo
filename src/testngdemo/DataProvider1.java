package testngdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	//@Test(dataProvider="testData")
	@Test(dataProviderClass=TestDataFile.class,dataProvider="data")
	public void RegisterUser(String FirstName,
			String lastName,
			String email,
			String password) {
		System.out.println("FirstName");
		System.out.println("lastName");
		System.out.println("email");
		System.out.println("password");
		
		

	}
	
	@Test(dataProviderClass=TestDataFile.class,dataProvider="LoginData")
	public void LoginUser(
			String email,
			String password) {
	
		System.out.println("email");
		System.out.println("password");
		
	}
		
	
	
	
	
	/*@DataProvider
	public Object[][] testData(){
		Object[][] obj=new Object[3][4];
		
		obj[0][0]="Sohan";
		obj[0][1]="Singh";
		obj[0][2]="abc@gmail.com";
		obj[0][3]="swap@123";
		
		obj[1][0]="Shree";
		obj[1][1]="Salke";
		obj[1][2]="jhc@gmail.com";
		obj[1][3]="jui@123";
		
		obj[2][0]="Sonali";
		obj[2][1]="Singh";
		obj[2][2]="jhu@gmail.com";
		obj[2][3]="mkl@123";
		
		return obj;
	}*/
	
}
