package testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paramerization {
	
	@Parameters("email")
	@Test
	public void login(String email) {
		System.out.println("Inside login");
		System.out.println(email);
	}
	
	

}
