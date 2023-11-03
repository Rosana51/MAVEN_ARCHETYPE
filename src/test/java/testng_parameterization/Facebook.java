package testng_parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	public static WebDriver driver;
	public static Select select;
	//public static ChromeOptions options;
	
	@Test
	@Parameters({"urlf", "firstname", "lastname", "email", "passwordf"})
	public void createAccount(String urlf, String firstname, String lastname, String email, String passwordf) throws Exception {
	driver = new ChromeDriver();
	driver.get(urlf);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name = firstname]")).sendKeys(firstname);
	driver.findElement(By.cssSelector("input[name = lastname]")).sendKeys(lastname);
	driver.findElement(By.name("reg_email__")).sendKeys(email);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
	driver.findElement(By.id("password_step_input")).sendKeys(passwordf);
	
	
	
	
	}
	

}
