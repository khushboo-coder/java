package questions;
import java.util.*;
public class SEARCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int [] arr = new int [n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
int m = sc.nextInt();
for (int i = 0; i < arr.length; i++) {
	if(arr[i]==m) {
		System.out.println(i);
	}
}
 	}

}
