package homeworks_Assignments;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oct29th_8thClass_Make5screenshots {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//Make 5 screenshots of different Websites banners
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.trabel.com/");
		

		WebElement trabelImage =  driver.findElement(By.cssSelector("img.background-image"));
		File source = trabelImage.getScreenshotAs(OutputType.FILE); 
		File destination = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\Asgmt5screenshoots1.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.art.com/");
		WebElement artImage =  driver.findElement(By.cssSelector("div.landing-container"));
		File source1 = artImage.getScreenshotAs(OutputType.FILE); 
		File destination1 = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\Asgmt5screenshoots2.png");
		FileHandler.copy(source1, destination1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.nationalgeographic.com/");
		WebElement imageWrapper = driver.findElement(By.cssSelector("a.AnchorLink.Image__Wrapper.Image__Wrapper--relative"));
		File source2 = imageWrapper.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\Asgmt5screenshoots3.png");
		FileHandler.copy(source2, destination2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://ourplanet.com/en/");
		WebElement Wrapper = driver.findElement(By.xpath("//div[@class = 'wrapper']"));
		File source3 = Wrapper.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\Asgmt5screenshoots4.png");
		FileHandler.copy(source3, destination3);
			
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://openweathermap.org/");
		WebElement Image = driver.findElement(By.cssSelector("div.section.where-to"));
		File source4 = Image.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\Asgmt5screenshoots5.png");
		FileHandler.copy(source4, destination4);
	
		
	}

}
