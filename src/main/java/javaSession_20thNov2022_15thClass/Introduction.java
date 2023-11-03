package javaSession_20thNov2022_15thClass;
//Interface is 100% abstraction. All of the unimplemented methods or abstract methods, 
//inside an Interface ARE by default public and abstract by nature.
public interface Introduction {
	
	                void display(); // by default this is public and abstract.
	public abstract void display1(); //these methods examples are both the same.
	
//how to declare variables in interface? by default this Variables inside an interface
//is public, static, and final.in these examples these methods are the same.
	              int i = 10; //public static and final.
	public static int j = 20; //final means something we cannot Change.
//Once is final it cannot be changed. in this case if you print the the value is
	
               //int a = 20; 
                // a = 5; // here the value is a is 20 its final it cannot change to be 5.
               
//to execute a For Loop we need to create a method. When creating a method inside interface
//we need to add the default keyword, its only allowed only to create a method within interface.
//But inside the Class, we cannot use the default keyword to create a method.
        default void someThing() {     //create a method      
	    for(int b = 1 ; b < 10; b++) {
	    	System.out.println(b);
	}
  }
        
 //we can create a public STATIC method, but its allowed on [JavaSE-1.8]not below.
 // but it has to be public. In Java 9 its allowed private. default non-static methods are allowed in interface.
        public static void turnUp() {
        	
        }
}

