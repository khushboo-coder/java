package questions;

//import java.util.Iterator;

public class Two_to_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,3,5,7,8,11,15};
		int [] arr2 = {1,3,7,12,13,14,19,20};
		//int [] crr = new int [arr.length+brr.length];
		int [] ans = MergeTwoSorted(arr1, arr2);  // us array ko ek array mein store karege and fir check karege
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}



	}

	public static int [] MergeTwoSorted(int []arr1, int []arr2) {
		int [] ans = new int [arr1.length+arr2.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				ans[k]=arr2[j];
				j++;
				k++;
			}
			else {
				ans[k]=arr1[i];
				i++;
				k++;
			}


		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;

		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}







