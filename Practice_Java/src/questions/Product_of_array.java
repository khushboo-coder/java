package questions;

public class Product_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,3,4};
int [] ans = ArrayExceptSelf(arr);
for (int i = 0; i < ans.length; i++) {
	System.out.println(ans[i]);
}


	}
	public static int[] ArrayExceptSelf(int[] arr) {
		int [] left = new int[arr.length];
		int [] right = new int[arr.length];
		 right[right.length-1] = 1;
		 left[0] = 1;
		for (int i = arr.length-2; i >=0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		for (int i = 1; i < right.length; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		for (int i = 0; i < right.length; i++) {
			left[i]=left[i]*right[i];
		}
return left;	
	}
}
