package testng_code_5thNov2022_10thClass;

import org.testng.annotations.*;

public class Enable_vs_AlwaysRun {
	//since we declare enable = false in test case 1 this will disable the test
	// doesn't matter if we declare alwaysRun=true
	@Test(priority = 1, alwaysRun = true, enabled = false)
	public void logic1() {
		System.out.println("First Logic");
	}
	@Test(priority = 2, dependsOnMethods = "logic1")
	public void logic2() {
		System.out.println("Second Logic");
	}
	@Test(priority = 3, dependsOnMethods = {"logic1", "logic2" })
	public void logic3() {
		System.out.println("Thrird Logic");
		
	}
	

}
