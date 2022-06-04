package questions;

public class Product_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,5};
		int [] ans = a(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int [] a (int [] arr) {
		int n = arr.length;
		int [] left = new int [n];
		int [] right = new int [n];
		left[0]=1;
		right[right.length-1]=1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		for (int i = right.length-2; i >=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = left[i] * right[i];
		}
		return right;
	}
}
