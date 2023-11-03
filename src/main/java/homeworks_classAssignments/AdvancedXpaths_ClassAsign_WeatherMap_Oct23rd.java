package homeworks_classAssignments;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
//Class practice write nine advance XPaths for a parent to a child
//write nine advance XPaths bottom to top.

public class AdvancedXpaths_ClassAsign_WeatherMap_Oct23rd {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openweathermap.org/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//li[@class = 'logo']/a/img"));
		//driver.findElement(By.xpath("//li[@class = 'logo']/descendant::img[1]"));
		//driver.findElement(By.xpath("//ul[@id = 'first-level-nav']/descendant::img[1]"));
		//driver.findElement(By.xpath("//nav[@id = 'nav-website']/descendant::img[1]"));
		//driver.findElement(By.xpath("//nav[@id = 'nav-website']/child::ul[1]/child::li[1]/descendant::img[1]"));
		//driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::nav[1]/descendant::img[1]"));
		//driver.findElement(By.xpath("//body[@class = 'body-orange']/child::nav[1]/descendant::img[1]"));
		//driver.findElement(By.xpath("//body[@class = 'body-orange']/child::style[1]/following-sibling::nav[1]/descendant::img[1]"));
		
		//driver.findElement(By.xpath("//li[@id = 'hamburger']/preceding::img[1]"));
		//driver.findElement(By.xpath("//li[@id = 'hamburger']/preceding-sibling::li[1]/descendant::img[1]"));
		//driver.findElement(By.xpath("//div[@id = 'desktop-menu']/preceding-sibling::li[1]/preceding::img[1]"));
		//driver.findElement(By.xpath("//div[@id = 'desktop-menu']/preceding-sibling::li[@id = 'hamburger']/preceding::img[1]"));
		//driver.findElement(By.xpath("//div[@id = 'topcontrol']/preceding-sibling::main[@class = 'wrapper']/preceding::img[2]"));
		//driver.findElement(By.xpath("//div[@id = 'footer-website']/preceding-sibling::nav[@id = 'nav-website']/child::ul[1]/descendant::img[1]"));
		//driver.findElement(By.xpath("//ul[@id = 'mobile-menu']/preceding-sibling::ul[@id = 'first-level-nav']/child::li[1]/descendant::img[1]"));
        //driver.findElement(By.xpath("//div[@class = 'owm-loader-container']/preceding::ul[@id = 'mobile-menu']/preceding::li[@id ='hamburger']/preceding::img[1]"));
	}

}
