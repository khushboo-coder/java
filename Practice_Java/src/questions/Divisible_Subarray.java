package questions;
import java.util.*;
public class Divisible_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {

		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(divisible_subarray(arr));
		}
		
}
	public static long divisible_subarray(int [] arr) {
		
			int n = arr.length;
		
	long ans = 0;
	int sum = 0;
	long [] hole = new long[arr.length];
	hole[0]=1;
	for (int i = 0; i < hole.length; i++) {
		sum+=arr[i];
		if(sum<0) {
			sum%=n;
			sum+=n;
		}
		sum%=n;
		hole[sum]++;
	}
	for (int i = 0; i < hole.length; i++) {
		long p = hole[i];
		ans = ans+((p*(p-1))/2);
	}
		
	
	return ans;
	
	}
	
  }