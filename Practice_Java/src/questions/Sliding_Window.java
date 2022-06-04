package questions;

public class Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,3,5,11,19,4};
int k = 3;
System.out.println(maximumSuminwindow(arr, k));

	}
public static int maximumSuminwindow(int [] arr, int k){
	int sum = 0;
	
	//1st window
	for (int i = 0; i <k; i++) {
	sum+=arr[i];
	}
	int ans = sum; // max sum ka track rakhne ke liye ki 1st window jo bnaya tha vohi hmara ans hai.
// grow the window
	for (int i = k; i < arr.length; i++) {
	sum+=arr[i]; // window size 4 ho gya
	sum-=arr[i-k]; // reduce the window and create a new window
	 ans = Math.max(sum, ans);// max check krna hai, pehle vali and new window ke sum mein se
	}
	return ans;
}
}
