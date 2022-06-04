package questions;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,8,3,1,2};
// insertion sort
		for (int i = 1; i < arr.length; i++) { //unsorted
			int current = arr[i];
			int j = i-1; //sorted part
			while(j>=0 && current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = current;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
