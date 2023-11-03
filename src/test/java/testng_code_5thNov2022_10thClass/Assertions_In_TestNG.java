package testng_code_5thNov2022_10thClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_In_TestNG {
//Assertions - is to verify that the expected result and the actual result matched or not.
//There are two types of assertion Soft Assert and Hard Assert.
	
	@Test(priority = 1)
	public void program1() {
		System.out.println(10/2);
		System.out.println("B is an alphabet");
		Assert.assertTrue(2<3); //as long as assertion is passing, the control will move on.
		System.out.println(5 + 7);
		Assert.assertTrue(true);
	}
	@Test(priority = 2)
	public void logic1() {
		System.out.println("Hello World");
	}
		
		
	
	}
