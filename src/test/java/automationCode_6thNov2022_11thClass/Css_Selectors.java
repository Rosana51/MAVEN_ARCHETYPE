package automationCode_6thNov2022_11thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selectors {
	public static WebDriver driver;
	//basic syntax of CSS Selector html[attribute = value] or html.value or .value
	//CSS Selector compound values. html.value1.value2. or .value1.value2
	//these are different CSS Selector values and it only works if it is unique 1 of 1.
	@BeforeTest
	public void launchUrl() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
		
	}//to give time to go back from the Money page to the Sign in page. Add thread sleep.
	@Test
	public void clickOnSignIn() throws Exception{
	driver.findElement(By.cssSelector("a.moneyicon.relative")).click();
	driver.navigate().back();
	Thread.sleep(3000);
    driver.findElement(By.cssSelector("a[class = 'signin']")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input[name = 'proceed']")).click();
	driver.findElement(By.cssSelector("a.rd_logout")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}
	//this is XPath for Rediff Home link //b[contains(text(), 'Rediff Home')]
	//can't write a Css Selector for Rediff Home link
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
		
	}

}
