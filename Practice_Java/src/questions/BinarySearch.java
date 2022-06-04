package questions;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int [] arr = new int[N];
for(int i =0; i<arr.length; i++) {
	arr[i]=sc.nextInt();
}
int M = sc.nextInt();
System.out.println(BinarySearch(arr, M));
	}
public static int BinarySearch(int[]arr, int x) {
for (int i = 0; i < arr.length; i++) {
	if(arr[i]==x) {
		return i;
	}

}	
return -1;
}
}
