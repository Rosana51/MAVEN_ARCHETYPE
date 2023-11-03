package session_6thNov2022_11thClass;

public class Understanding_Methods {

	public static void main(String[] args) {
		//The Main Method is an execution engine of Java Class.
		//we don't use method inside the method
		//void is a return type
		//these methods represent the behavior of the object
	} //these examples are non-parameterized methods
	   public int  sumOfTwoNumbers() { //int can be used as an argument to a method.
		   int i=1, j=2;
		   int sum = (i+j);
		   return sum; //I am returning sum which is an integer
	}
	   public String concatenateST() {
		   String S1 = "Hello";
		   String S2 = "12345";
		   String S3 = S1+S2;
		   return S3;
	   }
		public void barking() {
			System.out.println("Dog Barks");	
		}
		public void sleeping() {
			System.out.println("Dog Slepping");

	}

}
