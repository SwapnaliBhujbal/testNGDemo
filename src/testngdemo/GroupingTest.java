package testngdemo;

import org.testng.annotations.Test;

public class GroupingTest {
	
	
	@Test(groups= {"performance"})
	public void feature1() {
		System.out.println("Inside feature1");
	}
	
	@Test(groups= {"regression"})
	public void feature2() {
		System.out.println("Inside feature2");
	}
	
	@Test(groups= {"performance","regression"})
	public void feature3() {
		System.out.println("Inside feature3");
	}



}
