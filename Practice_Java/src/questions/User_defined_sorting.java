package questions;

public class User_defined_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {15,14,13,11,89,67,43,21};
//int temp;
sortArray(arr);

	}
public static void sortArray(int [] a) {
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length-5; j++) {
			if(a[i]>a[j]) {
				 temp = a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 
			}
			
		}
		System.out.print(a[i]+" ");
	}
}
}
