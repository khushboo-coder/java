package questions;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3,4,41 }, 
		         { 5, 6, 7, 8 ,42}, 
		         { 9, 10, 11, 12 ,43}, 
		         { 13, 14, 15, 16 ,45} };
System.out.println(matrixSearch(arr, 7));
	}
public static boolean matrixSearch(int [] [] arr, int item) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(arr[i][j]==item) {
				System.out.print(i +" "+ j);
				System.out.println();
				return true;
			}
			}
		}
	return false;
	}
}

