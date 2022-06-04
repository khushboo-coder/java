package questions;

public class DivisibleSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,-2,7,3};
		System.out.println(print(arr));

	}
	public static int print(int [] arr) {
		//int ans = Integer.MIN_VALUE;
		//int si = 0;
		//int ei = 0;
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < arr.length; i++) { //starting btayega

			for (int j = i; j < arr.length; j++) { // kha tk print krna hai
				int sum = 0;

				for (int j2 = i; j2 <=j; j2++) { // print krega

					sum = sum + arr[j2];
					//if(ans<sum) {
						//ans = sum;
						//si = i;
						//ei = j;
					//}
					if(sum%n==0) {
						System.out.print(arr[j2]+" ");
					}

					}
				System.out.println();


					//System.out.println("sum of subarray is"+ sum);

					//System.out.print(arr[j2]+" ");
					//System.out.println(sum);
				if(sum%n==0) {
					//System.out.println(arr[j2]);
					count++;
					//System.out.println(count);


			}

				}
				
				System.out.println();
		}		
		System.out.print("Number of good subarrays are ");
return count;

	}
}
