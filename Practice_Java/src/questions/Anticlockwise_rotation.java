package questions;
import java.util.*;
public class Anticlockwise_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
PrintSpecial(arr);
		}
	}
	
public static void PrintSpecial(int [] [] arr) {
	int minr = 0;
	int minc = 0;
	int maxr = arr.length-1;
	int maxc= arr[0].length-1;
	int count = 0;
	int total_element = arr.length*arr[0].length;
	while(count<total_element) {
		for (int row = minr; row <= maxr && count<total_element ; row++) {
			System.out.print(arr[row][maxc]+ " ");
			
		}
		maxc--;
		count++;

	}
	}
}

	


