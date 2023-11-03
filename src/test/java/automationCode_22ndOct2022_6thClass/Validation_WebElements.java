package automationCode_22ndOct2022_6thClass;
// It must be used wrong credentials for Negative Testing

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Validation_WebElements {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement usernametextBox = driver.findElement(By.id("login1"));
		System.out.println(usernametextBox.isDisplayed());
		System.out.println(usernametextBox.isEnabled());
		System.out.println(usernametextBox.isSelected());
		
		if (usernametextBox.isDisplayed() && usernametextBox.isEnabled()) {
			usernametextBox.sendKeys("seleniumpanda@rediffmail.com");
		} else {
			System.out.println("username textbox is not working");
		}
	

	}

}
