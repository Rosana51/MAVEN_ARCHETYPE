package automationCode_29thOct2022_8thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_DropDown_Facebook{
	public static WebDriver driver;
	public static Select select;
    public static ChromeOptions options;
    
	public static void main(String[] args) {
	options = new ChromeOptions();
	options.addArguments("--incognito");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[contains(text (), 'Create new account')]")).click();
	driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
	driver.findElement(By.name("lastname")).sendKeys("Panda");
	driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
	//now create the object of the class
	select = new Select(driver.findElement(By.id("month")));
	// use selectByVisibleText(string text)
	select.selectByVisibleText("May");
	
	select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("25");
	
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1995");
	
	//select = new Select(driver.findElement(By.id("u_2_4_+Y")));
	//select.selectByVisibleText("_58mt");
	// how to select the gender???????????????????????????????
	
	
	

	}

}
