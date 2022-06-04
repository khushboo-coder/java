package lecture13;

public class Sqrt_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 48;
int search = (sq_root(n));
System.out.println(search);

	}
	public static int sq_root( int n) {
		int lo = 0;
		int hi = n;
		int ans = 0;
		//int mid = (lo+hi)/2;
		while(lo<hi) {
			int mid = (lo+hi)/2;

			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid<n) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
return ans;
}
}
