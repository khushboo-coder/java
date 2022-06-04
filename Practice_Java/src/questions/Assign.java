package questions;
import java.util.*;
public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
			int x = arr.length;
		int [] left = new int [x];
		int [] right = new int [x];
		left[0] = arr[0];
		right[n-1] = arr[x-1];
		int water = 0;

		for (int i = 1; i < left.length; i++) {
		left[i] = Math.max(left[i-1], arr[i]) ;
		}
		for (int i = x-2; i >=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			water = water + Math.min(left[i], right[i]) - arr[i];

		}

		System.out.println(water);

	}


	
    


	}


