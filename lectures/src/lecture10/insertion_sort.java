package lecture10;

public class insertion_sort {

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

		for (int pass = 1; pass < arr.length; pass++) {
			
			int j=pass-1;
			int item=arr[pass];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
			

		}


	}

}
