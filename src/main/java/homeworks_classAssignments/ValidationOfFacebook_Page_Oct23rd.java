package homeworks_classAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationOfFacebook_Page_Oct23rd {
	
    public static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text (), 'Create new account')]")).click();
		//driver.findElement(By.name("//input[@name = 'firstname']")).sendKeys("Bella");
		//driver.findElement(By.name("//input[@name = 'lastname']")).sendKeys("Besos");
		//driver.findElement(By.name("//input[@ name = 'reg_email__']")).sendKeys("kunfupanda@321");
		//driver.findElement(By.name("//input[@ name = 'reg_passwd__']")).sendKeys("Kpanda123");
		String ActualCurrentUrl = "https://www.facebook.com/";
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		String ExpectedTitle = driver.getTitle();
		
		if (ActualTitle.equals(ExpectedTitle) && ActualCurrentUrl.equals(ExpectedCurrentUrl)) {
			System.out.println("My url is correct");
		}else {
			System.out.println("My url is not correct");
		}
		
		WebElement CreateNewAccountButton = driver.findElement(By.xpath("//a[contains(text (), 'Create new account')]"));
		if (CreateNewAccountButton.isEnabled() == true && CreateNewAccountButton.isDisplayed() == true) {
			CreateNewAccountButton.click();
		}else { 
			System.out.println("Create New Account Button is not working");	
		}
		
		WebElement FirstnameTextBox =  driver.findElement(By.name("//input[@name = 'firstname']"));
		if (FirstnameTextBox.isEnabled() == true && FirstnameTextBox.isDisplayed() == true) {
			FirstnameTextBox.sendKeys("Bella");
		}else { 
			System.out.println("The First name textbox is not enabled or displayed");
		}
		
		WebElement LastnameTextBox = driver.findElement(By.name("//input[@name = 'lastname']"));
		if (LastnameTextBox.isEnabled() == true && LastnameTextBox.isDisplayed() == true) {
			LastnameTextBox.sendKeys("Besos");
		}else {
			System.out.println("The Last name textbox is not enabled or displayed");
		}
		
		WebElement MobileNumberOrEmailTextBox = driver.findElement(By.name("//input[@name = 'reg_email__']"));
		if (MobileNumberOrEmailTextBox.isEnabled() == true && MobileNumberOrEmailTextBox.isDisplayed() == true) {
			MobileNumberOrEmailTextBox.sendKeys("kunfupanda@321");
		}else { 
			System.out.println("The Mobile number or email TextBox is not enabled or displayed");
		}
		
		WebElement NewPasswordTextBox = driver.findElement(By.name("//input[@name = 'reg_passwd__']"));
		if (NewPasswordTextBox.isEnabled() == true && NewPasswordTextBox.isDisplayed() == true) {
			NewPasswordTextBox.sendKeys("Kpanda123");
		}else {
			System.out.println("The New password TextBox is not enabled or displayed");
		}

	}
	
}

