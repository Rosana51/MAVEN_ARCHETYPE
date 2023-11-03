package automationCode_6thNov2022_11thClass;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//Use new selectors: Near, toRightOf, toLeftof, above, and below.
//Create 2 classes - WebDriverCod
//Rediff code full using cssSelectors. CreateAccount for tutuorialsninja.com using cssSelectors
//use SoftAssert and WebDriverWait wherever applicable
public class Hw_CSS_Selectors_Rediff_tutorialsninja {
	
	public static WebDriver driver;
	
	@Test
	public void checkingNewLocators()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("div.form-group+div input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]")).click();
		
		//Thread.sleep(4000);
		WebElement referencePoint = driver.findElement(By.xpath("//legend[contains(text(),  'Your Personal Details')]"));
		//above
		String MyAccountInformationText = driver.findElement(with(By.tagName("h1")).above(referencePoint)).getText();
		System.out.println(MyAccountInformationText);
		//below
		String FirstNameText = driver.findElement(with(By.tagName("label")).below(referencePoint)).getText();
		System.out.println(FirstNameText);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
	    //WebElement for: Sign in Button, input text box.
		WebElement RefPoint = driver.findElement(By.cssSelector("input#password"));
		
	    //toRightOf
		WebElement SignInButton = driver.findElement(with(By.tagName("input")).toRightOf(RefPoint));
		System.out.println(SignInButton);
		
		//toLeftOf
		WebElement PasswordText = driver.findElement(with(By.tagName("p")).toLeftOf(RefPoint));
		System.out.println(PasswordText);
		
		//below
		WebElement ForgotPasswordLink = driver.findElement(with(By.tagName("u")).below(RefPoint));
		System.out.println(ForgotPasswordLink);
		
		//near
		WebElement KeepMeSignedInText = driver.findElement(with(By.tagName("label")).near(RefPoint));
		System.out.println(KeepMeSignedInText);
		
	}

	

}
