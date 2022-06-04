package questions;
import java.util.*;
public class MAX_VALUES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int [] arr = new int [n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
int max = Integer.MIN_VALUE;
int min = arr[0];
for (int i = 0; i < arr.length; i++) {
	if(arr[i]>max) {
		max = arr[i];
	}
	if(arr[i]<min) {
		min = arr[i];
	}
}
System.out.println(max + " is the maximum value");
System.out.println(min + " is the minimum value");

	}

}
