package questions;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,3,5,11,19,4};
int k = 3;
System.out.print(slidingWindow(arr, k)+" ");

	}
public static int slidingWindow(int [] arr, int k) {
	int sum = 0;
	for (int i = 0; i < k; i++) {
		sum = sum + arr[i];
	}
	int ans = sum;
	for (int i = k; i < arr.length; i++) {
		sum = sum + arr[i];
		sum-=arr[i-k];
		ans = Math.max(ans, sum);
	}
	return ans;
}
}