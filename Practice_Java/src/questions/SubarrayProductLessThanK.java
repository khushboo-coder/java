package questions;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {1,1,1,11};
int k = 10;
System.out.println(productLTK(nums, k));
	}
public static int productLTK(int [] arr, int k) {
	int product = 1;
	int sum = 0;
	int count = 0;
	for (int i = 0; i <arr.length; i++) {
		product = product * arr[i];
		if(product<k) {
			System.out.print(product+" ");
			count++;
			 sum = Math.max(product, product);
		}
		  
	}
	System.out.println();
	return count;
}
}
