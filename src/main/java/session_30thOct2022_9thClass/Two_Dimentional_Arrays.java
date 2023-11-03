package session_30thOct2022_9thClass;

public class Two_Dimentional_Arrays {

	public static void main(String[] args) {
//Follow the same steps of 1-D. For 2-D Arrays, Declare, Create, Initialize, and Retrieve.
    int [] [] a = new int [3] [4]; // row has the value of [3] and column has the value of [4]
    
    a[0][0] =101;
    a[0][1] =202;
    a[0][2] =303;
    a[0][3] =404;//These four lines of code represent one row 
    
    a[1][0] =101;
    a[1][1] =202;
    a[1][2] =303;
    a[1][3] =404;
    
    a[2][0] =101;
    a[2][1] =202;
    a[2][2] =303;
    a[2][3] =404;
    
    int [][] a1 = {{1,2,3,4,}, {5,6,7,8,}, {9,10,11,12}};
    
   for(int row=0 ; row<a1.length; row++) { //i represent row and j=column
	   for(int col=0; col<a1[row].length ; col++) { //use row and col instead
	   System.out.print(a1[row][col] +" ");
   }
   	System.out.println();
   }
	}
   
   }
	


