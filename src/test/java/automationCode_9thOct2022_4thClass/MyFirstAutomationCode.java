package automationCode_9thOct2022_4thClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstAutomationCode {
	public static WebDriver driver;
	public static WebDriver driver1;
	public static WebDriver driver2;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		driver1 = new FirefoxDriver();
		driver1.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebDriverManager.edgedriver().setup();
		driver2 = new EdgeDriver();
		driver.manage().window().maximize();
		driver2.get("https://www.rediff.com");
		
		driver.quit();
		driver1.quit();
		driver2.quit();
		
	}

}
