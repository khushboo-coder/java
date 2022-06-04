package questions;

public class Subarray_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,1,1,11};
int k = 10;
System.out.println(productlessthank(arr, k));
	}
public static int productlessthank(int[] arr, int k ) {
	
	if(k==0) {
		return k;
	}
	int si = 0; //starting index
	int ei = 0; //end index
	int p = 1; //product
	int ans = 0;
	while(ei<arr.length) {
		p *= arr[ei];
	
	// check window shrink hoga ya nahi
	while(p >= k && si <=ei) {
	p/=arr[si]; //product ko divide kr dege starting index se
	si++;
	}
	// ab window size calculate karege
	ans += (ei-si+1);
	ei++;
}
	return ans;

}
}
