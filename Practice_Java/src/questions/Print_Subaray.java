package questions;

public class Print_Subaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, -3, -5, 4, 3, -7};
		System.out.println(print(arr));

	}
	public static int print(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int si = 0;
		int ei = 0;
		for (int i = 0; i < arr.length; i++) { //starting btayega

			for (int j = i; j < arr.length; j++) { // kha tk print krna hai
				int sum = 0;

				for (int j2 = i; j2 <=j; j2++) { // print krega

					sum = sum + arr[j2];
					if(ans<sum) {
						ans = sum;
						si = i;
						ei = j;
					}
					//System.out.println("sum of subarray is"+ sum);

					//System.out.print(arr[j2]+" ");
					//System.out.println(sum);

				}
				System.out.println();
			}
		}

		for (int i = si; i <=ei; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		return ans;
	}
}