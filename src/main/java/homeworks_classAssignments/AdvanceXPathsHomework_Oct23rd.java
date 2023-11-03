package homeworks_classAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceXPathsHomework_Oct23rd {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Write five advance XPaths for a parent to a child
		//and five advance XPaths bottom to top.
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.rediff.com/");
		//driver.get("https://wtop.com/"); 
		driver.get("https://www.amazon.com/");
		
		//Ten advance XPaths for Rediff, Money Element
		
		//driver.findElement(By.xpath("//a[@class = 'mailicon']/following-sibling::a[1]"));
		//driver.findElement(By.xpath("//div[@class = 'table']/descendant::a[1]"));
		//driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following-sibling::div[@class = 'logobar']/child::div[@class = 'table']/descendant::a[1]"));
	    //driver.findElement(By.xpath("//div[@class = 'table']/child::div[@class = 'cell']/following-sibling::div[1]/descendant::a[1]"));
	    //driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::div[@class = 'cell']/following-sibling::div[1]/descendant::a[1]"));
		
		//driver.findElement(By.xpath("//div[@id ='red_container_main']/preceding-sibling::div[@class = 'navbar']/preceding-sibling::div[@class = 'logobar']/descendant::a[2]"));
		//driver.findElement(By.xpath("//a[@class = 'vdicon']/preceding-sibling::a[2]"));
		//driver.findElement(By.xpath("//div[@class = 'navbar']/preceding-sibling::div[@class = 'srchbar clear-fix relative']/preceding::a[@class = 'moneyicon relative']"));
		//driver.findElement(By.xpath("//div[@id = 'red_container_main']/preceding-sibling::div[@class = 'srchbar clear-fix relative']/preceding::a[@class = 'moneyicon relative']"));
       // driver.findElement(By.xpath("//div[@class = 'firstrow']/preceding::a[@class = 'moneyicon relative']"));
        
		//Write Ten Advance XPaths for WTOPnews, News link Element
	
		//driver.findElement(By.xpath("//div[@id ='nav-search']/child::nav[1]/descendant::a[1]"));
		//driver.findElement(By.xpath("//div[@id ='nav-search']/child::nav[1]/descendant::a[@class = 'Nav-link'][1]"));
		//driver.findElement(By.xpath("//div[@class ='container__inner']/child::div[@id = 'nav-search']/descendant::a[@class = 'Nav-link'][1"));
		//driver.findElement(By.xpath("//div[@class ='container__inner']/child::div[@id = 'nav-search']/descendant::a[1]"));
		//driver.findElement(By.xpath("//div[@id ='site-alerts-homepage']/following-sibling::div[1]/child::div[@class = 'container__inner']/child::div[@id = 'nav-search']/descendant::a[1]"));
		
		//driver.findElement(By.xpath("//div[@class = 'search']/preceding-sibling::nav[1]/descendant::a[@class = 'Nav-link'][1]"));
		//driver.findElement(By.xpath("//div[@class = 'search']/preceding::a[@class = 'Nav-link'][1]"));
		//driver.findElement(By.xpath("//link[@id = 'subheads-css']/preceding::div[@id = 'listen-live-container']/ancestor::div[@id = 'header-audio-player']/preceding::a[@class = 'Nav-link'][1]"));
		//driver.findElement(By.xpath("//div[@id = 'header-audio-player']/preceding::div[@class= 'search']/preceding::a[@class = 'Nav-link'][1]"));
		//driver.findElement(By.xpath("//form[@class = 'search-form']/ancestor::div[@class ='search']/preceding::a[@class = 'Nav-link'][1]"));
		
		//Write Ten Advance XPhaths for Amazon, All element.
		
		//driver.findElement(By.xpath("//div[@class = 'nav-left']/child::a[1]/descendant::span[1]"));
		//driver.findElement(By.xpath("//div[@id='nav-main']/descendant::a[@id = 'nav-hamburger-menu'][1]/descendant::span[1]"));
		//driver.findElement(By.xpath("//div[@id='nav-main']/descendant::a[@id = 'nav-hamburger-menu'][1]/descendant::span[@class = 'hm-icon-label']"));
		//driver.findElement(By.xpath("//div[@id = 'navbar']/child::div[@id = 'nav-main']/descendant::a[@id = 'nav-hamburger-menu']/descendant::span[1]"));
		//driver.findElement(By.xpath("//a[@id = 'nav-top']/following-sibling::header[@id = 'navbar-main']/descendant::div[@id = 'nav-main']/descendant::span[1]"));
		//driver.findElement(By.xpath("//div[@id= 'a-page']/descendant::header[@id = 'navbar-main'][1]/descendant::a[@id = 'nav-hamburger-menu']/descendant::span[1]"));
		
		//driver.findElement(By.xpath("//div[@id = 'nav-shop'][1]/preceding::span[1]"));
		//driver.findElement(By.xpath("//div[@id = 'nav-xshop-container'][1]/preceding::span[1]"));
		//driver.findElement(By.xpath("//div[@id = 'nav-progressive-subnav']/preceding::div[@id = 'nav-xshop-container'][1]/preceding::span[1]"));
		//driver.findElement(By.xpath("//a[@id = 'skippedLink']/preceding::div[@id = 'nav-progressive-subnav']/preceding::div[@id = 'nav-xshop-container'][1]/preceding::span[1]"));
		//driver.findElement(By.xpath("//div[@id = 'pageContent']/preceding::div[@id = 'nav-shop'][1]/preceding::span[1]"));
		//driver.findElement(By.xpath("//div[@id = 'gw-layout']/ancestor::div[@id = 'pageContent'][1]/preceding::div[@id = 'nav-progressive-subnav'][1]/preceding::span[1]"));
		

		
		
	}

}
