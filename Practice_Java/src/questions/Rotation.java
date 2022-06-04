package questions;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,4,6,7,2,5};
		int k = 3;
		for (int r = 1; r <=k; r++) {
			int item = arr[arr.length-1];
	for (int i = arr.length-2; i >=0; i--) {
			arr[i+1] = arr[i];

		}
		

		arr[0] = item;
		}
		
		//int k = 4;



		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}







