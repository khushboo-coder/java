package questions;

import java.util.Scanner;

public class Spiral_Clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [] [] array = new int [M][N];
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		PrintSpecial(array);

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
					System.out.print(arr[minr][col]+","+ " ");

				}
				minr++;
				count++;
				// minr to maxr

				for (int row = minr; row <= maxr && count<total_element ; row++) {
					System.out.print(arr[row][maxc]+","+ " ");

				}
				maxc--;
				count++;
				// maxc to minc
				for (int col = maxc; col >=minc && count<total_element; col--) {
					System.out.print(arr[maxr][col]+","+ " ");
				}
				maxr--; count++;
				//  minr to maxr
				for (int row = maxr; row >=minr && count<total_element; row--) {
					System.out.print(arr[row][minc]+","+ " ");	
				}
				minc++; count++;
				//System.out.println();

			}
			System.out.print("End");
			System.out.println();

		}

	}
