package automationCode_29thOct2022_8thClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts_PopUps {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("proceed")).click();
		
		// How to handle alerts in interface
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Text of the alert is : " + text); //prints: Please enter a valid user name
		
		if(text.equals(" Please enter a valid user name")) {
		Thread.sleep(2000); //to see the alert
		alert.accept();
		}else {
			alert.dismiss();
		} 
		Thread.sleep(2000); 
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	

	}

}
