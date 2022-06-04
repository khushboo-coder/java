package questions;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr =  {1,3,6,2,8,5,7,4,9,10};
sort(arr);
	}
public static void sort(int [] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			int temp = 0;
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
