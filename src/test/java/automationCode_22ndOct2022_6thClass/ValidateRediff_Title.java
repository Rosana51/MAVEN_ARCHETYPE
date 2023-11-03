package automationCode_22ndOct2022_6thClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidateRediff_Title {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com/");
				
		String actualCurrentUrl = "https://www.rediff.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedCurrentTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.get("https://www.rediff.com/");
		}else {
			driver.get("https://www.google.com/");
		}

		driver.quit();
		
		

	}

}
