package automationCode_20thNov2022_15thClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://rediff.com");
		
		List<WebElement> RediffScriptTags = driver.findElements(By.tagName("script"));
		System.out.println("Total number of webelements with Script tagnames are : " + RediffScriptTags.size());
		//The total number of Webelements with Script tagnames are 25. 
		
		List<WebElement>RediffLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in this page : " + RediffLinks.size());
		//Total number of Links in this page : 262
		
		 //What if we want to pick the 100th link
	    WebElement OneHundredLink = RediffLinks.get(99); //The indexing starts from zero.
	    System.out.println(OneHundredLink.getText()); //it prints NEWS the value of news is 100
	    System.out.println(OneHundredLink.getAttribute("href"));//it prints the link address.
	 
	    //Find the coordinate axis of the 100th link.
	    System.out.println(OneHundredLink.getLocation().x + " , " + OneHundredLink.getLocation().y);
	    //It prints the value of x 962 and the value of y 1545
	    
	    //Click on the 100th Link
	    OneHundredLink.click();
	    
	   //Write a for loop to print the names of the 251 number of links in this page.
	    //click on the links that are active.
	  //  Thread.sleep(2000);
	   // driver.navigate().back();
	    for(int i=0; i<RediffLinks.size(); i++) {
	    	WebElement TotalLinks = RediffLinks.get(i);
	    	System.out.println(TotalLinks.getText() + "-----" + TotalLinks.isDisplayed());
	    	
	    	//if (TotalLinks.isDisplayed() == true) {
	    		//TotalLinks.click();  
	    		}
	    	} 
	

	}


