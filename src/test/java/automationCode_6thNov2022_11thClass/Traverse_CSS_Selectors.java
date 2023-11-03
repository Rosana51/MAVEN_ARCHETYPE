package automationCode_6thNov2022_11thClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//traverse in CSS Selectors use the following symbols: # harsh
//the (>) use for a child, the (+) go to the next sibling, the (:) to mark
//the ((1)) for indexing, give (space) for a direct descendant??.
public class Traverse_CSS_Selectors {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	}
		
	
	@Test
	public void clickOnSignIn() {
		driver.findElement(By.cssSelector("div.table>div:nth-child(1)+div+div>p>a.signin:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div#div_login_error+div>div>div+div>input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(1)+div>div:nth-child(1)+div>div:nth-child(1)+div>div:nth-child(1)>input#password:nth-child(1)")).sendKeys("Selenium@123");
		
		
	}
	@AfterTest
	public void tearDown() {
		
	}
	

}
