package questions;

public class Linear_Search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {2,1,3,67,8,9};
int n = 5;
System.out.println(linearSearch(arr, n));
	}
public static int linearSearch(int [] arr, int n) {
	 //int index = 0;
	for (int i = 0; i < arr.length; i++) {
	if(n==arr[i]) {
		return i;
	}
	}
	return -1;
}
}
