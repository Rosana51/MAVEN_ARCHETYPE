package automationCode_13thNov2022_13thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Rediff_Recording {
	public static WebDriver driver;
	
	@Test(invocationCount = 2)
	public static void test() throws Exception {
		
	ScreenRecorderUtil.startRecord("test");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
	driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
	//driver.findElement(By.xpath("//a[contains(@class, 'rd_logout')]")).click();
	//driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click(); 
	//run the test without line 26 and 27. The test passed.
	driver.quit();
	
	ScreenRecorderUtil.stopRecord();
	}

}
