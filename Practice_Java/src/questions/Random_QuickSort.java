package questions;
import java.util.*;
public class Random_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {9,4,5,2,1,6,7};
QuickSort(arr, 0, arr.length-1);
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]+"");
}
	}
	public static void QuickSort(int[]arr,int si,int ei) {
		
		//base case
		if(si >= ei) {
			return;
		}
		int pi = Pivot_index(arr, 0, ei);
		Pivot_index(arr, si, pi-1);
		Pivot_index(arr, pi+1, ei);
		
	}
	public static void Random_Number(int []arr,int si,int ei) {
		Random rand = new Random();
		int lo = si;
		int hi = ei;
		int ri = rand.nextInt(hi-lo)+lo;
		
		int temp = arr[ei];
		arr[ei]=arr[ri];
		arr[ri]=temp;

		
		
	}
public static int Pivot_index(int[]arr,int si, int ei) {
	Random_Number(arr, si, ei);
int pivot = arr[ei];
int pi = si;

for (int i = si; i <= ei; i++) {
	if(arr[i]<=pivot) {
		int t = arr[i];
		arr[i]=arr[pi];
		arr[pi]=t;
		
		pi++;
	
}
}
int t = arr[ei];
arr[ei]=arr[pi];
arr[pi]=t;

return pi;
}
}
