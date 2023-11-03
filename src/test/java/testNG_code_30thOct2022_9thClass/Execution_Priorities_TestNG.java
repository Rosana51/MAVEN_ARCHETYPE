package testNG_code_30thOct2022_9thClass;

import org.testng.annotations.*;

public class Execution_Priorities_TestNG {
	
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("Testing @BeforeSuite annotation");
	}
		
	@BeforeTest
	public void beforeTest () {
	    System.out.println("Testing @BeforeTest annotation");
	}
	    
	 @BeforeClass
	 public void beforeClass () {
		System.out.println("Testing @BeforeClass annotation");
	}
	 @BeforeMethod
	 public void beforeMethod () {
		System.out.println("Testing @BeforeMethod annotation");
	}
	 
	@Test
	public void testcase()  {
		System.out.println("My code is working fine");
	}
	
	@AfterSuite
	public void afterSuite () {
		System.out.println("Testing @AfterSuite annotation");
	}
		
	@AfterTest
	public void afterTest () {
	    System.out.println("Testing @AfterTest annotation");
	}
	    
	 @AfterClass
	 public void afterClass () {
		System.out.println("Testing @AfterClass annotation");
	}
	 @AfterMethod
	 public void afterMethod () {
		System.out.println("Testing @AfterMethod annotation");


}
}
