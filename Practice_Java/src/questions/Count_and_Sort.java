package questions;
import java.util.*;
public class Count_and_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();// size of an array

int [] arr = new int [n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
	//System.out.print(arr[i]+ " ");
}
System.out.println();
for (int i = 0; i < arr.length; i++) {
	int temp = 0;
	for (int j = i+1; j < arr.length; j++) {
	if(arr[i]>arr[j])	{
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	}
	System.out.print(arr[i]+ " ");
}
	}

}
