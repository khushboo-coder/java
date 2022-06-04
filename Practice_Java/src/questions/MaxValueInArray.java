package questions;
import java.util.*;
public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int [] arr = new int [N];
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
MaxSum(arr);
	}
public static void MaxSum(int []arr) {
	int k = Integer.MIN_VALUE;
	int temp = 0;
	for (int i = 0; i < arr.length; i++) {
	//arr[0]=Integer.MAX_VALUE;
	if(arr[i]>k) {
		temp = arr[i];
		arr[i] = k;
		k=temp;
	}
	//System.out.println(temp);
	}
	System.out.println(temp);
}
}
