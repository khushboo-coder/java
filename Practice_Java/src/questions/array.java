package questions;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int [] arr = new int[5];
arr [0] = 12;
arr [1] = 2;
arr [2] = 5;
arr [3] = 9;
arr [4] = 7;
//System.out.println(arr[0]);

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]); // print an array
}
int [] a = new int [2];
a[0]= 9;
a[1]= 45;
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i] + " ");
	int n = sc.nextInt();
	int [] val = new int [n];
	
	for (int j = 0; j < val.length; j++) {
		val[j] = sc.nextInt();
		System.out.println(val[j]);
		
	}
}
	}

}
