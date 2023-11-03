package testNG_code_30thOct2022_9thClass;

import org.testng.Assert;
import org.testng.annotations.*;

//Dependency is used, if one test case doesn't pass the others will be skipped.
//Write Assert.fail to fail test case 1.
public class Dependency_Operations {
	@Test()
	public void Tc1() {
		System.out.println("Test Case 1");
		Assert.fail("Purposely to Fail");
	}
	@Test(dependsOnMethods = "Tc1")
	public void Tc2() {
		System.out.println("Test Case 2");
	}
	@Test(dependsOnMethods = {"Tc1", "Tc2"})
	public void Tc3() {
		System.out.println("Test Case 3");
	}
	@Test(dependsOnMethods =  {"Tc1", "Tc2","Tc3"} )
	public void Tc4() {
		System.out.println("Test Case 4");
	}
	@Test(dependsOnMethods = {"Tc1", "Tc2","Tc3", "Tc4"})
	public void Tc5() {
		System.out.println("Test Case 5");
	}
	}
 

