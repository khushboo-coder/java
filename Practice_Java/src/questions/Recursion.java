package questions;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,3,2,4,5,6,2,4,6,9,3};
int item = 3;
firstOcc(arr, item,0);
	}
public static void firstOcc(int [] arr, int item, int i) {
	//-ve base case
	if(i==arr.length) {
		return;
	}

	//+ve base case
	if(arr[i]==item) {
		System.out.print(i + " ");
	}
 firstOcc(arr, item, i+1);


}
}
