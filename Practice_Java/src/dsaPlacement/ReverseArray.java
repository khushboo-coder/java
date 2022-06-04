package dsaPlacement;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i<arr.length; i++ ) {
			arr[i]=sc.nextInt();
		}
		reverseArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void reverseArray(int [] arr) {
		int start = 0;
		int end = arr.length-1;
		int temp = 0;
		while(start<end) {

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}



	}
}
