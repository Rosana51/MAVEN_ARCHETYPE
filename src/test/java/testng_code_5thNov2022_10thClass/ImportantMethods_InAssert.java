package testng_code_5thNov2022_10thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImportantMethods_InAssert {
	public static WebDriver driver;
	
	@Test
	public void logic1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//use assertion for each WebElement
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		String currentTitle = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		
		Assert.assertEquals(currentTitle, "Rediffmail");
		Assert.assertEquals(currentUrl, "https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Assert.assertTrue(true);
	
		WebElement password = driver.findElement(By.id("password"));
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("Selenium@123");
		//the assertions that are mostly needed are
		Assert.assertTrue(false);//any condition needed
		Assert.assertEquals(false, null);
		//Assert.assertNotEquals(null, null);
		Assert.assertFalse(false);
		Assert.fail();
				
		
		
		
		
	}

}
