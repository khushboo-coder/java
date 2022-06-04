package lecture13;

public class Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {2,-3,-4,9};
int sol = subarraysum(arr);
System.out.println(sol);

	}
public static int subarraysum(int [] arr) {
	int ans = Integer.MIN_VALUE;
	int si = 0;
	int ei = 0;
	int sum = 0;

	
	for (int i = 0; i < arr.length; i++) {
		sum = 0;
		for (int j = i; j < arr.length; j++) {
			sum+=arr[j];
			if(sum>ans) {
				ans = sum;
				ans = Math.max(ans, sum);
			}
			
		}
	}
	for (int i = si; i <=ei; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();

	return ans;
	
}
}
