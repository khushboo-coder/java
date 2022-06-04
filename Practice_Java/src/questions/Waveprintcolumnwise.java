package questions;
import java.util.*;
public class Waveprintcolumnwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int [] [] array = new int[m][n];
for (int i = 0; i < array.length; i++) {
	for (int j = 0; j < array[0].length; j++) {
		array [i][j] = sc.nextInt();
	}
		
}
WavePrint(array);
	}
public static void WavePrint(int [][]arr) {
	for (int col = 0; col < arr[0].length; col++) {
		if(col%2==0) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col]+","+ " ");
			}
		}
		else {
			for (int row = arr.length-1; row >= 0; row--) {
				System.out.print(arr[row][col]+"," + " ");
			}
		}
	}
	System.out.print("END");
	System.out.println();
}
}
