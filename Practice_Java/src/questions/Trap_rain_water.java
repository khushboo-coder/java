package questions;
import java.util.*;
public class Trap_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter size of an array");
		int n = sc.nextInt();  // Size of an array
		//System.out.println("Input Values of an array");
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 int m = arr.length;
		int [] left = new int [m];
		int [] right = new int [m];
		left[0] = arr[0];
		right[m-1] = arr[m-1];
		int water = 0;

		for (int i = 1; i < left.length; i++) {
		left[i] = Math.max(left[i-1], arr[i]) ;
		}
		for (int i = m-2; i >=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			water = water + Math.min(left[i], right[i]) - arr[i];

		}

		System.out.println(water);

	}

}
