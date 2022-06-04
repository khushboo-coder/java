package questions;
import java.util.*;
public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Size of an array");
		int n = sc.nextInt();
		//System.out.println("Enter Values of an array");
int [] arr = new int [n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
//int sum = 0;
for (int i = arr.length-1; i >= 0; i--) {
	System.out.println(arr[i]);
	
}
//System.out.println("Reversed Array");

	}
/*public static void sum(int [] a) {
	for (int i = a.length-1; i >= 0; i--) {
		//System.out.println("Reversed Array");
		System.out.print(a[i] + " ");
		
	}*/

}

