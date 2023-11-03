package aCRecordPractice_13thNov2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_Recording { //In class work
	
	public static WebDriver driver;
	public static ChromeOptions options;
	public static Select select;
	
	@Test()
	public static void test() throws Exception {
		
		ScreenRecorderUtil.startRecord("test");
		
		options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Oct");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1978");
		
		driver.quit();
		
		ScreenRecorderUtil.stopRecord();
	}
	
	

}
