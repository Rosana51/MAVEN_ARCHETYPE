package testNG_code_30thOct2022_9thClass;

import org.testng.annotations.*;

//Write 5 Test Cases, give priority values, and skip the a test case by declaring False.
public class Enabled_Operation {
	
	@Test(priority = 2, enabled = true)
	public void Tc1() {
		System.out.println("Test Case 1");
	}
	@Test(priority = 3)
	public void Tc2() {
		System.out.println("Test Case 2");
}
	@Test(priority = 1)
	public void Tc3() {
		System.out.println("Test Case 3");
	}
	@Test(priority = 5, enabled = false )
	public void Tc4() {
	System.out.println("Test Case 4");
	}
	
	@Test(priority = 4)
	public void Tc5() {
			System.out.println("Test Case 5");
		}
}