package session_29thOct2022_8thClass;

public class Nested_For_Loop {

	public static void main(String[] args) {
		
		// Pattern programming 
		pattern1();
		pattern2();
		pattern3(5);
		pattern4(5);
		
	}
	static void pattern1() {
		for (int row=1 ; row<=5 ; row++) {
			for(int col=1 ; col<=5 ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");
	}
   static void pattern2() {
	   for(int row=1 ; row<=5 ; row++) {
		   for(int col=1 ;col<=row ; col++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("-------------------------------------------------------------");
		   }
   static void pattern3(int n) {
	   for(int row=1 ; row <= n; row++) {
		   for(int col = 1 ; col<= n-row+1 ; col++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("-------------------------------------------------------------");
   }
   static void pattern4(int n) {
	   for(int row=1 ; row <= n; row++) {
		   for(int col = 1 ; col<= row ; col++) {
			   System.out.print(col +" ");
		   }
		   System.out.println();
	   }
	   System.out.println("-------------------------------------------------------------");
   }
}


