package automationCode_22ndOct2022_6thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidateRediffMail_Title {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//System.out.println(driver.getCurrentUrl()); // https://mail.rediff.com/cgi-bin/login.cgi
		//System.out.println(driver.getTitle()); // Rediffmail
		String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediffmail"; 
		String expectedTitle = driver.getTitle();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)) {
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		
	}else {
		System.out.println("My Url is not correct");
	}
	
		
		
 
	}

}
