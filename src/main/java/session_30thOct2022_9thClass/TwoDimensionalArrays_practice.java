package session_30thOct2022_9thClass;

public class TwoDimensionalArrays_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a = { {1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}};
		
		for(int row=0 ; row<a.length ; row++) {
			for(int col=0 ; col<a[row].length; col++) {
				System.out.print(a[row] [col] + " ");
			}
			System.out.println();
		}
	}

}
