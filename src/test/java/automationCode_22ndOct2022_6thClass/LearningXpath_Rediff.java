package automationCode_22ndOct2022_6thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningXpath_Rediff {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains (@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains (@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'rd_logout')]")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		
		
		
		

	}

}
