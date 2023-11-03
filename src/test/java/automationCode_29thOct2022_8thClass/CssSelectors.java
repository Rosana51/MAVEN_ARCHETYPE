package automationCode_29thOct2022_8thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {
	public static WebDriver driver;

	public static void main(String[] args) {
		//basic CSS Selectors: html[attribute = value]; html#value; html.value; html.value.value.value.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");;
		driver.findElement(By.cssSelector("input.signinbtn")); // do not .click
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.cssSelector("span.ng-tns-c65-11.ui-dropdown-label.ui-inputtext.ui-corner-all.ng-star-inserted"));
		
		driver.quit();
		
		
		
		

	}

}
