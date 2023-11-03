package automationCode_29thOct2022_8thClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {
       public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	 //Use CSS Selector: html.value.value
	//Copy the path location for the screenshots:
// C:\Users\loren\eclipse-workspace\MAVEN_ARCHETYPE\screenshots
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");

		WebElement owmScreen = driver.findElement(By.cssSelector("div.section.where-to"));
	    File source = owmScreen.getScreenshotAs(OutputType.FILE); //the output is in the form of a file
		File destination = new File(System.getProperty("user.dir")+ "MAVEN_ARCHETYPE\\screenshots\\screenshot1.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://shaadi.com");
		
		WebElement shaadiBanner = driver.findElement(By.xpath("//div[@class = 'css-1k9g704']"));
		File source1 = shaadiBanner.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir")+ "MAVEN_ARCHETYPE\\screenshots\\screenshot2.png");
        FileHandler.copy(source1, destination1);
        
        //File destination1 = new File("C:\\Users\\loren\\eclipse-workspace\\MAVEN_ARCHETYPE\\screenshots\\screenshot2.png");
        //this is my own path, I can not share.To be able to share use (user.dir) 
	}

}
