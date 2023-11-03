package testNG_code_30thOct2022_9thClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAroundTng {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void setUp() {
		driver.get("https://rediff.com");
	}
	
	@Test
	public void ClickOnSignInLink () {
		driver.findElement(By.className("signin")).click();
	}

	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
