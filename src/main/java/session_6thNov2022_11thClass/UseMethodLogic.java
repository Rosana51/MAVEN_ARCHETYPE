package session_6thNov2022_11thClass;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//In Class Work:Make 10 Methods. Static and non-static. Create the Object of the Class.
public class UseMethodLogic {

	public static void main(String[] args) {
    System.out.println("This is the main method");
    UseMethodLogic.logic1(); //call by class name 
    UseMethodLogic.logic2();
    UseMethodLogic.logic3();
    logic4();  // Call directly
    logic5();
    logic6();
    UseMethodLogic objref = new UseMethodLogic();
    objref.logic7();
    objref.logic8();
    objref.logic9();
    objref.logic10();
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://google.com");
	}
	public static void logic1() {
		System.out.println("I have coding logic1");
	}
	public static void logic2() {
		System.out.println("I have coding logic2");
	}
	public static void logic3() {
		System.out.println("I have coding logic3");
	}
	public static void logic4() {
		System.out.println("I have coding logic4");
	}
	public static void logic5() {
		System.out.println("I have coding logic5");
	}
	public static void logic6() {
		System.out.println("I have coding logic6");	
	} 
	public void logic7() {
		System.out.println("I have coding logic7");
	}
	public void logic8() {
		System.out.println("I have coding logic8");
	}
	public void logic9() {
		System.out.println("I have coding logic9");
	}
	public void logic10() {
		System.out.println("I have coding logic10");
	}

	
}
