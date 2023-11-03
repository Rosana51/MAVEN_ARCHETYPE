package javaSession_20thNov2022_15thClass;

//Abstraction means hiding internal implementation and just highlighting the setup services.
//Abstraction in Java can be achieved by 2 ways; abstract and Interface.
//Abstract:Class can give zero to one hundred abstraction [0 to 100%]
//Interface: can give hundred percent of abstraction(Web driver is an interface it is secure)
//Unimplemented methods do not have a body, they are also called abstract methods.
//Abstract Class can have both abstract unimplemented methods and normal methods.
//Abstract method can only reside inside an Abstract Class.

public abstract class Abstraction_Concept { //make the class an abstract Class.
	String student_name; //declare globally student age and name.
	int student_age;

//private String student_bankaccount;cannot create an abstract class private it can't be called.
//private scope is within the Class, it cannot be accessed outside this Class.
		public static void displayLogic0() { //Static enjoys the privilege of of the Mother Class.
			System.out.println("This is a normal static method");
		}
		public void displayLogic1() {
			System.out.println("This is a normal method");
		}
		public abstract void displayLogic2();
		
	    public abstract void displayLogic3();
	    
	   // private abstract void displayLogic4();
	//we cannot have private abstract method. Neither a private static abstract method. 
	    
	    protected abstract void displayLogic5(); 
	    
	    abstract void displayLogic6();
	    
	    
	    }
		
		
