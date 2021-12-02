package questions;

public class find_max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4,8,7,6,9};
int max = arr[0];
int min = arr [0];
for (int i = 1; i < arr.length; i++) {
	if(max<arr[i]) {
		max = arr[i];
	}
	//System.out.println("max value is" + max);
}
System.out.println("max value is " + max);
for (int i = 1; i < arr.length; i++) {
	if(arr[i]<min) {
		min = arr[i];
	}
	
}
System.out.println("Min value is " + min);
	}

}
