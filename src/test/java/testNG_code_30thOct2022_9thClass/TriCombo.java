package testNG_code_30thOct2022_9thClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo {
//the TriCombo exist for these 3 annotations @BeforeMethod, @Test, @AfterMethod.
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("This is Before Method executing");	
	}
	
	@Test
	public void testcase1() {
		driver.get("https://google.com");
		System.out.println("Test Case Google");
	}
	 
	@Test
	public void testcase2() {
		driver.get("https://amazon.com");
		System.out.println("Test Case Amazon ");
	}
	@Test
	public void testcase3() {
		driver.get("https://rediff.com");
		System.out.println("Test Case Rediff");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method Annotation");
		driver.quit();
	}
	

}
