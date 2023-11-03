package automationCode_6thNov2022_11thClass;
//type this import line because it is not available to import
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NewSelectors_Selenium4 {
//near, toRighof, toleftof, above and below
	
	public static WebDriver driver;
	
	@Test
	public void checkingNewLocators() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text (), 'Create new account')]")).click();
		//add tread.sleep to give time.
		Thread.sleep(3000);
		//reference point.
		WebElement referencePoint = driver.findElement(By.cssSelector("input[name = firstname]"));
		
		//this String is for above
		String QuickandEasyText = driver.findElement(with(By.tagName("div")).above(referencePoint)).getText();
		System.out.println(QuickandEasyText);
		
		//String for toRighof
		String LastnameTextBox = driver.findElement(with(By.tagName("input")).toRightOf(referencePoint)).getText();
		System.out.println(LastnameTextBox);
		
		//String for below
		String MovileNumberOrEmailTextBox = driver.findElement(with(By.tagName("input")).below(referencePoint)).getText();
		System.out.println(MovileNumberOrEmailTextBox);
		
		
	//Switch to a new window. open Rediff and inspect password text Box.
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	//Reference Point	
		WebElement refPoint = driver.findElement(By.cssSelector("input#password"));
		
	//String for toLeftof
		String PasswordText = driver.findElement(with(By.tagName("p")).toLeftOf(refPoint)).getText();
		System.out.println(PasswordText);
		
	//String for near it did not work with string. It did with WebElement. near.
		WebElement EyeIcon = driver.findElement(with(By.tagName("em")).near(refPoint));
		System.out.println(EyeIcon);
		
	//Web Element toRightof
		WebElement SignInButton = driver.findElement(with(By.tagName("input")).near(refPoint));
		SignInButton.click();
		System.out.println(SignInButton);
		
	}
	
}
