package questions;
//import java.util.*;
public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		//Scanner sc = new Scanner(System.in);
		//int rows = sc.nextInt();
		//int cols = sc.nextInt();
		//int [] [] arr = new int [rows][cols];
		//for (int i = 0; i < rows; i++) {
		//	for (int j = 0; j < cols; j++) {
			//	arr[i][j]=sc.nextInt();
			//}

		//}
		wavePrint(arr);
		rowWiseWave(arr);
	}
	public static void wavePrint(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rowWiseWave(int [] [] arr) {
		for (int cols= 0; cols <arr[0].length; cols++) {
			if(cols%2==0) {
				for (int rows = 0; rows< arr.length; rows++) {
					System.out.print(arr[rows][cols]+" ");
				}
			}
			else {
				for (int rows= arr.length-1; rows>=0; rows--) {
					System.out.print(arr[rows][cols]+" ");
				}
			}
		}
		System.out.println();

	}
}
