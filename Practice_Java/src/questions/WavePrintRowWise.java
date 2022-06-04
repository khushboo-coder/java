package questions;
import java.util.*;
public class WavePrintRowWise {

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
		PrintWave(array);
	}
	public static void PrintWave(int [][]arr) {
		for(int row=0; row<arr.length; row++) {
			if(row%2==0) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col]+","+" ");	
				}
			}
			else {
				for(int col = arr[0].length-1; col>=0; col--) {
					System.out.print(arr[row][col]+","+" ");	
				}
			}
			//System.out.println();
		}
		System.out.println("END");
		System.out.println();
	}
}