package lecture15;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3,4},
			      {5,6,7,8},
			      {9,10,11,12},
			      };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
			
			System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	PrintSpecial(arr);
	}
	public static void PrintSpecial(int [] [] arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc= arr[0].length-1;
		int count = 0;
		int total_element = arr.length*arr[0].length;
		while(count<total_element) {
			// minc -- > maxc

			for (int col = minc; col <= maxc && count<total_element; col++) {
				System.out.print(arr[minr][col]+ " ");
				
			}
			minr++;
			count++;
			// minr to maxr

			for (int row = minr; row <= maxr && count<total_element ; row++) {
				System.out.print(arr[row][maxc]+ " ");
				
			}
			maxc--;
			count++;
			// maxc to minc
			for (int col = maxc; col >=minc && count<total_element; col--) {
				System.out.print(arr[maxr][col]+ " ");
			}
			maxr--; count++;
			//  minr to maxr
			for (int row = maxr; row >=minr && count<total_element; row--) {
			System.out.print(arr[row][minc]+ " ");	
			}
			minc++; count++;
			//System.out.println();

		}
		System.out.println();
	}

}
