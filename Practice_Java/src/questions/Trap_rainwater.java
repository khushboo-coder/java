package questions;
import java.util.*;
public class Trap_rainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-- >0) {
	int n = sc.nextInt();
	int [] arr = new int [n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println();
System.out.println(Trap_rainwater(arr));	
}

	}
public static int Trap_rainwater(int [] arr) {
	int n = arr.length;
	int [] left = new int [n];
	int [] right = new int [n];
	left[0]=arr[0];
	right[n-1]=arr[n-1];
	for (int i = 1; i < right.length; i++) {
		left[i] = Math.max(left[i-1], arr[i]);
	}
	for (int i = arr.length-2; i>=0; i--) {
		right[i] = Math.max(right[i+1], arr[i]);
	}
	int water = 0;
	for (int i = 0; i < right.length; i++) {
		water =water +  (Math.min(right[i], left[i])-arr[i]);
	}
	return water;
}
}
