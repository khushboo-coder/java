package questions;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {7,8,3,1,2};
int n =arr.length;
int temp;
//bubble sort
for (int i = 0; i <= n-1; i++) { // pura array pe traverse krega
	for (int j = 0; j < n-i-1; j++) { //  sorted elements ko ignore krege
		
	
	if(arr[j]>arr[j+1]) {
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1]=temp;
	} // n^2 time complexity
	}
}
for (int i = 0; i <n; i++) {
	System.out.println(arr[i]);
}
	}

}
