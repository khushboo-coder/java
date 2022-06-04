package questions;

public class Rotate_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,3,4,6,7,2,5};
System.out.println("Before Rotation");
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
}
	sort(arr,3);
	System.out.println();
	System.out.println("After Rotation");
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	}

public static void sort(int [] a, int k) {
	k%=a.length;
	for (int r = 1; r <= k; r++) { //r is for rotation
		int item =a [a.length-1];
	for (int i = a.length-2; i >= 0; i--) {
		a[i+1] = a[i];
		//a[0]=item;

	}
	a[0]=item;
	}
//System.out.println(a[i]);
}
}