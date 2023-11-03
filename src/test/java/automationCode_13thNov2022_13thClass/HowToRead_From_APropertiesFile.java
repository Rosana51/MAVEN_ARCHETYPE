package automationCode_13thNov2022_13thClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToRead_From_APropertiesFile {
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	//create properties file, on the config.properties file	
	String path = System.getProperty("user.dir") + "\\src\\test\\java\\automationCode_13thNov2022_13thClass\\config.properties";
	System.out.println(System.getProperty("user.dir"));
    prop = new Properties();//Pass a parameter (the path). on the constructor of FileInputStream
	ip = new FileInputStream(path); 
	prop.load(ip); // this is how we will understand the property file.
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("usernameXpath"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("passwordXpath"));
	System.out.println(prop.getProperty("password"));
	System.out.println(prop.getProperty("signinButtonXpath"));
	
	//we could utilize this property file in the WebDriver code?
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("username"));
	driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath(prop.getProperty("signinButtonXpath"))).click();
	
	
	

}
}
	
//C:\Users\loren\eclipse-workspace\MAVEN_ARCHETYPE\src\test\java\automationCode_13thNov2022_13thClass\config.properties