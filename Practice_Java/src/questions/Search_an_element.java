package questions;
//import java.util.*;
public class Search_an_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner (System.in);
		//int n = sc.nextInt();
		//int [] arr = new int [n];
		//for (int i = 0; i < arr.length; i++) {
		//	arr[i] = sc.nextInt();
		//}
		//int m = sc.nextInt();
		int [] arr = {5,6,7,8,9,10,1,2,3};
		int item = 10;
		System.out.println(searchElement(arr, item));
	}
	public static int searchElement(int [] arr, int item) {

		int left = 0;
		int right = arr.length-1;
		while(left<=right) 	{
			int mid = (left+right)/2;

			if(arr[mid]==item) {
				return mid;
			}
			if(arr[left]<arr[mid]) {//check krege left array sorted hai kya
				if(item>=arr[left] && item<arr[mid]) { //check krege item is subarray mein present hai ya nhi
					right = mid-1;
				}
				else {
					left = mid+1;
				}
			}
			else {
				if(item>arr[mid]&&item<=arr[right]) {
					left = mid+1;
				}
				else {
					right = mid -1;
				}
			}
		}
		return -1;
	}
}
