package session_6thNov2022_11thClass;

public class Parameterized_Methods {
   int age = 10;  // we are declaring these variables at a Class/Global level
   String name = "python";//it will be globally available for all
   public static void main(String[] args) {
   }
	//when we parameterized methods we don't need to declare variables 
	//we can directly write the variables

		public void testLogic(int age, String name) {
		this.age = age;
		this.name = name;
		}
    public void testLogin(int rollnumber, String StudentName, int classNumber) {
    	
    }// we can write as many parameterized methods as possible in the test case
	}//use as many parameters as possible that are only necessary, and relevant to the 
     //logic of the method.


