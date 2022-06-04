package questions;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,3,4,5,6,7};
Display(arr);
System.out.println();
swap(arr, 2, 3);
Display(arr);
	}
public static void swap(int [] arr, int a, int b) {
	for (int i = 0; i < arr.length; i++) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
}
public static void Display(int [] arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
}
}
