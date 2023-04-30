package testngdemo;

import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test
	public void PaymentInDollar() {
		System.out.println("Payment in dollar");
	}
	
	@Test
	public void PaymentInRupee() {
		System.out.println("Payment in rupee");
	}
	
	

}
