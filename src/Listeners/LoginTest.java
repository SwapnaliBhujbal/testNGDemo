package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTest {
	
	
	@Test
	public void loginwithEmail() {
		System.out.println("Inside test login with email");
	}

	@Test
	public void loginwithFacebook() {
		System.out.println("Inside test login with facebook");
		Assert.assertEquals("testString","testString1");
	}
}
