package lecture8;
import java.util.Scanner;
public class input_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();// size of array
		System.out.println("enter array values");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		display(arr);
	    int [] b = newArray(5);
		b = new int [3];
		System.out.println("new array values");
		display(b);

	}
	public static int []  newArray(int n) {
		
		int []a = new int [n];
		return a;
		
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
