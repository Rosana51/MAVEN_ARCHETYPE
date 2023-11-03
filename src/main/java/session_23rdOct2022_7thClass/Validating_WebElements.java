package session_23rdOct2022_7thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_WebElements {
	public static WebDriver driver;
// TODO Validate Web Elements. isDisplayed(), isEnable(), isSelected.
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[text() ='Forgot password?']"));
		System.out.println(forgotPasswordLink.isDisplayed());
		System.out.println(forgotPasswordLink.isEnabled());
		System.out.println(forgotPasswordLink.isSelected());
		
		if (forgotPasswordLink.isDisplayed() == true) {
			forgotPasswordLink.click();
			//System.out.println("Title of this page : " + driver.getTitle() + "-------" + "CurrentUrl of the page is : " + driver.getCurrentUrl());
			       
		} else { 
			System.out.println("Link is not clickable");
			
		}


		
	}
		
}
