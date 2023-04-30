package testngdemo;

import org.testng.annotations.Test;

public class SignUpTest {
	
	
	@Test
	public void SignUpViaEmail() {
		System.out.println("signUp via email");
	}
	
	@Test
	public void SignUpViaFacebook() {
		System.out.println("SignUp via facebook");
		
	}
	
	@Test
	public void SignUpViaTwitter() {
		System.out.println("Signup via Twitter");
		
	}
}

