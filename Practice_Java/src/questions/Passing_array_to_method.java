package questions;

public class Passing_array_to_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {33,3,4,5};
 min(a);



	}
public static void min(int [] arr) {
	int min = arr[0];
	for (int i = 1; i < arr.length; i++) {
		
	
	if(min>arr[i]) {
	min=arr[i];	
	
	System.out.println(arr[i]);
	}
}
	
}
}
