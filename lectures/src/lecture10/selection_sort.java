package lecture10;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 7, 2, 1, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	public static void Sort(int[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {// 0 to n-1
			int min = counter;

			for (int i = counter + 1; i < arr.length; i++) {
				if (arr[i] < arr[min]) {
					min = i;
				}

			}

			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;

		}


	}

}
