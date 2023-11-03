package automationCode_22ndOct2022_6thClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
    driver.findElement(By.name("proceed")).click();
    driver.findElement(By.className("rd_logout")).click();
		
	}

}
