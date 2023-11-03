package testNG_code_30thOct2022_9thClass;

import org.testng.annotations.*;
//in line 24 the priority =4, we add invocationCount =5 to run 5 times that test case.

public class Priority_AValue {
	
	@Test (priority = 2)
	public void TestCase1() {
		System.out.println("Test Case 1");
	}
	@Test (priority = 3)
	public void TestCase2() {
		System.out.println("Test Case 2");
	}
	@Test (priority = 1)
	public void TestCase3() {
		System.out.println("Test Case 3");
	}
	@Test (priority = 5)
	public void TestCase4() {
		System.out.println("Test Case 4");
	}
	@Test (priority = 4, invocationCount = 5)
	public void TestCase5() {
		System.out.println("Test Case 5");
	}
	

}
