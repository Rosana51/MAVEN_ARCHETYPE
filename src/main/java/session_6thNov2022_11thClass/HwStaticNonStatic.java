package session_6thNov2022_11thClass;

public class HwStaticNonStatic {
//create 10 classes 5 static, 5 non static. Each class should have e different Objects
//Call using object reference and directly.
	public static void main(String[] args) {
		System.out.println("This is the main Method");
	
		HwStaticNonStatic Romeo = new HwStaticNonStatic(); //Create the Object of the class
		Romeo.eating(); //using HwStaticNonStatic Romeo = new HwStaticNonStatic
		Romeo.playing();
		Romeo.sleeping();
		Romeo.biting();
		Romeo.running();
		HwStaticNonStatic.logic6();
		HwStaticNonStatic.logic7();
		HwStaticNonStatic.logic8(); //call using Object reference
		logic9();
		logic10(); //called directly
		
	}
	
	public void eating() {
		System.out.println("Romeo Barks");
	}
	public void playing() {
		System.out.println("Romeo Plays");
	}
	public void sleeping() {
		System.out.println("Romeo Sleeps");
	}
	public void biting() {
		System.out.println("Romeo Bites");
	}
	public void running() {
		System.out.println("Romeo Runs");
	}
	public static void logic6() {
		System.out.println("I have coding logic6");
	}
	public static void logic7() {
		System.out.println("I have coding logic7");
	}
	public static void logic8() {
		System.out.println("I have coding logic8");
	}
	public static void logic9() {
	System.out.println("I have coding logic9");
	}
	public static void logic10() {
		System.out.println("I have coding logic10");
	}
}
