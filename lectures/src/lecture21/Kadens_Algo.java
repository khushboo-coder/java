package lecture21;

public class Kadens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {-11,-12,2,3,-3,7,-3};
System.out.println(MaxSubarraySum(arr));

	}
public static int MaxSubarraySum(int [] arr) {
	int ans = Integer.MIN_VALUE;
	int curr_sum = 0;
	for (int i = 0; i < arr.length; i++) {
		curr_sum = curr_sum + arr[i];
		ans = Math.max(ans, curr_sum);
		if(curr_sum<0) {
			curr_sum = 0;
		}
	}
return ans;	
}
}
