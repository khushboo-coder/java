package dsaPlacement;

import java.util.Arrays;

public class Chocolate_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,1,9,56,7,9,12}; 
		int m = 5;  //no. of students
		System.out.println(cP(arr, m));
	}
	public static int cP(int [] arr, int m) {
		int ans = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-m; i++) {
			int minw = arr[i];
			int maxw = arr[i+m-1];
			int gap = maxw - minw;


			if(gap<ans) {
				ans = gap;
			}
		}
		return ans;
	}
}
