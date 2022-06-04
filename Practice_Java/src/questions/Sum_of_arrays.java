package questions;
import java.util.*;
public class Sum_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] array = new int [m];
		for (int i = 0; i < array.length; i++) {
			array[i]= sc.nextInt();
		}
		ArrayList<Integer> ans = list(arr, array);
		for (int i = 0; i <ans.size(); i++) {
			System.out.print(ans.get(i)+", ");

		}
		System.out.println("END");

	}
	public static ArrayList<Integer> list ( int [] arr, int [] array) {
		ArrayList <Integer> list = new ArrayList<>();
		int carry = 0;
		//int sum = 0;
		int i = arr.length-1;
		int j = array.length-1;
		while(i>=0 || j>=0) {
			int sum =0;
			if(i>=0) {
				sum+=arr[i];
				i--;
			}
			if(j>=0) {
				sum+=array[j];
				j--;
			}
			sum+=carry;
			list.add(0, sum%10);
			carry = sum/10;


		}
		if(carry>0) {
			list.add(0, carry);
		}

		return list;
	}

}
