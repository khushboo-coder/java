package questions;

public class SQ_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 48;
		System.out.println(sqRoot(n));
	}
	public static int sqRoot(int n) {
		int lo = 0;
		int hi = n;
		int ans = 0;
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(mid*mid == n) {
				return mid;
			}
			else if(mid*mid<n) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid - 1;
			}
		}
			return ans;
		
	}

}
