package dsaPlacement;

import java.util.Arrays;

public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {0,4,0,5,6};
		System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int [] arr) {
		Arrays.sort(arr);
		for (int j = 0; j < arr.length-1; j++) {


			if(arr[j]==arr[j+1]) {
				return true;
			}
		}
		return false;
	}
}
