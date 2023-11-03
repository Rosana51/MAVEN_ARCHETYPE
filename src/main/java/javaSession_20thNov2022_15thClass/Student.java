package javaSession_20thNov2022_15thClass;

public class Student extends Abstraction_Concept {

	public static void main(String[] args) {
//*** we cannot create the Object of the Abstract Class, line 7.***
	//	Abstraction_Concept ac = new Abstraction_Concept();
// or cannot create the Object of the interface, line 9.
	//	WebDriver driver = new WebDriver();
		
// We can pull logic1 because is not an abstract method is a simple method.
//display Logic2, Logic3, Logic5, and Logic6 are child Class, Abstraction_Concept is Parent.
	    Student st = new Student();
		st.displayLogic0(); //cannot pull off Logic0 because it's static method.    
		st.displayLogic1();
		st.displayLogic2();
		st.displayLogic3();
		st.displayLogic5();
		st.displayLogic6();
		st.student_age = 5;
		st.student_name = "Bob";
	
		
// the Abstract concept Class can refer to the Object Student Class.Parent can ref to Child.
// but Student Class cannot refer to the Abstract Class because is a Child Class.
	Abstraction_Concept	ref = new Student();
		ref.displayLogic3();
		
	}

	@Override
	public void displayLogic2() {
		System.out.println("child display logic 2");
		
	}

	@Override
	public void displayLogic3() {
		System.out.println("child display logic 3");	
		
	}

	@Override
	protected void displayLogic5() {
		System.out.println("child display logic 5");	
		
	}

	@Override
	void displayLogic6() {
		System.out.println("child display logic 6");
		
	}

}
