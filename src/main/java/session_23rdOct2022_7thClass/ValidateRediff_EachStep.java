package session_23rdOct2022_7thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateRediff_EachStep {
	public static WebDriver driver;
     // verify and validate Rediff first validate Url,  
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualCurrentUrl = "https://www.rediff.com/";
		String ActualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		String ExpectedTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle) && ActualCurrentUrl.equals(ExpectedCurrentUrl)){
			System.out.println("My Url is correct");
		}else {
			System.out.println("My Url is not correct");	
		}
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		if(signinLink.isEnabled() == true && signinLink.isDisplayed() == true) {
			signinLink.click();
		}else {
			System.out.println("The link is not working");
		}
		
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		if(usernameTextBox.isEnabled() == true && usernameTextBox.isDisplayed() == true) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		}else {
			System.out.println("the username textbox field is not enabled or displayed");
		}
		
		WebElement passwordTexBox = driver.findElement(By.id("password"));
		if (passwordTexBox.isEnabled() == true && passwordTexBox.isDisplayed() == true) {
			passwordTexBox.sendKeys("Selenium@123");	
		}else {
			System.out.println("the password textbox field is not enable or displayed");
		}
		
		WebElement signinButton = driver.findElement(By.name("proceed"));
		if (signinButton.isEnabled() == true && signinButton.isDisplayed() == true) {
			signinButton.click();
		}else {
			System.out.println("The button is not enabled or displayed");
		}

		WebElement logOutLink = driver.findElement(By.className("rd_logout"));
		if (logOutLink.isEnabled() == true && logOutLink.isDisplayed()== true) {
			logOutLink.click();
		}else {
			System.out.println(" The logout link is not enabled or displayed");
		}
		
		WebElement successfulSignOutMessage = driver.findElement(By.xpath("//p[contains (text(), 'You have successfully signed out of Rediffmail')]"));
		if (successfulSignOutMessage.isDisplayed() ==true) {
			System.out.println("Successful signout");
		}else {
			System.out.println("Not a success");
		} 
		
		WebElement RediffHomePageLink = driver.findElement(By.xpath("//b[contains (text (), 'Rediff Home')]"));
		if (RediffHomePageLink.isEnabled() == true && RediffHomePageLink.isDisplayed() == true) {
			RediffHomePageLink.click();
		}else {
			System.out.println("The homepage link is not enabled or displayed");
		}
		
	}
	

}
