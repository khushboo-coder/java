package questions;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {7,8,3,1,2};
//selection sort
for (int i = 0; i < arr.length-1; i++) {
	int smallest = i;
	for (int j = i+1; j < arr.length; j++) {
		if(arr[j]<arr[smallest]) {
			smallest = j;
		}

	}
	int temp = arr[smallest];
	arr[smallest] = arr[i];
	arr[i] = temp;


} // time complexity n^2
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}

}
