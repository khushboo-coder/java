package questions;

public class Test_anonymous_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new int[]{10,22,44,66});//passing anonymous array to method


	}

	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}	
	}

}
