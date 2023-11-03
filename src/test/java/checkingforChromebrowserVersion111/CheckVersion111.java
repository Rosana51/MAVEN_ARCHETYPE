package checkingforChromebrowserVersion111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckVersion111 {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
	options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	
	driver.get("https://www.rediff.com/");

	}

}
