package automationCode_20thNov2022_15thClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concepts_MOE {
	public static WebDriver driver;

	public static void main(String[] args) {
		//Determine how many tag names are with the given name script:
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://cnn.com");
		                                     //it returns a list of all matching WebElements
	    List<WebElement> CNNScriptTags = driver.findElements(By.tagName("script"));

	    System.out.println("Total number of Webelements with Script tagnames are : " + CNNScriptTags.size());
		//It returns the total number of Webelements with Script tagnames; 113
	    
	    List<WebElement> CNNLinks = driver.findElements(By.tagName("a"));	
	    System.out.println("Total number of links in this page: " + CNNLinks.size());
	  //It returns the total number of links in this page: 565
	    
	}

}
