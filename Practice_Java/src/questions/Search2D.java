package questions;
import java.util.*;
public class Search2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols = sc.nextInt();
int [][] arr = new int [rows][cols];
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < cols; j++) {
		arr[i][j] = sc.nextInt();
	}
	
}
int n = sc.nextInt();
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < cols; j++) {
		if(arr[i][j]==n) {
			System.out.print(i + " "+ j);
		}
	}
	System.out.println();
}
	}

}
