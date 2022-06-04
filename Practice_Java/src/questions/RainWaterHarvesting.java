package questions;

public class RainWaterHarvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,  0,  0,  2,  0,  4};
		int WS = rainWater(arr);
System.out.println(WS);
	}
public static int rainWater(int [] arr) {
	int water = 0;
	int n = arr.length;
	int [] left = new int [n];
	int [] right = new int [n]; 
	left[0] = arr[0];
	right[right.length-1] = arr[arr.length-1];
	for (int i = 1; i < left.length; i++) {
		left[i] = Math.max(left[i-1], arr[i]);
	}
	for (int i = right.length-2; i>=0; i--) {
		right[i] = Math.max(right[i+1], arr[i]);
	}
	for (int i = 0; i < arr.length; i++) {
		 water = water + Math.min(left[i], right[i]) - arr[i];
	}
	return water;
}
}
