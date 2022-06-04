package questions;

public class Kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
System.out.println(kadenesAlgo(arr));
	}
public static int kadenesAlgo(int [] arr) {
	int sum = 0;
	int ans = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
		sum = sum + arr[i];
		ans = Math.max(ans, sum);
		//change the subarray
		if(sum<0) {
			sum = 0;
		}
	}
	return ans;
}
}
