package javaSession_20thNov2022_15thClass;
//to inherit another class, we can extend the abstract class but we type implements instead.

public class Evaluate extends Abstraction_Concept implements Introduction, IntroductionPart2{
//make the Class abstract or add all of the unimplemented methods 
//this is multiple inheritance. A normal class can extend an Abstract Class and interface as well.
	public static void main(String[] args) {
	    Evaluate ev = new Evaluate(); //create the Object of the Class
	    ev.display();
	    ev.display1();//we can call the someThing method.
	    ev.someThing(); //but cannot call turnUp method because is static .
	   Introduction intro = new Evaluate(); 

	}

@Override
public void display() {
	System.out.println("this is display");
	
}

@Override
public void display1() {
    System.out.println("this is display1");	
}
@Override
public void displayLogic2() {
	
	
}

@Override
public void displayLogic3() {
	
	
}

@Override
protected void displayLogic5() {
	
	
}

@Override
void displayLogic6() {

	
}

@Override
public void launchUrl() {
	
}

@Override
public void tearDown() {
	
}

}
