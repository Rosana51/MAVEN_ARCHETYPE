package automationCode_22ndOct2022_6thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Validation_WebElement_NegativeTesting {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@1234");
		driver.findElement(By.name("proceed")).click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']"));
		
		System.out.println(errorMessage.getText());
		
		

	}

}
