package questions;

public class Returns_an_array {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating method which returns an array
		static int[] get(){
		return new int[]{10,30,50,90,60};
		}

		public static void main(String args[]){
		//calling method which returns an array
		int arr[]=get();
		//printing the values of array
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	}

}
