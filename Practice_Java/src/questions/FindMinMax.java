package questions;
import java.util.*;
public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Min element of an array is" + Min(arr));
		System.out.println("Max element of an array is" + Max(arr));
	}
	public static int Min(int [] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int Max(int [] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
