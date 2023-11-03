package automationCode_29thOct2022_8thClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
	public static WebDriver driver;
    // driver.get means that it waits for the whole page to load it takes time.
	// driver.navigate means that it moves to the next tab is faster
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.costco.com");
		
		openWindow();
		
		driver.quit();
		
	}
	
	static void openWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://easemytrip.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://facebook.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://cnn.com");
		
		driver.quit();
	}

}
