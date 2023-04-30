package testngdemo;

import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data")
	public static Object[][] testData(){
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
	}
	
	@DataProvider(name="LoginData")
	public static Object[][] LogintestData(){
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="abc@gmail.com";
		obj[0][1]="swapd@123";
		
		obj[1][0]="kj@gmail.com";
		obj[1][1]="swapg@123";
		
		obj[2][0]="vf@gmail.com";
		obj[2][1]="swapee@123";
		
		return obj;
	}
	

}
