package lecture35;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {35,50,15,25,80,20,90,45};
QuickSort(arr, 0, arr.length-1);
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
	}
	public static void QuickSort(int[] arr, int si, int ei) {
		//base case
		if (si >= ei) {
			return;
		}

		int pi = Pivot_index(arr, 0, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);

	}

	public static int Pivot_index(int[] arr, int si, int ei) {// 0, arr.length-1
		int pivot = arr[ei];
		int pi = si;

		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivot) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;

				pi++;
			}

		}
		int t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;
		return pi;


}
}