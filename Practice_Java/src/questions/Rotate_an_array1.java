package questions;

public class Rotate_an_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		int k = 9;
		rotateArray(arr,k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotateArray(int [] arr, int k) {
		k%=arr.length;
		for (int r = 1; r <=k; r++) { // for rotation 1, rotation less than = k
			
		
		int item = arr[arr.length-1];
		for (int i = arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = item;
	}
	}

}
