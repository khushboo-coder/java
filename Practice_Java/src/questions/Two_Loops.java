package questions;

public class Two_Loops {

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
			int sum = 0;

			for (int j = i; j < arr.length; j++) { // kha tk print krna hai

				// print krega

					sum = sum + arr[j];
					if(ans<sum) {
						ans = sum;
						si = i;
						ei = j;
					}
					//System.out.println("sum of subarray is"+ sum);

					//System.out.print(arr[j2]+" ");
					//System.out.println(sum);

				
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
