package session_6thNov2022_11thClass;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingMethodLogic {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		//To execute the 3 static methods. 
		UsingMethodLogic.logic1(); //We can use the name of the class
		UsingMethodLogic.logic2();
		UsingMethodLogic.logic3();
		logic1();  //or call directly
		logic2();
		logic3();
		UsingMethodLogic objref = new UsingMethodLogic();
		objref.logic4();
	
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();//we create the Object of the class
	    driver.get("https://google.com");//using  ChromeDriver driver = new ChromeDriver(); 
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
    //the logic4 can't be executed because it is not a static method
//We need to create the object by using object reference
    public void logic4() {
    	System.out.println("I have coding logic4");
    }
}
